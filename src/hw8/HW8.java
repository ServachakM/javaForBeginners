package hw8;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    public static int[] fiveValue(int a1, int a2, int a3, int a4, int a5) {
        int[] array = {a1, a2, a3, a4, a5};

        return array;
    }

    public static double[] fiveValue(double a1, double a2, double a3, double a4, double a5) {
        double[] array = {a1, a2, a3, a4, a5};

        return array;
    }

    public static String[] fiveValue(String a1, String a2, String a3, String a4, String a5) {
        String[] array = {a1, a2, a3, a4, a5};

        return array;
    }

    public static double[] arrayMulti(int[] array) {
        double[] array2 = new double[array.length];
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i] * 2.5;
            }
        }

        return array2;
    }

    public static int quantityEvenNumbers(int[] array) {
        int count = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0 && array[i] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] arrayOdd(int[] array) {
        int count = 0;
        int j = 0;
        if (array.length != 0) {
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

    public static boolean[] arrayNumberGreater10(int[] array) {
        int j = 0;
        boolean[] array2 = new boolean[array.length];
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (j < array.length) {
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

    public static String arrayWords(String[] array) {
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

    public static int sumHalfArray(int[] array) {
        int sum = 0;
        int j;
        if (array.length != 0) {
            j = array.length / 2;
            for (int i = j; i < array.length; i++) {
                sum += array[i];
            }
        } else {
            System.out.print("Array empty ");
        }

        return sum;
    }

    public static int[] arrayEvenOdd(int[] array) {
        int count1 = 0;
        int count2 = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }

        int[] array1 = new int[count1];
        int[] array2 = new int[count2];
        int j = 0;
        if (array1.length > array2.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    if (j < array1.length) {
                        array1[j] = array[i];
                        j++;
                    }
                }

            }
            return array1;
        } else if (array1.length < array2.length) {
            j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    if (j < array2.length) {
                        array2[j] = array[i];
                        j++;
                    }
                }
            }
            return array2;
        } else {
            return new int[0];
        }
    }

    public static int[] randomArrayFor0To100(int a, int upp, int low) {
        int[] array = new int[a];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.abs(randomInt(upp, low));
            }
        }
        return array;
    }

    public static int[] randomArrayTask19(int l, int d) {
        int[] array = new int[l];
        if (array.length != 0 && d > 0) {
            for (int i = 0; i < array.length; i++) {
                if (d == 1) {
                    array[i] = randomInt(10, 0);
                } else if (d == 2) {
                    array[i] = randomInt(100, 10);
                } else if (d == 3) {
                    array[i] = randomInt(1000, 100);
                } else if (d == 4) {
                    array[i] = randomInt(10000, 1000);
                } else if (d == 5) {
                    array[i] = randomInt(100000, 10000);
                } else if (d == 6) {
                    array[i] = randomInt(1000000, 100000);
                } else if (d == 7) {
                    array[i] = randomInt(10000000, 1000000);
                } else if (d == 8) {
                    array[i] = randomInt(100000000, 1000000);
                } else if (d == 9) {
                    array[i] = randomInt(Integer.MAX_VALUE, 100000000);
                }
            }
        }
        return array;
    }

    public static int[] arrayTask20(int[] array, int max, int min) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > min && array[i] < max) {
                count++;
            }
        }
        int[] array2 = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > min && array[i] < max) {
                array2[array2.length - count] = array[i];
                count--;
            }
        }

        return array2;
    }

    public static int[] arrayDiffTask21(int[] array) {
        int[] array2 = new int[array.length];
        int j = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    array2[j] = Math.abs(array[i] / 10 - array[i] % 10);
                    j++;
                } else {
                    return new int[]{};
                }
            }
        }

        return array2;
    }

    public static String[] arrayPhoneNumber(int[] array) {
        String[] array2 = new String[2];
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0 && array[i] < 10) {
                    array2[0] = array[0] + "(" + array[1] + array[2] + array[3] + ")" + array[4] + array[5] + array[6] + "-" + array[7] + array[8] + "-" + array[9] + array[10];
                    if (array[0] == 1) {
                        array2[1] = "USA";
                    } else if (array[0] == 2) {
                        array2[1] = "Australia";
                    } else if (array[0] == 3) {
                        array2[1] = "Zimbabwe";
                    } else if (array[0] == 4) {
                        array2[1] = "Germany";
                    } else {
                        return new String[]{};
                    }
                }
            }
        }
        return array2;
    }

    public static int countOfUniElements(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = 0;
                    }
                }
            }
        } else {
            System.out.println("Не корректная длина массива");
            return count;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] arrayUniNumber(int[] array) {
        int[] array2 = new int[array.length - (countOfUniElements(array))];
        int count = 0;
        for (int i = 0; count < array2.length && i < array.length; i++) {
            if (array[i] != 0) {
                array2[count] = array[i];
                count++;
            }
        }
        return array2;
    }


    public static int[] quantityUniAndNotUniElements(int[] array) {
        int[] array2 = new int[2];
        if (array.length > 0) {
            array2[0] = array.length - countOfUniElements(array);
            array2[1] = countOfUniElements(array);

        } else {
            return new int[]{};
        }
        return array2;
    }


    private static int[] task23(int[] array) {
        int[] arrayToReturn = new int[0];

        if (array.length > 0) {
            int count = 1;
            boolean notTheSame = false;
            for (int i = 0; i < array.length; i++) {
                int valueToCompare = array[i];

                for (int j = 0; j < array.length; j++) {
                    if (valueToCompare == array[j]) {

                        count++;
                    }
                }
            }
            System.out.println(count);
//            arrayToReturn = new int[count];
//            arrayToReturn[0] = array[0];

//            for (int i = 1; i < array.length; i++){
//                j = 1;
//                while (j < arrayToReturn.length){
//                    if(array[j] != array[i]){
//                        arrayToReturn[j] = array[i];
//                        j++;
//                    }
//                }
//            }
        }
        return arrayToReturn;
    }

    private static int[] task25(int[] array, int first, int second) {

        int[] arrayToReturn = new int[(second - first + 1)];
        if (second >= 0 && first >= 0) {
            if (second < array.length && array.length > 0) {
                int j = 0;

                for (int i = 0; i < array.length; i++) {
                    if (i >= first && i <= second) {
                        arrayToReturn[j] = array[i];
                        j++;
                    }
                }
            } else {
                System.out.printf("Error with value :: %s%n", second);
            }
        }
        return arrayToReturn;
    }

    public static int[] arrayUniElementsFromTwoArrays(int[] array, int[] array2) {
        if (array.length > 0 || array2.length > 0) {
            int[] array3 = new int[array.length + array2.length];
            for (int i = 0; i < array.length; i++) {
                array3[i] = array[i];
            }
            for (int i = 0; i < array2.length; i++) {
                array3[array.length + i] = array2[i];
            }
            return arrayUniNumber(array3);
        } else return new int[]{};
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
        table3Columns(a, HW8_1.a_1, compare2Value(a, HW8_1.a_1));
        line();
        table3Columns(d, HW8_1.d_1, compare2Value(5.5, 5.5));
        line();
        table3Columns("Rabbit", "Rabbit", compare2Value(str, HW8_1.str_1));
        line();

        /** Task 7
         * Написать метод, который принимает на вход 5 целых чисел,
         * и возвращает массив из этих же чисел
         */
        printTaskNumber(7);

        System.out.println(Arrays.toString(fiveValue(5, 4, 8, 7, 3)));
        System.out.println(Arrays.toString(fiveValue(1.5, 2, 4, 8, 9)));


        /** Task 8
         * Написать метод, который принимает на вход 5 чисел типа double,
         * и возвращает массив из этих же чисел
         */
        printTaskNumber(8);

        System.out.println(Arrays.toString(fiveValue(1.5, 2.3, 5.5, 4.7, 6.6)));


        /** Task 9
         * Написать метод, который принимает на вход 5 слов,
         * и возвращает массив из этих слов
         */
        printTaskNumber(9);

        System.out.println(Arrays.toString(fiveValue("hv", "tt", "yy", "dd", "tt")));


        /** Task 10
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */
        printTaskNumber(10);

        System.out.println(Arrays.toString(arrayMulti(new int[]{1, 2, 5, 4, 3, 8, 1})));
        System.out.println(Arrays.toString(arrayMulti(new int[]{1, 1, 5, 5, 3, 3})));
        System.out.println(Arrays.toString(arrayMulti(new int[0])));


        /** Task 11
         * Написать метод, который принимает на вход массив целых
         * положительных чисел,  и возвращает количество четных чисел в
         * этом массиве
         */
        printTaskNumber(11);

        System.out.println(quantityEvenNumbers(new int[]{1, 2, 3, 4, 5, 6}));

        System.out.println(quantityEvenNumbers(new int[]{0, 0, 0, 0, 0}));
        System.out.println(quantityEvenNumbers(new int[]{-1, -5, -6, -8}));
        System.out.println(quantityEvenNumbers(new int[0]));


        /** Task 12
         * Написать метод, который принимает на вход массив целых
         * положительных чисел,  и возвращает массив нечетных чисел
         */
        printTaskNumber(12);

        System.out.println(Arrays.toString(arrayOdd(new int[]{1, 5, 3, 4, 7, 9, 1})));
        System.out.println(Arrays.toString(arrayOdd(new int[]{})));
        System.out.println(Arrays.toString(arrayOdd(new int[]{2, 4, 2, 6, 4})));


        /** Task 13
         * Написать метод, который принимает на вход масив целых чисел,
         * и возвращает массив значений true или false, если числа больше 10
         */
        printTaskNumber(13);

        System.out.println(Arrays.toString(arrayNumberGreater10(new int[]{1, 10, 11, 14, 55, 2})));
        System.out.println(Arrays.toString(arrayNumberGreater10(new int[]{})));

        /** Task 14
         * Написать метод, который принимает на вход массив слов,
         * и возвращает строку, состоящую из этих слов
         */
        printTaskNumber(14);

        System.out.println(arrayWords(new String[]{"I", "love", "Ukraine"}));


        /** Task 15
         * Написать метод, который принимает массив целых чисел и
         * считает сумму чисел во второй половине массива
         */
        printTaskNumber(15);

        System.out.println(sumHalfArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sumHalfArray(new int[]{1, 2, 3, 4, 5, 1}));
        System.out.println(sumHalfArray(new int[]{}));
        System.out.println(sumHalfArray(new int[]{-2, -3, -4, -1, 3, -2}));
        System.out.println(sumHalfArray(new int[]{-2, -3, -4, -1, -3, -2}));


        /** Task 16
         * Написать метод, который принимает на вход целое положительные число
         * в пределах от 1 до 10 исключительно, и возвращает таблицу умножения
         * на это число в виде массива
         * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
         */
        printTaskNumber(16);

        System.out.println(Arrays.toString(multiplicationTable(2)));
        System.out.println(Arrays.toString(multiplicationTable(0)));
        System.out.println(Arrays.toString(multiplicationTable(10)));
        System.out.println(Arrays.toString(multiplicationTable(1)));


        /** Task 17
         * Написать метод, который принимает массив целых чисел и возвращает
         * массив четных чисел, если четных чисел больше, или массив нечетных
         * чисел, если нечетных чисел больше.
         */
        printTaskNumber(17);

        System.out.println(Arrays.toString(arrayEvenOdd(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(arrayEvenOdd(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(arrayEvenOdd(new int[]{1, 2, 3, 4, 5, 6, 8})));


        /** Task 18
         * Написать метод, который принимает на вход длину массива и генерирует
         * массив случаейных положительных чисел от 0 до 100 исключительно.
         */
        printTaskNumber(18);

        System.out.println(Arrays.toString(randomArrayFor0To100(8, 99, 1)));
        System.out.println(Arrays.toString(randomArrayFor0To100(30, 99, 1)));
        System.out.println(Arrays.toString(randomArrayFor0To100(0, 99, 0)));


        /** Task 19
         * Написать метод, который принимает на вход длину массива l и
         * количество знаков d (однозначные, двузначные, трехзначные и тд числа),
         * и генерирует массив случайных целых положительных чисел длины l,
         * в котором все числа имеют количество знаков d
         */
        printTaskNumber(19);

        System.out.println(Arrays.toString(randomArrayTask19(20, 2)));
        System.out.println(Arrays.toString(randomArrayTask19(5, 3)));
        System.out.println(Arrays.toString(randomArrayTask19(10, 4)));
        System.out.println(Arrays.toString(randomArrayTask19(5, 6)));
        System.out.println(Arrays.toString(randomArrayTask19(3, 9)));


        /** Task 20
         * Написать метод, который принимает на вход массив целых
         * положительных чисел, и возвращает массив только двузначных чисел.
         * ПРоверить работу метода на массиве из задания 18.
         */
        printTaskNumber(20);

        System.out.println(Arrays.toString(arrayTask20(new int[]{2, 4, 5, 3, 1, 20, 7, 80}, 100, 9)));
        System.out.println(Arrays.toString(arrayTask20(randomArrayFor0To100(9, 100, 0), 100, 9)));
        System.out.println(Arrays.toString(arrayTask20(randomArrayFor0To100(9, 50, 0), 100, 9)));

        System.out.println(Arrays.toString(arrayTask20(new int[]{123, 9, 4, 789, 5, 12, 698, 0}, 1000, 100)));

        /** Task 21
         * Написать метод, который принимает на вход массив целых положительных
         * двузначных чисел, и возвращает массив разниц между десятками
         * и единицами
         */
        printTaskNumber(21);

        System.out.println(Arrays.toString(arrayDiffTask21(new int[]{10, 12, 13, 14, 15})));
        System.out.println(Arrays.toString(arrayDiffTask21(new int[]{})));
        System.out.println(Arrays.toString(arrayDiffTask21(new int[]{0, 2, 4, 6, 7, 3})));
        System.out.println(Arrays.toString(arrayDiffTask21(new int[]{0, -2, 4, -6, -7, 3})));


        /** Task 22
         * Написать метод, который принимает массив из 11 целых положительных
         * чисел от 0 до 9, и возвращает массив, который содержит номер телефона,
         * состоящий из этих чисел,  и название страны, которой номер принадлежит.
         * Например:
         * method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
         */
        printTaskNumber(22);


        System.out.println(Arrays.toString(arrayPhoneNumber(new int[]{1, 8, 0, 0, 1, 2, 35, 4, 5, 6, 7})));


        /** Task 23
         * Написать метод, который принимает массив целых положительных
         * чисел больше 0, и возвращает массив уникальных чисел.
         */
        printTaskNumber(23);

        int[] array23 = {6, 4, 2, 2, 2};

        System.out.println(Arrays.toString(arrayUniNumber(array23)));
        System.out.println(Arrays.toString(arrayUniNumber(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(arrayUniNumber(new int[]{6, 5, 4, 8, 5, 4, 4, 6, 3, 9})));


        /** Task 24
         *  Написать метод, который принимает на вход
         *  массив целых положительных чисел, и
         *  возвращает количество уникальных и неуникальных элементов
         *  в этом массиве
         */
        printTaskNumber(24);


        System.out.println(Arrays.toString(quantityUniAndNotUniElements(new int[]{})));
        System.out.println(Arrays.toString(quantityUniAndNotUniElements(new int[]{3, 2, 1, 5, 1, 2, 3})));
        System.out.println(Arrays.toString(quantityUniAndNotUniElements(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(quantityUniAndNotUniElements(new int[]{1, 6, 5, 4, 8, 9})));


        /** Task 25
         *  Написать метод, который принимает на вход массив целых положительных
         *  чисел, и 2 целых положительнх числа (значения индексов).
         *  Метод возвращает массив, который содержит только числа из
         *  первого массива в промежутке между индексами.
         */

        printTaskNumber(25);

        int[] array25 = {2, 4, 5, 2, 1, 6, 7, 8, 18};
        System.out.println(Arrays.toString(task25(array25, 2, 6)));
        ;
        System.out.println(Arrays.toString(task25(new int[]{0, 1, 2, 3, 4, 5, 6}, 1, 5)));
        ;


        /** Task 26
         * Написать метод, который принимает на вход 2 массива int[] и
         * возвращает объединенный массив уникальных неповторяющихся элементов
         */
        printTaskNumber(26);


        System.out.println(Arrays.toString(arrayUniElementsFromTwoArrays(array23, array25)));
        System.out.println(Arrays.toString(arrayUniElementsFromTwoArrays(new int[]{10, 11, 9, 5, 3, 3}, new int[]{5, 9, 8, 7, 10, 3, 1})));


    }


}
