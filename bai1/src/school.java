import java.util.Scanner ;
public class school {
    private String name ;
    private String date ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void input(Scanner sc){
        System.out.println("Nhập tên trường : ");
        name = sc.nextLine() ;
        System.out.println("Ngày vào trường : ");
        date = sc.nextLine() ;
    }
    public void output(){
        System.out.println("Tên trường : " + name);
        System.out.println("Ngày vào trường : " + date );
    }
}
