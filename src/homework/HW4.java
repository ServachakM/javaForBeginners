package homework;

import lesson.Lesson4;

import static lesson.Lesson4.*;

public class HW4 {

    public static void print() {
        System.out.println();
    }

    public static void zadachaNum(int num) {
        System.out.println("------ Задача " + num + " ------ ");
    }

    public static void taskN(int num, String text) {
        zadachaNum(num);
        System.out.print(text);
        System.out.print(") ");
    }

    public static void metod17HW2(String a, String d, int k, int l) {
        int dev = k / l;
        int ost = k % l;
        System.out.println("Результат деления " + a + " на " + d + " = " + dev +
                ", а остаток от деления  = " + ost);
    }

    public static void metodAppleStudent(int apple, int student) {
        System.out.println("Если " + apple + " яблок(а) поделить на " + student
                + " учеников, то каждый ученик получит по " + apple / student
                + " яблок(а), и " + apple % student + " яблок(а) останется" +
                " учителю");
    }


    public static void printApple(int apple2) {
        if (apple2 % 10 == 1 && apple2 != 11) {
            System.out.print(" яблоко ");
        } else if (apple2 % 10 >= 2 && apple2 % 10 < 5) {
            System.out.print(" яблока ");
        } else if (apple2 % 10 == 0 || apple2 == 11 || apple2 % 10 >= 5) {
            System.out.print(" яблок ");
        }
    }

    public static void printStudent(int student2) {
        if (student2 % 10 == 1 && student2 != 11) {
            System.out.print(" ученика");
        } else {
            System.out.print(" учеников");
        }
    }

    public static void printAppleStudent(int apple2, int student2) {
        System.out.print("Если " + apple2);
        printApple(apple2);
        System.out.print(" поделить на " + student2);
        printStudent(student2);
        System.out.print(", то каждый ученик получит " + apple2 / student2);
        printApple(apple2 / student2);
        System.out.print(" и " + apple2 % student2 + " останется учителю\n");
    }

    public static void printTemperature(double temperature) {
        System.out.println("Температура в Цельсиях = " + temperature);
        temperature = (temperature * 1.8) + 32;
        System.out.println("Температура в Фаренгейтах = " + temperature);
    }

    public static void printLine() {
        System.out.println("_____________________________________________");
    }


    public static void printTable(int i) {
        printLine();
        System.out.println("| int min            | " + Integer.MIN_VALUE
                + "          |");
        printLine();
        System.out.println("| int max            | " + Integer.MAX_VALUE
                + "           |");
        printLine();
        System.out.println("| i ^ 2              | " + (i * i) + "      " +
                "            |");
        printLine();
    }

    public static void printTable(int i, String w) {
        printLine();
        System.out.println("| " + w + "            | " + i + "           |");
    }

    public static void rozryad(int a) {
        System.out.print("It’s a ");
        System.out.print(Integer.toString(a).length());
        System.out.println("-digit number.");
    }


