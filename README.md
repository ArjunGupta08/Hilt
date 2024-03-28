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
## @Provides with @InstallIn
`@Provides` annotation along with `@InstallIn` annotation in HILT. These annotations are required when you cannot use `@Inject` annotation on the constructor of classes or for scenarios where you have interfaces or abstract classes or classes that requires some patterns for object creation. For instance, room database requires builder pattern, for this we need modules. 

Learn about predefined set of components for each android class in Hilt. i.e. `Singleton Component`, `Activity Component`, `Fragment Component` in Hilt
## @Binds
When you want to bind implementation to an interface, we use @Binds annotation. You can use @Provides annotation for interfaces where Hilt is unable to create the object itself i.e. required class is not annotated with @Inject. 
## Qualifiers
It is like a tag that is attached to different implementation. Whenever you request object from Hilt, you pass the tag i.e. the qualifier along with the requested object. For this we have default @Named annotation or we can create custom qualifiers.
