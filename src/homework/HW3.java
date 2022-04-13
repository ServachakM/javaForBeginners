package homework;

public class HW3 {

    public static void main(String[] args) {

        /** Part 1
         *
         */

        String line = "_________________________________";
        String task = " ======= ";
        String task1 = "Task №";
        byte taskNumber = 2;

        byte a = 25;
        byte b = 125;

        short s = Short.MAX_VALUE;
        short t ;
        //Short.MAX_VALUE - 60000;

        System.out.println(t = Short.MAX_VALUE - 60000);



/** Task 2 Создать переменные a и b типа byte, присвоить им
 * значения из допустимого диапазона.
 */

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(a + "\n" + b);


 /** Task 3  Создать переменные s и t типа short, присвоить им
  * негативное и позитивное значения с разницей 60000.
  */

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(s + "\n" + t);

/** Task 4 Создать переменную i типа int и присвоить ей минимально
 * возможное значение этого типа.
 * Затем присвоить максимально возможное значение этого типа.
 * Распечатать оба значения в виде таблицы:
 *
 */
        int i;
        i = Integer.MIN_VALUE;

        System.out.println(i);

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(line);
        System.out.println("|  int min       | " + i + "  |");
        System.out.println(line);
        i = Integer.MAX_VALUE;
        System.out.println("|  int max       | " + i + "   |");
        System.out.println(line);

 /** Task 5 Создать переменную phoneNumber и присвоить ей
  *  значение номера телефона с кодом страны и города
  *  (можно ненастоящий номер телефона, например, 18009998877)
  */

        long phoneNumber = 18009998877L;
        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(phoneNumber);

/** Task 6 Создать переменную f типа float и присвоить ей значение 100.101101.
 *  Создать переменную d типа double и присвоить ей значение 100.101101.
 */
        float f;
        double d;
        f = 100.101101F;
        d = 100.101101;
        String fl = "float f = 100.101101";
        String db = "double d = 100.101101";

/** Task 7
 * a) Создать переменную типа Double с именем dd  и
 * инициализировать её результатом суммы чисел 10.09999 и 20.099999.
 *  b) Создать переменную типа Float с именем ff  и инициализировать её
 *  результатом суммы чисел 10.09999 и 20.099999.
 */
        Double dd = Double.sum(10.09999, 20.099999);
        float f1 = 10.09999F;
        float f2 = 20.099999F;
        Float ff = Float.sum(f1, f2);

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println("______________________________________________");
        System.out.println("| " + fl + "\t| " + f + "\t\t |");
        System.out.println("______________________________________________");
        System.out.println("| " + db + "\t| " + d + "\t\t |");
        System.out.println("______________________________________________");
        System.out.println("| Double dd\t\t\t\t| " + dd + " |");
        System.out.println("______________________________________________");
        System.out.println("| Float ff\t\t\t\t| " + ff + "\t\t\t |");
        System.out.println("______________________________________________");


/** Task 8 Создать переменную result и присвоить ей
 * значение выражения 10 / 3 (с максимальной точностью)
 */
        double m = 10;
        double l = 3;
        double result = m / l;


        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(result);


/** Task 9 Создать переменные sum, product, quotient и reminder, и
 * присвоить им значения вычислений переменных f и d
 */
        double sumfd = f + d;
        double productfd = f * d;
        double quotientfd = f / d;
        double reminderfd = f % d;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sumfd + "\n" + productfd + "\n" + quotientfd + "\n"
                + reminderfd);

 /**  Task 10 Распечатать слово HELLO точками
  *
  */

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(".  . ... .   .     ..");
        System.out.println(":..: :.. :   :   :    : ");
        System.out.println(":  : :.. :.. :..   ..");


