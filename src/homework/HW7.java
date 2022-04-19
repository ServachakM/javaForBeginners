package homework;

import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;

import static homework.HW4.*;
import static lessons.lesson1to7.Lesson4.*;

public class HW7 {

    public static int maxAges(int[] arr){
        int max = Integer.MIN_VALUE;
        if(arr.length != 0) {
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
            }
        }

        return max;
    }
    public static int minAges(int[] arr){
        int min = Integer.MAX_VALUE;
        if(arr.length != 0) {
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
            }
        }

        return min;
    }


    public static double averageArray(int[] array) {
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i] ;
        }
        return average / array.length ;
    }

    public static String[] minMaxAverage(int[] array) {

        String[] minMaxAverage = new String[3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        minMaxAverage[0] = "Min Value = " + min;
        minMaxAverage[1] = "Max Value = " + max;
        minMaxAverage[2] = "Average = " + averageArray(array);

        return minMaxAverage;
    }

    public static void main (String[] args) {

        /** Task 1
         * Создать массив catsNames, заполнить его любыми значениями
         * (см картинку котов из презентации).
         */
        printTaskNumber(1);

        String[] catsNames = {
                "Dasher",
                "Dancer",
                "Prancer",
                "Vixen",
                "Comet",
                "Cupid",
                "Donner",
                "Blitzen"
        };
        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        /** Task 2
         * В массиве catsNames изменить значение элемента с индексом 4
         * на “Рыжик”,  а значение элемента с индексом 1 на “Черныш”.
         */
        printTaskNumber(2);

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        /** Task 3
         * Создать массив catsColors и заполнить его значениями.
         */
        printTaskNumber(3);

        String[] catsColors = {
                "Grey",
                "Black",
                "Grey",
                "Brown",
                "Red",
                "Grey",
                "Red",
                "Grey"
        };

        for (int i = 0; i < catsColors.length; i++) {
            System.out.println(catsColors[i]);
         }

        /** Task 4
         * Создать массив catsAges и заполнить его любыми значениями.
         */
        printTaskNumber(4);

        int[] catsAges = {3,5,4,1,2,7,6,1};

        for (int i = 0; i < catsAges.length; i++) {
            System.out.println(catsAges[i]);
        }

        /** Task 5
         * Создать массив isCatRed и заполнить его соответствующими значениями
         */
        printTaskNumber(5);

        boolean[] isCatRed = {false, false, false, false, true, false, true,
                false};

        for (int i = 0; i < isCatRed.length; i++) {
            System.out.println(isCatRed[i]);
        }

        /** Task 6
         * Распечатать для массивов catsNames и catsColors:
         * имя кота в коробке с номером 6
         * имена котов из коробок с четными индексами
         * имена котов из коробок, чьи индексы кратны 4
         * цвет котов из коробок с нечетными индексами
         * цвет котов из коробок, чьи индексы кратны 3
         */
        printTaskNumber(6);
        taskN(6,"1");

        System.out.println(catsNames[6]);

        taskN(6,"2");

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        taskN(6,"3");

        for (int i = 0; i < catsNames.length; i++) {
            if(i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        taskN(6,"4");

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0 ) {
                System.out.println(catsColors[i]);
            }
        }
        taskN(6,"5");

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0 ) {
                System.out.println(catsColors[i]);
            }
        }

        /** Task 7
         * Распечатать “Накорми кота!” для всех серых котов
         */
        printTaskNumber(7);

        for (int i = 0; i < catsColors.length; i++) {
            if(catsColors[i].equals("Grey")) {
                System.out.println("Накорми кота!");
            } else {
                System.out.println(catsColors[i]);
            }
        }

        /** Task 8
         * Распечатать “Отнеси кота на прививку!”, если возраст кота
         * меньше 2 лет
         */
        printTaskNumber(8);

        for (int i = 0; i < catsAges.length; i++) {
            if(catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Error");
            }else if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            } else {
                System.out.println(catsAges[i]);
            }
        }

        /** task 9
         * Для кота в последней коробке распечатать имя, цвет, возраст
         */
        printTaskNumber(9);

        for (int i = 0 ; i < catsAges.length; i++) {
            if((catsNames.length == catsAges.length) && (catsNames.length == catsColors.length)) {

              if (i == (catsAges.length - 1)) {
                System.out.println("Имя кота из последней коробки - "
                        + catsNames[i] + "\nЦвет кота - " + catsColors[i]
                        + "\nВозраст кота - " + catsAges[i]);
              }
           }
        }

        /** Task 10
         * Распечатать имена всех котов, чей возраст больше 2 лет
         */
        printTaskNumber(10);

        for (int i = 0 ; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }

        /** Task 11
         * Распечатать “Накорми кота!” если имя кота “Рыжик” и
         * значение isCatRed == true
         */
        printTaskNumber(11);

        if( catsNames.length == isCatRed.length  && catsNames.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                    System.out.println("Накорми кота!");
                } else {
                    System.out.println(catsNames[i]);
                }
            }
        }

        /** Task 12
         * Распечатать средний возраст котов из массива catsAges
         */
        printTaskNumber(12);

        double average = 0;
        for (int i = 0; i < catsAges.length; i++) {
                average = average + catsAges[i] ;
        }
        System.out.printf("%.1f - средний возраст котов", (average / catsAges.length));


        /** Task 13
         * Распечатать возраст самого молодого кота
         */
        printTaskNumber(13);

        int min = Integer.MAX_VALUE;
        if(catsAges.length != 0) {
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 0) {
                    if (min > catsAges[i]) {
                        min = catsAges[i];
                    }
                }
            }
        }
        System.out.println(min + " - Возраст самого молодого кота");

        System.out.println(minAges(catsAges));


        /** Task 14
         * Распечатать возраст самого старого кота
         */
        printTaskNumber(14);

        int max = Integer.MIN_VALUE;
        if(catsAges.length != 0) {
            for(int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 0) {
                    if (max < catsAges[i]) {
                        max = catsAges[i];
                    }
                }
            }
        }
        System.out.println(max + " - Возраст самого старого кота");

        System.out.println(maxAges(catsAges));

        /** Task 15
         * Распечатать количество серых котов
         */
        printTaskNumber(15);

        int quantity = 0;
        for(int i = 0; i < catsColors.length; i++) {
            if(catsColors[i].equals("Grey")) {
                quantity = quantity + 1;
            }
        }
        System.out.println(quantity + " - количество серых котов");

        /** Task 16
         * Распечатать имя кота, если кот находится в коробке с четным
         * индексом и его возраст не больше 3 лет
         */
        printTaskNumber(16);

        if((catsNames.length == catsAges.length) && (catsNames.length != 0)){
             for(int i = 0; i < catsNames.length; i++) {
                 if (i % 2 == 0 && catsAges[i] <= 3) {
                     System.out.println(catsNames[i]);
                 }
             }
        }

        /** Task 17
         * Создать массив четных положительных чисел, значения которых
         * не больше 10. (заполняем значения с помощью цикла for)
         */
        printTaskNumber(17);

        int[] array2 = new int[0];
        int count = 0;
        for(int i = 0; i < 11; i++){
            if(i % 2 == 0) {
                count++;
                array2 = new int[count];
            }
        }
        System.out.println(array2.length);

        count = 0;
        for (int i = 0; i < array2.length; i++) {
                array2[i] = count;
                count += 2;
            }
        System.out.println(Arrays.toString(array2));

