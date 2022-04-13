package lesson;

public class Lesson5 {

    public static int returnMinOfThree(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c) {
            min = c;
        }
            return min;
    }

    public static double average (int a, int b, int c) {
        //double average = ((double)a + b + c) / 3;
       return ((double)a + b + c) / 3;
    }
    public static double returnAbs (double number) {
        if (number < 0) {
            number = (-1) * number;
        }
        return number;
    }
    public static double countDifferenceBetweenMinAverage(int a, int b, int c) {

        int min = returnMinOfThree(a, b, c);
        double average = average(a, b, c);

        return returnAbs(min - average);
    }
    public static String displayMessage(int a, int b, int c) {
        String message;

        if (countDifferenceBetweenMinAverage(a, b, c) > 3.51) {
            message = "Большой разброс чисел";
           // System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
          //  System.out.println(message);
        }
        return(message);
    }

    public static void main(String[] args) {

        // Даны 3 числа.
        // Необходимо найти максимально точную разницу
        // между минимальным числом и средним значением.
        // Если разница больше 3.51,
        // показать пользователю сообщение "Большой разброс чисел",
        // иначе показать сообщение "Маленький разброс чисел"

        int a = 5;
        int b = 2;
        int c = 10;

        System.out.println(returnMinOfThree(a, b, c));
        System.out.println(average(a, b, c));
        System.out.println(displayMessage(a, b, c));
//
//        String expectedResult = "Большой разброс чисел";
//        if(expectedResult == displayMessage(a, b, c)){
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//
//        String expectectedResult2 = "Маленький разброс чисел";
//        if (expectectedResult2 == displayMessage(a, b, c)) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }


    }
}