package homework;

import java.math.BigDecimal;

import static homework.HW4.*;
import static lesson.Lesson4.printTaskNumber;
import static lesson.Lesson5.*;

public class HW5 {

    public static void verifyEquals(int expectedResult, int actualResult) {
        String result = "";

        if (expectedResult == actualResult) {
            result = "\u001B[32m Pass \u001B[0m";
        } else {
            result = "\u001B[31m Fail \u001B[0m";
        }

        System.out.println(result);
    }

    public static void verifyEquals(double expectedResult,
                                    double actualResult) {
        String result = "";

        if (expectedResult == actualResult) {
            result = "\u001B[32m Pass \u001B[0m";
        } else {
            result = "\u001B[31m Fail \u001B[0m";
        }

        System.out.println(result);
    }

    public static void verifyEquals
            (String expectedResult, String actualResult) {
        String result = "";

        if (expectedResult.equals(actualResult)) {
            result = "\u001B[32m Pass \u001B[0m";
        } else {
            result = "\u001B[31m Fail \u001B[0m";
        }

        System.out.println(result);
    }

    public static String dayOfWeek(int a) {
        String dayOfWeek = "";

        if (a > 7 || a <= 0) {
            dayOfWeek = "Invalid data";
        } else if (a == 1) {
            dayOfWeek = "Monday";
        } else if (a == 2) {
            dayOfWeek = "Tuesday";
        } else if (a == 3) {
            dayOfWeek = "Wednesday";
        } else if (a == 4) {
            dayOfWeek = "Thursday";
        } else if (a == 5) {
            dayOfWeek = "Friday";
        } else if (a == 6) {
            dayOfWeek = "Saturday";
        } else if (a == 7) {
            dayOfWeek = "Sunday";
        }

        return (dayOfWeek);
    }

    public static int returnMaxOfThree(int x, int y, int z) {
        int largest;

        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest < z) {
            largest = z;
        }
        return largest;
        //  return Math.max(Math.max(x,y), z);

    }

    public static int returnMinOfThree(int a, int b, int c) {

        return Math.min(Math.min(a, b), c);
    }

    public static boolean tempCatControl(double t) {
        if(t < 34.5 || t > 42.5 ) {
            return false;
        } else {
            return true;
        }
    }

    public static String averageTempOfCat(double a, double b, double c,
                                          double d, double e) {
       // String temperature2 = "";
        double temperature;

        if (tempCatControl(a) && tempCatControl(b) && tempCatControl(c)
                && tempCatControl(d) && tempCatControl(e)) {
            temperature = Math.round((a + b + c + d + e) / 5);
            String temperature2 = String.valueOf(temperature);
            return temperature2;
        } else {
            return "Invalid data";
        }
    }

    public static String transferСurrency(double price) {

        if (price <= 0) {
            return "Invalid data";
        } else {
            double kop = (price - (int)price) * 100;
//            int indexOfDouble = String.valueOf(price).indexOf(".");
//
//            priceInString = (String.valueOf(price).substring(0, indexOfDouble) + " rub "
//                    + String.valueOf(price).substring(indexOfDouble + 1) + " kop");

            return (int) price + " rub " + (int) kop + " kop";
        }
    }



    public static String transferValueMass(double mass) {

//        String massInString = String.valueOf(mass);
//        int indexOfDouble = massInString.indexOf(".");
//        String returnMass = massInString.substring(0, indexOfDouble) + " kg "
//                + massInString.substring(indexOfDouble + 1) + " g";
        String massInString = "";
        if (mass > 0) {
            massInString = (int) mass + " kg " + (int) ((mass - (int) mass)
                    * 1000) + " g";
        } else {
            massInString = "Invalid data";
        }
        return massInString;
    }

    public static String priceSum(double a, double b) {
        double priceSum;
        if (a > 0 && b > 0) {
            priceSum = a * b;
            priceSum = (BigDecimal.valueOf(priceSum).setScale(2,
                    BigDecimal.ROUND_HALF_DOWN).doubleValue());

            return (priceSum + " $");
        } else {
            return ("Invalid data");
        }
    }


    public static void check(double price, double quantity, String goods,
                             String count) {
        double check = 0;
        if (price > 0 && quantity > 0) {
            check = BigDecimal.valueOf(price * quantity).setScale(2,
                    BigDecimal.ROUND_HALF_DOWN).doubleValue();
        } else {
            System.out.println("Invalid data");
        }
        String line = "_______________________________________";

        System.out.println(goods + "\n" + "Цена за 1 " + count + "\t\t\t" +
                transferСurrency(price) + "\n" + "Количество товара" + "\t\t"
                + transferValueMass(quantity) + "\n"
                + line + "\n" + "Сумма к оплате" + "\t\t\t"
                + transferСurrency(check) + "\n");
    }

    public static String salary(double hoursOfDay, double priceOfHour,
                              int quantityDays) {

        if (hoursOfDay <= 0 || priceOfHour <= 0 || quantityDays <= 0) {
            return "Invalid data";
        } else {
            return transferСurrency(hoursOfDay * priceOfHour * quantityDays);
        }
    }
       //            int indexOfDouble = String.valueOf(hoursOfDay * priceOfHour
