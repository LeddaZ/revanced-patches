## 🧩 Patches

🧩 The unofficial Patch bundle provided by ReVanced and the community.

> Looking for the JSON variant of this? [Click here](patches.json).

### 📦 `com.google.android.youtube`
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `hide-crowdfunding-box` | Hides the crowdfunding box between the player and video description. | 17.43.36 |
| `hide-time-and-seekbar` | Hides progress bar and time counter on videos. | 17.43.36 |
| `hide-video-buttons` | Adds options to hide action buttons under a video. | 17.43.36 |
| `enable-wide-searchbar` | Replaces the search icon with a wide search bar. This will hide the YouTube logo when active. | 17.43.36 |
| `hide-captions-button` | Hides the captions button on video player. | 17.43.36 |
| `hide-shorts-button` | Hides the shorts button on the navigation bar. | 17.43.36 |
| `hide-create-button` | Hides the create button in the navigation bar. | 17.43.36 |
| `disable-startup-shorts-player` | Disables playing YouTube Shorts when launching YouTube. | 17.43.36 |
| `hide-endscreen-cards` | Hides the suggested video cards at the end of a video in fullscreen. | 17.43.36 |
| `hide-cast-button` | Hides the cast button in the video player. | all |
| `sponsorblock` | Integrate SponsorBlock. | 17.43.36 |
| `hide-autoplay-button` | Hides the autoplay button in the video player. | 17.43.36 |
| `hide-watch-in-vr` | Hides the Watch in VR option from the player settings flyout panel. | 17.43.36 |
| `hide-album-cards` | Hides the album cards below the artist description. | 17.43.36 |
| `disable-auto-player-popup-panels` | Disable automatic popup panels (playlist or live chat) on video player. | 17.43.36 |
| `disable-auto-captions` | Disable forced captions from being automatically enabled. | 17.43.36 |
| `disable-fullscreen-panels` | Disables video description and comments panel in fullscreen view. | 17.43.36 |
| `hide-artist-card` | Hides the artist card below the searchbar. | 17.43.36 |
| `return-youtube-dislike` | Shows the dislike count of videos using the Return YouTube Dislike API. | 17.43.36 |
| `comments` | Hides components related to comments. | 17.43.36 |
| `theme` | Applies a custom theme. | all |
| `hide-email-address` | Hides the email address in the account switcher. | 17.43.36 |
| `tablet-mini-player` | Enables the tablet mini player layout. | 17.43.36 |
| `hide-watermark` | Hides creator's watermarks on videos. | 17.43.36 |
| `hide-info-cards` | Hides info-cards in videos. | 17.43.36 |
| `hide-my-mix` | Hides mix playlists. | 17.43.36 |
| `custom-branding` | Changes the YouTube launcher icon and name to your choice (defaults to ReVanced). | all |
| `premium-heading` | Shows premium branding on the home screen. | all |
| `old-quality-layout` | Enables the original quality flyout menu. | 17.43.36 |
| `general-ads` | Removes general ads. | 17.43.36 |
| `video-ads` | Removes ads in the video player. | 17.43.36 |
| `swipe-controls` | Adds volume and brightness swipe controls. | 17.43.36 |
| `downloads` | Enables downloading music and videos from YouTube. | 17.43.36 |
| `seekbar-tapping` | Enables tap-to-seek on the seekbar of the video player. | 17.43.36 |
| `disable-zoom-haptics` | Disables haptics when zooming. | all |
| `settings` | Adds settings for ReVanced to YouTube. | all |
| `open-links-directly` | Bypasses redirect links and allows opening links directly. | 17.43.36 |
| `microg-support` | Allows YouTube ReVanced to run without root and under a different package name with Vanced MicroG. | 17.43.36 |
| `custom-video-buffer` | Lets you change the buffers of videos. | 17.43.36 |
| `debugging` | Adds debugging options. | all |
| `client-spoof` | Spoofs the YouTube or Vanced client to prevent playback issues. | all |
| `always-autorepeat` | Always repeats the playing video again. | 17.43.36 |
| `minimized-playback` | Enables minimized and background playback. | 17.43.36 |
| `custom-video-speed` | Adds more video speed options. | 17.43.36 |
| `remember-video-quality` | Adds the ability to remember the video quality you chose in the video quality flyout. | 17.43.36 |
| `hdr-auto-brightness` | Makes the brightness of HDR videos follow the system default. | 17.43.36 |
</details>

### 📦 `com.vanced.android.youtube`
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `client-spoof` | Spoofs the YouTube or Vanced client to prevent playback issues. | all |
</details>

