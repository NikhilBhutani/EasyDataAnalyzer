package io.github.nikhilbhutani.easydataanalyzer;

import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.github.nikhilbhutani.analyzer.DataAnalyzer;
import io.github.nikhilbhutani.analyzer.PackageDetails;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> appnames = new ArrayList<>();
    DataAnalyzer dataAnalyzer;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        dataAnalyzer = new DataAnalyzer(this);



        ArrayList<ApplicationInfo> arrayList = (ArrayList<ApplicationInfo>) dataAnalyzer.getApplicationMeta();

/*        ArrayAdapter<ApplicationInfo> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);

        for(ApplicationInfo applicationInfo : arrayList){

            String appname = dataAnalyzer.getAppName(applicationInfo);
            String dataReceived = dataAnalyzer.getReceivedBytes(applicationInfo);
            appnames.add(appname +" " +dataReceived);

        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,appnames);

        listView.setAdapter(arrayAdapter);
*/





        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);


        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);




    }
}
