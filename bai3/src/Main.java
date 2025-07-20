import java.util.Scanner ;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap so nguyen a : ");
        int a = sc.nextInt() ;
        System.out.println("Nhap so nguyen b :");
        int b = sc.nextInt() ;
        int tong = a + b ;
        int hieu = a - b ;
        int tich = a * b ;
        double thuong = a / b ;
        int chia_lay_du = a % b ;
        if(a == b){
            System.out.println("2 so a va b bang nhau");
        }else System.out.println("2 so a va b khong bang nhau");
    }
}