//                    * quantityDays).indexOf(".");
//            salary = (String.valueOf(hoursOfDay * priceOfHour
//                    * quantityDays).substring(0, indexOfDouble) + " rub "
//                    + String.valueOf(hoursOfDay * priceOfHour
//                    * quantityDays).substring(indexOfDouble + 1) + " kop");






    public static String statement(String nameEmployee, double hoursOfDay,
                                   double priceOfHour, int quantityDays) {

         String statement = nameEmployee + "\t\t\t" + salary(hoursOfDay,
                 priceOfHour, quantityDays);
       return statement;
    }


    public static String diagram(int x) {
        String diagram = "";
        if (x < 0) {
            diagram = "x is negative";
        } else if (x > 0) {
            diagram = "x is positive";
        } else {
            diagram = "x is zero";
        }
        return (diagram);
    }

    public static int luckyNumber(int year) {

        int luckyNumber = (year % 10) + (year / 10) % 10 + year / 100;

        if (year <= 0 || year > 2022) {
            System.out.println("Invalid data");
        } else if (luckyNumber > 9) {
            luckyNumber = luckyNumber % 10 + luckyNumber / 10;
            if (luckyNumber > 9) {
                luckyNumber = luckyNumber % 10 + luckyNumber / 10;
            }
        }
        return  luckyNumber;
    }

    public static int median(int a, int b, int c) {

        int min = Math.min(Math.min(a,b), c);
        int max = Math.max(Math.max(a,b), c);
        int median = (a + b + c) - min - max;
        return median;
       // return (Math.max(Math.min(a, b), Math.min(Math.max(a, b), c)));
    }

    public static String averageMedianCompare( int a, int b, int c){

        double average = Math.round(average(a, b, c));
        int median = Math.abs(median(a,b,c));
        double averageMinusMedian = average - median;
        String massage = "";

        if (averageMinusMedian > 2){
            massage = "Среднее значение " + average + " отличается " +
                    "от медианы " + median + " на " + averageMinusMedian;
        } else {
            massage = "Среднее значение = " + average + ", медиана = "
            + median;
        }
        return massage;
    }

    public static String summaKOplape( double a) {
       String summa = "";
        a = Math.floor(a);
        summa = transferСurrency(a);

        return summa;
    }

    public static double methodMath(int a, int b, int c) {
        double d;
        d = Math.ceil(Math.sqrt((Math.addExact((Math.multiplyExact(a, b)), c)) *
                Math.pow(a, b)) / Math.PI);

        return d;
    }

    public static void randomPower() {
        double numberN = Math.random();
        double power = Math.random() * 11;
        long result = Math.round(Math.pow(numberN, power));
        System.out.println("Число " + numberN + " в степени " + power + " = " +
                result);
    }
    public static double getPow(int pow) {
        if(pow >= 0 && pow <=10) {
            return Math.pow(Math.random(), pow);
        }else {
            System.out.println("err");
            return Double.MAX_VALUE;
        }
    }

    public static void randomNumber() {
        System.out.println((int)(Math.random() * 99) + 1);
    }

    public static String  leapYear (int year) {
        boolean isLeapYear;
        String leapYear = "";

        if (year % 4 == 0) {
            isLeapYear = true;

        } else {
            isLeapYear = false;
        }

        leapYear = String.valueOf(isLeapYear);
        return leapYear;
    }


    public static void main (String[] args) {

        /** Task 1
         * ВСЕ!!! результаты должны быть протестированы, для этого необходимо
         * создать метод с названием verifyEquals(expectedResult, actualResult)
         */

         printTaskNumber(1);

         verifyEquals(255,255);


        /** Task 2
         * Написать метод, который принимает на вход число от 1 до 7
         * и возвращает день недели.
         */

        printTaskNumber(2);

        int i = 6;

        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(0));


        verifyEquals("Sunday", dayOfWeek(7));
        verifyEquals("Суббота", dayOfWeek(i));

        /** Task 3
         * Given three values, x, y, z, determine the largest value
         * and assign this value to the variable largest
         */

        printTaskNumber(3);

        int x = -125566;
        int y = -10;
        int z = -1235;
        System.out.println(returnMaxOfThree(x, y, z));
        verifyEquals(-10, returnMaxOfThree(x, y, z));
        verifyEquals(-10, returnMaxOfThree(-15, 125, 0));


        /** Task 4
         * Using nested if statements, write a fragment of code that prints
         * the smallest value contained in the variables a, b, c
         */

        printTaskNumber(4);

        int a = -125566;
        int b = -10;
        int c = -1235;
        System.out.println(returnMinOfThree(-125566,-10,-1235));
        verifyEquals(-125566, returnMinOfThree(a, b, c));
        verifyEquals(-10, returnMinOfThree(a, b, c));


        /** Task 5
         * Написать алгоритм вычисления среднего значения из 5 показателей
         * температуры тела кота.
         */

        printTaskNumber(5);

        double temper = 37.5;
        double temper2 = 37.9;
        double temper3 = 35.0;
        double temper4 = 36.6;
        double temper5 = 38.1;
        String test = "37.0";//38.5
        System.out.println(averageTempOfCat(temper, temper2, temper3, temper4,
                temper5));
        System.out.println(averageTempOfCat(37.0,36.6,38.8,0,41.0));
        verifyEquals(test, averageTempOfCat(temper, temper2, temper3,
                        temper4, temper5));
        verifyEquals("38.5", averageTempOfCat(temper,temper2, temper3,
                temper4, temper5 ));


        /** Task 6
         * Написать метод, который принимает на вход десятичное
         * число (например, 10.75), и возвращает строку “10 руб 75 коп”.
         */

        printTaskNumber(6);