//        ArrayList<Integer> list17 = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            if(i % 2 == 0) {
//                list17.add(i);
//            }
//        }
//        System.out.println(list17);


        /** Task 18
         * Написать метод, который принимает на вход массив int,
         * и возвращает среднее значение. Проверить работу метода тестом,
         * если параметр - массив catsAges
         */
        printTaskNumber(18);

        averageArray(new int[]{2, 5, 3, 7, 8, 4});
        averageArray(new int[]{3,5,4,1,2,7,6,1});
        HW5.verifyEquals(3.625,averageArray(catsAges));


        /** Task 19
         * Создать массив нечетных отрицательных чисел в промежутке
         * от -1000 до -900
         */
        printTaskNumber(19);

        int[] array3 = new int[0];
        count = 0;
        for (int j = -1000; j < -900; j++) {
            if(j % 2 != 0) {
                count++;
                array3 = new int[count];
            }
        }
        System.out.println(array3.length);
        count = 0;
        for (int j = -1000; j < -900; j++) {
            if (j % 2 != 0) {
                if (count < array3.length) {
                    array3[count] = j;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(array3));

//        ArrayList<Integer> list19 = new ArrayList<>();
//        for (int j = -1000; j < -900; j++) {
//            if (j % 2 != 0) {
//                list19.add(j);
//            }
//        }
//        System.out.println(list19);

        /** Task 20
         * Создать массив из 10 случайных положительных целых чисел
         */
        printTaskNumber(20);

        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
           array4[i] = (int)(Math.random() * 20); ;
        }
        System.out.println(Arrays.toString(array4));


        /** Task 21
         * Создать метод, который принимает на вход массив int,  и возвращает
         * минимальное значение, максимальное значение и среднее значение
         * всех чисел массива. Проверить работу метода на массиве из задания 20.
         */
        printTaskNumber(21);

        System.out.println(Arrays.toString(minMaxAverage(array4)));


        /** Task 22
         * Создать массив четных чисел и массив нечетных чисел из элементов
         * массива из задания 20.
         */
        printTaskNumber(22);


        count = 0;
        int newCount = 0;

        for(int i = 0; i < array4.length; i++){
            if(array4[i] % 2 == 0) {
                count++;
            } else {
                newCount++;
            }
        }
        int[] array5 = new int[count];
        int[] array6 = new int[newCount];


        count = 0;
        newCount = 0;

        for(int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 == 0 && count < array5.length) {
                array5[count] = array4[i];
                count++;
            } else if(newCount < array6.length) {
                array6[newCount] = array4[i];
                newCount++;
            }
        }
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(array6));

        /** Task 23
         * Создать двумерный массив, который состоит из имен, возрастов,
         * цветов котов:
         * Распечатать все данные котов в коробках с четными индексами,
         * используя двумерный массив.
         */
        printTaskNumber(23);

        String[][] cats2 = new String[3][8];
        String[] catsAges2 = new String[catsAges.length] ;
        for (int i = 0; i < catsAges.length; i++) {
            catsAges2[i] = String.valueOf(catsAges[i]);
        }
        if(catsNames.length == cats2[0].length
                && catsAges.length == cats2[0].length
                && catsColors.length == cats2[0].length ) {
            for (int i = 0; i < cats2.length; i++) {
                for (int j = 0; j < cats2[i].length; j++) {
                    if (i == 0) {
                        cats2[i][j] = catsNames[j];
                    } else if (i == 1) {
                        cats2[i][j] = catsAges2[j];
                    } else {
                        cats2[i][j] = catsColors[j];
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(cats2));

        for (int i = 0; i < cats2.length; i++) {
            for (int j = 0; j < cats2[i].length; j += 2) {
                System.out.print(cats2[i][j] + " ");
            }
            System.out.println();
        }


        /** Task 24
         * Создать двумерный массив целых случайных чисел от 1 до 10
         * размерности 4*8.
         */
        printTaskNumber(24);

        int[][] array7 = new int[4][8];
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                array7[i][j] = (int)((Math.random() * 10) + 1);
            }
        }
        System.out.println(Arrays.deepToString(array7));

        System.out.println(Utils.randomInt(10,1));


        /** Task 25
         * Вывести сумму всех четных чисел массива из задания 24.
         */
        printTaskNumber(25);


        int sum = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                if (array7[i][j] % 2 == 0) {
                    sum = sum + array7[i][j];
                }
            }
        }
        System.out.println(sum);


        printTaskNumber(26);


    }

}
