# EasyDataAnalyzer

As the name suggest, this Android library analyzes the network data information for any app in an android device.

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

- Add this to you app's build.gradle file
```gradle
compile 'com.github.NikhilBhutani:EasyDataAnalyzer:1.0'
```

### Usage Docs/Wiki

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
- Get Data Received by your app by package name
 
```
dataAnalyzer.getReceivedData(package_name)
```
- Get Data Transmitted by app
 
```
dataAnalyzer.getDataTransmitted(package_name) 
```
- Get Packets Received
 
```
dataAnalyzer.getPacketsReceived(package_name)
```
- Get Packets Transmiited
 
```
dataAnalyzer.getPacketsTransmitted(package_name)
```



# Screenshot of sample app
![Sc1](https://github.com/NikhilBhutani/EasyDataAnalyzer/blob/master/device-2016-07-14-192534.png) 


