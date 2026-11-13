
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "nasce_plast_ff"
include(":app")

nasce_plast_ff/
├── app/
│   └── src/
│       └── main/
│           └── java/
│               └── com/nasceplast/ff/
│                   └── MainActivity.kt
└── settings.gradle.kts
