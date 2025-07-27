import java.util.Scanner ;
public class Bai1buoi3{
    public static final String SQUARE = "Square" ;
    public static final String TRIANGLE = " Triangle" ;
    public static final String CIRCLE = "Circle" ;
    public static String NhapVienGach(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap loai hinh : ");
        return sc.nextLine() ;
    }
    public static boolean LoaiHinh(String type){
        return type.equalsIgnoreCase(SQUARE) ||
                type.equalsIgnoreCase(TRIANGLE) ||
                type.equalsIgnoreCase(CIRCLE) ;
    }
    public static double Svuong(double canh){
        return canh*canh ;
    }
    public static double Stamgiac(double day , double chieucao){
        return 0.5 * chieucao * day ;
    }
    public static double Stron(double bk){
        return Math.PI * bk *bk ;
    }
    public static double TinhCacHinh(String type){
        Scanner sc = new Scanner(System.in) ;
        if(type.equalsIgnoreCase(SQUARE) ){
            System.out.print("Nhap canh hinh vuong : ");
            double canh = sc.nextDouble() ;
            return Svuong(canh) ;
        }else if(type.equalsIgnoreCase(TRIANGLE)){
            System.out.println("Nhap day tam giac : ");
            double day = sc.nextDouble() ;
            System.out.println("Nhap chieu cao tam giac : ");
            double chieucao = sc.nextDouble() ;
            return Stamgiac(day , chieucao) ;
        }else if(type.equalsIgnoreCase(CIRCLE)){
            System.out.println("Nhap ban kinh : ");
            double bk = sc.nextDouble() ;
            return Stron(bk) ;
        }
        return 0;
    }
    public static void main(String[] args){
        String type = NhapVienGach() ;
        if(!LoaiHinh(type)){
            System.out.println("Nhap khong hop le");
            return ;
        }
        double S = TinhCacHinh(type) ;
        System.out.println("Dien tich vien gach : " + S);
    }
}