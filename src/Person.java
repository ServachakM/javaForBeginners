public class Person {

    public static void main(String[] args) {

        String firstName = "Марія";
        String lastName = " Сервачак";
        String nationality = "Українка";
        String country = "Україна";
        int age = 32;
        String study = "QA automation";
        String motto = "Russian warship, go fuck yourself";
        String slash = "=======================================";

        System.out.println(slash);
        System.out.print(firstName);
        System.out.println(lastName);
        System.out.println(nationality);
        System.out.println(study);
        System.out.println(motto);
        System.out.println(slash);

        int yob = 1990;
        int yob2 = 2013;
        String text = "Якщо людина народилася в ";
        String text1 = ", то її вік буде різниця між 2022 і ";
        String text2 = " та становить ";

        String type1 = "Якщо людина народилася в " + yob + ", " +
                "то її вік буде різниця між 2022 і "
                        + yob + " i становить " + (2022 - yob);
        String type2 = "Якщо людина народилася в " + yob2 + ", " +
                "то її вік буде різниця між 2022 і "
                        + yob2 + " i становить " + (2022 - yob2);
        String type3 = String.format("Якщо людина народилася в %s, " +
                        "то її вік буде різниця між 2022 і %s i становить %s",
                yob2, yob2, (2022 - yob2));

        System.out.println(type1);
        System.out.println(type2);
        System.out.println(type3);

        System.out.println(slash);
        System.out.println(text + yob + text1 + yob + text2 + (2022 - yob));

    }
}
