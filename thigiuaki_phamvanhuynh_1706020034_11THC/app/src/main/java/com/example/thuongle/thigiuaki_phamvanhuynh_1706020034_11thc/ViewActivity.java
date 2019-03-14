package com.example.thuongle.thigiuaki_phamvanhuynh_1706020034_11thc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewActivity extends AppCompatActivity {
    ListView listView;
    List<view_demo> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        onInit();
        onSetData();
        ContactAdater adapter = new ContactAdater(ViewActivity.this,R.layout.view_item,modelList);
        listView.setAdapter(adapter);

    }

    private void onSetData() {
        modelList = new ArrayList<>();
        modelList.add(new view_demo("PhamvanHuynh","TinhocUngdung","1706020034","SamsungGalaxyJ6","SSG11","3.595.00","Màn hình 5.5\"\n" +
                "Camera sau Chính 12 MP & Phụ 12 MP\n" +
                "Pin 2900 mAh"));
        modelList.add(new view_demo("PhamvanHuynh","TinhocUngdung","1706020034","SamsungGalaxyA7(2018)","DCG008","8.595.00","Màn hình 5.5\"\n" +
                "Camera sau Chính 12 MP & Phụ 12 MP\n" +
                "Pin 2900 mAh"));
        modelList.add(new view_demo("PhamvanHuynh","TinhocUngdung","1706020034","SamsungGalaxyA9","2TH11","11.595.00","Màn hình 5.5\"\n" +
                "Camera sau Chính 12 MP & Phụ 12 MP\n" +
                "Pin 2900 mAh"));

    }
    private void onInit() {
        listView = findViewById(R.id.lv_view);
    }
}
