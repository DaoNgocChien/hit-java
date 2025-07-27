import java.util.Scanner ;
public class bai2{
    public static String Nhap(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập chuỗi : ");
        String nhap = sc.nextLine().trim() ;
        return nhap ;
    }
    public static boolean DoiXung(String s){
        s = s.toLowerCase() ;
        int left = 0 ;
        int right = s.length() - 1 ;
        while(left < right ) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true ;
        }
    public static void Out(String s , boolean check){
        if(check){
            System.out.println("Chuỗi đối xứng") ;
        }else System.out.println("Chuỗi không đối xứng");
    }
    public static void main(String [] agrs){
        String Nhap = Nhap() ;
        boolean check = DoiXung(Nhap) ;
        Out(Nhap , check ) ;
    }


}