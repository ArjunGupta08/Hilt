# Hilt Intro

## Project SetUp
### `build.gradle ( Module Level )`
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    
    // Hilt
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-android-compiler:2.51")

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
### `build.gradle ( Project Level )`
    id("com.google.dagger.hilt.android") version "2.51" apply false
## @HiltAndroidApp
Hilt provides an easy way to inject dependencies. By just having an application class annotated with @HiltAndroidApp - dependency injection is done for you automatically. Fields marked with @Inject are injected automatically by Hilt.
Don't forget to mention this application class in your manifest file.
## @AndroidEntryPoint
@AndroidEntryPoint is another annotation that is required on Android classes like Activity, Fragment, Views that requires object to be injected. All the code generation is done by Hilt i.e. behind the scene Hilt generates Dagger2 code for you using these annotations. 
