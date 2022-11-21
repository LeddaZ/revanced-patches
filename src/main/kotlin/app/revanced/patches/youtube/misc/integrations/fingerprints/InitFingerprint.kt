package app.revanced.patches.youtube.misc.integrations.fingerprints

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patches.youtube.misc.integrations.annotations.IntegrationsCompatibility
import app.revanced.shared.patches.AbstractIntegrationsPatch.IntegrationsFingerprint

@Name("init-fingerprint")
@IntegrationsCompatibility
@Version("0.0.1")
object InitFingerprint : IntegrationsFingerprint(
    strings = listOf("Application creation"),
)