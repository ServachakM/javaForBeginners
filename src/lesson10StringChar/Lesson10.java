package lesson10StringChar;

import java.util.Arrays;
import java.util.Locale;



public class Lesson10 {


    public static boolean isPositiveNumber(int number){

        return  number >= 0;
    }
    // num1 >= num2 ? num1 : num2  // если первое число больше второго, то возвращаем первое число, иначе - второе


    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

//        System.out.println(str1 + space + str2 + space + str3);
//
        String str4 = str1 + space + str2 + space + str3;
//        System.out.println(str4);
//
//        System.out.println(str4.charAt(0));
//        System.out.println(str4.charAt(4));
//      //  System.out.println(str1.charAt(4)); // StringIndexOutOfBoundsException
//
//        char a = 'a';
//        Character aa = 'a';
//        System.out.println(a == aa);
//        System.out.println(aa.equals(a));
//
//        String strA = "a";
//        System.out.println(strA.equals(a));
//
//        for (int i = 0; i <= 4; i++) {
//            System.out.println(str4.charAt(i));
//        }
//
//        for (int i = 0; i < str4.length(); i++) {
//            if(str4.charAt(i) == 'a'){
//                System.out.println(i);// печатаем индекс
//                System.out.println(str4.charAt(i));// печатаем букву
//            } else {
//                System.out.println("Letter is not a");
//            }
//        }

        for (int i = 0; i < str4.length(); i++) {
            if(str4.charAt(i) >= 'i'){
                System.out.println(str4.charAt(i));
            } else {
                System.out.println("< i");
            }
        }

        System.out.println('i' - 1);
        System.out.println('i');
        System.out.println('i' + 1);

        System.out.println(Character.toString((char) ('i' - 1)));
        System.out.println(Character.toString((char)('i' + 1)));

        // перевели строку в массив букв
        String[] arrStr = new String[str4.length()];
        for (int i = 0; i < str4.length(); i++) {
            arrStr[i] = Character.toString(str4.charAt(i));
        }

        System.out.println(Arrays.toString(arrStr));

        System.out.println(str4.toCharArray());
        System.out.println(Arrays.toString(str4.toCharArray()));

        char[] arrChar = str4.toCharArray();
        System.out.println(arrStr[0].equals(arrChar[0]));
        System.out.println(arrStr[0].compareTo(Character.toString(arrChar[0])));

//        if(arrStr[0].compareTo(Character.toString(arrChar[0])) == 0){
//
//        }

        System.out.println(str4.toLowerCase());// все переводим в меншый регистр и сравниваем в lowercase
        System.out.println(str4.toUpperCase());

        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5));
    }

}
