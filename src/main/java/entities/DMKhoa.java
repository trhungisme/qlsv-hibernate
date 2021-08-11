package entities;

import java.util.HashSet;
import java.util.Set;

public class DMKhoa {
    private String MaKhoa;
    private String TenKhoa;

    private Set<DMSV> dmsvs;

    public DMKhoa(String maKhoa, String tenKhoa) {
        MaKhoa = maKhoa;
        TenKhoa = tenKhoa;
    }

    public Set<DMSV> getDmsvs() {
        return dmsvs;
    }

    public void setDmsvs(Set<DMSV> dmsvs) {
        this.dmsvs = dmsvs;
    }

    public DMKhoa() {
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        MaKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        TenKhoa = tenKhoa;
    }
}
