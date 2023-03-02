/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.son.m_class;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 */
public class HangHoa {

    private String maHang;
    private String tenHang;
    private String xuatXu;
    private int donGia;

    public HangHoa(String ma, String ten, String xuatX, int gia) {
        this.maHang = ma;
        this.tenHang = ten;
        this.xuatXu = xuatX;
        this.donGia=gia;
    }

    @Override
    public String toString() {
        return this.tenHang;
    }
    
    public String getMaHang() {
        return maHang;
    }


    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getXuatXu() {
        return xuatXu;
    }
    
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    
}
          