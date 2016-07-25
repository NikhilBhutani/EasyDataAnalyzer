package io.github.nikhilbhutani.easydataanalyzer;

import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

import io.github.nikhilbhutani.analyzer.DataAnalyzer;

public class MainActivity extends AppCompatActivity {


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

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