    /** Part 2
     *
     */
 /** Task 11 Создать переменные подходящего ссылочного типа данных
  *(выбирать минимально достаточный диапазон значений):
  */
        Byte t1;
        t1 = 0;
        Short t2;
        t2 = 150;
        Byte t3;
        t3 = -120;
        Float t4;
        t4 = -505.505F;
        Integer t5;
        t5 = 100100;
        Long t6;
        t6 = 100010001000L;
        Double t7;
        t7 = 2.66666666666666;
        Double t8;
        t8 = -1000000.001;
        Short t9;
        t9 = 1010;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(t1 + "\n" + t2 + "\n" + t3 + "\n" + t4 + "\n"
                + t5 + "\n" + t6 + "\n" + t7 + "\n" + t8 + "\n" + t9);

/** Task 12 С помощью полей классов ссылочного типа распечатать
 *  таблицу:
 */
        byte z;
        byte z1;
        byte z2;
        z = Byte.SIZE;
        z1 = Byte.MIN_VALUE;
        z2 = Byte.MAX_VALUE;
        short h;
        short h1;
        short h2;
        h = Short.SIZE;
        h1 = Short.MIN_VALUE;
        h2 = Short.MAX_VALUE;
        int v;
        int v1;
        int v2;
        v = Integer.SIZE;
        v1 = Integer.MIN_VALUE;
        v2 = Integer.MAX_VALUE;
        long x;
        long x1;
        long x2;
        x = Long.SIZE;
        x1 = Long.MIN_VALUE;
        x2 = Long.MAX_VALUE;
        float q;
        float q1;
        float q2;
        q = Float.SIZE;
        q1 = Float.MIN_VALUE;
        q2 = Float.MAX_VALUE;
        double w;
        double w1;
        double w2;
        w = Double.SIZE;
        w1 = Double.MIN_VALUE;
        w2 = Double.MAX_VALUE;
        String line2 = "_______________________________________________________"
                + "____________________";
        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(line2);
        System.out.println("| Type   | Size in bits | min                    |"
                + " max                    |");
        System.out.println(line2);
        System.out.println("| byte   | " + z + "            |" + z1 +
                "                    | " + z2 + "                    |");
        System.out.println(line2);
        System.out.println("| short  | " + h + "           |" + h1 + "       "
                + "           | " + h2 + "                  |");
        System.out.println(line2);
        System.out.println("| int    | " + v + "           |" + v1 + "        "
                + "     | " + v2 + "             |");
        System.out.println(line2);
        System.out.println("| long   | " + x + "           |" + x1 + "    | "
                + x2 + "    |");
        System.out.println(line2);
        System.out.println("| float  | " + q + "         | " + q1 + "      "
                + "          | " + q2 + "           |");
        System.out.println(line2);
        System.out.println("| double | " + w + "         | " + w1 + "      "
                + "         | " + w2 + " |");
        System.out.println(line2);

/** Task 13 Создать 2 переменные референсного типа Integer - num1 и num2,
 * присвоить им одинаковые значения, сравнить 2 переменные друг с
 * другом с помощью метода .equal. Вывести результат сравнения на
 * печать в виде выражения:
 */
          Integer num1 = 12345;
          Integer num2 = 12345;
          String text = "Если num1 = num2, то результат сравнения "
                + "методом .equal = ";
          System.out.println(task + task1 + (taskNumber++) + task);
          System.out.println(text + num1.equals(num2));
          num1 = 12345;
          num2 = 54321;
          String text2 = "Если num1 не равно num2, то результат"
                + " сравнения методом .equal = ";
          System.out.println(text2 + num1.equals(num2));

/** Task 14 Создать 2 переменные примитивного типа int - number1 and number2.
 *   Инициализаровать их
 *     а) одинаковыми значениями
 *     b) number1 < number2
 *     c) number1 > number2
 */

        int number1 = 555555;
        int number2 = 555555;
        String text3 = "Если number1 = number2, то результат сравнения"
                + " методом compare = ";

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(text3 + Integer.compare(number1, number2));

        number1 = 655555;
        number2 = 555555;
        String text4 = "Если number1 > number2, то результат сравнения"
                + " методом compare = ";

        System.out.println(text4 + Integer.compare(number1, number2));

        number1 = 555555;
        number2 = 655555;
        String text5 = "Если number1 < number2, то результат сравнения"
                + " методом compareUnsigned = ";

        System.out.println(text5 + Integer.compareUnsigned(number1, number2));

/** Task 15 Создать переменную типа Float, присвоить ей значение 234.9999
 *   и распечатать значение в int
 */

        Float p = 234.9999F;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(p.intValue());


/** Task 16 С помощью метода sum() класса Double посчитать
 *  сумму двух переменных типа double.
 */
         double r = 123.1234545;
         double r1 = 12.5684766;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(Double.sum(r, r1));

/** Task 17 С помощью метода sum() класса Integer посчитать
 *  сумму двух переменных типа Float.
 */

