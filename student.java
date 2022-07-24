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
        System.out.println("�������"+x+"��ѧ����ѧ�ţ�");
        id=sc.nextLine();
        System.out.println("�������"+x+"��ѧ����������");
        name=sc.nextLine();
        System.out.println("�������"+x+"��ѧ�������䣺");
        age=sc.nextLine();
        System.out.println("�������"+x+"��ѧ���ĳɼ���");
        score=sc.nextLine();
    }

    public void getstudent()
    {
        System.out.println("ѧ�ţ�"+id+" ������"+name+" ���䣺"+age+" �ɼ���"+score);
    }

    public String showstudent(){
        return  "ѧ�ţ�"+id+" ������"+name+" ���䣺"+age+" �ɼ���"+score;
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
