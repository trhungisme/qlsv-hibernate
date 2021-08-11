package entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;


public class DMMH {
    private String MaMH;
    private String TenMH;
    private int SoTiet;
    private Set<KetQua> ketQuas;

    public Set<KetQua> getKetQuas() {
        return ketQuas;
    }

    public void setKetQuas(Set<KetQua> ketQuas) {
        this.ketQuas = ketQuas;
    }

    public DMMH() {
    }

    public DMMH(String maMH, String tenMH, int soTiet) {
        MaMH = maMH;
        TenMH = tenMH;
        SoTiet = soTiet;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String maMH) {
        MaMH = maMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String tenMH) {
        TenMH = tenMH;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int soTiet) {
        SoTiet = soTiet;
    }
}
