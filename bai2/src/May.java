import java.util.Scanner ;
public class May {
    private String MaMay ;
    private String TenMay ;
    private String TinhTrang ;

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String maMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String tenMay) {
        this.TenMay = TenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public void Nhap(Scanner sc){
        System.out.println("Nhập mã máy : ");
        MaMay = sc.nextLine() ;
        System.out.println("Nhập tên máy : ");
        TenMay = sc.nextLine() ;
        System.out.println("Nhập tình trạng máy : ");
        TinhTrang = sc.nextLine() ;
    }
    public void Xuat(){
        System.out.println("Mã máy : " + MaMay);
        System.out.println("Tên máy : " + TenMay);
        System.out.println("Tình trạng máy : " + TinhTrang );
    }

}
