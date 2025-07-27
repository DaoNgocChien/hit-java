import java.util.Scanner ;
public class bai3{
    static int a , b ,c ;
    public static void nhap(){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhập a [0 , 100 ] : ");
         a = sc.nextInt() ;
        System.out.print("Nhập b [0 , 100] : ") ;
         b = sc.nextInt() ;
        System.out.print("Nhập c [0 , 200 ] : ") ;
         c = sc.nextInt() ;
        System.out.println("Phép tính bạn nhập là : " + a + " + " + b + " = " + c ) ;
    }
    public static void check(int a , int b , int c){
        if(a + b == c ){
            System.out.println("Phép tính đã nhập đúng") ;
        }
        else System.out.println("Phép tính đã nhập sai");
    }
    public static void main(String[] args){
        nhap() ;
        check(a , b , c ) ;
    }
}