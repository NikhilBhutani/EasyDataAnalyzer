package io.github.nikhilbhutani.analyzer;

/**
 * Created by Nikhil Bhutani on 7/13/2016.
 */
public class PackageDetails {

    private String appname;
    private String dataReceived;
    private String dataTransmitted;
    private String packetsReceived;
    private String packetsTransmitted;


    public PackageDetails(){


    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getDataReceived() {
        return dataReceived;
    }

    public void setDataReceived(String dataReceived) {
        this.dataReceived = dataReceived;
    }

    public String getDataTransmitted() {
        return dataTransmitted;
    }

    public void setDataTransmitted(String dataTransmitted) {
        this.dataTransmitted = dataTransmitted;
    }

    public String getPacketsReceived() {
        return packetsReceived;
    }

    public void setPacketsReceived(String packetsReceived) {
        this.packetsReceived = packetsReceived;
    }

    public String getPacketsTransmitted() {
        return packetsTransmitted;
    }

    public void setPacketsTransmitted(String packetsTransmitted) {
        this.packetsTransmitted = packetsTransmitted;
    }


}
