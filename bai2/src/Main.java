import java.util.Scanner ;
public class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in) ;
        PhongMay phong = new PhongMay() ;
        System.out.println("====Nhập thông tin phòng máy====");
        phong.Nhap(sc) ;
        System.out.println("===Thông tin phòng máy===");
        phong.Xuat() ;
    }
}