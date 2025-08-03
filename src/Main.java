import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
       manager.khoiTaoMau(); // tạo 5 sinh viên mẫu

        int chon;
        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Sắp xếp theo GPA");
            System.out.println("5. Sắp xếp theo số tiết nghỉ");
            System.out.println("6. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> manager.themSinhVien();
                case 2 -> {
                    System.out.print("Nhập tên sinh viên cần sửa: ");
                    String ten = sc.nextLine();
                    manager.suaThongTin(ten);
                }
                case 3 -> manager.sapXepTheoTuoi();
                case 4 -> manager.sapXepTheoGPA();
                case 5 -> manager.sapXepTheoVang();
                case 6 -> manager.hienThiDanhSach();
                case 0 -> System.out.println("🛑 Kết thúc chương trình.");
                default -> System.out.println("⚠️ Vui lòng chọn đúng chức năng.");
            }
        } while (chon != 0);
    }
}
