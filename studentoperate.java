package stu.cs;

import java.util.ArrayList;
import java.util.Scanner;

public class studentoperate {
    static  int count=0;
    ArrayList<student> array = new ArrayList<student>();
    Scanner sc = new Scanner(System.in);
    public static void Interface()       //��ҳ��
    {
        System.out.println("����0 �˳�");
        System.out.println("����1 ��ʾȫ��ѧ����Ϣ");
        System.out.println("����2 �޸�ѧ����Ϣ");
        System.out.println("����3 ɾ��ѧ����Ϣ");
        System.out.println("����4 ����ѧ����Ϣ");
        System.out.println("����5 ���ѧ����Ϣ");
        System.out.println("Ŀǰ����"+count+"��ѧ��");
    }

    public void add()                                                          //���ѧ����Ϣ
    {
        System.out.println("��������Ҫ��ӵ�ѧ��������");
        int x=sc.nextInt();
        count+=x;
        for(int i=0;i<x;i++)
        {
            student stu = new student();                               //����д��ѭ����  ��Ϊ��new����
            stu.setstudent(i+1);
            array.add(stu);
        }
        System.out.println("�����ɣ�");
    }
    public void show()
    {
        if(array.size()==0)
            System.out.println("����Ϣ��");
        else
        for(int i=0;i< array.size();i++)
        array.get(i).getstudent();
    }

    public void find()
    {
        System.out.println("��������Ҫ��ѯ��ѧ��ѧ�ţ�");
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
            System.out.println("�����ڸ�ѧ����");
    }

    public void delete()                                                           //ɾ��ѧ����Ϣ
    {
        System.out.println("��������Ҫɾ����ѧ��ѧ�ţ�");
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
              System.out.println("ɾ���ɹ���");
              c++;
              break;
            }
        }
        if(c==0)
            System.out.println("�����ڸ�ѧ����");
    }

    public void change()                                                         //�޸�ѧ����Ϣ
    {
        System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
        String Id=sc.nextLine();
        int c=0;
        for(int i=0;i< array.size();i++)
        {
            student s= new student();
            s=array.get(i);
            if(s.getId().equals(Id))
            {
                System.out.println("��������Ҫ�޸ĵ����������䣬�ɼ�:");
                String Name=sc.nextLine();
                String age=sc.nextLine();                                        //����һ��
                String score=sc.nextLine();
                student stu=new student(Id,Name,age,score);
                array.set(i,stu);
                System.out.println("�޸ĳɹ���");
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("�����ڸ�ѧ����");
    }

}
