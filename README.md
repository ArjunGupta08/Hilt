# Hilt Intro

## Project SetUp
    build.gradle ( Module0. Level )

    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    
    // Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }

    build.gradle ( Project Level )

    id("com.google.dagger.hilt.android") version "2.44" apply false
