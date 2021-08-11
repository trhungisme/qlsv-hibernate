package entities;

public class KetQua {
    private DMSV dmsv;
    private DMMH dmmh;
    private int LanThi;
    private float Diem;

    public KetQua() {
    }

    public KetQua(DMSV dmsv, DMMH dmmh, int lanThi, float diem) {
        this.dmsv = dmsv;
        this.dmmh = dmmh;
        LanThi = lanThi;
        Diem = diem;
    }

    public DMMH getDmmh() {
        return dmmh;
    }

    public void setDmmh(DMMH dmmh) {
        this.dmmh = dmmh;
    }

    public DMSV getDmsv() {
        return dmsv;
    }

    public void setDmsv(DMSV dmsv) {
        this.dmsv = dmsv;
    }

    public int getLanThi() {
        return LanThi;
    }

    public void setLanThi(int lanThi) {
        LanThi = lanThi;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float diem) {
        Diem = diem;
    }
}
