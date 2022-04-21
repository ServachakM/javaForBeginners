package utils;

public class Utils {

    public static void line (){
        System.out.println("________________________________________________" +
                "_______________");
    }

    public static void printEmptyLine(){
        System.out.println();
    }

    public static void printRavlyk(){
        System.out.print("\u001B[34m  @@@@@@@@@@@@@@@@@@ \u001B[0m");

    }

    public static void printTaskNumber(int num) {
        printEmptyLine();
        printRavlyk();
        System.out.print("\u001B[33m Task " + num + "\u001B[0m");
        printRavlyk();
        printEmptyLine();
        printEmptyLine();
    }
    public static void printLine(){
        System.out.println("_________________________________________");

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
    public static void zadachaNum(int num) {
        System.out.println("------ Задача " + num + " ------ ");
    }

    public static void taskN(int num, String text) {
        zadachaNum(num);
        System.out.print(text);
        System.out.print(") ");
    }

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

    public static int randomInt(int upp, int low) {

        return (int)(Math.random() * (upp - low)) + low;
    }

    public static double averageArray(int[] array) {
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i] ;
        }
        return average / array.length ;
    }

    public static int[][] create2DArrayRandom(int row, int column, int upp,
                                              int low){
        int[][] array = new int[row][column];
        for(int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomInt(upp,low);
            }
        }

        return array;
    }

    public static void table3ColumnsHeader(String name1Column,
                                           String name2Column,
                                           String name3Column) {
        System.out.println(name1Column + "\t\t\t\t\t\t| " + name2Column +
                "\t\t\t\t\t\t| "
                + name3Column);
    }

    public static String compare2Value(int a, int b) {
        if(a == b){
            return "true";
        } else {
            return "false";
        }
    }

    public static String compare2Value(double a, double b) {
        if(a == b){
            return "true";
        } else {
            return "false";
        }
    }

    public static String compare2Value(String a, String b) {
        if(a.equals(b)){
            return "true";
        } else {
            return "false";
        }
    }

    public static void table3Columns( int a, int b, String trueOrFalse) {
        System.out.println("Integer a = " + a + "\t\t\t| " + "Integer a_1 = "
                + b + "\t\t\t| "
                + trueOrFalse);

    }
    public static void table3Columns( double a, double b, String trueOrFalse) {
        System.out.println("Double d = " + a + "\t\t\t| " + "Double d_1 = "
                + b + "\t\t\t| "
                + trueOrFalse);
    }

    public static void table3Columns( String a, String b, String trueOrFalse) {
        System.out.println("String str = " + a + "\t\t| " + "String str_1 = "
                + b + "\t\t| "
                + trueOrFalse);
    }





}

