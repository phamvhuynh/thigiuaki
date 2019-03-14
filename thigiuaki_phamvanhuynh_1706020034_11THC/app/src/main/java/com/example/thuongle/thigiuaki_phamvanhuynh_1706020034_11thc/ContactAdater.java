package com.example.thuongle.thigiuaki_phamvanhuynh_1706020034_11thc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;

public class ContactAdater extends ArrayAdapter {
        private Context mContext;
        private int mResources;
        private List<view_demo> mList;
        public ContactAdater(Context context, int resource, List<view_demo> objects) {
            super(context, resource, objects);
            this.mContext = context;
            this.mResources = resource;
            this.mList = objects;
        }

    public ContactAdater(@NonNull Context context, int resource, int textViewResourceId, @NonNull Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if (viewHolder == null){
                convertView = LayoutInflater.from(mContext).inflate(mResources,parent,false);
                viewHolder = new ViewHolder();
                viewHolder.textViewtendt = convertView.findViewById(R.id.tv_tendt);
                viewHolder.textViewmadt = convertView.findViewById(R.id.tv_madt);
                viewHolder.textViewgia = convertView.findViewById(R.id.tv_gia);
                viewHolder.btnback = convertView.findViewById(R.id.back);
                viewHolder.btnView = convertView.findViewById(R.id.view);
            }
            else{
                viewHolder = (ViewHolder)convertView.getTag();
            }
            final view_demo model = mList.get(position);
            viewHolder.textViewtendt.setText(String.valueOf("Ten dien thoai :"+model.getTensanpham()));
            viewHolder.textViewmadt.setText(String.valueOf("Ma san pham :"+model.getMasanpham()));
            viewHolder.textViewgia.setText(String.valueOf( " Gia  : " +model.getGia()));
            viewHolder.btnback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext,MainActivity.class);
                    mContext.startActivity(intent);
                }
            });
               viewHolder.btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,ViewdetaiActivity.class);
                intent.putExtra("Model",model);
                mContext.startActivity(intent);
            }
        });
            return  convertView;
        }

        public class ViewHolder{
            TextView textViewtendt;
            TextView textViewmadt;
            TextView textViewgia;
            Button btnback;
            Button btnView;
        }
}
