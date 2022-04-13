package lesson;

public class Lesson4 {

    public static void print(String text) {
        System.out.println(text);

    }
    public static void printLine(){
        System.out.println("_____________________");

    }

       //____________ 13 ____________

    public static void printEmptyLine(){
        System.out.println();
    }

    public static void printRavlyk(){
        System.out.print("\u001B[34m  @@@@@@@@@@@@@@@@@@ \u001B[0m");

    }

    //public static void print(int number){
       // System.out.print(number);
   // }
    public static void printTaskNumber(int num){
        printEmptyLine();
        printRavlyk();
        System.out.print("\u001B[33m Task " + num + "\u001B[0m");
        printRavlyk();
        printEmptyLine();
        printEmptyLine();
    }

    public static void task( int number){
        printEmptyLine();
        printLine();
        System.out.println("Задача" + number);
    }

    static int number = 1;
    public static void task(){
        printLine();
        System.out.println("Задача " + number);
        number++;
    }


    public static void main(String[] args) {

        printTaskNumber(1);

      //  task();
       // task(1);

        // Квадрат - это !круг (не круг)
        String square = "Квадрат";
        String circle = "Круг";

        System.out.println(square != circle);

        printTaskNumber(2);

       // Если сегодня суббота, то значить, завтра воскресенье
       // task();
        // вариант 1

        String today = "Суббота";

        if (today == "Суббота") {
            System.out.println("Воскресенье");
        }

        //варыант 2
        String tomorrow = "Воскресенье";

        if (today == "Суббота") {
            System.out.println(tomorrow);
        }

        //вариант3

        String tomorrow1;
        if (today == "Суббота") {
            tomorrow1 = "Воскресенье";
        }

       // task();
        printTaskNumber(3);


        // если a > b и(или) b < c, то присвоить a значение 7, и сложить b + c,
       // иначе присвоить a равно 10.


        int a = 9;
        int b = 12;
        int c = 3;

        if(a > b || b < c){
            a = 7;
           int sum = b + c;
            System.out.println(a + "\n" + sum);
        } else {
            a = 10;
            System.out.println(a);
        }

        printTaskNumber(4);


      //  task();
        print("Hello");
        print (today);



        String line = "___________________";

         //task();
//        // если x > y или y < z, то expectadResult = "Pass", а иначе
//        // expectadResult = "False"
//        // Проверить ответ запустив тест x = 0; y = 1; z = 2
//        // AAA
//        //test
//
//       // A1 = arrange
//        int x = 0;
//        int y = 1;
//        int z = 2;
//
//        a = x;
//        b = y;
//        c = z;
//        int sum;
//
//        int expectedX = 7;
//        int expectedSum = 3;
//
//
//    // A2 = act
//
//        if(a > b || b < c){
//            a = 7;
//            int sum = b + c;
//            System.out.println(a + "\n" + sum);
//        } else {
//            a = 10;
//            System.out.println(a);
//        }
//
//        // A3 =assert
//
//        if (x == expectedX && sum == expectedSum){

        task();
        task(100);
// Проверьте число.
// Если число нечетное и кратно трем,
// то посчитайте результат деления на 3. Иначе
// посчитайте результат умножения на три.
// Если число Не нечетное, посчитайте произведение числа
// на результат деления на 2.

// Выведите результат работы алгоритма на печать.
// Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

// Напишите тест, который проверит работу вашего кода и выведет
// на печать результат проверки.
// Тестовые данные 23, 44, 21


        int n = 3;
        int expectedResult = 1;


        if(n % 2 != 0){
            if (n % 3 == 0){
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }
        System.out.println("n = " + n);

        // Test

        if (expectedResult == n){
            System.out.println("\u001b[32m" + "Pass");
        } else {
            System.out.println("\u001b[31m" + "Fail");
        }






    }









}
