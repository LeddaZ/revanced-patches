package app.revanced.patches.music.layout.branding.icon.patch

import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.*
import app.revanced.patcher.patch.annotations.DependsOn
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.patches.music.layout.branding.icon.annotations.CustomMusicBrandingCompatibility
import app.revanced.patches.youtube.misc.manifest.patch.FixLocaleConfigErrorPatch
import app.revanced.util.resources.ResourceUtils
import app.revanced.util.resources.ResourceUtils.copyResources
import java.io.File
import java.nio.file.Files

@Patch
@DependsOn([FixLocaleConfigErrorPatch::class])
@Name("custom-music-branding")
@Description("Changes the YouTube Music launcher icon and name to your choice (defaults to ReVanced Music).")
@CustomMusicBrandingCompatibility
@Version("0.0.1")
class CustomMusicBrandingPatch : ResourcePatch {
    override fun execute(context: ResourceContext): PatchResult {
        fun copyResources(resourceGroups: List<ResourceUtils.ResourceGroup>) {
            iconPath?.let { iconPathString ->
                val iconPath = File(iconPathString)
                val resourceDirectory = context["res"]

                resourceGroups.forEach { group ->
                    val fromDirectory = iconPath.resolve(group.resourceDirectoryName)
                    val toDirectory = resourceDirectory.resolve(group.resourceDirectoryName)

                    group.resources.forEach { iconFileName ->
                        Files.write(
                            toDirectory.resolve(iconFileName).toPath(),
                            fromDirectory.resolve(iconFileName).readBytes()
                        )
                    }
                }
            } ?: resourceGroups.forEach { context.copyResources("branding/music", it) }
        }

        val iconResourceFileNames = arrayOf(
            "adaptiveproduct_youtube_music_background_color_108",
            "adaptiveproduct_youtube_music_foreground_color_108",
            "ic_launcher",
            "ic_launcher_round"
        ).map { "$it.png" }.toTypedArray()

        fun createGroup(directory: String) = ResourceUtils.ResourceGroup(
            directory, *iconResourceFileNames
        )

        // change the app icon
        arrayOf("xxxhdpi", "xxhdpi", "xhdpi", "hdpi", "mdpi")
            .map { "mipmap-$it" }
            .map(::createGroup)
            .let(::copyResources)

        // change the name of the app
        val manifest = context["AndroidManifest.xml"]
        manifest.writeText(
            manifest.readText()
                .replace(
                    "android:label=\"@string/application_name",
                    "android:label=\"$appName"
                )
        )

        return PatchResultSuccess()
    }

    companion object : OptionsContainer() {
        private var appName: String? by option(
            PatchOption.StringOption(
                key = "appName",
                default = "YouTube ReVanced",
                title = "Application Name",
                description = "The name of the application it will show on your home screen.",
                required = true
            )
        )

        private var iconPath: String? by option(
            PatchOption.StringOption(
                key = "iconPath",
                default = null,
                title = "App Icon Path",
                description = "A path containing mipmap resource folders with icons."
            )
        )
    }
}
