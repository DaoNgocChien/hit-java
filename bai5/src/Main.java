public class Main {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuon so 5 :");
        for(int i = 1 ; i < 10 ; i ++){
            System.out.println( i + "x" + "5" + " = " +  i * 5 );
        }
        int sum = 0 ;
        for(int i = 0 ; i < 100 ; i+=2){
            sum += i ;
        }
        System.out.println("Tong cac so chan tu 1 - 100 :" + sum);
    }
}