# [2.34.0](https://github.com/LeddaZ/revanced-patches/compare/v2.33.0...v2.34.0) (2022-09-25)


### Bug Fixes

* **custom-playback-speed:** implement own method instead of `takeWhile` ([f58c7c6](https://github.com/LeddaZ/revanced-patches/commit/f58c7c6866330da886a415173f7c9dfd4c446918))
* **custom-video-buffer:** use correct offset for `getMaxBuffer` call injection ([59b7d0d](https://github.com/LeddaZ/revanced-patches/commit/59b7d0d7275d8dd9a49020e11d020c50227f1eaa))
* **hide-time-and-seekbar:** don't draw the seekbar ([#594](https://github.com/LeddaZ/revanced-patches/issues/594)) ([7b40751](https://github.com/LeddaZ/revanced-patches/commit/7b4075185c47e67c3ee0077f07cbb87c44ea3152))
* **seekbar-tapping:** do not disable seekbar when hiding it ([#600](https://github.com/LeddaZ/revanced-patches/issues/600)) ([cd9ac6d](https://github.com/LeddaZ/revanced-patches/commit/cd9ac6dab99be5dbcc666e5740a6575492d3716c))
* **sponsorblock:** broken fingerprint and invert setting `shorts_playing` ([#579](https://github.com/LeddaZ/revanced-patches/issues/579)) ([01e50cc](https://github.com/LeddaZ/revanced-patches/commit/01e50ccc92f8e2375f67543b5fa86b561bffdc02))
* **sponsorblock:** reflect changes to strings ([#585](https://github.com/LeddaZ/revanced-patches/issues/585)) ([57d0418](https://github.com/LeddaZ/revanced-patches/commit/57d04186d0672e96adf8a7ea2290991c02571e45))
* **sponsorblock:** reflect strings from official guidelines ([#523](https://github.com/LeddaZ/revanced-patches/issues/523)) ([c6b8f02](https://github.com/LeddaZ/revanced-patches/commit/c6b8f023c89381c788c9eeda21fe5284256311a3))
* **sponsorblock:** resolve unresolved fingerprint ([78e2bab](https://github.com/LeddaZ/revanced-patches/commit/78e2babdd0bfa46aacfd56c4d25c6a59f0d7954b))


### Features

* `disable-auto-player-popup-panels` ([#543](https://github.com/LeddaZ/revanced-patches/issues/543)) ([d0de4cc](https://github.com/LeddaZ/revanced-patches/commit/d0de4cc0a18fc7e77c1cccd7e057e2749f3f7214))
* `hide-time-and-seekbar` patch ([#544](https://github.com/LeddaZ/revanced-patches/issues/544)) ([65e9db7](https://github.com/LeddaZ/revanced-patches/commit/65e9db7f1eb9f11361298b0a99cea2c97b949fec))
* **custom-playback-speed:** max, min, granularity option ([ccbf78f](https://github.com/LeddaZ/revanced-patches/commit/ccbf78f6cef4340794147bc9eb2c4b5da449b141))
* disable sponsorblock on shorts ([#439](https://github.com/LeddaZ/revanced-patches/issues/439)) ([ff7918c](https://github.com/LeddaZ/revanced-patches/commit/ff7918ca6e217a5a5e9d6e2a26ba3b40400d9a16))
* **downloads:** missing package installation request ([fd2b007](https://github.com/LeddaZ/revanced-patches/commit/fd2b007f064cec78be5c955d4ed9d9c2e6f8765f))
* explicit support for YouTube v17.34.35 and v17.34.36 ([#527](https://github.com/LeddaZ/revanced-patches/issues/527)) ([247f67c](https://github.com/LeddaZ/revanced-patches/commit/247f67c8bd21a2f3061e8a98642403021324f745))
* section `acknowledgements` for issue templates ([1bafb2a](https://github.com/LeddaZ/revanced-patches/commit/1bafb2a5a21288f0443e8a375a36981e73a2ed01))
* **theme:** arbitrary background color for light theme  ([#565](https://github.com/LeddaZ/revanced-patches/issues/565)) ([20db1e2](https://github.com/LeddaZ/revanced-patches/commit/20db1e2d4f9ef04192d4723ccbaf6da11021cf44))

# [2.33.0](https://github.com/LeddaZ/revanced-patches/compare/v2.32.0...v2.33.0) (2022-09-19)


### Bug Fixes

* **hdr-auto-brightness:** increase patching compatibility across versions ([fc6e1b1](https://github.com/LeddaZ/revanced-patches/commit/fc6e1b19241b28a5cb24099e7c6bb0987786b9de))
* **hide-create-button:** increase patching compatibility across versions ([1c19324](https://github.com/LeddaZ/revanced-patches/commit/1c19324090dedf8c708c90166aa3456cae432f5b))
* **hide-shorts-button:** increase patching compatibility across versions ([b3147d8](https://github.com/LeddaZ/revanced-patches/commit/b3147d8eac34d0eb0b3b7d7a31b67e49e8aec536))


### Features

* bump patches compatibility to v17.36.37 ([ccda840](https://github.com/LeddaZ/revanced-patches/commit/ccda84002f6b566007b82c5fe4329cf3c891580d))
* **sponsorblock:** string for response error code 400 ([#512](https://github.com/LeddaZ/revanced-patches/issues/512)) ([8a60b64](https://github.com/LeddaZ/revanced-patches/commit/8a60b648c08d1ad4b9cea2ff048303e6ab6217b5))

# [2.32.0](https://github.com/LeddaZ/revanced-patches/compare/v2.31.0...v2.32.0) (2022-09-17)


### Features

* **amoled:** remove in favour of `theme` patch ([5b6c04d](https://github.com/LeddaZ/revanced-patches/commit/5b6c04df83d6a08c60f77e031556cb917e400e64))
* **theme:** arbitrary background color for dark theme ([6323a4f](https://github.com/LeddaZ/revanced-patches/commit/6323a4f36f314405a3eca4b807dcc0afc95f873d))

# [2.31.0](https://github.com/LeddaZ/revanced-patches/compare/v2.30.0...v2.31.0) (2022-09-15)


### Bug Fixes

* `auto-captions` patch switch description ([#488](https://github.com/LeddaZ/revanced-patches/issues/488)) ([fbeedc0](https://github.com/LeddaZ/revanced-patches/commit/fbeedc0533138647b0eb89440fd3710085ab0836))
* alignment of download button icon ([#477](https://github.com/LeddaZ/revanced-patches/issues/477)) ([ba0764d](https://github.com/LeddaZ/revanced-patches/commit/ba0764d2b6d0210e6f90d1746c2fa43f50127c4e))


### Features

* `disable-auto-captions` patch ([#435](https://github.com/LeddaZ/revanced-patches/issues/435)) ([ac5720f](https://github.com/LeddaZ/revanced-patches/commit/ac5720fe6c08d6859c3c1f4551163168f82e9f14))
* bump YouTube Music patches to v5.23.50 ([#462](https://github.com/LeddaZ/revanced-patches/issues/462)) ([5e8a5db](https://github.com/LeddaZ/revanced-patches/commit/5e8a5dbcffdd3a0ba6628fc873cf99355a6aa45d))
* patch requests issue template ([#467](https://github.com/LeddaZ/revanced-patches/issues/467)) ([0c2287d](https://github.com/LeddaZ/revanced-patches/commit/0c2287d8dd0795f2670faea183845d11783a4eff)), closes [revanced/revanced-patches#463](https://github.com/revanced/revanced-patches/issues/463)

# [2.30.0](https://github.com/LeddaZ/revanced-patches/compare/v2.29.1...v2.30.0) (2022-09-12)


### Features

* Remove non-YT/YTM patches ([6a24ff3](https://github.com/LeddaZ/revanced-patches/commit/6a24ff33117e0ea8f730ce40562387ac49cfb921))

## [2.29.1](https://github.com/LeddaZ/revanced-patches/compare/v2.29.0...v2.29.1) (2022-09-12)


### Bug Fixes

* design language for download icon ([#464](https://github.com/LeddaZ/revanced-patches/issues/464)) ([434faf2](https://github.com/LeddaZ/revanced-patches/commit/434faf29a09c64f2f7aab04e28f4604514bb5563))
* path for download icon ([#465](https://github.com/LeddaZ/revanced-patches/issues/465)) ([636b6a9](https://github.com/LeddaZ/revanced-patches/commit/636b6a9bfea52d005763318fb8bbe421ad483881))

# [2.29.0](https://github.com/LeddaZ/revanced-patches/compare/v2.28.1...v2.29.0) (2022-09-09)


### Bug Fixes

* cleanup & trigger release for ThemePatch ([72e91ee](https://github.com/LeddaZ/revanced-patches/commit/72e91eeb0801edac8d8291be84d442dbc41fcbe8)), closes [#447](https://github.com/LeddaZ/revanced-patches/issues/447) [revanced/revanced-patcher#99](https://github.com/revanced/revanced-patcher/issues/99)
* multiple compatible pkgs on readme ([09afd64](https://github.com/LeddaZ/revanced-patches/commit/09afd645d6d8734e750114ad11b0f396e1d0dceb))
* wrap theme option ([2a1de39](https://github.com/LeddaZ/revanced-patches/commit/2a1de3977c7463b001be863f073131ebaaecb2f1))


### Features

* add deprecated & options to patches.json ([ef2a795](https://github.com/LeddaZ/revanced-patches/commit/ef2a7955f5aaf16f535590dd259ff853f8e560f6))
* Theme Patch ([#440](https://github.com/LeddaZ/revanced-patches/issues/440)) ([925f8d8](https://github.com/LeddaZ/revanced-patches/commit/925f8d8d645ce906359ad52451cdd4c2f281e43d))

## [2.28.1](https://github.com/LeddaZ/revanced-patches/compare/v2.28.0...v2.28.1) (2022-09-03)


### Bug Fixes

* don't respect primary color for the download button icon ([#424](https://github.com/LeddaZ/revanced-patches/issues/424)) ([62d1fe5](https://github.com/LeddaZ/revanced-patches/commit/62d1fe517880ecf6bd60147a2178bd6f7a218404))

# [2.28.0](https://github.com/LeddaZ/revanced-patches/compare/v2.27.0...v2.28.0) (2022-09-02)


### Bug Fixes

* do not constrain `amoled` patch to versions ([#408](https://github.com/LeddaZ/revanced-patches/issues/408)) ([eb524ee](https://github.com/LeddaZ/revanced-patches/commit/eb524ee306ecaea1188d6c11673f1c4bdb21b3f6))
* partial ad blockage in `tiktok-ads` patch ([#420](https://github.com/LeddaZ/revanced-patches/issues/420)) ([f9e6b88](https://github.com/LeddaZ/revanced-patches/commit/f9e6b88913f157c647ed8601cd72b15aae3495c3))
* resolve fingerprint in `premium-icon-reddit` patch ([#413](https://github.com/LeddaZ/revanced-patches/issues/413)) ([c253ec8](https://github.com/LeddaZ/revanced-patches/commit/c253ec80e473bbd66347345bfeef441fc630074f))
* wrong dependency version ([a1160fd](https://github.com/LeddaZ/revanced-patches/commit/a1160fdbe427abc90d6f1c79c1c9a77980bb38d9))


### Features

* `tiktok-download` and `tiktok-seekbar` patch ([#405](https://github.com/LeddaZ/revanced-patches/issues/405)) ([9dee12e](https://github.com/LeddaZ/revanced-patches/commit/9dee12e32c62c277105e85d36a23933fd7e21992))
* bump YouTube Music patches to v5.22.54 ([#409](https://github.com/LeddaZ/revanced-patches/issues/409)) ([e198a87](https://github.com/LeddaZ/revanced-patches/commit/e198a876c440512093745307cf00a2abbeee61d9))

# [2.27.0](https://github.com/LeddaZ/revanced-patches/compare/v2.26.0...v2.27.0) (2022-08-30)


### Bug Fixes

* `seekbar-tapping` toggling ([#401](https://github.com/LeddaZ/revanced-patches/issues/401)) ([65a6145](https://github.com/LeddaZ/revanced-patches/commit/65a61451cbdb3c46b6c6553f0d96f01dd95553c5))
* add `patches.json` as a release asset ([6a4ed89](https://github.com/LeddaZ/revanced-patches/commit/6a4ed897bcd41ef5b48a6febb1aa1111903b32f0))
* don't overwrite register in `compact-header` patch ([#406](https://github.com/LeddaZ/revanced-patches/issues/406)) ([7e7cba8](https://github.com/LeddaZ/revanced-patches/commit/7e7cba886acc8584a2e07c0710541566b23b2540))
* release `patches.json` file ([#402](https://github.com/LeddaZ/revanced-patches/issues/402)) ([57943ff](https://github.com/LeddaZ/revanced-patches/commit/57943ff427a0c551f1600fc2cb1ac5ad567c17fd))
* run meta generator ([0d8bc16](https://github.com/LeddaZ/revanced-patches/commit/0d8bc16d19f2e83df7b4aaef8cc30563f4bbb7ed))


### Features

* `premium-icon-reddit` patch ([#333](https://github.com/LeddaZ/revanced-patches/issues/333)) ([88aaddc](https://github.com/LeddaZ/revanced-patches/commit/88aaddc20fa036a908da07b0b8b3fe35414030b2))
* Add JSON meta ([182379f](https://github.com/LeddaZ/revanced-patches/commit/182379f2033095a9367fb214d1f54b866b529443))
* blacklist `.vsc` folder in `.gitignore` ([#331](https://github.com/LeddaZ/revanced-patches/issues/331)) ([da45961](https://github.com/LeddaZ/revanced-patches/commit/da45961c6b41982cafd6ec674e21dc850c6b0665))
* bump YouTube Music patches to v5.21.52 ([#404](https://github.com/LeddaZ/revanced-patches/issues/404)) ([ff8297b](https://github.com/LeddaZ/revanced-patches/commit/ff8297bde73ca9ac9e0079e9560a93d702631a36))
* bump youtube version to v17.33.42 ([#398](https://github.com/LeddaZ/revanced-patches/issues/398)) ([02e0a92](https://github.com/LeddaZ/revanced-patches/commit/02e0a920662bf6f8559a7be973da40895236928f))

# [2.26.0](https://github.com/LeddaZ/revanced-patches/compare/v2.25.0...v2.26.0) (2022-08-27)


### Bug Fixes

* package name for Vanced ([#390](https://github.com/LeddaZ/revanced-patches/issues/390)) ([c044e0b](https://github.com/LeddaZ/revanced-patches/commit/c044e0bb5cce21313b1560acaeb8d085aa165d5b))


### Features

* add debug switch ([#391](https://github.com/LeddaZ/revanced-patches/issues/391)) ([60fa8fa](https://github.com/LeddaZ/revanced-patches/commit/60fa8fabba3aecf44db891f912de51b617ab901d))

# [2.25.0](https://github.com/LeddaZ/revanced-patches/compare/v2.24.0...v2.25.0) (2022-08-26)


### Bug Fixes

* `Patch` annotation for `client-spoof` patch ([0058d8e](https://github.com/LeddaZ/revanced-patches/commit/0058d8e1137215c5c52833f029c74271d28bed62))
* changed default value for autorepeat setting ([#386](https://github.com/LeddaZ/revanced-patches/issues/386)) ([746cdca](https://github.com/LeddaZ/revanced-patches/commit/746cdca4062ea213f6ade2b1bff07c44ea53242b))


### Features

* `client-spoof` patch ([275f119](https://github.com/LeddaZ/revanced-patches/commit/275f119066d7c14a0ed32da6b39b91bd083e0eff))

# [2.24.0](https://github.com/LeddaZ/revanced-patches/compare/v2.23.0...v2.24.0) (2022-08-23)


### Bug Fixes

* add missing switch for `tablet-mini-player` patch ([50bb9ab](https://github.com/LeddaZ/revanced-patches/commit/50bb9abaf8a8b5e14610ade33a31e0a51684f985))
* correct title for `tablet-miniplayer` setting switch ([41c788b](https://github.com/LeddaZ/revanced-patches/commit/41c788b0e4930135b97521679a66b8657c38b22c))
* default values for settings ([1582621](https://github.com/LeddaZ/revanced-patches/commit/1582621586fa6005e32dec688fe33cc7e7d52262))


### Features

* `downloads` patch ([#215](https://github.com/LeddaZ/revanced-patches/issues/215)) ([0ccbaa5](https://github.com/LeddaZ/revanced-patches/commit/0ccbaa56e5b51a543637c46f2ef2421072b746a8))
* `settings` patch framework ([#266](https://github.com/LeddaZ/revanced-patches/issues/266)) ([f8afc2a](https://github.com/LeddaZ/revanced-patches/commit/f8afc2a2ec9cec9ebbc29f7c529f54f47fb9b198))
* setting for downloader package name ([227b2f4](https://github.com/LeddaZ/revanced-patches/commit/227b2f444aedaf1ecc8c65da9fdbf89990c325d5))
* v17.29.34 compatibility for `downloads` patch ([#374](https://github.com/LeddaZ/revanced-patches/issues/374)) ([6915216](https://github.com/LeddaZ/revanced-patches/commit/69152168ff2b46bd29d987da848e655b3c72f455))

# [2.23.0](https://github.com/LeddaZ/revanced-patches/compare/v2.22.0...v2.23.0) (2022-08-21)


### Bug Fixes

* make `custom-branding` cross-platform ([#366](https://github.com/LeddaZ/revanced-patches/issues/366)) ([9e86b4b](https://github.com/LeddaZ/revanced-patches/commit/9e86b4b098deea6476b59125df298f19dc79b619))


### Features

* bump YouTube patches to `v17.32.35` ([#347](https://github.com/LeddaZ/revanced-patches/issues/347)) ([504a9fb](https://github.com/LeddaZ/revanced-patches/commit/504a9fb7819ad8b3b8cf48ad5193a4fd1b8aa051))
* bundle `dex` file into `jar` file ([#359](https://github.com/LeddaZ/revanced-patches/issues/359)) ([3ece187](https://github.com/LeddaZ/revanced-patches/commit/3ece187b970f1da64f084229e2d4921dcd916fb1))

# [2.22.0](https://github.com/LeddaZ/revanced-patches/compare/v2.21.0...v2.22.0) (2022-08-17)


### Bug Fixes

* add missing switch for tablet mini-player ([0664584](https://github.com/LeddaZ/revanced-patches/commit/066458453b743007f0cc2d4150f5c188553740b1))
* disable cast modules in YouTube Music ([#337](https://github.com/LeddaZ/revanced-patches/issues/337)) ([96e50e3](https://github.com/LeddaZ/revanced-patches/commit/96e50e36455c883de62b21ac296a05ef05211852))


### Features

* `swipe-controls` override volume button behaviour ([#285](https://github.com/LeddaZ/revanced-patches/issues/285)) ([e630219](https://github.com/LeddaZ/revanced-patches/commit/e6302196c1edd355b1148dcff85799abcc4cf0da))
* `tablet-mini-player` patch ([44ae812](https://github.com/LeddaZ/revanced-patches/commit/44ae8122a673db2672ea13d4a738cc73f3c86407))
* `tiktok-ads` patch ([#335](https://github.com/LeddaZ/revanced-patches/issues/335)) ([13daf1a](https://github.com/LeddaZ/revanced-patches/commit/13daf1a78e7997a97f85dcae88caa63402e84a03))
* ˋpflotsh-ecmwf-subscription-unlockˋ patch ([#332](https://github.com/LeddaZ/revanced-patches/issues/332)) ([e405a54](https://github.com/LeddaZ/revanced-patches/commit/e405a5449fa5672124ccf2ec04a9530a70dbbed2))

# [2.21.0](https://github.com/LeddaZ/revanced-patches/compare/v2.20.0...v2.21.0) (2022-08-11)


### Bug Fixes

* incorrect compatibilty attribute ([#296](https://github.com/LeddaZ/revanced-patches/issues/296)) ([6af4e27](https://github.com/LeddaZ/revanced-patches/commit/6af4e27583ecb98bb3f011e0d787d8ace98bf3d4))
* spoof `X-Android-Cert` of Firebase `authToken` api request ([#315](https://github.com/LeddaZ/revanced-patches/issues/315)) ([c3fa2bd](https://github.com/LeddaZ/revanced-patches/commit/c3fa2bd635fceceaed1cbdb6b5b651041c0ea33a))


### Features

* `promo-code-unlock` patch ([#292](https://github.com/LeddaZ/revanced-patches/issues/292)) ([6822063](https://github.com/LeddaZ/revanced-patches/commit/68220634f5479b937c59d93d779d3b35137a4f92))
* bump music patches to 5.17.51 ([#307](https://github.com/LeddaZ/revanced-patches/issues/307)) ([6f73368](https://github.com/LeddaZ/revanced-patches/commit/6f733689b703b1863110cadbabba8b890dd04c6d))

# [2.20.0](https://github.com/LeddaZ/revanced-patches/compare/v2.19.2...v2.20.0) (2022-08-03)


### Bug Fixes

* incorrect fingerprint version [skip ci] ([8cf0a51](https://github.com/LeddaZ/revanced-patches/commit/8cf0a518631095c1271017131151279c3073daae))
* migrate to new patcher api ([98edfdf](https://github.com/LeddaZ/revanced-patches/commit/98edfdf93cb783eb056173b09f62981e1e0f3e4a))
* remove requirement for solution [skip ci] ([#271](https://github.com/LeddaZ/revanced-patches/issues/271)) ([5cb636e](https://github.com/LeddaZ/revanced-patches/commit/5cb636e80b7a4f5b26c1e1b4f803fea79dda640c))
* rollback to `Dependencies` annotation ([bc2b54e](https://github.com/LeddaZ/revanced-patches/commit/bc2b54e6dd202478cdcdcc21d4aabdf936c19594))


### Features

* add "Application Icon Path" option to branding ([4bd3030](https://github.com/LeddaZ/revanced-patches/commit/4bd30308da291a8f74c01daf76f163bdbc384250))
* add "Application Name" option to branding and move renaming to CustomBrandingPatch.kt ([ee2f923](https://github.com/LeddaZ/revanced-patches/commit/ee2f9230e0ade693451d88df5a9c785fa0e0a4e2))
* remove `force-vp9-codec` patch ([#287](https://github.com/LeddaZ/revanced-patches/issues/287)) ([9ad16a3](https://github.com/LeddaZ/revanced-patches/commit/9ad16a3efbc91af8c7092c8d77274bec73ae6201))
* set the correct theme of the settings screen ([0a7e6d4](https://github.com/LeddaZ/revanced-patches/commit/0a7e6d44a2e19d616854caf99ad9dcf2bdbc64d7))

## [2.19.2](https://github.com/LeddaZ/revanced-patches/compare/v2.19.1...v2.19.2) (2022-08-01)


### Bug Fixes

* add missing permission to reboot app ([#260](https://github.com/LeddaZ/revanced-patches/issues/260)) ([a729c15](https://github.com/LeddaZ/revanced-patches/commit/a729c1568f8f262b4b486aa8b67d5ba631c2cbb6))

## [2.19.1](https://github.com/LeddaZ/revanced-patches/compare/v2.19.0...v2.19.1) (2022-07-31)


### Bug Fixes

* Revert "fix: specify `custom-music-branding` compatibility properly" ([1fdc6df](https://github.com/LeddaZ/revanced-patches/commit/1fdc6dfe3088f41606d331c7470b582fc9d6de87))

# [2.19.0](https://github.com/LeddaZ/revanced-patches/compare/v2.18.1...v2.19.0) (2022-07-31)


### Bug Fixes

* specify `custom-music-branding` compatibility properly ([f45fb41](https://github.com/LeddaZ/revanced-patches/commit/f45fb41d8f95f1356addf0f3dc6d372461de45c9))


### Features

* `ResourceUtils` helper class ([cf7dfe7](https://github.com/LeddaZ/revanced-patches/commit/cf7dfe735c5cf95fbf01350c5d9eeadcf3f97817))
* `settings` patch ([1231116](https://github.com/LeddaZ/revanced-patches/commit/12311168d45ce6939293cb1b56108d5c77931999))
* add `custom-video-buffer` patch ([aec7a48](https://github.com/LeddaZ/revanced-patches/commit/aec7a48bbf7036e7724b261efcba77121a61331e))

## [2.18.1](https://github.com/LeddaZ/revanced-patches/compare/v2.18.0...v2.18.1) (2022-07-30)


### Bug Fixes

* actually call `VideoInformation.setCurrentVideoId` first ([2b08929](https://github.com/LeddaZ/revanced-patches/commit/2b08929300b144bd4cebae079edcf7e8eaea2885))

# [2.18.0](https://github.com/LeddaZ/revanced-patches/compare/v2.17.0...v2.18.0) (2022-07-28)


### Features

* add custom-branding-music patch* ([8469810](https://github.com/LeddaZ/revanced-patches/commit/8469810742cb65d09bed8d91cb6e889d38b89408))

# [2.17.0](https://github.com/LeddaZ/revanced-patches/compare/v2.16.0...v2.17.0) (2022-07-27)


### Bug Fixes

* `default-video-quality` patch crashing ([#227](https://github.com/LeddaZ/revanced-patches/issues/227)) ([924da46](https://github.com/LeddaZ/revanced-patches/commit/924da46860dd2e31cc1b21b711d8c8caadb837f1))
* add v17.28.34 compatiblity for the `hide-shorts-button` patch ([#224](https://github.com/LeddaZ/revanced-patches/issues/224)) ([3c8f9fb](https://github.com/LeddaZ/revanced-patches/commit/3c8f9fbb8fd7d64df66f30c0e22ac6008e6fc95a))
* bump youtube version to 17.28.34 ([#225](https://github.com/LeddaZ/revanced-patches/issues/225)) ([c4cc33d](https://github.com/LeddaZ/revanced-patches/commit/c4cc33d6d138991f4ee40fde9408184b906ef831))
* bump youtube version to 17.29.34 ([#236](https://github.com/LeddaZ/revanced-patches/issues/236)) ([1e7b945](https://github.com/LeddaZ/revanced-patches/commit/1e7b945cec16fdd8adce9f44a37f8897b3145165))
* exclude `swipe-controls` by default due to instability ([0eee79b](https://github.com/LeddaZ/revanced-patches/commit/0eee79b0870ac048e8529a87e8f1cf77f383c1c2))
* remove broken video-quality patch ([d76bb82](https://github.com/LeddaZ/revanced-patches/commit/d76bb8223abf54bac5b712bcefecec219e44725d))
* rename `default-video-quality` to `remember-video-quality` ([143029c](https://github.com/LeddaZ/revanced-patches/commit/143029c9bf7631849bc0feabb159cf4300eaa4c6))
* rename autorepeat-by-default patch to always-autorepeat ([9b5d78d](https://github.com/LeddaZ/revanced-patches/commit/9b5d78db6ff2ba8c561548528ed64fbc94686130))


### Features

* `default-video-quality` patch ([#141](https://github.com/LeddaZ/revanced-patches/issues/141)) ([f75a7bf](https://github.com/LeddaZ/revanced-patches/commit/f75a7bfef5e7fe4eb66713fef7576c2cc0fa3432))
* `general-reddit-ads` patch ([#235](https://github.com/LeddaZ/revanced-patches/issues/235)) ([ca041e8](https://github.com/LeddaZ/revanced-patches/commit/ca041e83f5c9c7a6d3c7b743f7195b833a7909a7))
* `music-microg-support` patch ([#208](https://github.com/LeddaZ/revanced-patches/issues/208)) ([0a05af4](https://github.com/LeddaZ/revanced-patches/commit/0a05af4fceff1e61d48b69536b2a227157c35114))
* bump compatibility of YouTube Music patches to v5.16.51 ([#238](https://github.com/LeddaZ/revanced-patches/issues/238)) ([b192689](https://github.com/LeddaZ/revanced-patches/commit/b192689e5f6f17f33fa3519b8db7192304786f32))
* twitter `timeline-ads` patch ([#222](https://github.com/LeddaZ/revanced-patches/issues/222)) ([c6a0d7b](https://github.com/LeddaZ/revanced-patches/commit/c6a0d7beff56dbf3a87b0f189e4fe41f2a2dddff))

# [2.16.0](https://github.com/LeddaZ/revanced-patches/compare/v2.15.0...v2.16.0) (2022-07-22)


### Bug Fixes

* `minimized-playback` patch for YouTube Kids videos ([#201](https://github.com/LeddaZ/revanced-patches/issues/201)) ([0c9b438](https://github.com/LeddaZ/revanced-patches/commit/0c9b438731d327e0c8fbdd50c44a065c39b23fd7))
* `old-quality-layout` patch ([28983e1](https://github.com/LeddaZ/revanced-patches/commit/28983e151857cb52cdb1058a2dbc635d94e7ae9a))
* autoplay not working. ([176245e](https://github.com/LeddaZ/revanced-patches/commit/176245e91be60be08bfa3d7d202eb0d772f72e66))
* autoplay still enabled when using patch ([51f1ebc](https://github.com/LeddaZ/revanced-patches/commit/51f1ebcfdfb01066419ce4317d1ed2c5e63580b6))
* bump youtube version to 17.27.39 ([791961c](https://github.com/LeddaZ/revanced-patches/commit/791961cebd674023e144ea4db32750215e263569))
* check if node has attributes before accessing them ([dc87c25](https://github.com/LeddaZ/revanced-patches/commit/dc87c250c9b3941bd30cc67a0d753fbc0de2d3ab))
* compatibility of `force-vp9-codec-parent-fingerprint` fingerprint with version `17.27.39` ([3401b07](https://github.com/LeddaZ/revanced-patches/commit/3401b072d70fb4eb35517248ac5afaf177035f17))
* crash when using force-vp9-codec patch ([68b254f](https://github.com/LeddaZ/revanced-patches/commit/68b254f46e5cd18c2b8aa155f5b14258dd38c2d5))
* disable-fullscreen-panels patch not working ([#213](https://github.com/LeddaZ/revanced-patches/issues/213)) ([80a41fd](https://github.com/LeddaZ/revanced-patches/commit/80a41fd805b8e610b6f611ba742c2a71d3a58a41))
* make all patches toggleable with settings ([#202](https://github.com/LeddaZ/revanced-patches/issues/202)) ([99c540a](https://github.com/LeddaZ/revanced-patches/commit/99c540ab8c56638baa40a01fede8fb5104aeaa8c))
* references to integrations in `return-youtube-dislike` patch ([71a490e](https://github.com/LeddaZ/revanced-patches/commit/71a490e22e0ac5d80e73fc7e3e46911a2939e528))
* use dependency in correct patch ([7ef67d2](https://github.com/LeddaZ/revanced-patches/commit/7ef67d253995ab3f1f2d61d459a3d52fd1082b6c))


### Features

* `compact-header` patch ([409ece5](https://github.com/LeddaZ/revanced-patches/commit/409ece5351f52cb31951295aa7b584be8b50a8d2))
* `force-vp9-codec` patch ([#157](https://github.com/LeddaZ/revanced-patches/issues/157)) ([ce7bf4c](https://github.com/LeddaZ/revanced-patches/commit/ce7bf4cf1c774a5e2c8627cbc83a7f059fa57cc5))
* `hide-get-premium` patch ([#195](https://github.com/LeddaZ/revanced-patches/issues/195)) ([5d870fe](https://github.com/LeddaZ/revanced-patches/commit/5d870fe26037a023d6d5f2feffb8a812634deb5b))
* `minimize-playback-music` patch ([#200](https://github.com/LeddaZ/revanced-patches/issues/200)) ([c07c9ee](https://github.com/LeddaZ/revanced-patches/commit/c07c9ee9ebba69c96391356020ca505666a8a890))
* `sponsorblock` patch ([#101](https://github.com/LeddaZ/revanced-patches/issues/101)) ([7b9ce27](https://github.com/LeddaZ/revanced-patches/commit/7b9ce27af6f8654d56a0a5b0c7431171665ccab5)), closes [#89](https://github.com/LeddaZ/revanced-patches/issues/89) [#90](https://github.com/LeddaZ/revanced-patches/issues/90)

# [2.15.0](https://github.com/LeddaZ/revanced-patches/compare/v2.14.5...v2.15.0) (2022-07-16)


### Bug Fixes

* `codecs-unlock` patch and update Music patches to `5.14.53` ([5788dee](https://github.com/LeddaZ/revanced-patches/commit/5788dee39c3178662833b5c64e00b01ccaf015f4))


### Features

* `music-video-ads` patch ([#172](https://github.com/LeddaZ/revanced-patches/issues/172)) ([6609dc2](https://github.com/LeddaZ/revanced-patches/commit/6609dc2021e40f80964e2b7bf8cfac7771497c50))
* `return-youtube-dislikes` patch ([#175](https://github.com/LeddaZ/revanced-patches/issues/175)) ([8491a52](https://github.com/LeddaZ/revanced-patches/commit/8491a52ff1fa9c86fa1c42694f413732a01465c6))

## [2.14.5](https://github.com/LeddaZ/revanced-patches/compare/v2.14.4...v2.14.5) (2022-07-14)


### Bug Fixes

* `swipe-controls` with active engagement panel ([#177](https://github.com/LeddaZ/revanced-patches/issues/177)) ([caa685f](https://github.com/LeddaZ/revanced-patches/commit/caa685fa446b1df1325d765dde74cad7656fe5b2))

## [2.14.4](https://github.com/LeddaZ/revanced-patches/compare/v2.14.3...v2.14.4) (2022-07-13)


### Bug Fixes

* constrain `old-quality-layout` to older version ([6280337](https://github.com/LeddaZ/revanced-patches/commit/6280337141694ce21dc8163df4f6330f4fad1534))

## [2.14.3](https://github.com/LeddaZ/revanced-patches/compare/v2.14.2...v2.14.3) (2022-07-13)


### Bug Fixes

* `exclusive-audio-playback` patch ([#153](https://github.com/LeddaZ/revanced-patches/issues/153)) ([551fe4e](https://github.com/LeddaZ/revanced-patches/commit/551fe4e8b8de97621b41e76e79e43b550bdd7ecf))
* `hdr-auto-brightness` ([#152](https://github.com/LeddaZ/revanced-patches/issues/152)) ([8b20b39](https://github.com/LeddaZ/revanced-patches/commit/8b20b39b5e7f49ad50f6da2d3b524dee23fa6f44))

## [2.14.2](https://github.com/LeddaZ/revanced-patches/compare/v2.14.1...v2.14.2) (2022-07-11)


### Bug Fixes

* update README template to match repo description ([7c6d479](https://github.com/LeddaZ/revanced-patches/commit/7c6d4798177bb578264380f8c8c085cf439ab7be))

## [2.14.1](https://github.com/LeddaZ/revanced-patches/compare/v2.14.0...v2.14.1) (2022-07-11)


### Bug Fixes

* bump youtube version for swipe-controls patch ([164b6ad](https://github.com/LeddaZ/revanced-patches/commit/164b6ad9c68ae196d2a9f5c9d67f73df8a3c3901))

# [2.14.0](https://github.com/LeddaZ/revanced-patches/compare/v2.13.0...v2.14.0) (2022-07-11)


### Bug Fixes

*  `autorepeat-by-default` patch ([#148](https://github.com/LeddaZ/revanced-patches/issues/148)) ([b280270](https://github.com/LeddaZ/revanced-patches/commit/b280270d86176cddedbc1055ba4512358d25e658))
* listing of wrong fingerprint class ([#147](https://github.com/LeddaZ/revanced-patches/issues/147)) ([c1fa5bf](https://github.com/LeddaZ/revanced-patches/commit/c1fa5bf1d5f571a4be7156c1f7d706a4d415ff02))


### Features

* `swipe-controls` rewrite ([#131](https://github.com/LeddaZ/revanced-patches/issues/131)) ([d649f15](https://github.com/LeddaZ/revanced-patches/commit/d649f157868515b5facb2266177b3068ad4190e7))

# [2.13.0](https://github.com/LeddaZ/revanced-patches/compare/v2.12.2...v2.13.0) (2022-07-10)


### Features

* use custom icons for custom-branding patch ([933a26d](https://github.com/LeddaZ/revanced-patches/commit/933a26da5dad046cc64790956941e1ea2809c4ca))

## [2.12.2](https://github.com/revanced/revanced-patches/compare/v2.12.1...v2.12.2) (2022-07-10)


### Bug Fixes

* display codename for patch names ([10c53f7](https://github.com/revanced/revanced-patches/commit/10c53f720df3e70b9d59e8bc3219d56b996f03db))
* incorrect package name in gradle task ([152b2c9](https://github.com/revanced/revanced-patches/commit/152b2c90cf102170648fcc168da10f46743bdc63))
* invalid regex ([26bf1d8](https://github.com/revanced/revanced-patches/commit/26bf1d818f953abc061126d8b91f17cd9008ba1d))

## [2.12.1](https://github.com/revanced/revanced-patches/compare/v2.12.0...v2.12.1) (2022-07-10)

# [2.12.0](https://github.com/revanced/revanced-patches/compare/v2.11.0...v2.12.0) (2022-07-10)


### Bug Fixes

* update patches to `17.26.35` ([#142](https://github.com/revanced/revanced-patches/issues/142)) ([b04112c](https://github.com/revanced/revanced-patches/commit/b04112c8562a7b95e7555e894b665913094b33eb))
* wording [skip ci] ([ba64d9e](https://github.com/revanced/revanced-patches/commit/ba64d9efc3ee606e9bda30ad7f8017af34b1dc3f))


### Features

* issue templates ([b82b0aa](https://github.com/revanced/revanced-patches/commit/b82b0aad88b7ab9d86f1bcc8e007f6a76a9aa1a5))

# [2.11.0](https://github.com/revanced/revanced-patches/compare/v2.10.2...v2.11.0) (2022-07-09)


### Features

* `autorepeat-by-default` patch ([#106](https://github.com/revanced/revanced-patches/issues/106)) ([e0ac9f3](https://github.com/revanced/revanced-patches/commit/e0ac9f385fc360f4dd2451e26676633120356c10))

## [2.10.2](https://github.com/revanced/revanced-patches/compare/v2.10.1...v2.10.2) (2022-07-08)


### Bug Fixes

* trigger release on `build` commits ([be8bd1b](https://github.com/revanced/revanced-patches/commit/be8bd1b2a4b91f9763448661a802a5dc4a6b1d1d))

## [2.10.1](https://github.com/revanced/revanced-patches/compare/v2.10.0...v2.10.1) (2022-07-08)


### Bug Fixes

* patch description consistency ([#134](https://github.com/revanced/revanced-patches/issues/134)) ([da5896d](https://github.com/revanced/revanced-patches/commit/da5896dde0a2b2b9ffe65e486402e4ef92ec1ce9))

# [2.10.0](https://github.com/revanced/revanced-patches/compare/v2.9.4...v2.10.0) (2022-07-07)


### Features

* implement `wide-searchbar` Patch ([#130](https://github.com/revanced/revanced-patches/issues/130)) ([332f4d1](https://github.com/revanced/revanced-patches/commit/332f4d12d06316d65db252a280fe1f263e65c3a8))

## [2.9.4](https://github.com/revanced/revanced-patches/compare/v2.9.3...v2.9.4) (2022-07-06)


### Bug Fixes

* add 17.25.34 as supported version for swipe-controls patch ([4d84c19](https://github.com/revanced/revanced-patches/commit/4d84c1914f8ecf51cee25667219bc6cf635a6c1c))

## [2.9.3](https://github.com/revanced/revanced-patches/compare/v2.9.2...v2.9.3) (2022-07-06)


### Bug Fixes

* Readd `swipe-controls` patch ([#123](https://github.com/revanced/revanced-patches/issues/123)) ([7f2a2b2](https://github.com/revanced/revanced-patches/commit/7f2a2b2ee4e6045d53aba4e7705431b643981107))

## [2.9.2](https://github.com/revanced/revanced-patches/compare/v2.9.1...v2.9.2) (2022-07-05)


### Bug Fixes

* revert `swipe-controls` patch  ([66e1f33](https://github.com/revanced/revanced-patches/commit/66e1f3384a58361737ba889d946be875b23f3163))

## [2.9.1](https://github.com/revanced/revanced-patches/compare/v2.9.0...v2.9.1) (2022-07-05)


### Bug Fixes

* make `minimized-playback-manager-fingerprint` unique ([#120](https://github.com/revanced/revanced-patches/issues/120)) ([cd5e911](https://github.com/revanced/revanced-patches/commit/cd5e911f4ed9ad95b02c13c30cd9466d250e8904))

# [2.9.0](https://github.com/revanced/revanced-patches/compare/v2.8.2...v2.9.0) (2022-07-05)


### Features

* `swipe-controls` patch ([#115](https://github.com/revanced/revanced-patches/issues/115)) ([1d0a7dc](https://github.com/revanced/revanced-patches/commit/1d0a7dcc0cc3ea2bcd8ce0221d5e2f53d6eb0ae5))

## [2.8.2](https://github.com/revanced/revanced-patches/compare/v2.8.1...v2.8.2) (2022-07-05)


### Bug Fixes

* show minimized playback options in settings ([#118](https://github.com/revanced/revanced-patches/issues/118)) ([6e1a538](https://github.com/revanced/revanced-patches/commit/6e1a538d34291d75f19bf66a188bc69241de3a7a))

## [2.8.1](https://github.com/revanced/revanced-patches/compare/v2.8.0...v2.8.1) (2022-07-05)


### Bug Fixes

* remove unnecessary version constraints ([#117](https://github.com/revanced/revanced-patches/issues/117)) ([1cddf8d](https://github.com/revanced/revanced-patches/commit/1cddf8d9063da3bbdba0fd7080c8c93768b83a4c))

# [2.8.0](https://github.com/revanced/revanced-patches/compare/v2.7.0...v2.8.0) (2022-07-04)


### Features

* `enable-debugging` patch ([#116](https://github.com/revanced/revanced-patches/issues/116)) ([bb355e7](https://github.com/revanced/revanced-patches/commit/bb355e7b7e78e602a10b346fe7e5795463615a81))

# [2.7.0](https://github.com/revanced/revanced-patches/compare/v2.6.0...v2.7.0) (2022-07-03)


### Features

* `hdr-max-brightness` patch ([#105](https://github.com/revanced/revanced-patches/issues/105)) ([1310573](https://github.com/revanced/revanced-patches/commit/131057366a777786d6016d3385584b4e17bc4a8b))
* `hide-infocard-suggestions` patch ([#107](https://github.com/revanced/revanced-patches/issues/107)) ([31a767a](https://github.com/revanced/revanced-patches/commit/31a767adbb152906303ab0ae5250769fc38d0625))

# [2.6.0](https://github.com/revanced/revanced-patches/compare/v2.5.0...v2.6.0) (2022-07-02)


### Bug Fixes

* freezing panels when watching video in fullscreen ([#89](https://github.com/revanced/revanced-patches/issues/89)) ([f5d4f6c](https://github.com/revanced/revanced-patches/commit/f5d4f6c3419916c6a9cf67babc6be8a64c854d3b))
* invalid version in compatibility annotation ([#90](https://github.com/revanced/revanced-patches/issues/90)) ([df43547](https://github.com/revanced/revanced-patches/commit/df435475cdd0494a1e4ea9e2980c2998c9bc7048))
* remove refreshing home screen not working ([6c24ebe](https://github.com/revanced/revanced-patches/commit/6c24ebef2fb4f0d58e369ac5bf63e4cab6ca0e80))


### Features

* migrate to breaking changes of patcher ([d9147cd](https://github.com/revanced/revanced-patches/commit/d9147cd60c0c25d0c5cc05409b8889dfacd89af9))

# [2.6.0-dev.2](https://github.com/revanced/revanced-patches/compare/v2.6.0-dev.1...v2.6.0-dev.2) (2022-07-02)


### Bug Fixes

* remove refreshing home screen not working ([ec7ae90](https://github.com/revanced/revanced-patches/commit/ec7ae900181b6456c692adb3b5bb337e81bc5fea))

# [2.6.0-dev.1](https://github.com/revanced/revanced-patches/compare/v2.5.1-dev.1...v2.6.0-dev.1) (2022-07-02)


### Features

* migrate to breaking changes of patcher ([a116852](https://github.com/revanced/revanced-patches/commit/a11685263fb2274c67684258e73c5247502cb010))

## [2.5.1-dev.1](https://github.com/revanced/revanced-patches/compare/v2.5.0...v2.5.1-dev.1) (2022-06-30)


### Bug Fixes

* freezing panels when watching video in fullscreen ([#89](https://github.com/revanced/revanced-patches/issues/89)) ([f5d4f6c](https://github.com/revanced/revanced-patches/commit/f5d4f6c3419916c6a9cf67babc6be8a64c854d3b))
* invalid version in compatibility annotation ([#90](https://github.com/revanced/revanced-patches/issues/90)) ([df43547](https://github.com/revanced/revanced-patches/commit/df435475cdd0494a1e4ea9e2980c2998c9bc7048))

# [2.5.0](https://github.com/revanced/revanced-patches/compare/v2.4.0...v2.5.0) (2022-06-30)


### Features

* hide watermark support for 17.25.34 ([#87](https://github.com/revanced/revanced-patches/issues/87)) ([0cdb65b](https://github.com/revanced/revanced-patches/commit/0cdb65bbb3e7b9d75eb393ee87e3718bcd6af4b3))

# [2.4.0](https://github.com/revanced/revanced-patches/compare/v2.3.1...v2.4.0) (2022-06-30)


### Features

* add youtube version 17.25.34 ([#85](https://github.com/revanced/revanced-patches/issues/85)) ([889c9d5](https://github.com/revanced/revanced-patches/commit/889c9d564d16c6e68a52095a4fc8e6d04346c9e9))

## [2.3.1](https://github.com/revanced/revanced-patches/compare/v2.3.0...v2.3.1) (2022-06-30)


### Bug Fixes

* change fingerprint to work on latest youtube ([#80](https://github.com/revanced/revanced-patches/issues/80)) ([4dba323](https://github.com/revanced/revanced-patches/commit/4dba323ddf8980cd2b0908a0de41c4b4dea6b0d7))

# [2.3.0](https://github.com/revanced/revanced-patches/compare/v2.2.0...v2.3.0) (2022-06-30)


### Features

* `disable-autoplay-button` patch ([#79](https://github.com/revanced/revanced-patches/issues/79)) ([0d6fb51](https://github.com/revanced/revanced-patches/commit/0d6fb51e025649aae37e230778ea367482fab0d7))

# [2.2.0](https://github.com/revanced/revanced-patches/compare/v2.1.0...v2.2.0) (2022-06-29)


### Features

* make resource mapping patch aware of types ([#77](https://github.com/revanced/revanced-patches/issues/77)) ([188491a](https://github.com/revanced/revanced-patches/commit/188491a707abccc1164413f075d8a66c145a1455))

# [2.1.0](https://github.com/revanced/revanced-patches/compare/v2.0.3...v2.1.0) (2022-06-28)


### Features

* `custom-playback-speed` patch ([#50](https://github.com/revanced/revanced-patches/issues/50)) ([224254b](https://github.com/revanced/revanced-patches/commit/224254bcce2b394bbfd2549089f0204ce4ed4a89))

## [2.0.3](https://github.com/revanced/revanced-patches/compare/v2.0.2...v2.0.3) (2022-06-27)


### Bug Fixes

* check if resource files exist ([ba1f3af](https://github.com/revanced/revanced-patches/commit/ba1f3af99be58edc44ed1b8f1875508d5034efd8))

## [2.0.2](https://github.com/revanced/revanced-patches/compare/v2.0.1...v2.0.2) (2022-06-27)


### Bug Fixes

* some more refactoring of integrations, add hide-watermark patch ([#63](https://github.com/revanced/revanced-patches/issues/63)) ([feb09c5](https://github.com/revanced/revanced-patches/commit/feb09c56f475e2537a67d3636b08737848158a8e))

## [2.0.1](https://github.com/revanced/revanced-patches/compare/v2.0.0...v2.0.1) (2022-06-26)


### Bug Fixes

* invalid string in strings list ([f08b53b](https://github.com/revanced/revanced-patches/commit/f08b53b07d93bd8ac6e7da376ea6e6023e53076e))
* migrate to new `proxy` api ([db32ffe](https://github.com/revanced/revanced-patches/commit/db32ffe56a8e73177bef724ee10eda9a28b367b8))

# [2.0.0](https://github.com/revanced/revanced-patches/compare/v1.11.0...v2.0.0) (2022-06-26)


### Code Refactoring

* migrate from `Signature` to `Fingerprint` ([084078e](https://github.com/revanced/revanced-patches/commit/084078e7f1852ccd2045e3fa8aedc25a7fd5faa8))


### BREAKING CHANGES

* Not backwards compatible, since a lot of classes where renamed.

# [1.11.0](https://github.com/revanced/revanced-patches/compare/v1.10.5...v1.11.0) (2022-06-26)


### Features

* add youtube version 17.24.35 ([ec626cc](https://github.com/revanced/revanced-patches/commit/ec626ccfa2bcf14b722d08110382de009a1c12b4))
* add youtube version 17.24.35 ([adc60a6](https://github.com/revanced/revanced-patches/commit/adc60a6fa09f6a21800ba51b8ca888d11a17e870))

## [1.10.5](https://github.com/revanced/revanced-patches/compare/v1.10.4...v1.10.5) (2022-06-25)


### Bug Fixes

* put back proper variable ([#61](https://github.com/revanced/revanced-patches/issues/61)) ([d26c423](https://github.com/revanced/revanced-patches/commit/d26c4233031fd418eb37c8f05e9bc1857e0572e6))

## [1.10.4](https://github.com/revanced/revanced-patches/compare/v1.10.3...v1.10.4) (2022-06-23)


### Bug Fixes

* missing brackets at inlining ([8936c8a](https://github.com/revanced/revanced-patches/commit/8936c8aaedb56817cda5eec5f4a8c32f433862aa))

## [1.10.3](https://github.com/revanced/revanced-patches/compare/v1.10.2...v1.10.3) (2022-06-23)


### Bug Fixes

* get create button view register by more reliable means ([#59](https://github.com/revanced/revanced-patches/issues/59)) ([6ab821e](https://github.com/revanced/revanced-patches/commit/6ab821e377176f4e9f1b7ec2b58a924fa40299db))

## [1.10.2](https://github.com/revanced/revanced-patches/compare/v1.10.1...v1.10.2) (2022-06-23)


### Bug Fixes

* `disable-create-button` not working with prebuilt jar file ([#55](https://github.com/revanced/revanced-patches/issues/55)) ([78be64a](https://github.com/revanced/revanced-patches/commit/78be64accc2023281c0c376849cdb0213622dc5c))

## [1.10.1](https://github.com/revanced/revanced-patches/compare/v1.10.0...v1.10.1) (2022-06-23)


### Bug Fixes

* patcher not propagating dexlib ([980c486](https://github.com/revanced/revanced-patches/commit/980c48673259496d793bc7f864ad355188dcf7b6))
* update patcher version ([e3d0bb7](https://github.com/revanced/revanced-patches/commit/e3d0bb7ee1923ea996cf637267c62d233a74c7fa))

# [1.10.0](https://github.com/revanced/revanced-patches/compare/v1.9.1...v1.10.0) (2022-06-23)


### Features

* add compatibility for YouTube v17.23.36 and v17.24.34 ([1812bc3](https://github.com/revanced/revanced-patches/commit/1812bc39e0e88f1ab02ae8127e9000780eedf49c))

## [1.9.1](https://github.com/revanced/revanced-patches/compare/v1.9.0...v1.9.1) (2022-06-21)


### Bug Fixes

* update patcher version ([5f54bc9](https://github.com/revanced/revanced-patches/commit/5f54bc9aa8fd8b83448141a9b05746e3e977369d))

# [1.9.0](https://github.com/revanced/revanced-patches/compare/v1.8.2...v1.9.0) (2022-06-21)


### Features

* use `install` mode by default ([c2b2993](https://github.com/revanced/revanced-patches/commit/c2b299336a984d66a2d066e5ebe9c4f9bee5c2aa))

## [1.8.2](https://github.com/revanced/revanced-patches/compare/v1.8.1...v1.8.2) (2022-06-20)


### Bug Fixes

* migrate to breaking changes from patcher ([2c0a419](https://github.com/revanced/revanced-patches/commit/2c0a4196fed2fbdcd454ed882b720898d3050c51))
* old usage of `toInstructions` extension method ([65ddd52](https://github.com/revanced/revanced-patches/commit/65ddd522dca19e0590d9cb6fdb2d85ad7b98481e))

## [1.8.1](https://github.com/revanced/revanced-patches/compare/v1.8.0...v1.8.1) (2022-06-20)


### Bug Fixes

* add execute permission to `./gradlew` file ([ff7a560](https://github.com/revanced/revanced-patches/commit/ff7a5602f68428111fea6c60cbea694592039ef1))

# [1.8.0](https://github.com/revanced/revanced-patches/compare/v1.7.0...v1.8.0) (2022-06-20)


### Features

* bump compatibility of patches for Youtube to v17.23.35 ([3748d05](https://github.com/revanced/revanced-patches/commit/3748d0533e62a8871ab2202ce9b61170a90dae62))

# [1.7.0](https://github.com/revanced/revanced-patches/compare/v1.6.4...v1.7.0) (2022-06-20)


### Features

* `disable-fullscreen-panels` patch ([3bf0561](https://github.com/revanced/revanced-patches/commit/3bf056163500b006d1a20c5f3a3e0c92fec13bd8))

## [1.6.4](https://github.com/revanced/revanced-patches/compare/v1.6.3...v1.6.4) (2022-06-19)


### Bug Fixes

* update patcher version ([#35](https://github.com/revanced/revanced-patches/issues/35)) ([1a379df](https://github.com/revanced/revanced-patches/commit/1a379dfd974b9f92d4bd0d5d7a4711eb6d1060b3)), closes [#34](https://github.com/revanced/revanced-patches/issues/34)

## [1.6.3](https://github.com/revanced/revanced-patches/compare/v1.6.2...v1.6.3) (2022-06-16)


### Bug Fixes

* wrong dex path ([170fbbb](https://github.com/revanced/revanced-patches/commit/170fbbb99e4a2dbe3e0febe44d07a692aa9d7224))

## [1.6.2](https://github.com/revanced/revanced-patches/compare/v1.6.1...v1.6.2) (2022-06-16)


### Bug Fixes

* broken gradle task ([91483a8](https://github.com/revanced/revanced-patches/commit/91483a8fbf92559d079dc52f846f5f871f5d6b5c))

## [1.6.1](https://github.com/revanced/revanced-patches/compare/v1.6.0...v1.6.1) (2022-06-16)


### Bug Fixes

* broken gradle task ([4d07961](https://github.com/revanced/revanced-patches/commit/4d07961c8afd24da7f8879d11419147f2e100f05))

# [1.6.0](https://github.com/revanced/revanced-patches/compare/v1.5.3...v1.6.0) (2022-06-16)


### Bug Fixes

* broken gradle task ([28e3f55](https://github.com/revanced/revanced-patches/commit/28e3f554ea6a7144416523fe48ce7adbb613b263))


### Features

* generate dex files using gradle task ([c34c1be](https://github.com/revanced/revanced-patches/commit/c34c1be21f50b4f720a7cd81e0dfe5ef6330caab))

## [1.5.3](https://github.com/revanced/revanced-patches/compare/v1.5.2...v1.5.3) (2022-06-16)


### Bug Fixes

* forgot about this ([7102a25](https://github.com/revanced/revanced-patches/commit/7102a25dc618f19b324b01870d23f5418f375b2a))

## [1.5.2](https://github.com/revanced/revanced-patches/compare/v1.5.1...v1.5.2) (2022-06-16)


### Bug Fixes

* dummy task for Gradle semantic-release plugin ([f6a8911](https://github.com/revanced/revanced-patches/commit/f6a8911906dfe52fcdb685daf7a02d6d0052cba9))
* releases ([30d5c9a](https://github.com/revanced/revanced-patches/commit/30d5c9a67ccf88ca6ac00d0a9f2a2e330f8092dd))

## [1.5.1](https://github.com/revanced/revanced-patches/compare/v1.5.0...v1.5.1) (2022-06-16)


### Reverts

* Revert "Changed app name to ReVanced (#21)" (#24) ([70a48c5](https://github.com/revanced/revanced-patches/commit/70a48c5f35cd236612352a1dbbf50487625e6e96)), closes [#21](https://github.com/revanced/revanced-patches/issues/21) [#24](https://github.com/revanced/revanced-patches/issues/24)

# [1.5.0](https://github.com/revanced/revanced-patches/compare/v1.4.0...v1.5.0) (2022-06-15)


### Bug Fixes

* sync version ([6170e36](https://github.com/revanced/revanced-patches/commit/6170e3689d9c8998be94a8464352af620cccd11b))


### Features

* `hide-cast-button` patch ([2cd531e](https://github.com/revanced/revanced-patches/commit/2cd531eb5a334f3cf91cba4556f07e863cd9ec1b))

# [1.4.0](https://github.com/revanced/revanced-patches/compare/v1.3.1...v1.4.0) (2022-06-15)


### Bug Fixes

* add size `48px` for `custom-branding` patch ([f81872b](https://github.com/revanced/revanced-patches/commit/f81872b8e41da215517fdb59364130d8ce681607))


### Features

* `premium-heading` patch ([78913bf](https://github.com/revanced/revanced-patches/commit/78913bf1e80f5b91d0dee506fdfe3f875e8e6988))

## [1.3.1](https://github.com/revanced/revanced-patches/compare/v1.3.0...v1.3.1) (2022-06-15)


### Bug Fixes

* `custom-branding` patch failing to get resources ([efb6d4c](https://github.com/revanced/revanced-patches/commit/efb6d4c2be515185fc9bd29c40ce202f0d684cee))

# [1.3.0](https://github.com/revanced/revanced-patches/compare/v1.2.2...v1.3.0) (2022-06-14)


### Features

* `custom-branding` patch ([0d65ea8](https://github.com/revanced/revanced-patches/commit/0d65ea8cdb0e02287f6be6855cd3d28823a61e70))

## [1.2.2](https://github.com/revanced/revanced-patches/compare/v1.2.1...v1.2.2) (2022-06-13)


### Bug Fixes

* environment variable not found in gradle build script ([0da15fb](https://github.com/revanced/revanced-patches/commit/0da15fb0effac0566d080d7b85e9fbe46c3dd34d))

## [1.2.1](https://github.com/revanced/revanced-patches/compare/v1.2.0...v1.2.1) (2022-06-12)


### Performance Improvements

* fix high battery consumption due to chromecast not working with `microg` ([dd8b01a](https://github.com/revanced/revanced-patches/commit/dd8b01a5c5d75b00ea4d04ce35bc43942c1b0409))

# [1.2.0](https://github.com/revanced/revanced-patches/compare/v1.1.0...v1.2.0) (2022-06-11)


### Bug Fixes

* migrate to `include` annotation ([110bbf1](https://github.com/revanced/revanced-patches/commit/110bbf143a9cec8dce1f0416cff40f8d93055e96))


### Features

* `microg-patch` ([48bbd57](https://github.com/revanced/revanced-patches/commit/48bbd574a52c8bf6834b26facfe7384b830f944a))
* updated all patches to support v17.22.36 of `com.android.google.youtube` ([e12dc11](https://github.com/revanced/revanced-patches/commit/e12dc11b670c2b0c414741616e0a646e8421e418))

# [1.1.0](https://github.com/revanced/revanced-patches/compare/v1.0.0...v1.1.0) (2022-06-11)


### Features

* generate & upload dex files ([#18](https://github.com/revanced/revanced-patches/issues/18)) ([e6f5355](https://github.com/revanced/revanced-patches/commit/e6f53553a98c164c4eb926fb273358ed506e00a4))

# 1.0.0 (2022-06-05)


### Bug Fixes

* `create-button-signature` ([a173f6e](https://github.com/revanced/revanced-patches/commit/a173f6e5a7e65943657e2072e8a72a4a680e5277))
* `enable-seekbar-tapping` patch ([52fd726](https://github.com/revanced/revanced-patches/commit/52fd726d9b0d2efbd0f9742fc84ad01ccdcff168))
* `Index` in wrong package ([2f9360f](https://github.com/revanced/revanced-patches/commit/2f9360f57cc8415564534fbbd8bd5e2a83a1b629))
* `minimized-playback` & `old-quality-layout` wrong opcodes ([b45d175](https://github.com/revanced/revanced-patches/commit/b45d175c6f1ece6da894ab16128c2644d262c9c7))
* `minimized-playback` patch ([55677a4](https://github.com/revanced/revanced-patches/commit/55677a44ff965c0b92c3f1d771bd68c12c142ad4))
* `SignatureChecker` not handling nullable field `methodMetadata` ([17bcf78](https://github.com/revanced/revanced-patches/commit/17bcf786a85ccf1f7d9f5a66a044a3c26def09bb))
* accidentally removed code in refactor ([0077e26](https://github.com/revanced/revanced-patches/commit/0077e26d23cc112b671a41614a55348fac2c88ca))
* add missing `trimIndent()` to string literals ([76d3c71](https://github.com/revanced/revanced-patches/commit/76d3c71b67edebd79f2cdb1bb28e4d2969d72223))
* add missing opcode for `create-button-method` ([0a398ef](https://github.com/revanced/revanced-patches/commit/0a398ef364f91a0dd9608df1a036a2515476ccf2))
* attempt on all patches ([3395d69](https://github.com/revanced/revanced-patches/commit/3395d69747103a4bdf314297aa0bfa6ef6a0fc36))
* breaking changes by `revanced-patcher` dependency ([e12e484](https://github.com/revanced/revanced-patches/commit/e12e484e3796c5c9c8505b677838cdf8432f2e79))
* breaking changes by `revanced-patcher` dependency ([7e485b4](https://github.com/revanced/revanced-patches/commit/7e485b4ffe204d724809aeb9bd9f693a35ded94d))
* breaking changes of the patcher ([1a49bbd](https://github.com/revanced/revanced-patches/commit/1a49bbdbc4ff6f427934259536218e161908b449))
* breaking patcher changes ([50f9cc5](https://github.com/revanced/revanced-patches/commit/50f9cc52acfd5bc23330ecd23d8d85678a9d3eee))
* breaking patcher changes ([cbb9e2c](https://github.com/revanced/revanced-patches/commit/cbb9e2cd1fa829e1d1dd92dbd40131b11ae6a05b))
* breaking patcher changes ([581d1b0](https://github.com/revanced/revanced-patches/commit/581d1b0ca7d15adcdb1ab6116ef035acfe701757))
* bugfixes in `microg` ([a43b33b](https://github.com/revanced/revanced-patches/commit/a43b33bdbb2b36e0a8f991fa11dfeeec34de01f9))
* clean after building ([a2df3fb](https://github.com/revanced/revanced-patches/commit/a2df3fbc9761b07f3010542fa8684ade00e4dc91))
* disable `hide-suggestions-patch` patch until fixed ([99099ea](https://github.com/revanced/revanced-patches/commit/99099ea0bc12f5f25896967db642442df69d0c4f))
* incorrect endIndex (fixed in Patcher) ([424788e](https://github.com/revanced/revanced-patches/commit/424788edd777110cdaff97500556d18628f33385))
* loop in `amoled` patch ([c4c86b6](https://github.com/revanced/revanced-patches/commit/c4c86b65fd8b2463c1d86ad2e46ec9f08e60d47c))
* migrate patches to latest patcher api changes ([8a0ee03](https://github.com/revanced/revanced-patches/commit/8a0ee03a71cf4a000c9a7246d0e64ed8291a5127))
* missing extension method `doRecursively` ([e9c9460](https://github.com/revanced/revanced-patches/commit/e9c946008ee912652d288e515b83b52ae2d239d8))
* modified opcode for `show-video-ads-constructor` ([a0dcea3](https://github.com/revanced/revanced-patches/commit/a0dcea3a13f68cae449dfaf445b542e339c83ff0))
* multiple bugs in patches ([e37201d](https://github.com/revanced/revanced-patches/commit/e37201d0ceef474696857a0d8845950c888194d0))
* name for `IntegrationsPatch` ([e46ef02](https://github.com/revanced/revanced-patches/commit/e46ef02302825d62b57912b2747a25f858036bb7))
* print instruction index of warning ([9e29aee](https://github.com/revanced/revanced-patches/commit/9e29aeeeff222412f6c45cf7e4879f8ec53ca6ee))
* publish releases ([83916f9](https://github.com/revanced/revanced-patches/commit/83916f96d27989dcbb35c0ba6ef326a16b470501))
* remove `HideSuggestionsPatch` from `Index` ([f32e474](https://github.com/revanced/revanced-patches/commit/f32e4747b512c675b807ff5eebfd0b8e66173fba))
* remove unused patches ([d12e92a](https://github.com/revanced/revanced-patches/commit/d12e92aead677fefa9dcb48748d783225b65fab1))
* signature checker with changes of patcher ([e82459d](https://github.com/revanced/revanced-patches/commit/e82459d37759e1a5a860d3e7fcdf69d95b06858e))
* spelling mistake ([52f9147](https://github.com/revanced/revanced-patches/commit/52f9147ee8d591f786397d174dc02a141d9250a9))
* tests failing ([102793f](https://github.com/revanced/revanced-patches/commit/102793f24f8bf7c7fd254968b29d65da7b2b962f))
* update `HomeAdsPatch` ([62f1801](https://github.com/revanced/revanced-patches/commit/62f1801e9cbee53c0be3413c245161bd941e4aec))
* update patches ([91b8ec8](https://github.com/revanced/revanced-patches/commit/91b8ec81f33417798546c32db708fe09ada3930c))
* use the latest version of patcher dependency ([fe4a439](https://github.com/revanced/revanced-patches/commit/fe4a439cb2bc5e385ae13e8e155f25bb15e74633))
* version in package metadata of music ([b299205](https://github.com/revanced/revanced-patches/commit/b299205aa7cde82f1f55fc598de3ff8d80b8bcb0))
* **VideoAds:** remove `istore1` opcode ([dc4ec57](https://github.com/revanced/revanced-patches/commit/dc4ec574414c5df959efa0ca8f1cd39a812fedf8))
* write while reading resources and remove checking for "." in resource extensions ([7bc6094](https://github.com/revanced/revanced-patches/commit/7bc60943cb2350e89dac091ec9c98c5effd0b8a9))
* wrong access flag in signature for `Create button patch` ([9fbb89d](https://github.com/revanced/revanced-patches/commit/9fbb89d05336a256a0759eea6095e073946c45e5))
* wrong annotation and signature in patches ([a0fdee8](https://github.com/revanced/revanced-patches/commit/a0fdee81a6d6773603520e7c3040ae8637642d58))
* wrong opcode for `create-button-method` ([3214650](https://github.com/revanced/revanced-patches/commit/32146506f139aebc44cd5faffb7706b8b9c21c3d))
* wrong opcode pattern for `create-button-method` ([f4d8a85](https://github.com/revanced/revanced-patches/commit/f4d8a8525bc64b90748b21979d463977a21dcd85))
* wrong opcode pattern for `enable-seekbar-tapping-signature` ([1d83395](https://github.com/revanced/revanced-patches/commit/1d833957ed3e01188770c85e3d84e483419bd797))
* wrong opcode pattern for signature in `Hide suggestions patch` ([535aee0](https://github.com/revanced/revanced-patches/commit/535aee08408b990c80f5966c13fa84666a8b35d0))
* wrong patches in `upgrade-tab-remover` ([5182290](https://github.com/revanced/revanced-patches/commit/518229031ceca049ad790f7b77b19405d39f0ce1))
* wrong signature for `hide-reels-signature` ([2d9ff2a](https://github.com/revanced/revanced-patches/commit/2d9ff2af0a991d7721f3741187716a3b08bb4029))
* wrong signatures for patch `Old Quality Layout Patch` ([823e503](https://github.com/revanced/revanced-patches/commit/823e503d84037bdf27b09f17e63383f963c76854))
* wrong versions of patches ([a112b22](https://github.com/revanced/revanced-patches/commit/a112b22ce6e685204caab6f95f511e26ef95806b))


### Code Refactoring

* Rename `net.revanced` to `app.revanced` ([68ea89f](https://github.com/revanced/revanced-patches/commit/68ea89f15e9ea077df0d0ac20a40b735bb5ae26c))


### Features

* `Dependencies` annotation ([85806bb](https://github.com/revanced/revanced-patches/commit/85806bb355e342ecb33d4ee1e76f9edf89b2c2ee))
* `GeneralBytecodeAds` and `GeneralResourceAds` patch ([f99bbef](https://github.com/revanced/revanced-patches/commit/f99bbef4c911ac2492166c7a3792ea11ffceffab))
* `hide-shorts-button` patch ([88352ee](https://github.com/revanced/revanced-patches/commit/88352ee6ecd23faa4a7fd9f7495e67fa1d3e33bd))
* `tastebuilder-remover` for music ([a6aeca3](https://github.com/revanced/revanced-patches/commit/a6aeca31bd80b8c4a8acd071e22faca6e136bdb0))
* Add (WIP) Signature Checker ([ae4c7b2](https://github.com/revanced/revanced-patches/commit/ae4c7b29f211c461de460f97f3a8656e795adafb))
* add `amoled` patch ([d61bac4](https://github.com/revanced/revanced-patches/commit/d61bac4f8243d0ef72ca91c7c1d5facd858d515e))
* add home ads patch ([36cddd1](https://github.com/revanced/revanced-patches/commit/36cddd1488683e19e2b927e34c80a4f0f3cace35))
* add patches compatibility to the newest version ([799401d](https://github.com/revanced/revanced-patches/commit/799401ddf99da0aaa5f52c39d3d3d4061370fd75))
* add publishing to package registry ([b475e09](https://github.com/revanced/revanced-patches/commit/b475e09577db4dda7bbb45dbf170d78772834a6d))
* add semantic-release ([d60f1d0](https://github.com/revanced/revanced-patches/commit/d60f1d06798d312b158b71691ecc87e828dccbc1))
* added `codecs-unlock` patch ([e5fd7ce](https://github.com/revanced/revanced-patches/commit/e5fd7cece94b1ff5342178f59b29576db806e0f6))
* begin `MicroG Patch` ([91474ba](https://github.com/revanced/revanced-patches/commit/91474ba07376c13e7a71685dfd8b6e6913ed5ee9))
* display metadata for each signature in `SignatureChecker` ([736a71f](https://github.com/revanced/revanced-patches/commit/736a71fac21a32dbb1eef9c3a9f0d3005e7d9ca0))
* get required register dynamically ([0924ca2](https://github.com/revanced/revanced-patches/commit/0924ca2ad30ae865dcc0fd484cb0da517e827352))
* Initial commit ([bee5f2f](https://github.com/revanced/revanced-patches/commit/bee5f2faed882271ed059b0435e6e1aa91f93dbd))
* integrations patch ([19c0b0d](https://github.com/revanced/revanced-patches/commit/19c0b0d194bb97c7248ea7a9b081176961653b9d))
* migrate to dalvik patches ([e088c67](https://github.com/revanced/revanced-patches/commit/e088c671081bcf75586ccc1c4bdbed9366e93874))
* MinimizedPlayback, CreateButtonRemover ([cc08c6c](https://github.com/revanced/revanced-patches/commit/cc08c6c3d38879dd4672ec671631b34aa2e3cc77))
* OldQualityLayout, HideSuggestions, HideReels, EnableSeekbarTapping ([04a7cff](https://github.com/revanced/revanced-patches/commit/04a7cfff20d2734b1c92713de4e7e08a3b93ee85))
* Patches for YouTube Music ([b60c9d3](https://github.com/revanced/revanced-patches/commit/b60c9d33b611bb4d5b55bb419652bc14b0309792))
* remove obsolete patch `Hide suggestions patch` ([e65c6f2](https://github.com/revanced/revanced-patches/commit/e65c6f240ed23a54271d20a90fc57ec65cafc02d))
* update MicroG patch to latest version ([c24f806](https://github.com/revanced/revanced-patches/commit/c24f8063a04f89aea2d2f7087a435738de7dfeae))
* update patches to latest version ([bad25de](https://github.com/revanced/revanced-patches/commit/bad25dec1d73137f8b7a1bf4daaceb2279b4d48c))
* use supplier instead of KClass ([08af6e5](https://github.com/revanced/revanced-patches/commit/08af6e54af79ef9ef4fb3372a348ce9b6fba4d20))
* use supplier instead of KClass ([91aa019](https://github.com/revanced/revanced-patches/commit/91aa019f8d3d87fbf7affeb7abc2b02ba87af5c3))


### BREAKING CHANGES

* signature of patches was changed
* signature of patches was changed
* Package name was changed from "net.revanced" to "app.revanced"

# [1.0.0-dev.16](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.15...v1.0.0-dev.16) (2022-06-05)


### Features

* add patches compatibility to the newest version ([799401d](https://github.com/revanced/revanced-patches/commit/799401ddf99da0aaa5f52c39d3d3d4061370fd75))

# [1.0.0-dev.15](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.14...v1.0.0-dev.15) (2022-06-05)


### Bug Fixes

* remove unused patches ([d12e92a](https://github.com/revanced/revanced-patches/commit/d12e92aead677fefa9dcb48748d783225b65fab1))

# [1.0.0-dev.14](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.13...v1.0.0-dev.14) (2022-06-04)


### Bug Fixes

* spelling mistake ([52f9147](https://github.com/revanced/revanced-patches/commit/52f9147ee8d591f786397d174dc02a141d9250a9))


### Features

* `Dependencies` annotation ([85806bb](https://github.com/revanced/revanced-patches/commit/85806bb355e342ecb33d4ee1e76f9edf89b2c2ee))
* `GeneralBytecodeAds` and `GeneralResourceAds` patch ([f99bbef](https://github.com/revanced/revanced-patches/commit/f99bbef4c911ac2492166c7a3792ea11ffceffab))

# [1.0.0-dev.13](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.12...v1.0.0-dev.13) (2022-05-31)


### Bug Fixes

* migrate patches to latest patcher api changes ([8a0ee03](https://github.com/revanced/revanced-patches/commit/8a0ee03a71cf4a000c9a7246d0e64ed8291a5127))
* missing extension method `doRecursively` ([e9c9460](https://github.com/revanced/revanced-patches/commit/e9c946008ee912652d288e515b83b52ae2d239d8))

# [1.0.0-dev.12](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.11...v1.0.0-dev.12) (2022-05-28)


### Bug Fixes

* wrong annotation and signature in patches ([a0fdee8](https://github.com/revanced/revanced-patches/commit/a0fdee81a6d6773603520e7c3040ae8637642d58))

# [1.0.0-dev.11](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.10...v1.0.0-dev.11) (2022-05-26)


### Bug Fixes

* breaking changes by `revanced-patcher` dependency ([7e485b4](https://github.com/revanced/revanced-patches/commit/7e485b4ffe204d724809aeb9bd9f693a35ded94d))
* breaking patcher changes ([50f9cc5](https://github.com/revanced/revanced-patches/commit/50f9cc52acfd5bc23330ecd23d8d85678a9d3eee))
* breaking patcher changes ([cbb9e2c](https://github.com/revanced/revanced-patches/commit/cbb9e2cd1fa829e1d1dd92dbd40131b11ae6a05b))
* bugfixes in `microg` ([a43b33b](https://github.com/revanced/revanced-patches/commit/a43b33bdbb2b36e0a8f991fa11dfeeec34de01f9))
* write while reading resources and remove checking for "." in resource extensions ([7bc6094](https://github.com/revanced/revanced-patches/commit/7bc60943cb2350e89dac091ec9c98c5effd0b8a9))


### Features

* begin `MicroG Patch` ([91474ba](https://github.com/revanced/revanced-patches/commit/91474ba07376c13e7a71685dfd8b6e6913ed5ee9))
* update MicroG patch to latest version ([c24f806](https://github.com/revanced/revanced-patches/commit/c24f8063a04f89aea2d2f7087a435738de7dfeae))

# [1.0.0-dev.11](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.10...v1.0.0-dev.11) (2022-05-26)


### Bug Fixes

* breaking changes by `revanced-patcher` dependency ([7e485b4](https://github.com/revanced/revanced-patches/commit/7e485b4ffe204d724809aeb9bd9f693a35ded94d))
* breaking patcher changes ([50f9cc5](https://github.com/revanced/revanced-patches/commit/50f9cc52acfd5bc23330ecd23d8d85678a9d3eee))
* breaking patcher changes ([cbb9e2c](https://github.com/revanced/revanced-patches/commit/cbb9e2cd1fa829e1d1dd92dbd40131b11ae6a05b))
* bugfixes in `microg` ([a43b33b](https://github.com/revanced/revanced-patches/commit/a43b33bdbb2b36e0a8f991fa11dfeeec34de01f9))
* write while reading resources and remove checking for "." in resource extensions ([7bc6094](https://github.com/revanced/revanced-patches/commit/7bc60943cb2350e89dac091ec9c98c5effd0b8a9))


### Features

* begin `MicroG Patch` ([91474ba](https://github.com/revanced/revanced-patches/commit/91474ba07376c13e7a71685dfd8b6e6913ed5ee9))
* update MicroG patch to latest version ([c24f806](https://github.com/revanced/revanced-patches/commit/c24f8063a04f89aea2d2f7087a435738de7dfeae))

# [1.0.0-dev.10](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.9...v1.0.0-dev.10) (2022-05-22)


### Bug Fixes

* `create-button-signature` ([a173f6e](https://github.com/revanced/revanced-patches/commit/a173f6e5a7e65943657e2072e8a72a4a680e5277))
* breaking changes by `revanced-patcher` dependency ([e12e484](https://github.com/revanced/revanced-patches/commit/e12e484e3796c5c9c8505b677838cdf8432f2e79))
* loop in `amoled` patch ([c4c86b6](https://github.com/revanced/revanced-patches/commit/c4c86b65fd8b2463c1d86ad2e46ec9f08e60d47c))


### Features

* add `amoled` patch ([d61bac4](https://github.com/revanced/revanced-patches/commit/d61bac4f8243d0ef72ca91c7c1d5facd858d515e))
* update patches to latest version ([bad25de](https://github.com/revanced/revanced-patches/commit/bad25dec1d73137f8b7a1bf4daaceb2279b4d48c))

# [1.0.0-dev.9](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.8...v1.0.0-dev.9) (2022-05-13)


### Bug Fixes

* clean after building ([a2df3fb](https://github.com/revanced/revanced-patches/commit/a2df3fbc9761b07f3010542fa8684ade00e4dc91))

# [1.0.0-dev.8](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.7...v1.0.0-dev.8) (2022-05-13)


### Bug Fixes

* publish releases ([83916f9](https://github.com/revanced/revanced-patches/commit/83916f96d27989dcbb35c0ba6ef326a16b470501))

# [1.0.0-dev.7](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.6...v1.0.0-dev.7) (2022-05-07)


### Bug Fixes

* use the latest version of patcher dependency ([fe4a439](https://github.com/revanced/revanced-patches/commit/fe4a439cb2bc5e385ae13e8e155f25bb15e74633))

# [1.0.0-dev.6](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.5...v1.0.0-dev.6) (2022-05-07)


### Bug Fixes

* update patches ([91b8ec8](https://github.com/revanced/revanced-patches/commit/91b8ec81f33417798546c32db708fe09ada3930c))

# [1.0.0-dev.5](https://github.com/revanced/revanced-patches/compare/v1.0.0-dev.4...v1.0.0-dev.5) (2022-05-07)


### Bug Fixes

* `enable-seekbar-tapping` patch ([52fd726](https://github.com/revanced/revanced-patches/commit/52fd726d9b0d2efbd0f9742fc84ad01ccdcff168))
* `Index` in wrong package ([2f9360f](https://github.com/revanced/revanced-patches/commit/2f9360f57cc8415564534fbbd8bd5e2a83a1b629))
* `minimized-playback` & `old-quality-layout` wrong opcodes ([b45d175](https://github.com/revanced/revanced-patches/commit/b45d175c6f1ece6da894ab16128c2644d262c9c7))
* `minimized-playback` patch ([55677a4](https://github.com/revanced/revanced-patches/commit/55677a44ff965c0b92c3f1d771bd68c12c142ad4))
* `SignatureChecker` not handling nullable field `methodMetadata` ([17bcf78](https://github.com/revanced/revanced-patches/commit/17bcf786a85ccf1f7d9f5a66a044a3c26def09bb))
* accidentally removed code in refactor ([0077e26](https://github.com/revanced/revanced-patches/commit/0077e26d23cc112b671a41614a55348fac2c88ca))
* add missing `trimIndent()` to string literals ([76d3c71](https://github.com/revanced/revanced-patches/commit/76d3c71b67edebd79f2cdb1bb28e4d2969d72223))
* add missing opcode for `create-button-method` ([0a398ef](https://github.com/revanced/revanced-patches/commit/0a398ef364f91a0dd9608df1a036a2515476ccf2))
* attempt on all patches ([3395d69](https://github.com/revanced/revanced-patches/commit/3395d69747103a4bdf314297aa0bfa6ef6a0fc36))
* breaking changes of the patcher ([1a49bbd](https://github.com/revanced/revanced-patches/commit/1a49bbdbc4ff6f427934259536218e161908b449))
* breaking patcher changes ([581d1b0](https://github.com/revanced/revanced-patches/commit/581d1b0ca7d15adcdb1ab6116ef035acfe701757))
* disable `hide-suggestions-patch` patch until fixed ([99099ea](https://github.com/revanced/revanced-patches/commit/99099ea0bc12f5f25896967db642442df69d0c4f))
* incorrect endIndex (fixed in Patcher) ([424788e](https://github.com/revanced/revanced-patches/commit/424788edd777110cdaff97500556d18628f33385))
* modified opcode for `show-video-ads-constructor` ([a0dcea3](https://github.com/revanced/revanced-patches/commit/a0dcea3a13f68cae449dfaf445b542e339c83ff0))
* multiple bugs in patches ([e37201d](https://github.com/revanced/revanced-patches/commit/e37201d0ceef474696857a0d8845950c888194d0))
* name for `IntegrationsPatch` ([e46ef02](https://github.com/revanced/revanced-patches/commit/e46ef02302825d62b57912b2747a25f858036bb7))
* print instruction index of warning ([9e29aee](https://github.com/revanced/revanced-patches/commit/9e29aeeeff222412f6c45cf7e4879f8ec53ca6ee))
* remove `HideSuggestionsPatch` from `Index` ([f32e474](https://github.com/revanced/revanced-patches/commit/f32e4747b512c675b807ff5eebfd0b8e66173fba))
* signature checker with changes of patcher ([e82459d](https://github.com/revanced/revanced-patches/commit/e82459d37759e1a5a860d3e7fcdf69d95b06858e))
* tests failing ([102793f](https://github.com/revanced/revanced-patches/commit/102793f24f8bf7c7fd254968b29d65da7b2b962f))
* update `HomeAdsPatch` ([62f1801](https://github.com/revanced/revanced-patches/commit/62f1801e9cbee53c0be3413c245161bd941e4aec))
* version in package metadata of music ([b299205](https://github.com/revanced/revanced-patches/commit/b299205aa7cde82f1f55fc598de3ff8d80b8bcb0))
* **VideoAds:** remove `istore1` opcode ([dc4ec57](https://github.com/revanced/revanced-patches/commit/dc4ec574414c5df959efa0ca8f1cd39a812fedf8))
* wrong access flag in signature for `Create button patch` ([9fbb89d](https://github.com/revanced/revanced-patches/commit/9fbb89d05336a256a0759eea6095e073946c45e5))
* wrong opcode for `create-button-method` ([3214650](https://github.com/revanced/revanced-patches/commit/32146506f139aebc44cd5faffb7706b8b9c21c3d))
* wrong opcode pattern for `create-button-method` ([f4d8a85](https://github.com/revanced/revanced-patches/commit/f4d8a8525bc64b90748b21979d463977a21dcd85))
* wrong opcode pattern for `enable-seekbar-tapping-signature` ([1d83395](https://github.com/revanced/revanced-patches/commit/1d833957ed3e01188770c85e3d84e483419bd797))
* wrong opcode pattern for signature in `Hide suggestions patch` ([535aee0](https://github.com/revanced/revanced-patches/commit/535aee08408b990c80f5966c13fa84666a8b35d0))
* wrong patches in `upgrade-tab-remover` ([5182290](https://github.com/revanced/revanced-patches/commit/518229031ceca049ad790f7b77b19405d39f0ce1))
* wrong signature for `hide-reels-signature` ([2d9ff2a](https://github.com/revanced/revanced-patches/commit/2d9ff2af0a991d7721f3741187716a3b08bb4029))
* wrong signatures for patch `Old Quality Layout Patch` ([823e503](https://github.com/revanced/revanced-patches/commit/823e503d84037bdf27b09f17e63383f963c76854))
* wrong versions of patches ([a112b22](https://github.com/revanced/revanced-patches/commit/a112b22ce6e685204caab6f95f511e26ef95806b))


### Features

* `hide-shorts-button` patch ([88352ee](https://github.com/revanced/revanced-patches/commit/88352ee6ecd23faa4a7fd9f7495e67fa1d3e33bd))
* `tastebuilder-remover` for music ([a6aeca3](https://github.com/revanced/revanced-patches/commit/a6aeca31bd80b8c4a8acd071e22faca6e136bdb0))
* Add (WIP) Signature Checker ([ae4c7b2](https://github.com/revanced/revanced-patches/commit/ae4c7b29f211c461de460f97f3a8656e795adafb))
* add home ads patch ([36cddd1](https://github.com/revanced/revanced-patches/commit/36cddd1488683e19e2b927e34c80a4f0f3cace35))
* added `codecs-unlock` patch ([e5fd7ce](https://github.com/revanced/revanced-patches/commit/e5fd7cece94b1ff5342178f59b29576db806e0f6))
* display metadata for each signature in `SignatureChecker` ([736a71f](https://github.com/revanced/revanced-patches/commit/736a71fac21a32dbb1eef9c3a9f0d3005e7d9ca0))
* get required register dynamically ([0924ca2](https://github.com/revanced/revanced-patches/commit/0924ca2ad30ae865dcc0fd484cb0da517e827352))
* integrations patch ([19c0b0d](https://github.com/revanced/revanced-patches/commit/19c0b0d194bb97c7248ea7a9b081176961653b9d))
* migrate to dalvik patches ([e088c67](https://github.com/revanced/revanced-patches/commit/e088c671081bcf75586ccc1c4bdbed9366e93874))
* Patches for YouTube Music ([b60c9d3](https://github.com/revanced/revanced-patches/commit/b60c9d33b611bb4d5b55bb419652bc14b0309792))
* remove obsolete patch `Hide suggestions patch` ([e65c6f2](https://github.com/revanced/revanced-patches/commit/e65c6f240ed23a54271d20a90fc57ec65cafc02d))

# [1.0.0-dev.4](https://github.com/ReVancedTeam/revanced-patches/compare/v1.0.0-dev.3...v1.0.0-dev.4) (2022-03-22)


### Features

* use supplier instead of KClass ([08af6e5](https://github.com/ReVancedTeam/revanced-patches/commit/08af6e54af79ef9ef4fb3372a348ce9b6fba4d20))
* use supplier instead of KClass ([91aa019](https://github.com/ReVancedTeam/revanced-patches/commit/91aa019f8d3d87fbf7affeb7abc2b02ba87af5c3))


### BREAKING CHANGES

* signature of patches was changed
* signature of patches was changed

# [1.0.0-dev.3](https://github.com/ReVancedTeam/revanced-patches/compare/v1.0.0-dev.2...v1.0.0-dev.3) (2022-03-21)


### Features

* OldQualityLayout, HideSuggestions, HideReels, EnableSeekbarTapping ([04a7cff](https://github.com/ReVancedTeam/revanced-patches/commit/04a7cfff20d2734b1c92713de4e7e08a3b93ee85))

# [1.0.0-dev.2](https://github.com/ReVancedTeam/revanced-patches/compare/v1.0.0-dev.1...v1.0.0-dev.2) (2022-03-21)


### Code Refactoring

* Rename `net.revanced` to `app.revanced` ([68ea89f](https://github.com/ReVancedTeam/revanced-patches/commit/68ea89f15e9ea077df0d0ac20a40b735bb5ae26c))


### BREAKING CHANGES

* Package name was changed from "net.revanced" to "app.revanced"

# 1.0.0-dev.1 (2022-03-21)


### Features

* add publishing to package registry ([b475e09](https://github.com/ReVancedTeam/revanced-patches/commit/b475e09577db4dda7bbb45dbf170d78772834a6d))
* add semantic-release ([d60f1d0](https://github.com/ReVancedTeam/revanced-patches/commit/d60f1d06798d312b158b71691ecc87e828dccbc1))
* Initial commit ([bee5f2f](https://github.com/ReVancedTeam/revanced-patches/commit/bee5f2faed882271ed059b0435e6e1aa91f93dbd))
* MinimizedPlayback, CreateButtonRemover ([cc08c6c](https://github.com/ReVancedTeam/revanced-patches/commit/cc08c6c3d38879dd4672ec671631b34aa2e3cc77))
