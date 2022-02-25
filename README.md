![ScreenShoot Apps](docs/image/ss_banner.png?raw=true)

## About This Project

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-frogo--log-brightgreen.svg?style=flat-square)](https://android-arsenal.com/details/1/8314)
[![JitPack](https://jitpack.io/v/amirisback/frogo-log.svg?style=flat-square)](https://jitpack.io/#amirisback/frogo-log)
[![Scan with Detekt](https://github.com/amirisback/frogo-log/actions/workflows/detekt-analysis.yml/badge.svg?style=flat-square)](https://github.com/amirisback/frogo-log/actions/workflows/detekt-analysis.yml)
[![Generate APK / AAB](https://github.com/amirisback/frogo-log/actions/workflows/generate-apk-aab.yml/badge.svg)](https://github.com/amirisback/frogo-log/actions/workflows/generate-apk-aab.yml)
- Privacy Policy [Click Here](https://github.com/amirisback/frogo-log/blob/master/PRIVACY-POLICY.md)
- LICENSE [Click Here](https://github.com/amirisback/frogo-log/blob/master/LICENSE)
- SDK for your Log problem to make easier developing android apps
- frogo-log is Long Term Service
- Line number show
- Toast for easy develop and debug

## Screenshoot Result
<table>
    <tr>
        <th>SS 1</th>
        <th>SS 2</th>
        <th>SS 3</th>
        <th>SS 4</th>
    </tr>
    <tr>
        <td><img width="200px" height="360px" src="docs/image/ss-1.png"></td>
        <td><img width="200px" height="360px" src="docs/image/ss-2.png"></td>
        <td><img width="200px" height="360px" src="docs/image/ss-3.png"></td>
        <td><img width="200px" height="360px" src="docs/image/ss-4.png"></td>
    </tr>
<table>

## Screenshoot Library Sample
![ScreenShoot Apps](docs/image/ss_result_1.png?raw=true)

## Version Release
This Is Latest Release

    $version_release = 2.0.8

What's New??

    * Update Build Gradle Version *
    * Bug Fixing *
    * Enhance Performance *
    * Refactoring Code *
    * Long Term Service *
    * Update build.gradle.kts latest update *

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)

#### <Option 1> Groovy Gradle

    // Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

#### <Option 2> Kotlin DSL Gradle

```kotlin
// Add it in your root build.gradle.kts at the end of repositories:

allprojects {
    repositories {
        ...
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 2. Add the dependency (build.gradle : Module)

#### <Option 1> Groovy Gradle

    dependencies {
        // library frogo-log
        implementation 'com.github.amirisback:frogo-log:2.0.8'
    }

#### <Option 2> Kotlin DSL Gradle

    dependencies {
        // library frogo-log
        implementation("com.github.amirisback:frogo-log:2.0.8")
    }

### Step 3. Add the method of Frogo-Log

#### FrogoLog (with line code)
```kotlin
// Function Log Debug
FrogoLog.d("Debug")

// Function Log Info
FrogoLog.i("Info")

// Function Log Verbose
FrogoLog.v("Verbose")

// Function Log Warn
FrogoLog.w("Warn")

// Function Log Error
FrogoLog.e("Error")

// Function Log Simple Debug without message params
FrogoLog.d()

```
#### FrogoLog (with line code and Toast
```kotlin
// Function Log Debug (adding context params)
FrogoLog.d("Debug", this@MainActivity)

// Function Log Info (adding context params)
FrogoLog.i("Info", this@MainActivity)

// Function Log Verbose
FrogoLog.v("Verbose", this@MainActivity)

// Function Log Warn (adding context params)
FrogoLog.w("Warn", this@MainActivity)

// Function Log Error (adding context params)
FrogoLog.e("Error", this@MainActivity)

// Function Log Simple Debug without message params
FrogoLog.d(this@MainActivity)
```

#### FLog (without line code)

```kotlin
// Function Log Debug
FLog.d("Debug")

// Function Log Info
FLog.i("Info")

// Function Log Verbose
FLog.v("Verbose")

// Function Log Warn
FLog.w("Warn")

// Function Log Error
FLog.e("Error")

// Function Log Simple Debug without message params
FLog.d()
```

#### Flog (without line code with toast)
```kotlin
// Function Log Debug (adding context params)
FLog.d("Debug", this@MainActivity)

// Function Log Info (adding context params)
FLog.i("Info", this@MainActivity)

// Function Log Verbose
FLog.v("Verbose", this@MainActivity)

// Function Log Warn (adding context params)
FLog.w("Warn", this@MainActivity)

// Function Log Error (adding context params)
FLog.e("Error", this@MainActivity)

// Function Log Simple Debug without message params
FLog.d(this@MainActivity)
```

### Result
![ScreenShoot Apps](docs/image/ss_result_2.png?raw=true)

### Sample code
For sample code you can see at [This](https://github.com/amirisback/frogo-log/blob/master/app/src/main/java/com/frogobox/logcat/MainActivity.kt)

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account

![ScreenShoot Apps](docs/image/mad_score.png?raw=true)