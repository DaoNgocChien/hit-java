import java.util.Scanner ;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập số lượng sinh viên : ");
        int n = Integer.parseInt(sc.nextLine()) ;
        student[] students = new student[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + ": ") ;
            students[i] = new student() ;
            students[i].input(sc);
        }
        System.out.println("--Danh sach sinh viên--");
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Sinh vien thứ " + (i+1) + ": ");
            students[i].output() ;
        }
        sc.close() ;
    }
}