import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhập tên : ");
        String ten = sc.nextLine() ;
        System.out.print("Nhập tuổi : ");
        int tuoi = sc.nextInt() ;
        System.out.print("Nhập chiều cao : ");
        float chieu_cao = sc.nextFloat() ;
        System.out.println("Tên : " + ten);
        System.out.println("Tuổi : " + tuoi);
        System.out.println("Chiều cao : " + chieu_cao + "m");
    }
}
