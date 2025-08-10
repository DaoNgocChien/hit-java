import java.util.Scanner ;
public class QuanLy {
    private String MaQL;
    private String HoTen;

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        this.MaQL = MaQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }
    public void Nhap(Scanner sc){
        System.out.println("Nhập mã quản lí : ");
        MaQL = sc.nextLine() ;
        System.out.println("Nhập họ tên : ");
        HoTen = sc.nextLine() ;
    }
    public void Xuat(){
        System.out.println("Mã quản lí :" + MaQL);
        System.out.println("Họ Tên : " + HoTen);
    }
}
