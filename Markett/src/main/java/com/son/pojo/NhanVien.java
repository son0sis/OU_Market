/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.son.m_class;

import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien {
    private int maNV;
    private String tenNV;
    private Date ngaySinh;
    private Date ngayVao;
    private int soDT;

    public NhanVien(int maNV, String tenNV, Date ngaySinh, Date ngayVao, int soDT) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.ngayVao = ngayVao;
        this.soDT = soDT;
    }

    /**
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the tenNV
     */
    public String getTenNV() {
        return tenNV;
    }

    /**
     * @param tenNV the tenNV to set
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVao
     */
    public Date getNgayVao() {
        return ngayVao;
    }

    /**
     * @param ngayVao the ngayVao to set
     */
    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    /**
     * @return the soDT
     */
    public int getSoDT() {
        return soDT;
    }

    /**
     * @param soDT the soDT to set
     */
    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }
    
}
