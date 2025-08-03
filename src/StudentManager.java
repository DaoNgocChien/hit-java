import java.util.*;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void khoiTaoMau() {
        list.add(new Student("An", 2002, "Hà Nội", 7.5, 8.0, 9.0, 2));
        list.add(new Student("Bình", 2001, "Đà Nẵng", 6.0, 7.5, 8.0, 1));
        list.add(new Student("Chi", 2000, "Hải Phòng", 9.0, 8.5, 9.0, 0));
        list.add(new Student("Dũng", 2003, "Hà Nam", 5.5, 6.0, 7.0, 5));
        list.add(new Student("Hà", 2001, "Nghệ An", 8.0, 7.0, 8.5, 3));
    }

    public void themSinhVien() {
        System.out.print("Tên: ");
        String ten = sc.nextLine();
        System.out.print("Năm sinh: ");
        int ns = Integer.parseInt(sc.nextLine());
        System.out.print("Địa chỉ: ");
        String dc = sc.nextLine();
        System.out.print("Điểm tx1: ");
        double tx1 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm tx2: ");
        double tx2 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm kthp: ");
        double kthp = Double.parseDouble(sc.nextLine());
        System.out.print("Số tiết nghỉ: ");
        int vang = Integer.parseInt(sc.nextLine());

        Student s = new Student(ten, ns, dc, tx1, tx2, kthp, vang);
        list.add(s);
        System.out.println("✅ Đã thêm sinh viên.");
    }

    public void suaThongTin(String tenCanSua) {
        for (Student s : list) {
            if (s.getTen().equalsIgnoreCase(tenCanSua)) {
                System.out.print("Nhập tên mới: ");
                s.setTen(sc.nextLine());
                System.out.print("Năm sinh mới: ");
                s.setNamSinh(Integer.parseInt(sc.nextLine()));
                System.out.print("Địa chỉ mới: ");
                s.setDiaChi(sc.nextLine());
                System.out.print("Điểm tx1 mới: ");
                s.setTx1(Double.parseDouble(sc.nextLine()));
                System.out.print("Điểm tx2 mới: ");
                s.setTx2(Double.parseDouble(sc.nextLine()));
                System.out.print("Điểm kthp mới: ");
                s.setKthp(Double.parseDouble(sc.nextLine()));
                System.out.print("Số tiết nghỉ mới: ");
                s.setVang(Integer.parseInt(sc.nextLine()));
                System.out.println("✅ Đã sửa thông tin.");
                return;
            }
        }
        System.out.println("❌ Không tìm thấy sinh viên.");
    }

    public void sapXepTheoTuoi() {
        list.sort(Comparator.comparingInt(Student::getTuoi));
        System.out.println("✅ Đã sắp xếp theo tuổi.");
    }

    public void sapXepTheoGPA() {
        list.sort((a, b) -> Double.compare(b.getGPA(), a.getGPA()));
        System.out.println("✅ Đã sắp xếp theo GPA.");
    }

    public void sapXepTheoVang() {
        list.sort(Comparator.comparingInt(Student::getVang));
        System.out.println("✅ Đã sắp xếp theo số tiết nghỉ.");
    }

    public void hienThiDanhSach() {
        System.out.printf("%-10s %-8s %-15s %-12s %-12s %-13s %-10s %-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số nghỉ");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