//        String [] arr = priceInString.split("\\.");
//        System.out.println(arr[0] + " hrn " + arr[1] + " kop");
//        System.out.println(indexOfDouble);

        double price = 10.75;
        System.out.println(transferСurrency(10.75));
        System.out.println(transferСurrency(125.78));
        System.out.println(transferСurrency(0.07));
        System.out.println(transferСurrency(0));
        verifyEquals("10 rub 75 kop",
                transferСurrency(price));
        verifyEquals("11 rub 75 kop", transferСurrency(price));



        /** Task 7
         * Написать метод, который принимает на вход десятичное число
         * и возвращает строку “10 кг 75 гр”.
         */

        printTaskNumber(7);

        double mass = 10.750;
        System.out.println(transferValueMass(mass));
        System.out.println(transferValueMass(0));

        verifyEquals("10 kg 750 g", transferValueMass(mass));
        verifyEquals("10 kg 760 g", transferValueMass(mass));




        /** Task 8
         * Написать метод, который принимает на вход 2 параметра -
         * цену и количество товара (может быть вес товара,
         * или количество в штуках). Алгоритм возвращает сумму покупки
         * в виде десятичного числа.
         */

        printTaskNumber(8);

        double p = 390.15;
        int k = 7;
        String test2 = "2731.05 $";
        System.out.println(priceSum(p, k));
        System.out.println(priceSum(1,-1));
        verifyEquals(test2, priceSum(p, k));
        verifyEquals("1452.23 $", priceSum(122.2, 14));



        /** Task 9
         * Написать метод, который принимает на вход необходимые параметры,
         * и печатает чек.
         */

        printTaskNumber(9);

        check(50.13, 3.400, "Яблоки",
                "кг");
        check(30.50, 5, "Хлеб", " шт");


        /** Task 10
         * Написать метод, который принимает на вход количество часов работы
         * в день и стоимость одного часа работы, и возвращает заработную
         * плату в месяц.
         */

        printTaskNumber(10);

        int hoursOfDay = 8;
        double priceOfHour = 950.55;
        int quantityDays = 20;

        System.out.println(salary(hoursOfDay, priceOfHour, quantityDays));
        System.out.println(salary(0, 22.55, 22));
        verifyEquals("152088 rub 0 kop", salary(hoursOfDay,
                priceOfHour, quantityDays ));
        verifyEquals("5555.25 $", salary(hoursOfDay,
                priceOfHour, quantityDays ));


        /** Task 11
         * Написать метод, который принимает на вход необходимые параметры
         * и печатает строку ведомости выдачи зарплаты сотрудникам.
         */

        printTaskNumber(11);

        System.out.println(statement("Смирнова Мария Ивановна",
                hoursOfDay, priceOfHour, quantityDays ));
        System.out.println(statement("Смирнова Мария Ивановна",
                8, 0, 22));
        System.out.println(statement("Себеряков Иван Петрович", 4,
                1010.00, 20));

        verifyEquals("Смирнова Мария Ивановна\t\t\t152088 rub 0 kop",
                statement("Смирнова Мария Ивановна",
                        hoursOfDay, priceOfHour, quantityDays ));
        verifyEquals("Сидорова Мария Ивановна\t\t\t152088 rub 0 kop",
                statement("Смирнова Мария Ивановна", hoursOfDay,
                        priceOfHour, quantityDays ));


        /** Task 12
         * Записать в виде метода:
         */

        printTaskNumber(12);

        int r = 0;

        System.out.println(diagram(r));
        verifyEquals("x is zero", diagram(r));
        verifyEquals("x is zero", diagram(25));


        /** Task 13
         * Написать метод, который принимает на вход год рождения и возвращает
         * ваше счастливое число. Счастливое число рассчитывается по формуле:
         * сумма всех чисел, если результат больше 9, снова считается сумма
         * всех чисел.
         */

        printTaskNumber(13);

        System.out.println("Счастливое число - " + luckyNumber(1990));
        System.out.println("Счастливое число - " + luckyNumber(2001));
        System.out.println("Счастливое число - " + luckyNumber(1988));

        verifyEquals(9, luckyNumber(1989));
        verifyEquals(5,luckyNumber(2013));



        /** Task 14
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним
         * значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение:
         * “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math,
         * где возможно их использовать
         */

        printTaskNumber(14);

        int number = 1;
        int number2 = 10;
        int number3 = 12;

        System.out.println(averageMedianCompare(number,number2,number3));
        System.out.println(averageMedianCompare(-5, 10, 125));

        verifyEquals("Среднее значение = 8.0, медиана = 10",
                averageMedianCompare(number, number2, number3));
        verifyEquals("Среднее значение = 8.0, медиана = 10",
                averageMedianCompare(-5, 10, 12));



        /** Task 15
         * Написать метод, который использует методы класса Math,
         * принимает на вход сумму к оплате (например, 10.75) и округляет
         * сумму в пользу покупателя. Метод возвращает новую сумму к оплате
         * в виде строки, например “10 руб 00 коп”.
         */

        printTaskNumber(15);

        double summa = 10.75;
        System.out.println(summaKOplape(summa));
        System.out.println(summaKOplape(-5));
        verifyEquals("10 rub 0 kop", summaKOplape(summa));
        verifyEquals("10 rub 5 kop", summaKOplape(summa));
        System.out.println(summaKOplape(16.99));


        /** Task 16
         * Посчитать с помощью методов класса Math
         * a = 3
         * b = 4
         * c = 20
         * Вернуть значение с округлением в бОльшую сторону.
         */
        printTaskNumber(16);


        int a2 = 3;
        int b2 = 4;
        int c2 = 20;
        double d;

        System.out.println(methodMath(a2, b2, c2));
        verifyEquals(17.0, methodMath(a2, b2, c2) );
        verifyEquals(10.0, methodMath(a2, b2, c2) );


        /** Task 17
         *
         */

        printTaskNumber(17);

        taskN(17, "1");

        int y2 = 2;
        int x2;
        if(y2 > 0) {
            x2 = 1;
        }

        taskN(17, "2");

        double score = 80.25;
        if(score >= 80 && score <= 90) {
            score = score + 5;
            System.out.println(score);
        }

        taskN(17, "3");

        boolean item;
        int i2 = 22;
        int v = 0;
        item = ((i2 >= 10) && (v < 50));
        System.out.println(item);

        taskN(17, "4");

        int xx = 9;
        if(xx % 2 != 0 && xx >= 0){
            System.out.println("True");
        }

        taskN(17, "5");

        int yy = 0;
        if (xx >= 0 && yy >= 0) {
            System.out.println("True");
        }

        taskN(17, "6");

        int x3 = -2;
        int y3 = -5;
        if ((x3 > 0 && y3 > 0) || (x3 < 0 & y3 < 0)) {
            System.out.println("True");
        }


        /** Task 18
         * Написать метод, который с помощью методов класса Math высчитывает
         * любую степень сгенерированного случайного числа. Метод возвращает
         * математически округленное целое значение и выводит на экран:
         */

        printTaskNumber(18);

        randomPower();
        randomPower();



        /** Task 19
         * Написать метод, который возвращает случайное число в пределах
         * от 1 до 99 включительно.
         */

        printTaskNumber(19);


        randomNumber();
        randomNumber();


       /** Task 20
         *
         */
        printTaskNumber(20);


        int year = 1998;

        System.out.println(leapYear(year));
        System.out.println(leapYear(1456));
        System.out.println(leapYear(2002));
        verifyEquals("true", leapYear(2004));
        verifyEquals("false", leapYear(2021));
        verifyEquals("false", leapYear(2020));







    }
}
