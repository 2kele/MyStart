package stu.cs;

import java.util.ArrayList;
import java.util.Scanner;

public class studentoperate {
    static  int count=0;
    ArrayList<student> array = new ArrayList<student>();
    Scanner sc = new Scanner(System.in);
    public static void Interface()       //主页面
    {
        System.out.println("输入0 退出");
        System.out.println("输入1 显示全部学生信息");
        System.out.println("输入2 修改学生信息");
        System.out.println("输入3 删除学生信息");
        System.out.println("输入4 查找学生信息");
        System.out.println("输入5 添加学生信息");
        System.out.println("目前已有"+count+"名学生");
    }

    public void add()                                                          //添加学生信息
    {
        System.out.println("请输入想要添加的学生数量：");
        int x=sc.nextInt();
        count+=x;
        for(int i=0;i<x;i++)
        {
            student stu = new student();                               //必须写入循环里  因为用new创建
            stu.setstudent(i+1);
            array.add(stu);
        }
        System.out.println("添加完成！");
    }
    public void show()
    {
        if(array.size()==0)
            System.out.println("无信息！");
        else
        for(int i=0;i< array.size();i++)
        array.get(i).getstudent();
    }

    public void find()
    {
        System.out.println("请输入想要查询的学生学号：");
        //sc.nextLine();
        String Id=sc.nextLine();
        int c=0;
        for(int i=0;i< array.size();i++)
        {
            student s= new student();
            s=array.get(i);
            if(s.getId().equals(Id))
            {
                array.get(i).getstudent();
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("不存在该学生！");
    }

    public void delete()                                                           //删除学生信息
    {
        System.out.println("请输入想要删除的学生学号：");
        //sc.nextLine();
        String Id=sc.nextLine();
        int c=0;
        for(int i=0;i< array.size();i++)
        {
            student s= new student();
            s=array.get(i);
            if(s.getId().equals(Id))
            {
              array.remove(i);
              System.out.println("删除成功！");
              c++;
              break;
            }
        }
        if(c==0)
            System.out.println("不存在该学生！");
    }

    public void change()                                                         //修改学生信息
    {
        System.out.println("请输入想要修改的学生学号：");
        String Id=sc.nextLine();
        int c=0;
        for(int i=0;i< array.size();i++)
        {
            student s= new student();
            s=array.get(i);
            if(s.getId().equals(Id))
            {
                System.out.println("请输入想要修改的姓名，年龄，成绩:");
                String Name=sc.nextLine();
                String age=sc.nextLine();                                        //会吞一行
                String score=sc.nextLine();
                student stu=new student(Id,Name,age,score);
                array.set(i,stu);
                System.out.println("修改成功！");
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("不存在该学生！");
    }

}
