package homework;

import utils.Utils;

import java.util.Arrays;

import static utils.Utils.*;

public class HW10 {

// Написать алгоритм CapitalizeWords, который принимает на вход предложение
// с единичным пробелом между словами,
// и возвращает предложение, в котором все слова написаны с большой буквы
// "        happy birthday!  " --> "Happy Birthday!"
// "     john jacob smith jr." --> "John Jacob Smith Jr."

    public static String capitalizeWords(String sentence) {
        //пустой Стринг = ""; - может приходить, с ним можно работать.
        //String str = null; - обязательно проверяем, потому что может упасть програма.

        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);

                    }
                }

                return sentence;
            }

            return "";
        }

        return "";
    }

    public static String qA4EveryOne(String str) {
        if (!str.isEmpty()) {
            String str1 = str.trim();
            if (str.length() > str1.length()) {
                str1 = str1.replace(" ", "");

                return "Лишние пробелы удалены " + str1;
            } else {

                return "Пробелов не было " + str1;
            }
        }

        return "Строка пустая";
    }

    public static String removeAlla(String str) {

        if (str != null) {
            str = str.trim();
            if (str.length() > 0) {
                str = str.replace("a", "");
            }

            return str;
        }

        return "";
    }

    public static String removeAllZeros(String str) {

        if (str != null) {

            if (!str.isEmpty()) {
                str = str.replace(" ", "").replace("0", "");
            }

            return str;
        }

        return "";
    }

    public static String removeAllSpaces(String str) {

        if (str != null) {
            if (str.length() > 0) {
                str = str.replace(" ", "");
            }

            return str;
        }

        return "";
    }

    public static int countLetterA(String str) {

        int count = 0;
        if (str != null) {
            str = str.trim();
            if (str.length() > 0) {
                str = str.toLowerCase();

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a') {
                        count++;
                    }
                }
            }

            return count;
        }

        return Integer.MIN_VALUE;
    }

    public static boolean isTextIncludeJava(String text) {

        if (text != null) {

            return text.contains("Java");
        }

        return Boolean.FALSE;
    }

    public static String quotes(String str){
        if(str != null){
            str = str.trim();
            if(str.length() > 0) {
                String quo = "'";
                String tes = ".'";

                return  quo.concat(str).concat(tes);
            }

            return "Строка пустая или состоит с пробелов";
        }

        return "";
    }

    public static String correctName(String name){
        if(name != null){
            name = name.trim();
            if(name.length() > 0){
                name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());

                return name;
            }

            return "Строка пустая или состоит из пробелов";
        }

        return "";
    }

    public static String betweenLetterParam(String str, String letter) {
        if (str != null && letter != null) {
            str = str.trim();

            if (!str.isEmpty()) {

                if (str.contains(letter)) {

                    str = str.substring(str.indexOf(letter),
                            (str.lastIndexOf(letter) + 1));

                    return str;
                }

                return "Буква-параметр отсутствует в строке";
            }

            return "Строка пустая";
        }

        return "";
    }

    public static boolean ifStartAndEndLetterTheSame(String str){
        if(str != null){
            str = str.trim();
            if(str.length() > 0){
                str = str.toLowerCase();

                return str.charAt(0) == str.charAt(str.length() - 1);
            }
        }

        return false;
    }

    public static String[] replaceToArray(String str){
        if(str != null){
            str = str.trim();
            if(str.length() > 0){
                String[] array = str.split(" ");

                return array;
            }
        }

        return new String[]{};
    }





    public static void main (String[]args){
//        System.out.println("        happy birthday!  ");
//        System.out.println(capitalizeWords("        happy birthday!  "));
//        System.out.println(capitalizeWords(""));
//        System.out.println(capitalizeWords(null));
//        System.out.println(capitalizeWords("     john jacob smith jr."));
//        System.out.println(capitalizeWords(" "));


/** Part 1
 * Task1
 *  Методы isEmpty(), length(), trim(), replace()
 */
        printTaskNumber(1);

        String sentencePlusSpace = "    QA   4Everyone   ";
        String sentenceWithoutSpace = "QAAutomation4Everyone";
        String sentenceEmpty = "";

        System.out.println(qA4EveryOne(sentencePlusSpace));
        System.out.println(qA4EveryOne(sentenceWithoutSpace));
        System.out.println(qA4EveryOne(sentenceEmpty));

/** Task 2
 * Написать алгоритм RemoveAlla
 */
        printTaskNumber(2);

        String qa = "    QA4Everyone   ";
        String panda = "panda   ";

        System.out.println(removeAlla(qa));
        System.out.println(removeAlla(panda));
        System.out.println(removeAlla(sentenceEmpty));


        /** Task 3
         * Написать алгоритм RemoveAllZeros
         */
        printTaskNumber(3);

        String numbers = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        String numbers2 = " 0000000111";


        System.out.println(removeAllZeros(numbers2));
        System.out.println(removeAllZeros(numbers));


        /** Task 4
         *  Написать алгоритм RemoveAllSpaces.
         */

        printTaskNumber(4);

        String phrase = "    QA   4  Everyone   ";
        String phrase2 = "p a     n d a   ";
        String test = "   ";

        System.out.println(removeAllSpaces(phrase));
        System.out.println(removeAllSpaces(phrase2));


        /** Task 5
         *  Напишите метод, который принимает на вход строку и считает,
         *  сколько букв а или А содержится в строке.
         */
        printTaskNumber(5);

        String abra = "Abra cada bra";
        String hom = "Homenum Revelio";
        String empty = "";

        System.out.println(countLetterA(abra));
        System.out.println(countLetterA(hom));
        System.out.println(countLetterA(empty));
        System.out.println(countLetterA(null));


        /** Task 6
         * Напишите метод, который принимает на вход текст и проверяет,
         * содержится ли в тексте хотя бы одно слово Java.
         */
        printTaskNumber(6);

        String text1 = "As of March 2022, Java 18 is" +
                " the latest version, while Java 17, 11 and 8 are the" +
                " current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial " +
                "use, although it will otherwise still support Java 8 with" +
                " public updates for personal use indefinitely." +
                " Other vendors have begun to offer zero-cost builds of " +
                "OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades";
        String text2 = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";

        System.out.println(isTextIncludeJava(text1));
        System.out.println(isTextIncludeJava(""));
        System.out.println(isTextIncludeJava(null));
        System.out.println(isTextIncludeJava(text2));


        /** Task 7
         *  Напишите метод, который принимает на вход строку, и добавляет
         *  Кавычки в начале строки, точку и кавычки в конце строки с помощью
         *  метода concat()
         */
        printTaskNumber(7);

        String sentence = "One";
        String sentence2 = "    TWO  ";

        System.out.println(quotes(sentence));
        System.out.println(quotes(sentence2));
        System.out.println(quotes("  H E L L O "));
        System.out.println(quotes("   "));
        System.out.println(quotes(null));


        /** Task 8
         * Напишите метод, кторый принимает на вход название города и
         * исправляет написание:
         */
        printTaskNumber(8);

        String city = "ташкент";
        String city2 = "ЧикаГО";

        System.out.println(correctName(city));
        System.out.println(correctName(city2));
        System.out.println(correctName("  "));
        System.out.println(correctName(null));


        /** Task 9
         * Напишите метод, который принимает на вход строку, и возвращает все,
         * что находится между первой и последней буквой-параметром
         */
        printTaskNumber(9);

        String str = "Abracadabra";
        String letter = "b";
        String str2 = "Whippersnapper";
        String letter2 = "p";

        System.out.println(betweenLetterParam(str, letter));
        System.out.println(betweenLetterParam(str2, "e"));
        System.out.println(betweenLetterParam("", letter2));
        System.out.println(betweenLetterParam(str, letter2));
        System.out.println(betweenLetterParam(str2, null));


        /** Task 10
         * Напишите метод, который принимает на вход слово, и возвращает true,
         * если слово начинается и заканчивается на одинаковую букву, и
         * false иначе
         */
        printTaskNumber(10);

        System.out.println(ifStartAndEndLetterTheSame(str));
        System.out.println(ifStartAndEndLetterTheSame(str2));
        System.out.println(ifStartAndEndLetterTheSame(""));


        /** Task 11
         * Напишите метод, который принимает на вход предложение и возвращает
         * слова из этого предложения в виде массива слов
         */
        printTaskNumber(11);

        String sent = "QA for Everyone";
        String pushkin = "Александр Сергеевич Пушкин";

        System.out.println(Arrays.toString(replaceToArray(sent)));
        System.out.println(Arrays.toString(replaceToArray(pushkin)));
        System.out.println(Arrays.toString(replaceToArray("")));

        /** Task 12
         * Написать метод, который принимает на вход предложение,
         * которое состоит из имени, фамилии, отчества и возвращает
         * массив строк:
         */
        printTaskNumber(12);


    }
}
