/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.son.m_class;

/**
 *
 * @author DELL
 */
public class ChiNhanh {
    private int maChiNhanh;
    private String tenChiNhanh;
    private String diaChi;

    public ChiNhanh(int maChiNhanh, String tenChiNhanh, String diaChi) {
        this.maChiNhanh = maChiNhanh;
        this.tenChiNhanh = tenChiNhanh;
        this.diaChi = diaChi;
    }

    /**
     * @return the maChiNhanh
     */
    public int getMaChiNhanh() {
        return maChiNhanh;
    }

    /**
     * @param maChiNhanh the maChiNhanh to set
     */
    public void setMaChiNhanh(int maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    /**
     * @return the tenChiNhanh
     */
    public String getTenChiNhanh() {
        return tenChiNhanh;
    }

    /**
     * @param tenChiNhanh the tenChiNhanh to set
     */
    public void setTenChiNhanh(String tenChiNhanh) {
        this.tenChiNhanh = tenChiNhanh;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
