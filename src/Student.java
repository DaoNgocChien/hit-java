public class Student {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double tx1;
    private double tx2;
    private double kthp;
    private int vang;

    public Student(String ten, int namSinh, String diaChi, double tx1, double tx2, double kthp, int vang) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.vang = vang;
    }

    public int getTuoi() {
        return java.time.Year.now().getValue() - namSinh;
    }

    public double getGPA() {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }

    // Getter - Setter
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public int getNamSinh() { return namSinh; }
    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public double getTx1() { return tx1; }
    public void setTx1(double tx1) { this.tx1 = tx1; }

    public double getTx2() { return tx2; }
    public void setTx2(double tx2) { this.tx2 = tx2; }

    public double getKthp() { return kthp; }
    public void setKthp(double kthp) { this.kthp = kthp; }

    public int getVang() { return vang; }
    public void setVang(int vang) { this.vang = vang; }

    @Override
    public String toString() {
        return String.format("%-10s %-8d %-15s %-12.2f %-12.2f %-13.2f %-10.2f %-10d",
                ten, getTuoi(), diaChi, tx1, tx2, kthp, getGPA(), vang);
    }
}
