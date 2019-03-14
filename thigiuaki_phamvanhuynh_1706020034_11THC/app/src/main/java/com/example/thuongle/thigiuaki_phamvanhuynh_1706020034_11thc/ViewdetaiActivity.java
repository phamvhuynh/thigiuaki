package com.example.thuongle.thigiuaki_phamvanhuynh_1706020034_11thc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewdetaiActivity extends AppCompatActivity {
    TextView tvhovaten;
    TextView tvnganh;
    TextView tvmaSV;
    TextView tvtensp;
    TextView tvmasp;
    TextView tvgia;
    TextView tvmota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdetai);
        onInit();
        onGetIntent();
        
    }

    private void onGetIntent() {
        Intent intent = getIntent();
        view_demo model = (view_demo) intent.getSerializableExtra("Model");
        tvhovaten.setText("Họ và Tên : " + model.getHovaten());
        tvmaSV.setText("Ngành : " + model.getNganh());
        tvmaSV.setText("Mã sinh viên : " + model.getMaSV());
        tvtensp.setText("Tên Sản Phẩm : "+ model.getTensanpham());
        tvmasp.setText("Mã sản phẩm : "+model.getMasanpham());
        tvgia.setText("Giá : "+model.getGia());
        tvmota.setText("Mô tả : "+model.getMota());
    }

    private void onInit() {
        tvhovaten = findViewById(R.id.detail_tvUserName);
        tvnganh = findViewById(R.id.detail_tvNganh);
        tvmaSV = findViewById(R.id.detail_tbmaSV);
        tvtensp = findViewById(R.id.detail_tvtensanpham);
        tvmasp = findViewById(R.id.detail_tvmasp);
        tvgia = findViewById(R.id.detail_tvgia);
        tvmota = findViewById(R.id.detail_tvmota);
    }
}
