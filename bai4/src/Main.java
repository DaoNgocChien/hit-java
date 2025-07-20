import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Nhap vao 5 so nguyen : ");
        for(int i = 0 ; i < 5 ; i ++){
            System.out.print("a[" + (i+1) + "] =" );
            numbers[i] = sc.nextInt() ;
        }
        System.out.println("Phan tu da nhap : ");
        for(int i = 0 ; i < 5 ; i ++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0] ;
        for(int i = 0 ; i < 5 ; i ++){
            if(numbers[i] > max ) {
                max = numbers[i];
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);

        sc.close();
    }
}