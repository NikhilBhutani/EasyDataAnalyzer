### EasyDataAnalyzer

As the name suggest, this Android library analyzes the network data information for any app in an android device.

### Featured in
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-EasyDataAnalyzer-green.svg?style=true)](https://android-arsenal.com/details/1/3944) [![AndroidDev Digest](https://img.shields.io/badge/AndroidDev%20Digest-%2399-blue.svg)](https://www.androiddevdigest.com/digest-103/)

### Show some :heart:
[![GitHub stars](https://img.shields.io/github/stars/NikhilBhutani/EasyDataAnalyzer.svg?style=social&label=Star)](https://github.com/NikhilBhutani/EasyDataAnalyzer) [![GitHub forks](https://img.shields.io/github/forks/NikhilBhutani/EasyDataAnalyzer.svg?style=social&label=Fork)](https://github.com/NikhilBhutani/EasyDataAnalyzer/fork) [![GitHub watchers](https://img.shields.io/github/watchers/NikhilBhutani/EasyDataAnalyzer.svg?style=social&label=Watch)](https://github.com/NikhilBhutani/EasyDataAnalyzer) [![GitHub followers](https://img.shields.io/github/followers/NikhilBhutani.svg?style=social&label=Follow)](https://github.com/NikhilBhutani/EasyDataAnalyzer)  


# Including in your project

EasyDataAnalyzer is available in the MavenCentral to add as a dependency
 
 -  Add this to your root build.gradle file
```
 allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```

- Add this to your app's build.gradle file
```gradle
compile 'com.github.NikhilBhutani:EasyDataAnalyzer:1.0'
```

### Usage Docs/Wiki

-Instantiate the class.
```
DataAnalyzer dataAnalyzer = new DataAnalyzer(this);
```
- Get the Installed Application list

```
ArrayList<ApplicationInfo> package_name = (ArrayList<ApplicationInfo>) dataAnalyzer.getApplicationMeta();
```
- Get Appname by passing a package name 

```
dataAnalyzer.getAppName(package_name)
```
- Get Data Received(bytes) by your app by package name
 
```
dataAnalyzer.getReceivedData(package_name)
```
- Get Data Transmitted(bytes) by app
 
```
dataAnalyzer.getDataTransmitted(package_name) 
```
- Get Packets Received(bytes)
 
```
dataAnalyzer.getPacketsReceived(package_name)
```
- Get Packets Transmitted(bytes)
 
```
dataAnalyzer.getPacketsTransmitted(package_name)
```



# Screenshot of sample app
![Sc1](https://github.com/NikhilBhutani/EasyDataAnalyzer/blob/master/device-2016-07-14-192534.png) 


# License

    Copyright 2016 Nikhil Bhutani

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



