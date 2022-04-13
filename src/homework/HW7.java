package homework;

import lesson.Lesson4;

import static homework.HW4.*;
import static lesson.Lesson4.*;

public class HW7 {

//    public static double averageArray(int[]) {
//        double average = 0;
//
//        for (int i = 0; i < catsAges.length; i++) {
//            average = average + catsAges[i] ;
//        }
//        System.out.println((average / catsAges.length));
//
//    }

    public static void main (String[] args) {

        /** Task 1
         * Создать массив catsNames, заполнить его любыми значениями
         * (см картинку котов из презентации).
         */
        printTaskNumber(1);

        String[] catsNames = {
                "Dasher",
                "Dancer ",
                "Prancer ",
                "Vixen ",
                "Comet ",
                "Cupid ",
                "Donner ",
                "Blitzen "
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
            if(catsColors[i] == "Grey") {
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
            if (catsAges[i] < 2) {
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
            if (i == (catsAges.length - 1)) {
                System.out.println("Имя кота из последней коробки - "
                        + catsNames[i] + "\nЦвет кота - " + catsColors[i]
                        + "\nВозраст кота - " + catsAges[i]);
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

        for (int i = 0; i < catsNames.length; i++) {
            if( catsNames[i] == "Рыжик" && isCatRed[i] == true) {
                System.out.println("Накорми кота!");
            } else {
                System.out.println(catsNames[i]);
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
        System.out.println((average / catsAges.length));


        /** Task 13
         * Распечатать возраст самого молодого кота
         */
        printTaskNumber(13);

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < catsAges.length; i++) {
            if(min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        /** Task 14
         * Распечатать возраст самого старого кота
         */
        printTaskNumber(14);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < catsAges.length; i++) {
            if(max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);

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
        System.out.println(quantity);

        /** Task 16
         * Распечатать имя кота, если кот находится в коробке с четным
         * индексом и его возраст не больше 3 лет
         */
        printTaskNumber(16);

        for(int i = 0; i < catsNames.length; i++) {
            if(i % 2 == 0 && catsAges[i] < 3){
                System.out.println(catsNames[i]);
            }
        }

        /** Task 17
         * Создать массив четных положительных чисел, значения которых
         * не больше 10. (заполняем значения с помощью цикла for)
         */
        printTaskNumber(17);

        int[] array = new int[8];
        for(int i = 0; i < array.length; i++){

        }

        /** Task 18
         * Написать метод, который принимает на вход массив int,
         * и возвращает среднее значение. Проверить работу метода тестом,
         * если параметр - массив catsAges
         */
        printTaskNumber(18);













    }

}
