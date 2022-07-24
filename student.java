package stu.cs;
import java.util.ArrayList;
import java.util.Scanner;

public class student {
    private String id;
    private String name;
    private String age;
    private String score;

    public student(){};
    public student(String Id, String Name, String Age, String Score)
    {
        id = Id;
        name = Name;
        age = Age;
        score = Score;
    }

    public String getId() {
        return id;
    }
    public void setstudent(int x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第"+x+"名学生的学号：");
        id=sc.nextLine();
        System.out.println("请输入第"+x+"名学生的姓名：");
        name=sc.nextLine();
        System.out.println("请输入第"+x+"名学生的年龄：");
        age=sc.nextLine();
        System.out.println("请输入第"+x+"名学生的成绩：");
        score=sc.nextLine();
    }

    public void getstudent()
    {
        System.out.println("学号："+id+" 姓名："+name+" 年龄："+age+" 成绩："+score);
    }

    public String showstudent(){
        return  "学号："+id+" 姓名："+name+" 年龄："+age+" 成绩："+score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student student = (student) o;

        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (age != null ? !age.equals(student.age) : student.age != null) return false;
        return score != null ? score.equals(student.score) : student.score == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
