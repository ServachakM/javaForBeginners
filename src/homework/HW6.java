package homework;

import static lessons.lesson1to7.Lesson4.*;

public class HW6 {
// переписать щоб крок не був минусовий
    public static void taskTen(double start, double end, double step) {
        if (start < end && step > 0) {
            for (double i = start; i < end; i += step) {
                System.out.printf("%.2f  ", i);
            }
        } else if (start > end && step < 0) {
            for (double i = start; i > end; i += step) {
                System.out.printf("%.2f  ", i);
            }
        } else {
            System.out.println("Invalid data");
        }
    }
    // Метод вместо Стрынг формата
    public static double format(double number, int d) {
        int num = (int)Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);

        return number;
    }

    public static void taskEleven(int l) {
        int end = 0;
        for(int i = 0; end < l; i += 2) {
            System.out.print(i + " ");
            end++;
        }
    }

    public static void taskTwelve(int n) {
        for(int i = 1; i <= n; i++){
            System.out.print((int)Math.pow(2, i) + " ");
        }
    }

    public static void taskSixteen(int n, int m, int l) {
        int end = 0;

        if (m % 2 == 0 || l <= 0) {
            System.out.println("Шаг не может быть четным числом, а длина" +
                    " последовательности <= 0");
        } else {
            for (int i = n; end < l; i += m) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");;
                    end++;
                }
            }
        }
    }

    public static void taskEighteen(int l, int n) {
        int end = 0;
        if (l > 0) {
            for (int i = n; end < l; i ++) {   //for(int i = n; end < l; i += 2){ sout i;}
                System.out.print((i * 2) + " ");
                end++;
            }
        } else {
            System.out.println("Длина последовательности должна быть больше 0");
        }
    }

    public static void taskEighteenIrina(int n, int l) {
        if (n < l) {
            System.out.println("[" + (n) + "]" + " = " + (n));
            for (int i = n; i < l; i++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (n));
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    public static double taskTwenty(double x){
        double y = 0;
        if(x > 1.5) {
            y = 2.5 * Math.pow(x,3) + 6 * Math.pow(x,2) - 30;
            System.out.print(y + " ");
        }
        if(x >= 0 && x <= 1.5) {
            y = x + 1;
            System.out.print(y + " ");
        }
        if(x < 0 ) {
            y = x;
            System.out.print(y + " ");
        }
        return y;
    }

    public static void main(String[] args) {

        /** Task 1
         * Распечатать последовательность чисел от 0 до 9 включительно.
         */
        printTaskNumber(1);

        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        /** Task 2
         * Распечатать последовательность чисел от 10 исключительно до
         * 0 включительно.
         */
        printTaskNumber(2);

        for(int i = 9; i > -1; i--) {
            System.out.print(i + " ");
        }

        /** Task 3
         * Распечатать последовательность чисел от 50 до 55 включительно
         * с шагом 2.
         */
        printTaskNumber(3);

        for(int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }

        /** Task 4
         * Распечатать последовательность чисел, кратных 7,
         * в промежутке (327, 300)
         */
        printTaskNumber(4);

        for(int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        /** Task 5
         * Распечатать последовательность чисел в промежутке [12, 13]
         * с шагом 0.1
         */
        printTaskNumber(5);
        // Почему, если < 13, то все равно виводит 13.0 на печать
        for(double i = 12.0; i < 13.0; i += 0.1 ) {
            System.out.printf("%.2f\t ", i );
        }

        /** Task 6
         * Распечатать последовательность четных чисел от 215 до 237
         * включительно
         */
        printTaskNumber(6);

        for(int i = 215; i < 238; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        /** Task 7
         * Распечатать последовательность чисел, кратных 7, в промежутке
         * от 7 исключительно до 14 исключительно.
         */
        printTaskNumber(7);

        for(int i = 8; i < 14; i++) {
           if(i % 7 == 0) {
               System.out.print(i + " ");
//           } else {
//               System.out.println("В промежутке от 7 исключительно до" +
//                       " 14 исключительно нет чисел, кратных 7");
           }
        }

        /** Task 8
         * Распечатать последовательность которая начинается с минимального
         * значения типа данных short и заканчивается максимальным
         * значением short. Числа в последовательности должны быть кратны 15001.
         */
        printTaskNumber(8);

        for(int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }

        /** Task 9
         * Распечатать последовательность чисел в промежутке от
         * -10 до 34 включительно. Числа, кратные 11, должны быть распечатаны
         * синим цветом. Числа, кратные 12, должны быть распечатаны красным
         * цветом. А ноль необходимо распечатать словом ZERO.
         */
        printTaskNumber(9);

        for(int i = -10; i < 35; i++) {
            if(i == 0) {
                System.out.print("ZERO ");
            } else if(i % 11 == 0) {
                System.out.print("\u001B[34m" + i + "\u001B[0m ");
            } else if(i % 12 == 0) {
                System.out.print("\u001B[31m" + i + "\u001B[0m ");
            } else {
                System.out.print(i + " ");
            }
        }

        /** Task 10
         * Написать метод, который принимает на вход параметры start,
         * end, step, и печатает последовательность десятичных  чисел,
         * начиная с числа start, с шагом step. Точка выхода из цикла - число end.
         */
        printTaskNumber(10);

       taskTen(10,1,0.5);

        /** Task 11
         * Написать метод, который принимает параметр l и печатает
         * последовательность четных чисел от нуля. Длина последовательности = l.
         */
        printTaskNumber(11);

        taskEleven(20);

        /** Task 12
         * Напишите метод, который принимает целое число n, и выводит все
         * степени числа 2 от 1 до n включительно
         */
        printTaskNumber(12);

        taskTwelve(5);

        /** Task 13
         * Вывести последовательность 012345678900112233445566778899000…
         * до числа 9999 включительно.
         */
        printTaskNumber(13);

//        int value = "10000".length();


        for(int i = 0; i < 10000; i++) {
            if(i < 10 ) {
                System.out.print(i + " ");
            }else if(i == 10){
                System.out.print("00 ");
            } else if(i < 100 && i % 11 == 0) {
                System.out.print(i + " ");
            }else if(i == 100){
                System.out.print("000 ");
            } else if(i < 1000 && i % 111 == 0){
                System.out.print(i + " ");
            }else if(i == 1000){
                System.out.print("0000 ");
            } else if(i <= 9999 && i % 1111 == 0) {
                System.out.print(i + " ");
            }
        }

        /** Task 14
         * Распечатайте последовательность чисел:
         * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */
        printTaskNumber(14);

        for (int i = 0; i < 6; i++){
            if(i == 0){
                System.out.print(i + " ");
            }else{
                System.out.print(i + " ");
                System.out.print((i * -1) + " ");
            }
        }

        /** Task 15
         * Распечатать последовательность чисел:
         * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */
        printTaskNumber(15);

        for(int i = 0; i < 26; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        /** Task 16
         * Написать метод, который принимает параметры n, m, l , и
         * печатает последовательность нечетных чисел начиная с числа n,
         * с шагом m,  длина последовательности l .
         */
        printTaskNumber(16);

        taskSixteen(-10,-3, 5);

        /** Task 17
         * Сгенерируйте и распечатайте последовательность по формуле:
         * n + 1 = n + 2
         */
        printTaskNumber(17);

        int n = 0;
        int l = 15;
        for(int i = n ; i < l ; i ++) {
            System.out.print(i + 2 +  " ");
        }

        for(;n < l; n ++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }

        /** Task 18
         *  Написать метод, который принимает параметры l, n, и печатает
         *  последовательность чисел, начиная с числа n, по формуле для n + 1
         *  члена последовательности:
         * n + 1 = 2n
         * Длина последовательности l .
          */
        printTaskNumber(18);

        taskEighteen(10, 1);

        /** Task 19
         * Сгенерируйте последовательность целых положительных
         * двузначных чисел, в которых разница между первой цифрой (десятки)
         * и второй цифрой (единицы) не превышает 3.
         */
        printTaskNumber(19);

        for(int i = 99; i > 9; i--) {
            if((i / 10) - (i % 10) <= 3 && (i / 10) - (i % 10) >= 0) {
                System.out.print(i + " ");
            }
        }

        /** Task 20
         * Написать метод, который вычислит значение функции:
         */
        printTaskNumber(20);

        taskTwenty(0.7);


















    }
}
