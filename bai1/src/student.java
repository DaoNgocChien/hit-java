import java.util.Scanner ;
public class student {
    private String name ;
    private String className ;
    private Double score ;
    private Faculty y = new Faculty() ;

    public String getName(){
        return name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void input(Scanner sc) {
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập lớp: ");
        className = sc.nextLine();
        System.out.print("Nhập điểm số: ");
        score = Double.parseDouble(sc.nextLine());
        System.out.println("--- Nhập thông tin khoa ---");
        y.input(sc);
    }
    public void output() {
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + className);
        System.out.println("Điểm số: " + score);
        y.output();
    }
}
