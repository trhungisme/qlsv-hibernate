package entities;

import java.util.Date;
import java.util.Set;

public class DMSV {
    private String MaSV;
    private String HoSV;
    private String TenSV;
    private String Phai;
    private Date NgaySinh;
    private String NoiSinh;
    private float HocBong;
    private DMKhoa dmKhoa;
    private Set<KetQua> ketQuas;
    private Set<Club> clubs;


    public Set<Club> getClubs() {
        return clubs;
    }

    public void setClubs(Set<Club> clubs) {
        this.clubs = clubs;
    }

    public DMSV() {
    }

    public Set<KetQua> getKetQuas() {
        return ketQuas;
    }

    public void setKetQuas(Set<KetQua> ketQuas) {
        this.ketQuas = ketQuas;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getHoSV() {
        return HoSV;
    }

    public void setHoSV(String hoSV) {
        HoSV = hoSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public String getPhai() {
        return Phai;
    }

    public void setPhai(String phai) {
        Phai = phai;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        NoiSinh = noiSinh;
    }

    public float getHocBong() {
        return HocBong;
    }

    public void setHocBong(float hocBong) {
        HocBong = hocBong;
    }

    public DMKhoa getDmKhoa() {
        return dmKhoa;
    }

    public void setDmKhoa(DMKhoa dmKhoa) {
        this.dmKhoa = dmKhoa;
    }

    public DMSV(String maSV, String hoSV, String tenSV, String phai, Date ngaySinh, String noiSinh, float hocBong, DMKhoa dmKhoa) {
        MaSV = maSV;
        HoSV = hoSV;
        TenSV = tenSV;
        Phai = phai;
        NgaySinh = ngaySinh;
        NoiSinh = noiSinh;
        HocBong = hocBong;
        this.dmKhoa = dmKhoa;
    }

    public String toString() {
        return "Ma SV: " + getMaSV() + "\nHo SV: " + getHoSV() + "\nTen SV: " + getTenSV() + "\nGioi tinh: " + getPhai() + "\nNgay sinh: " + getNgaySinh() + "\nNoi sinh: " + getNoiSinh() + "\nHoc bong: " + getHocBong() + "\n-----------------------------------";
    }
}