         Float o = 12.785F;
         Float o1 = 35.157F;
        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(Integer.sum(o.intValue(), o1.intValue()));

/** Task 18 Создать 2 переменные типа Short:
 * short1 = 12000
 * short2 = 12300
 * a) Распечатать фразу:
 * “12000 - 12300 = -300”
 * где значение -300 выведено с помощью метода класса Short,
 * а не операцией вычисления.
 * b) Присвоить переменной short1 значение 12500, вывести фразу:
 * “12500 - 12300 = 200”
 * где значение 200 выведено с помощью метода класса Short,
 * а не операцией вычисления.
 */

        Short short1 = 12000;
        Short short2 = 12300;
        String text6 = "12000 - 12300 = ";

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(text6 + Short.compare(short1, short2));

        short1 = 12500;
        String text7 = "12500 - 12300 = ";

        System.out.println(text7 + Short.compare(short1, short2));

/** Task 19 Создать переменные:
 * String str1 = "123.56";
 * String str2 = "123.55";
 * Double doub1 = 123.56;
 * Double doub2 = 123.55;
 * a) Распечатать результат doub1 - doub2.
 * b) Используя методы ссылочного типа данных,
 посчитать и распечатать результат str1 - str2
 */

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double sub = doub1 - doub2;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println("Результат doub1 - doub2 = " + sub);

        // Вариант 1 перевода String в Double
        System.out.println("Результат str1 - str2 = "
                + (Double.parseDouble(str1) - (Double.parseDouble(str2))));

        // Вариант 2 перевода String в Double
        System.out.println("Результат str1 - str2 = " + (Double.valueOf(str1) -
                Double.valueOf(str2) ));

 /** Task 20 Создать переменную подходящего типа данных для
  *  хранения результатов измерения температуры тела кота
  *  (значения температуры в Цельсиях).
  *  Присвоить этой переменной сначала максимальное значение,
  *  затем минимальное значение. Посчитать и распечатать среднее значение,
  *  округленное с помощью метода класса Math.
  *  Распечатать результат среднего значения температуры тела кота.
  */

        double temp; double avarage;
        temp = 40.5;
        avarage = temp / 2;
        temp = 37.1;
        avarage = avarage + temp / 2;
        String temper = "ºC";

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(avarage + temper + " - средная температура кота");
        System.out.println(Math.round(avarage) + temper + " - средная температура "
                + "кота округленная методом Math"  );


        /** Part 3

/** Task 21 Создать переменную n типа Number, присвоить ей максимально
 *  возможное значение.
 *  Присвоить n значение 10, затем присвоить n значение 10.999999999.
 *  Распечатать результаты в виде выражения:
 */

        Number n;
        n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;
        n = 10.99F;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println("Переменная n может принимать значения: \n n = "
                + (Double.MAX_VALUE));
        System.out.println(" n = " + n.shortValue());
        System.out.println(" n = " + n.doubleValue());
        System.out.println(" n = " + n.floatValue());
        System.out.println(" Это возможно, потому что тип Number содержит" +
                        " все другие цифровые типы");



/** Task 22  Создать переменную Integer numberInteger = 100.
 *  Доказать, что numberInteger имеет тип Integer,
 *  а numberInteger.toString() имеет тип String.
 */

        Integer numberInteger = 100;

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(numberInteger.getClass());
        System.out.println(numberInteger.toString().getClass());

//        System.out.println(numberInteger + numberInteger);
//        System.out.println(numberInteger + numberInteger.toString());
//        System.out.println(numberInteger.toString()
//        + numberInteger.toString());
//        System.out.println("Так как при печати переменная "
//                + "numberInteger.toString() и переменная numberInteger \n"
//                + "не суммируется, а происходит конкатенацыя, то это значит,"
//                +" что одна переменная пита String, а другая - цыфрового типа ");

/** Task 23 Вывести на экран следующие выражения,
 * используя для печати только переменные:
 */

         float grad = 36.6F;
         float u = (float) 9 / 5F;
         float farr = (grad * u ) + 32F;
         float kill = 50F;
         float funt = kill * 2.205F;
         float kilo = kill / 2.205F;

         String cel = "36.6 градусов по Цельсию  = ";
         String far = " градусов по Фаренгейту";
         String kil = "50 kilogram = ";
         String lbs = "lbs";
         String lb = "50 lb = ";
         String kg = "kg";

        System.out.println(task + task1 + (taskNumber++) + task);
        System.out.println(cel + farr + far + "\n" + kil + funt + " " + lbs
                + "\n" + lb + kilo + " " +kg );













 }







}
















