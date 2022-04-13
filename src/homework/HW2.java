package homework;

import javax.swing.*;
import java.sql.SQLOutput;

public class HW2 {

    public static void main(String[] args){

        int k = 5;
        int l = 10;
        int m = 15;
        int SumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        int devKL = k / l;
        int devKM = k / m;
        int devLM = l / m;
        int devMK = m / k;
        int apple= 40;
        int apple1= 100;
        int student = 6;
        int student1 = 21;
        int devAppleStudent = apple / student;
        int devApple1Student1 = apple1 / student1;
        String line = "___________________________________";

        // 12. Вывод переменных в столбик
        System.out.println(line);

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.println( k + " \n" + l + " \n" + m);

        System.out.println("15\n21\n32");
        System.out.println(line);

        // 13. Вывод переменных в строку
        System.out.println(k + " "+ l + " " + m);

        // 14. Вывод переменных через кому
        System.out.println(k + "," + l + "," + m);

        // 15. Вывести значения переменных так,
        // что бы было понятно какое значение к какой переменной относится
        System.out.println( "Задача 15");
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        String tab1 = "int k = ";
        String tab2 = "int l = ";
        String tab3 = "int m = ";

        System.out.println(tab1 + k + ";");
        System.out.println(tab2 + l + ";");
        System.out.println(tab3 + m + ";");

        // 16. Арифметические операции
        System.out.println( "Задача 16");
        System.out.println(line);
        System.out.println(SumKL);
        System.out.println("Sum of k and l = " + ( k + l));
        System.out.println("Sum of k and l = " + SumKL);
        System.out.println("Mult of k and m = " + multKM);
        System.out.println("Разность переменных l и m = " + subLM );
        System.out.println("Разность переменных l и m = " + ( l - m) );
        System.out.println(line);

        /** 17. Результаты деления и остаток от деления
         */

        System.out.println( "Задача 17");
        System.out.println("Результат деления k на l = " + devKL + "," +
                " а остаток от деления = " + k % l);
        System.out.println("Результат деления k на m = " + devKM + ", " +
                "а остаток от деления = " + k % m);
        System.out.println("Результат деления l на m = " + devLM + "," +
                " а остаток от деления = " + l % m);
        System.out.println("Результат деления m на k = " + devMK + "," +
                " а остаток от деления = " + m % k);
        System.out.println("Результат деления k на l = " + (k / l) + "," +
                " а остаток от деления = " + k % l);
        System.out.println("Результат деления l на k = " + (l / k) + "," +
                " а остаток от деления = " + l % k);
        System.out.println("Результат деления m на l = " + (m / l) + "," +
                " а остаток от деления = " + m % l);
        System.out.println(line);

        /**18. Создать переменные apple и  student и распечатать выражение
         */

        System.out.println( "Задача 18");
        System.out.println("Если " + apple + " яблок поделить на "
                + student + " учеников, то каждый ученик получит по "
                + apple / student + " яблок, и "
                + apple % student + " яблока останется учителю." );
        System.out.println("Если " + apple + " яблок поделить на "
                + student + " учеников, то каждый ученик получит по "
                + devAppleStudent + " яблок, и "
                + apple % student + " яблока останется учителю." );

        System.out.println("Если " + apple1 + " яблок поделить на "
                + student1 + " ученика, то каждый ученик получит по "
                + devApple1Student1 + " яблок, и " + apple1 % student1 +
                " яблок останется учителю." );
        System.out.println(line);


        /**19. Распечатать вычисления и итоговый результат
         */
        int i = m;
        i++;
        int sumKLM = k + l + i;
        int o = m;
        o--;
        int sumKLM2 = k + l + o;
        int sumKLM3 = k + l + m;

        System.out.println( "Задача 19");
        System.out.println("Сумма чисел k, l, m++ = " + sumKLM);
        System.out.println("Сумма чисел k, l, m-- = " + sumKLM2 );
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = "
                + (sumKLM +sumKLM2 ) + ", а разность m++ и sumKLM = "
                + ( i - sumKLM3));
        System.out.println(line);

        /** 20. Показать, что число 48 кратно 8
         */
        System.out.println( "Задача 20");
        System.out.println(48 % 8);

        /** 20.1 Показать, что 8 и 48 четные числа
         */
        System.out.println(48 % 2);
        System.out.println(8 % 2);

        /** 20.2 Показать, что числа 47 и 49 - нечетные
         */
        System.out.println(47 % 2);
        System.out.println(49 % 2);
        System.out.println(line);

        // Часть 3

        /** 21.  Вывести на печать математическое выражение
         */


        float x = 2;
        float y = 3;
        float a = k;
        float b = l;
        float c = m;
        float d = y - x;
        float sumABC = a + b + c;


        System.out.println( "Задача 21");
        double result21 = Math.pow(( x + 3), 2);
        System.out.println(result21);
        System.out.println(line);

        /** 22.  Вывести на печать математическое выражение
         */
        System.out.println( "Задача 22");
        float dr1 = (3 + 4 * x) / 5;
        float dr2 = (10 * (y - 5) * sumABC) / x;
        float dr3 = 9 * (4 / x + ((9 + x) / y ));
        float result22 = dr1 - dr2 + dr3;
        System.out.println(result22);

        /** 23.  Вывести на печать математическое выражение
         */

        System.out.println( "Задача 23");
        System.out.println("Значение первого дроба = " + dr1);
        System.out.println("Значение второго дроба = " + dr2);
        System.out.println("Значение третьего дроба = " + dr3);
        System.out.println(line);
        System.out.println("Результат вычислений result23 = " + result22 );
        System.out.println(line);

        float ski = 5 * x + 7 * y;
        float ski2 = 8 * x + 10 * y;
        float ski21 = ski / ski2;
        float ski3 = (3 * x - y) / (x + y);
        float chis = ski21 / ski3;
        float ski4 = (a + b) / (c + d);
        float ski5 = c / d;
        float ski6 = a * b;
        float znam = a + b + ski4 + ski5 + ski6;
        float result23 = chis / znam;

        /** 23. Вывести на печать математическое выражение
         */
        System.out.println( "Задача 23");
        System.out.println("Значение чис1 = " + ski);
        System.out.println("Значение чис2 = " + ski2);
        System.out.println("Значение чис3 = " + ski21);
        System.out.println("Значение чис4 = " + ski3);

        System.out.println("Значение дроба чисельник = " + chis);
        System.out.println("Значение знам = " + ski4);
        System.out.println("Значение дроба знаменник = " + znam);

        System.out.println(line);
        System.out.println("Результат вычислений result23 = " + result23 );

        System.out.println();
        System.out.println();
        System.out.println( "_________Выводим результаты в таблицу_________");
        System.out.println(line);
        System.out.println("|     Task     |     Result       |" );
        System.out.println(line);
        System.out.println("|     21       |     " + result21 +  "         |");
        System.out.println(line);
        System.out.println("|     22       |     " + result22 +  "        |");
        System.out.println(line);
        System.out.println("|     23       |     " + result23 +  "  |");
        System.out.println(line);
    }
}