    public static void main(String[] args) {

        /** Task 2 Написать метод, который будет печатать номер задания
         * перед каждым ответом. Придумайте свой дизайн.
         */

        printTaskNumber(2);
        print();

        /** Task 3 Записать в виде кода следующие логические выражения:
         * 	1) (2 = 2) И (7 = 7);
         * 2) Не(15 < 3);
         * 3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         * 4) Не("Сосна" = "Дуб");
         * 5) (Не(15 < 3)) И (10 > 20);
         * 6) ("Глаза даны, чтобы видеть") И
         * ("Под третьим этажом находится второй этаж");
         * 7) (6/2 = 3) ИЛИ (7*5 = 20).
         */

        printTaskNumber(3);
        print();

        System.out.println("1) " + ((2 == 2) && (7 == 7)));

        System.out.println("2) " + !(15 < 3));

        String pine = "Сосна";
        String oak = "Дуб";
        String cherry = "Вишня";
        String maple = "Клен";

        System.out.println("3) " + ((pine.equals(oak)) || (cherry.equals(maple))));

        System.out.println("4) " + !(pine.equals(oak)));

        System.out.println("5) " + ((!(15 < 3)) && (10 > 20)));

        System.out.println("6) " + ((6 / 2 == 3) && (7 * 5 == 20)));

        String glaza = "видеть";
        int et3 = 3;
        int et2 = 2;
        if ((glaza.equals("видеть")) && et3 > et2) {
            System.out.println("7) Глаза даны, чтобы видеть И Под третьим этажом" +
                    " находится второй этаж");
        } else {
            System.out.println("7) False");
        }

        System.out.println("7) " + ("Глаза даны" == "чтобы видеть"
                && "Под третим этажом" == "второй"));


        printTaskNumber(4);
        print();

        /** Task 4 Записать в виде кода:
         1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
         2) !(28 > 7) И !(300/5 = 60);
         3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
         4) Не((300 < 100))  → ("Жажду можно утолить водой");
         5) (75 < 81) → (88 = 88).
         *
         */

        //  ("В минуте !70 секунд") || ("Работающие часы показывают время"));

        System.out.println("1) " + (("Минута" != "70 секунд") ||
                ("Работающие часы".equals("показывают время"))));

        System.out.println("2) " + (!(28 > 7) && !(300 / 5 == 60)));

        String tv = "электрический прибор";
        String glass = "стекло";
        System.out.println("3) " + ((tv.equals("электрический прибор") &&
                (glass.equals("дерево")))));

        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");
        }


        if (75 < 81) {
            System.out.println("5) " + (88 == 88));
        }

        printTaskNumber(5);
        print();

        /** Task 5 Записать в виде кода следующие выражения:
         а) Андрей старше Светы. Наташа старше Светы.
         б) На полке стоят учебники, а на столе лежат справочники.
         в) БОльшая детей — девочки. Остальные - мальчики.
         */

        int sveta = 20;
        int natasha = 25;
        int andrey = 28;
        if ((andrey > sveta) && (natasha > sveta)) {
            System.out.println("а) Андрей старше Светы. Наташа старше Светы.");
        } else {
            System.out.println("---------------");
        }

        String polka = "Учебники";
        String stol = "Справочники";

        if ((polka.equals("Учебники")) && (stol.equals("Справочники"))) {
            System.out.println("б) На полке стоят учебники, " +
                    "а на столе лежат справочники");
        } else {
            System.out.println("False");
        }

        String devochki = "Большая часть";
        String malchiki = "Меншая часть";

        if (devochki == "Большая часть" || malchiki == "Меншая часть") {
            System.out.println("в) БОльшая детей — девочки. Остальные - мальчики.");
        } else {
            System.out.println("False");
        }


        printTaskNumber(6);
        print();

        /** Task 6 “Водительские права можно получить,
         * только когда исполнится 16 лет.”
         */

