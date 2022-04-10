package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task30();
    }
    /*30)Даны вещественное число а и натуральное число n.
     Вычислить Р = а(а – n)(а – 2n) ... (а – n^2).*/
    private static void task30() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number a: ");
        int numa = in.nextInt();
        System.out.println("Input number n: ");
        int numn = in.nextInt();
        int p = numa;
        System.out.printf("Your number a: %d \n", numa);
        System.out.printf("Your number n: %d \n", numn);
        in.close();

        if (numn < 1) {
            System.out.println("Incorrect value");
        } else {

            for (int i = 1; i <= numn; i++) {
                p *= numa - numn * i;
            }
            System.out.printf("Your result: %d \n", p);
        }
    }
}
class tsk55 {

    public static void main(String[] args) {
        task50();
    }
    private static void task50() {
        //55)Вычислить сумму: 2/3...10/11.
        double a = 2;
        double b = 3;
        double sum = a/b;
        for(int i = 0; i <= 7; i++){
            sum += a/b;
            a++;
            b++;
            }
        System.out.printf("Result is: %f \n", sum );
        }
    }
class tsk85 {

    public static void main(String[] args) {
        task85();
    }

    private static void task85() {
        /*85)В ведомости указана зарплата, выплаченная каждому из сотрудников фирмы за некоторый месяц.
        Определить общую сумму выплаченных по ведомости денег.*/

        Scanner in = new Scanner(System.in);
        System.out.println("Input salary");
        int s = in.nextInt();
        System.out.println("Input number of workers");
        int w = in.nextInt();
        int res = 0;
        if (s <= 0 && w <= 0) {
            System.out.println("Incorrect value");
        } else {
            for (int i = 1; i <= w; i++) {
                res += s;
            }
            System.out.printf("Result is: %d \n", res);
        }
    }
}
class tsk105 {

    public static void main(String[] args) {
        task105();
    }
    /*105)Имеется серия измерений элементов треугольника. Группы элементов пронумерованы. В серии в произвольном порядке могут
 встречаться такие группы элементов треугольника: основание и высота (первая группа), две стороны и угол между ними,
 заданный в радианах (вторая группа), три стороны (третья группа). Разработать программу, которая запрашивает номер
 группы элементов, запрашивает ввод соответствующих элементов и вычисляет площадь треугольника. Вычисления прекратить,
 если в качестве номера группы введена цифра 0.*/
    private static void task105() {
        System.out.println("Input number of element`s group :");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch (x) {
            case 1:
                System.out.println("Input h:");
                int h = in.nextInt();
                System.out.println("Input a:");
                int a = in.nextInt();
                int res = a*h/2;
                System.out.printf("Result is: %d \n", res);
                break;
            case 2:
                System.out.println("Input a:");
                double a2 = in.nextInt();
                System.out.println("Input b:");
                double b1 = in.nextInt();
                System.out.println("Input sin:");
                double sin = in.nextInt();
                double res2 = Math.sin(sin) * a2/2 * b1;
                System.out.printf("Result is %f \n",res2);
            case 3:
                System.out.println("Input a:");
                double a1 = in.nextInt();
                System.out.println("Input b:");
                double b = in.nextInt();
                System.out.println("Input c:");
                double c = in.nextInt();
                double p = (a1 + b + c) / 2;
                double res1 = Math.sqrt(p * (p - a1) * (p - b) * (p - c));
                System.out.printf("Result is: %f \n",res1);
                break;
            default:
                System.out.println("Incorrect value");
                break;
        }

    }
}
class tsk130 {

    public static void main(String[] args) {
        task130();
    }
/*Проверить, действительно ли при чётном n число n/12+n^2/8+n^3/24 целое.*/
    private static void task130() {
        for (double n = 1; n <=9999 ; n++ ) {
          double res3 = n/12 + n*n/8 + n*n*n/24;
          if(res3 %2 == 0){
              System.out.println("Result is : " + res3);
              System.out.println("Number n is : " + n);
              break;
          }
        }



    }
}


















