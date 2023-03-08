/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.son.m_class;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhuyenMai {
    private String maKM;
    private String TenKM;
    private int giamGia;
    private Date ngayBD;
    private Date ngayKT;

    public KhuyenMai(String maKM, String TenKM, int giamGia, Date ngayBD, Date ngayKT) {
        this.maKM = maKM;
        this.TenKM = TenKM;
        this.giamGia = giamGia;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    /**
     * @return the maKM
     */
    public String getMaKM() {
        return maKM;
    }

    /**
     * @param maKM the maKM to set
     */
    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    /**
     * @return the TenKM
     */
    public String getTenKM() {
        return TenKM;
    }

    /**
     * @param TenKM the TenKM to set
     */
    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    /**
     * @return the giamGia
     */
    public int getGiamGia() {
        return giamGia;
    }

    /**
     * @param giamGia the giamGia to set
     */
    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    /**
     * @return the ngayBD
     */
    public Date getNgayBD() {
        return ngayBD;
    }

    /**
     * @param ngayBD the ngayBD to set
     */
    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    /**
     * @return the ngayKT
     */
    public Date getNgayKT() {
        return ngayKT;
    }

    /**
     * @param ngayKT the ngayKT to set
     */
    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }
    
    
}
