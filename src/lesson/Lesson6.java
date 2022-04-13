package lesson;

public class Lesson6 {

    public static void seq(int l) {
        int end = 0;

        for(int i = 0; end < l; i += 2){
            System.out.println(i);
            end ++;
        }
    }

    public static void main(String[] args) {
       //  Печатаем "Java for beginners" для всех чисел от 1 до 5 включ.
//        for(int i = 1; i < 6 ; i++) {
//            System.out.println("Java for beginners");
//        }
//
//        //Печатаем числа от 1 до 5 включительно
//        for(int i = 1; i < 6 ; i++ ) {
//            System.out.println(i);
//        }

//        //Печатаем только нечетные числа от 1 до 10 включительно
//        for (int i = 1; i < 11 ; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        //оптимальный цыкл       i += 2
//        for(int i = 1; i < 11 ; i = i + 2) {
//            System.out.println(i);
//        }

//        //Печатаем все числа от 1 до 100 включительно с шагом 10
//        for(int i = 1 ; i < 101; i += 10){
//            System.out.println(i);
//        }
//        // Печатаем все числа в промежутке от 0 до 100 вкл.,
//        // которые делятся на 10
//        for (int i = 0; i < 101 ; i += 10) {
//            System.out.println(i);
//        }

        // Печатаем все числа в промежутке от -100 до 100 вкл.,
        // которые делятся на 10
//        for (int i = -100; i < 101; i += 10){
//            System.out.println(i);
//        }
//
//        // Стараемся придумывать решения только с одним for
//        // Печатаем все числа от 5 до 1 вкл
//        for(int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }

       String bottles = " bottles of beer";
       String bottle = " bottle of beer";
       String wall = " on the wall";
       String take = "Take one down and pass it around";
       String commaSpace = ", ";
       String dot = ".";
       String go = "Go to the store and buy some more";
       String noMoreC = "No more";
       String noMoreL = "no more";
       String ln = "\n";

//        for(int i = 99; i > -1; i--) {
//
//            if(i == 2) {
//                System.out.print(i + bottles + wall + commaSpace + i + bottles
//                        + dot + ln + take + commaSpace + (i - 1) + bottle
//                        + wall + dot + ln + ln) ;
//            } else if(i == 1) {
//                System.out.print(i + bottle + wall + commaSpace + i + bottle
//                        + dot + ln + take + commaSpace + noMoreL + bottles
//                        + wall + dot + ln + ln);
//
//            } else if(i == 0) {
//                System.out.print(noMoreC + bottles + wall + commaSpace + noMoreL
//                        + bottles + dot + ln + go + commaSpace + (i + 99)
//                        + bottles + wall + dot + ln );
//            } else {
//                System.out.print(i + bottles + wall + commaSpace + i + bottles
//                        + dot + ln + take + commaSpace + (i - 1) + bottles
//                        + wall + dot + ln + ln);
//            }
//
//
//        }
//


        seq(20);











    }
}
