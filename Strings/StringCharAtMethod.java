package Strings;

public class StringCharAtMethod {
    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Rohit";
        String lastName = "Jaiswal";
        String fullName = firstName + " " + lastName;
       // System.out.println(firstName.charAt(1));

        printLetters(fullName);

    }
}