### 📦 `com.google.android.apps.youtube.music`
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `tasteBuilder-remover` | Removes the "Tell us which artists you like" card from the home screen. | 5.31.50 |
| `hide-get-premium` | Removes all "Get Premium" evidences from the avatar menu. | 5.31.50 |
| `minimized-playback-music` | Enables minimized playback on Kids music. | 5.31.50 |
| `custom-music-branding` | Changes the YouTube Music launcher icon and name to your choice (defaults to ReVanced Music). | all |
| `compact-header` | Hides the music category bar at the top of the homepage. | 5.31.50 |
| `upgrade-button-remover` | Removes the upgrade tab from the pivot bar. | 5.31.50 |
| `music-video-ads` | Removes ads in the music player. | 5.31.50 |
| `background-play` | Enables playing music in the background. | 5.31.50 |
| `exclusive-audio-playback` | Enables the option to play music without video. | 5.31.50 |
| `codecs-unlock` | Adds more audio codec options. The new audio codecs usually result in better audio quality. | 5.31.50 |
| `music-microg-support` | Allows YouTube Music ReVanced to run without root and under a different package name. | 5.31.50 |
</details>



## 📝 JSON Format

This section explains the JSON format for the [patches.json](patches.json) file.

The file contains an array of objects, each object representing a patch. The object contains the following properties:

| key                           | description                                                                                                                                                                           |
|-------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `name`                        | The name of the patch.                                                                                                                                                                |
| `description`                 | The description of the patch.                                                                                                                                                         |
| `version`                     | The version of the patch.                                                                                                                                                             |
| `excluded`                    | Whether the patch is excluded by default. If `true`, the patch must never be included by default.                                                                                     |
| `deprecated`                  | Whether the patch is deprecated.                                                                                                                                                      |
| `options`                     | An array of options for this patch.                                                                                                                                                   |
| `options.key`                 | The key of the option.                                                                                                                                                                |
| `options.title`               | The title of the option.                                                                                                                                                              |
| `options.description`         | The description of the option.                                                                                                                                                        |
| `options.required`            | Whether the option is required.                                                                                                                                                       |
| `options.choices?`            | An array of choices of the option. This may be `null` if this option has no choices. The element type of this array may be any type. It can be a `String`, `Int` or something else.   |
| `dependencies`                | An array of dependencies, which are patch names.                                                                                                                                      |
| `compatiblePackages`          | An array of packages compatible with this patch.                                                                                                                                      |
| `compatiblePackages.name`     | The name of the package.                                                                                                                                                              |
| `compatiblePackages.versions` | An array of versions of the package compatible with this patch. If empty, all versions are seemingly compatible.                                                                      |

Example:

```json
[
  {
    "name": "remember-video-quality",
    "description": "Adds the ability to remember the video quality you chose in the video quality flyout.",
    "version": "0.0.1",
    "excluded": false,
    "deprecated": false,
    "options": [],
    "dependencies": [
      "integrations",
      "video-id-hook"
    ],
    "compatiblePackages": [
      {
        "name": "com.google.android.youtube",
        "versions": [
          "17.22.36",
          "17.24.35",
          "17.26.35",
          "17.27.39",
          "17.28.34",
          "17.29.34",
          "17.32.35",
          "17.33.42"
        ]
      }
    ]
  },
  {
    "name": "theme",
    "description": "Enables a custom theme.",
    "version": "0.0.1",
    "excluded": false,
    "deprecated": false,
    "options": [
      {
        "key": "theme",
        "title": "Theme",
        "description": "Select a theme.",
        "required": true,
        "choices": [
          "Amoled"
        ]
      }
    ],
    "dependencies": [
      "locale-config-fix"
    ],
    "compatiblePackages": [
      {
        "name": "com.google.android.youtube",
        "versions": []
      }
    ]
  },
  {
    "name": "custom-branding",
    "description": "Changes the YouTube launcher icon and name to your choice (defaults to ReVanced).",
    "version": "0.0.1",
    "excluded": false,
    "deprecated": false,
    "options": [
      {
        "key": "appName",
        "title": "Application Name",
        "description": "The name of the application it will show on your home screen.",
        "required": true,
        "choices": null
      },
      {
        "key": "appIconPath",
        "title": "Application Icon Path",
        "description": "A path to the icon of the application.",
        "required": false,
        "choices": null
      }
    ],
    "dependencies": [
      "locale-config-fix"
    ],
    "compatiblePackages": [
      {
        "name": "com.google.android.youtube",
        "versions": []
      }
    ]
  }
]
```