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

    public List getApplicationMeta(){

        packages = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        return packages;
    }



   /*
    *  Get app name
    */
    public String getAppName(ApplicationInfo myapplicationInfo){

        String name = (String) packageManager.getApplicationLabel(myapplicationInfo).toString();

        return name;
    }


   /*
    *  Get network data received in bytes
    */
    public String getReceivedData(ApplicationInfo myapplicationInfo){

        String dataReceived = String.valueOf(TrafficStats.getUidRxBytes(myapplicationInfo.uid));

        return dataReceived;
    }



   /*
    *  Get network data transmitted in application
    */
    public String getDataTransmitted (ApplicationInfo applicationInfo) {

        String dataReceived = String.valueOf(TrafficStats.getUidTxBytes(applicationInfo.uid));

        return dataReceived;

    }

    /*
     *  Get network packets received in application
     */
    public String getPacketsReceived (ApplicationInfo applicationInfo) {

        String packetsReceived = String.valueOf(TrafficStats.getUidRxPackets(applicationInfo.uid));

        return packetsReceived;
    }

    /*
     *  Get network packets transmitted in application.
     */
    public String getPacketsTransmitted (ApplicationInfo applicationInfo) {

        String packetsReceived = String.valueOf(TrafficStats.getUidTxPackets(applicationInfo.uid));

        return packetsReceived;
    }

    /*
    *  Get network packets transmitted in application.
    */
    public Drawable getAppIcon (ApplicationInfo applicationInfo) {

        Drawable icon =  packageManager.getApplicationIcon(applicationInfo);

        return icon;
    }


}
