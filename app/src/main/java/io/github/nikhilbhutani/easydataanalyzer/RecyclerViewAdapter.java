package io.github.nikhilbhutani.easydataanalyzer;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import io.github.nikhilbhutani.analyzer.DataAnalyzer;

/**
 * Created by Nikhil Bhutani on 7/13/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<ApplicationInfo> myDataList;
    private DataAnalyzer dataAnalyzer;

    public RecyclerViewAdapter(Context context, ArrayList<ApplicationInfo> myDataList) {

        dataAnalyzer = new DataAnalyzer(context);
        this.myDataList = myDataList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.icon.setImageDrawable(dataAnalyzer.getAppIcon(myDataList.get(position)));
        holder.appname.setText(dataAnalyzer.getAppName(myDataList.get(position)));
        holder.dataReceived.setText("Data Received :" + dataAnalyzer.getReceivedData(myDataList.get(position)));
        holder.dataTransmitted.setText("Data Transmitted :" + dataAnalyzer.getDataTransmitted(myDataList.get(position)));
        holder.packetsReceived.setText("Packets Received :" + dataAnalyzer.getPacketsReceived(myDataList.get(position)));
        holder.packetsTransmitted.setText("Packets Transmitted :" + dataAnalyzer.getPacketsTransmitted(myDataList.get(position)));

    }


    @Override
    public int getItemCount() {
        return myDataList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView icon;
        final TextView appname;
        final TextView dataReceived;
        final TextView dataTransmitted;
        final TextView packetsReceived;
        final TextView packetsTransmitted;

        public ViewHolder(View itemView) {

            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.app_icon);
            appname = (TextView) itemView.findViewById(R.id.app_name);
            dataReceived = (TextView) itemView.findViewById(R.id.data_received);
            dataTransmitted = (TextView) itemView.findViewById(R.id.data_transmitted);
            packetsReceived = (TextView) itemView.findViewById(R.id.packets_received);
            packetsTransmitted = (TextView) itemView.findViewById(R.id.packets_transmitted);
        }
    }

}
