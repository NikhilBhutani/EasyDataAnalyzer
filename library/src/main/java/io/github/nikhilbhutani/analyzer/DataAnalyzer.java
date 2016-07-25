package io.github.nikhilbhutani.analyzer;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.net.TrafficStats;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil Bhutani on 7/13/2016.
 * <p/>
 * <p/>
 * Copyright 2016 Nikhil Bhutani
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class DataAnalyzer {

    public final PackageManager packageManager;
    public final Context context;

    ArrayList<String> appName = new ArrayList<>();
    List<ApplicationInfo> packages;

    public DataAnalyzer(Context context) {

        packageManager = context.getPackageManager();
        this.context = context;


    }

   /*
    *  Get meta data of every app stored.
    */

    public List getApplicationMeta() {

        packages = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        return packages;
    }


    /*
     *  Get app name
     */
    public String getAppName(ApplicationInfo myapplicationInfo) {

        String name = (String) packageManager.getApplicationLabel(myapplicationInfo).toString();

        return name;
    }


    /*
     *  Get network data received in bytes
     */
    public String getReceivedData(ApplicationInfo myapplicationInfo) {

        String dataReceived = String.valueOf(TrafficStats.getUidRxBytes(myapplicationInfo.uid));

        return dataReceived;
    }


    /*
     *  Get network data transmitted in application
     */
    public String getDataTransmitted(ApplicationInfo applicationInfo) {

        String dataReceived = String.valueOf(TrafficStats.getUidTxBytes(applicationInfo.uid));

        return dataReceived;

    }

    /*
     *  Get network packets received in application
     */
    public String getPacketsReceived(ApplicationInfo applicationInfo) {

        String packetsReceived = String.valueOf(TrafficStats.getUidRxPackets(applicationInfo.uid));

        return packetsReceived;
    }

    /*
     *  Get network packets transmitted in application.
     */
    public String getPacketsTransmitted(ApplicationInfo applicationInfo) {

        String packetsReceived = String.valueOf(TrafficStats.getUidTxPackets(applicationInfo.uid));

        return packetsReceived;
    }

    /*
    *  Get network packets transmitted in application.
    */
    public Drawable getAppIcon(ApplicationInfo applicationInfo) {

        Drawable icon = packageManager.getApplicationIcon(applicationInfo);

        return icon;
    }


}
