import java.util.Scanner ;
public class Faculty {
    private String name ;
    private String date ;
    private school school = new school() ; //khi tạo 1 cái Falculty mới tự tạo school

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDate(){
        return date ;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public school getSchool() {
        return school;
    }

    public void setSchool(school school) {
        this.school = school;
    }
    public void input(Scanner sc){
        System.out.println("Nhập tên khoa : ");
        name = sc.nextLine() ;
        System.out.println("Nhập ngày vào khoa");
        date = sc.nextLine() ;
        System.out.println("--Nhập thông tin trườnng--");
        school.input(sc) ;
    }
    public void output(){
        System.out.println("Tên khoa : " + name);
        System.out.println("Ngày vào khoa : " + date );
        school.output() ;
    }
}
