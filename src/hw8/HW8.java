package hw8;

import utils.Utils;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    public static int[] fiveValue(int a1, int a2, int a3, int a4, int a5){
       int[] array = {a1, a2, a3, a4, a5};

       return array;
    }

    public static double[] fiveValue(double a1, double a2, double a3, double a4,
                                  double a5){
        double[] array = {a1, a2, a3, a4, a5};

        return array;
    }

    public static String[] fiveValue(String a1, String a2, String a3, String a4,
                                     String a5){
        String[] array = {a1, a2, a3, a4, a5};

        return array;
    }

    public static double[] arrayMulti(int[] array) {
        double[] array2 = new double[array.length];
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i] * 2.5;
            }
        }

        return array2;
    }

    public static int kolichestvoCelyhChiselVMassive(int[] array) {
        int count = 0;
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] > 0 && array[i] % 2 == 0) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static int[] massiveNechetnyh(int[] array){
        int count = 0;
        int j = 0;
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    count++;
                }
            }
        }
        int[] array2 = new int[count];

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    array2[j] = array[i];
                    j++;
                }
            }

        return array2;
    }

    public static boolean[] massiveChislaBolsheDes(int[] array) {
        int j = 0;
        boolean[] array2 = new boolean[array.length];
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if(j < array.length) {
                    if (array[i] > 10) {
                        array2[j] = true;
                    } else {
                        array2[j] = false;
                    }
                }
               j++;
            }
        }

        return array2;
    }

    public static String task14(String[] array) {
        String str = "";
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    str += array[i] + " ";
                }
            }
        }
        return str;
    }


    public static void main(String[] args) {

        /** Task 5
         * Создать объекты типа Integer, Double, String и присвоить им
         * такие же значения, как и переменным класса HW8_1
         */
        printTaskNumber(5);

        Integer a = 5;
        Double d = 5.5;
        String str = "Rabbit";


        /** Task 6
         * Сравнить переменные соответствующих типов из классов HW8_1 и HW8
         * и распечатать результат сравнения в виде таблички:
         */
        printTaskNumber(6);

        line();
        table3ColumnsHeader("HW8", "HW8_1", "areEquals?");
        line();
        table3Columns(a, HW8_1.a_1,compare2Value(a, HW8_1.a_1));
        line();
        table3Columns(d,HW8_1.d_1, compare2Value(5.5,5.5));
        line();
        table3Columns("Rabbit", "Rabbit", compare2Value(str,HW8_1.str_1) );
        line();

        /** Task 7
         * Написать метод, который принимает на вход 5 целых чисел,
         * и возвращает массив из этих же чисел
         */
        printTaskNumber(7);

        System.out.println(Arrays.toString(fiveValue(5,4,8,7,3)));
        System.out.println(Arrays.toString(fiveValue(1.5,2,4,8,9)));


        /** Task 8
         * Написать метод, который принимает на вход 5 чисел типа double,
         * и возвращает массив из этих же чисел
         */
        printTaskNumber(8);

        System.out.println(Arrays.toString(fiveValue(1.5,2.3,5.5,4.7,6.6)));


        /** Task 9
         * Написать метод, который принимает на вход 5 слов,
         * и возвращает массив из этих слов
         */
        printTaskNumber(9);

        System.out.println(Arrays.toString(fiveValue("hv","tt","yy",
                "dd","tt")));


        /** Task 10
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */
        printTaskNumber(10);

        System.out.println(Arrays.toString(arrayMulti(new int[]{1,2,5,4,3,8,1})));
        System.out.println(Arrays.toString(arrayMulti(new int[]{1,1,5,5,3,3})));
        System.out.println(Arrays.toString(arrayMulti(new int[0])));


        /** Task 11
         * Написать метод, который принимает на вход массив целых
         * положительных чисел,  и возвращает количество четных чисел в
         * этом массиве
         */
        printTaskNumber(11);

        System.out.println(kolichestvoCelyhChiselVMassive(new int[]{1,2,3,4,5,6}));

        System.out.println(kolichestvoCelyhChiselVMassive(new int[]{0,0,0,0,0}));
        System.out.println(kolichestvoCelyhChiselVMassive(new int[]{-1, -5, -6, -8}));
        System.out.println(kolichestvoCelyhChiselVMassive(new int[0]));


        /** Task 12
         * Написать метод, который принимает на вход массив целых
         * положительных чисел,  и возвращает массив нечетных чисел
         */
        printTaskNumber(12);

        System.out.println(Arrays.toString(massiveNechetnyh(new int[]{1,5,3,4,7,9,1})));
        System.out.println(Arrays.toString(massiveNechetnyh(new int[]{})));
        System.out.println(Arrays.toString(massiveNechetnyh(new int[]{2,4,2,6,4})));


        /** Task 13
         * Написать метод, который принимает на вход масив целых чисел,
         * и возвращает массив значений true или false, если числа больше 10
         */
        printTaskNumber(13);

        System.out.println(Arrays.toString(massiveChislaBolsheDes(new int[]{1,10,11,14,55,2})));
        System.out.println(Arrays.toString(massiveChislaBolsheDes(new int[]{})));

        /** Task 14
         * Написать метод, который принимает на вход массив слов,
         * и возвращает строку, состоящую из этих слов
         */
        printTaskNumber(14);

        System.out.println(task14(new String[]{"I","love","Ukraine"}));



        /** Task 15
         * Написать метод, который принимает массив целых чисел и
         * считает сумму чисел во второй половине массива
         */
        printTaskNumber(15);



        /** Task 16
         * Написать метод, который принимает на вход целое положительные число
         * в пределах от 1 до 10 исключительно, и возвращает таблицу умножения
         * на это число в виде массива
         * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
         */
        printTaskNumber(16);






    }
}
