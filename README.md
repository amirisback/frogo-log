![ScreenShoot Apps](docs/image/ss_banner.png?raw=true)

# About This Project
[![JitPack](https://jitpack.io/v/amirisback/frogo-log.svg?style=flat-square)](https://jitpack.io/#amirisback/frogo-log)
- SDK for your Log problem to make easier developing android apps
- frogo-log is under huge large development

# Screenshoot Library Sample
![ScreenShoot Apps](docs/image/ss_result_1.png?raw=true)

# Version Release
This Is Latest Release

    $version_release = 1.0.1

What's New??

    * add: FLog method *

# Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)

    Add it in your root build.gradle at the end of repositories:

    	allprojects {
    		repositories {
    			...
    			maven { url 'https://jitpack.io' }
    		}
    	}

### Step 2. Add the dependency (build.gradle : Module)

    dependencies {
            // library frogo-log
            implementation 'com.github.amirisback:frogo-log:1.0.1'

### Step 3. Add the method of Frogo-Log

#### FrogoLog (with line code)
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


#### FLog (without line code)

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

### Result
![ScreenShoot Apps](docs/image/ss_result_2.png?raw=true)

### List method of Frogo-Log Lib

    // Function Log Simple Debug without message params
    fun d()

    // Function Log Debug
    fun d(msg: String?)

    // Function Log Verbose
    fun v(msg: String?)

    // Function Log Info
    fun i(msg: String?)

    // Function Log Warn
    fun w(msg: String?)

    // Function Log Warn
    fun w(e: Throwable?)

    // Function Log Warn
    fun w(e: Exception?)

    // Function Log Error
    fun e(msg: String?)

### Sample code
For sample code you can see at [This](https://github.com/amirisback/frogo-log/blob/master/app/src/main/java/com/frogobox/logcat/MainActivity.kt)

# Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

# Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account