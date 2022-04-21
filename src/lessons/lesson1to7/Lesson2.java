package lessons.lesson1to7;

public class Lesson2 {

    public static void main(String[] args) {

        String line = "______________________";
        int a = +5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("сумма переменных a и b = " + (a + b));
        System.out.println("сумма переменных a и b = " + sumAB);
        System.out.println(a + b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        System.out.println(line);
        System.out.println(a + b + " " + a + b);
        System.out.println(line);

        System.out.println("Он сказал \"Поехали!\" и махнул рукой.");
        System.out.println("Сегодня суббота");
        System.out.println("Сегодня\nсуббота");
        System.out.println("\tСегодня\t\tсуббота");
        System.out.println("Сегодня\tсубботa\t");
        System.out.println("Сегодня\t\t\tсубботa");

        System.out.println("" + a + b + c);
        System.out.println("" + a + " " + b + " " + c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        System.out.print("Сегодня ");
        System.out.println("Суббота");

        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);

        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);
        System.out.println(devAB);

        System.out.println(a % b);
        System.out.println(b % a);

        System.out.println(25 % 5);
        System.out.println(100 % 2);
        System.out.println(100 % 3);

        a++;
        System.out.println(a);
        System.out.println(a + 1);

        b--;
        System.out.println(b);
        System.out.println(b - 1);
        System.out.println(b);
    }
}