        int age = 16;
        if (age >= 16) {
            System.out.println("\u001B[32m" + "Водительские права " +
                    "можно получить, готовся к екзамену" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Нужно подрости" + "\u001B[0m");
        }


        printTaskNumber(7);
        print();

        /** Task 7 ”Петя не едет в автобусе, но при этом читает книгу
         * или не смотрит в окно”
         */

        String petya = "не едет в автобусе";
        String book = "читает";
        String window = "не смотрит";
        String petya2 = "Петя читает на остановке";

        if ((petya.equals("не едет в автобусе")) && (book.equals("читает"))
                || (window.equals("не смотрит"))) {
            System.out.println(petya2);
        } else {
            System.out.println("------------------");
        }


        printTaskNumber(8);
        print();
        /** Task 8 “Если с другом ты, это хорошо, а когда наоборот - плохо”
         *
         */

        String you = "з другом";
        String good = "хорошо";
        if (you.equals("з другом")) {
            you = good;
            System.out.println(you);
        } else {
            System.out.println("Плохо");

        }

        printTaskNumber(9);
        print();

        /** Task 9 	-
         *  a) Если тебе больше 18 лет, то ты взрослый.
         *  Иначе, ты - ребенок.
         */
        taskN(9, "a");

        int vozrast = 0;
        if (vozrast > 0) {
            if (vozrast >= 18) {
                System.out.println("\u001B[31m" + "Tы взрослый" + "\u001B[0m");
            } else {
                System.out.println("\u001B[34m" + "Tы - ребенок" + "\u001B[0m");
            }
        } else {
            System.out.println("Не правильный возраст");
        }
        print();
        taskN(9, "b");
        /** b) Если земля сухая, значит, нет дождя.
         * Если земля мокрая, то идет дождь.
         */

        String land = "сухая";
        // String land1 = "мокрая";
        if (land.equals("сухая")) {
            System.out.println("\u001B[31m" + "Нет дождя" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Идет дождь" + "\u001B[0m");
        }

        print();
        taskN(9, "c");

        /** c) Если земля сухая, значит, нет дождя.
         * Если земля мокрая, то идет дождь. Иначе идет снег.
         */

        if (land == "сухая") {
            System.out.println("\u001B[31m" + "Нет дождя" + "\u001B[0m");
        } else if (land != "сухая") {
            System.out.println("\u001B[31m" + "Идет дождь" + "\u001B[0m");
        } else {
            System.out.println("\u001B[34m" + "Идет снег" + "\u001B[0m");
        }


        print();
        taskN(9, "d");
        /**
         * d) Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
         */

        String sky = "Тучи";
        if (sky == "Тучи") {
            System.out.println("\u001B[31m" + "Идет дождь" + "\u001B[0m");
        } else {
            System.out.println("\u001B[34m" + "Идет слепой дождь" + "\u001B[0m");
        }

        print();
        taskN(9, "e");

        /**
         *  e) Если сегодня суббота, значит, завтра воскресенье.
         *          Если сегодня пятница, значит, вчера был четверг.
         *          Иначе вчера был не четверг, а завтра - не воскресенье
         */

        String today = "Суббота";
        if (today == "Суббота") {
            System.out.println("\u001B[31m" + "Воскресенье" + "\u001B[0m");
        } else if (today == "Пятница") {
            System.out.println("\u001B[31m" + "Вчера был четверг" + "\u001B[0m");
        } else {
            System.out.println("\u001B[34m" + "Если сегодня пятница, значит, " +
                    "вчера был четверг" + "\u001B[0m");
        }

        print();
        taskN(9, "f");
        /**
         *  f) Если на горе свистнул рак, значит, прошла вечность,
         *           иначе ждите дальше.
         */
        String rak = "Свиснул";
        if (rak == "Свиснул") {
            System.out.println("\u001B[31m" + "Прошла вечность" + "\u001B[0m");
        } else {
            System.out.println("\u001B[34m" + "Ждите дальше" + "\u001B[0m");
        }

        print();
        taskN(9, "g");
        /**
         * g) Если тебе 18 или ты закончил школу, то ты можешь не жить
         *           с родителями, иначе живи с родителями.
         */

        int age1 = 0;
        String school = "Ты закончил школу";
        if (age1 == 18 || (school == "Ты закончил школу")) {
            System.out.println("\u001B[31m" + "Ты можешь не жить с родителями"
                    + "\u001B[0m");
        } else {
            System.out.println("\u001B[34m" + "Живи с родителями" + "\u001B[0m");
        }


        /** Task 10 Проверьте число на четность. Если число четное,
         *  удвойте это число, иначе возведите число в квадрат.
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        printTaskNumber(10);
        print();

        int b = 10;
        if (b % 2 == 0) {
            b = b * 2;
        } else {
            b = b * b;
        }
        System.out.println("b = " + b);
        // 13 слайд If Else

        /** Task 11
         * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         * Голосовать можно с 18 лет
         * Машину можно водить с 16 лет
         * В школу можно идти с 5 лет
         */
        printTaskNumber(11);
        print();

        int age2 = 20;

        if (age2 >= 18) {
            System.out.println("Голосовать можно");
        }
        if (age2 >= 16) {
            System.out.println("Машину можно водить");
        }
        if (age2 >= 5 && (age >= 18)) {
            System.out.println("В школу можно идти");
        }
        // 14 слайд If 3 условия

        /** Task 12 Напишите алгоритм программы, которая проверяет
         *  оценку ученика и выполняет следующие действия:
         * 5 - выдать похвальную грамоту и перевести в следующий класс
         * 4 - перевести в следующий класс
         * 3 - дать задание на лето и перевести в следующий класс
         * 2 - вызвать родителей и оставить в текущем классе на второй год
         */
        printTaskNumber(12);
        print();

        int mark = 1;
        if (mark > 5 || mark < 2) {
            System.out.println("Не правильная оценка");
        }
        if (mark == 5) {
            System.out.println("\u001B[32m" + "Выдать похвальную грамоту и " +
                    "перевести в следующий класс");
        } else if (mark == 4) {
            System.out.println("\u001B[33m" + "Перевести в следующий класс");
        } else if (mark == 3) {
            System.out.println("\u001B[35m" + "Дать задание на лето и перевести" +
                    " в следующий класс");
        } else if (mark == 2) {
            System.out.println("\u001B[31m" + "Вызвать родителей и оставить" +
                    " в текущем классе на второй год");
        }

        System.out.println("\u001B[0m");

        /** Task 13 Напишите алгоритм программы, которая проверяет 2 числа.
         *  Программа складывает числа, которые делятся на 3 без остатка,
         *  и вычитает числа, которые делятся на 5 без остатка.
         *  Программа умножает числа, которые делятся на 2 без остатка,
         *  но если хотя бы одно число отрицательное, программа умножает
         *  результат предыдущего действия на (-1).
         *  Если числа не прошли ни одну проверку, программа выводит на печать
         *  ошибку о невозможности произвести действия.
         */
        printTaskNumber(13);
        print();
// переробити на if else перевирити чому виводить вкынцы фразу
        int i = -30;
        int p = 15;
        int sum = i + p;
        int multi = i * p;
        if ((i % 3 == 0) && (p % 3 == 0)) {
            System.out.println(" Сумма = " + sum);
        }
        if ((i % 5 == 0) && (p % 5 == 0)) {
            System.out.println(" Вычитание = " + (i - p));
        }
        if ((i % 2 == 0) && (p % 2 == 0)) {
            System.out.println(" Умножение = " + multi);
        }
        if (i < 0 || p < 0) {
            System.out.println(" Умножение на -1 = " + (multi * (-1)));
        } else {
            System.out.println("Невозможно произвести действия");
        }

        /** Task 14 Распечатать следующие выражения, используя метод и параметры:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         * И так далее все возможные варианты.
         */

        printTaskNumber(14);
        print();

        metod17HW2("m", "k", 15, 5);
        metod17HW2("l", "m", 25, 3);


        /** Task 15 Выполнить задание 18 из HW2 с помощью метода и параметров:
         а) Создать переменные apple и  student и присвоить им значения 40 и 6
         соответственно. Распечатать выражение:
         Если … яблок(а) поделить на … учеников, то каждый ученик получит
         по … яблок(a), и … яблок(а) останется учителю.
         Распечатать это же выражение со значениями 100 и 21.
         */
        printTaskNumber(15);
        print();

        metodAppleStudent(5, 2);

        /** Task 16  Выполнить задание 18 из HW2 с помощью метода и параметров:
         Написать метод так, чтобы правильные склонения слов
         (н-р, яблок или яблока) печатались автоматически в зависимости от
         значений параметров.
         Распечатать выражение с параметрами:
         apple = 42, 55, 1
         student = 42, 5, 2
         */
        printTaskNumber(16);
        print();

        printAppleStudent(11, 6);
        printAppleStudent(555, 21);

          // сначала сделать проверку на 100,


        /** Task 17
         * Напишите метод, который примет на вход параметр температуры в
         * Цельсиях, и распечатает результат температуры в Цельсиях
         * и в Фаренгейтах.
         */
        printTaskNumber(17);
        print();

        printTemperature(17.5);


        /** Task 18 а) Создать метод, который примет на вход параметр i
         * и распечатает таблицу:
         * b) поменять значение i и распечатать таблицу с новым значением i
         */
        printTaskNumber(18);
        print();

        printTable(12);

        /** Task 19 Напишите тест, который валидирует
         *  (проверит правильность работы) ваш код из задания №10.
         *  Тестовые данные - 2, 5, 0.
         */
        printTaskNumber(19);
        print();

        int b1;
        b1 = 5;
        int expectedResult = 25;

        if (b1 % 2 == 0) {
            b1 = b1 * 2;
        } else {
            b1 = b1 * b1;
        }
        System.out.println("b = " + b1);

// Test
        if (expectedResult == b1) {
            System.out.println("\u001b[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001b[31m" + "Fail" + "\u001B[0m");
        }


        /** Task 20
         * Напишите тест, который валидирует ваш код из задания №11.
         * Придумайте тестовые данные. Выведите результат проверки на печать.
         */
        printTaskNumber(20);
        print();

        int age3 = 18;

        String resultWord = "";
        String resultWord2 = "";
        String resultWord3 = "";


        if (age3 >= 18) {
//                System.out.println("Голосовать можно");
            resultWord = "Голосовать можно";
        }
        if (age3 >= 16) {
//                System.out.println("Машину можно водить");
            resultWord2 = "Машину можно водить";
        }
        if (age3 >= 5) {
            resultWord3 = "В школу можно идти";
//                System.out.println("В школу можно идти");
        }

        String expectedWord = "Голосовать можно";
        String expectedWord2 = "Машину можно водить";
        String expectedWord3 = "В школу можно идти";

        if (resultWord.equals(expectedWord)) {
            System.out.println("\u001b[32m" + "Pass");
        }
        if (resultWord2.equals(expectedWord2)) {
            System.out.println("\u001b[32m" + "Pass");
        }
        if (resultWord3.equals(expectedWord3)) {
            System.out.println("\u001b[32m" + "Pass");
        } else {
            System.out.println("\u001b[31m" + "Fail");
        }
        System.out.println("\u001B[0m");


        /** Task 21
         *  Напишите алгоритм программы, которая проверяет число типа short на
         *  количество разрядов, и выводит результат проверки.
         * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         * Выведите результат проверки на печать.
         */

        printTaskNumber(21);
        print();

        short s = -3568;
        if (s <= Short.MAX_VALUE || s >= Short.MIN_VALUE) {
            System.out.println("It’s a " + String.valueOf(Math.abs(s)).length()
                    + "-digit number.");
        } else {
            System.out.println(" Выберите другое число");
        }

        rozryad(54236);
        // rozryad(1244);
        //rozryad(1245698812);


//        int category = 5123;
//        int task21 = 0;
//        if (category < 10) {
//           task21 = 1;
//        }
//        if (category >= 10 && category < 100) {
//            task21 = 2;
//        }
//        if (category >= 100 && category < 1000) {
//            task21 = 3;
//        }
//        if (category >= 1000 && category < 10000) {
//            task21 = 4;
//        }
//        if (category >= 10000 && category < 32768) {
//            task21 = 5;
//        }
//        System.out.println("It’s a " + task21 + "-digit number.");


//        String actualResult = "";
//        String age18 = "Можно идти в школу, можно водить машину, можно голосовать.";
//        String age16 = "Можно идти в школу, можно водить машину.";
//        String age5 = "Можно идти в школу.";
//        String age0 = "Вам никуда нельзя.";
//
//        int x = 18;
//        String expectedResult = age18;
//
//        if (x < 5) {
//            actualResult = age0;
//        } else if (x < 16) {
//            actualResult = age5;
//        } else if (x < 18){
//            actualResult = age16;
//        } else if (x >= 18) {
//            actualResult = age18;
//        }
//
//        System.out.println("Возраст " + x + " лет.\n" + "Actual result: " + actualResult);
//        System.out.println("Expected Result: " + expectedResult);
//
//        // TEST
//        if (expectedResult.equals(actualResult)) {
//            System.out.println("\u001B[32m" + "PASS");
//        } else {
//            System.out.println("\u001B[31m" + "FAIL");
//        }

    }


}