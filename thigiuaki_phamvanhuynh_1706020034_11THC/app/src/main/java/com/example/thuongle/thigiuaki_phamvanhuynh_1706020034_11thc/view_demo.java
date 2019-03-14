package com.example.thuongle.thigiuaki_phamvanhuynh_1706020034_11thc;

import java.io.Serializable;

public class view_demo implements Serializable {
    private String hovaten;
    private String nganh;
    private String maSV;
    private String tensanpham;
    private String masanpham;
    private String gia;
    private String mota;

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    public view_demo(String mhovaten, String mnganh, String mmaSV, String mtensanpham, String mmasanpham, String mgia, String mmota) {
        this.hovaten = mhovaten;
        this.nganh = mnganh;
        this.maSV = mmaSV;
        this.tensanpham = mtensanpham;
        this.masanpham = mmasanpham;
        this.gia = mgia;
        this.mota = mmota;
    }
}
