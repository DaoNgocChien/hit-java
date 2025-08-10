import java.util.Scanner ;
public class PhongMay {
    private String MaPhong ;
    private String TenPhong ;
    private double DienTich ;
    private QuanLy x  ;
    private May[] y;
    private int n ;

    public void Nhap(Scanner sc) {
        System.out.print("Nhập mã phòng: ");
        MaPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        TenPhong = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        DienTich = Double.parseDouble(sc.nextLine());
        //Nhap thong tin quan ly
        x = new QuanLy();
        System.out.println("===Nhập thông tin quản lý===");
        x.Nhap(sc);
        //Nhap thong tin may
        System.out.print("Nhập số lượng máy: ");
        n = Integer.parseInt(sc.nextLine());
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("===Nhập thông tin máy thứ " + (i + 1) + "====");
            y[i] = new May();
            y[i].Nhap(sc);
        }
    }
        public void Xuat() {
            System.out.println("Mã phòng: " + MaPhong);
            System.out.println("Tên phòng: " + TenPhong);
            System.out.println("Diện tích: " + DienTich);
            System.out.println("--- Thông tin quản lý ---");
            x.Xuat() ;
            System.out.println("--- Danh sách máy ---");
            for (int i = 0; i < n; i++) {
                System.out.println("Máy thứ " + (i + 1) + ":");
                y[i].Xuat();
            }
        }
}


