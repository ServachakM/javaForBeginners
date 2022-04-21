package lessons.lesson1to7;

public class Lesson7 {

      public static void main(String[] args) {
        // ячейка памяти типа String- масив
        String[] catsNames;

        // об'ект типа Стрынг-масив состоящий из 8 ячеек
        catsNames = new String[8];
        catsNames [4] = "Рыжик";
        catsNames [1] = "Black";
        catsNames [6] = "Рыжик";

        // об'ект типа инт-масив состоящий из 8 ячеек
        int[] catsAges = new int [8];
//
//        System.out.println(catsNames);
//        System.out.println(catsAges);
//        System.out.println(catsNames[0]);
//        System.out.println(catsAges[2]);
//        System.out.println(catsNames[4]);
//        System.out.println("___________________________________");
//
//        for(int i = 0; i < 8; i++ ){
//            System.out.println(catsNames[i]);
//        }
        System.out.println("___________________________________");

        for(int i = 0; i < 8; i++ ){
            if(catsNames[i] == "Рыжик") {
                System.out.println(catsNames[i]);
            }
        }

        System.out.println("___________________________________");

        for(int i = 0; i < 8; i++) {
            if(catsNames[i] == "Рыжик") {
                System.out.println(i);
            }
        }
        System.out.println("___________________________________");
        for(int i = 0; i < 8; i++) {
            if(catsNames[i] == "Black") {
                System.out.println(i);
            }
        }
        System.out.println("___________________________________");
        System.out.println(catsNames.length);  //длина массива



    }
}
