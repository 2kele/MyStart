package stu.cs;

import java.util.ArrayList;
import java.util.Scanner;

public class studentmanager {
    public static void main(String[] args)
    {
        System.out.println("****��ӭʹ��******");
        studentoperate stop = new studentoperate();
        Scanner sc = new Scanner(System.in);
        int x;
        do
        {
            stop.Interface();
            x = sc.nextInt();
            switch (x) {
                case 0:
                    System.out.println("���˳���ллʹ�ã�");
                    break;
                case 1:
                    stop.show();
                    break;
                case 2:
                    stop.change();
                    break;
                case 3:
                    stop.delete();
                    break;
                case 4:
                    stop.find();
                    break;
                case 5:
                    stop.add();
                    break;
                default:
                    System.out.println("����ָ�");
                    break;
            }
        }while (x!=0);

    }
}