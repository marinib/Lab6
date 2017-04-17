import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the pig Latin translator!");

        // 1. display prompt/get user input

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the line or word to be translated. ");
        String lineOrWord = scan.nextLine();

        System.out.println("The line or word you entered translates to: " + pigLatin(lineOrWord) + " in Pig Latin!");}

        // 3. parse sentence and check each word to vowel, own class

    public static String pigLatin(String line) {

        char firstLetter = line.charAt(0);
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
            line = line.concat("yay");

        } else {
            String firstConso = "";
            if (line.charAt(1) == 'h') {
                firstConso = line.substring(0, 2);
                line = line.concat(firstConso).concat("ay");
                line = line.substring(2);
            } else {
                firstConso = String.valueOf(firstConso);
                line = line.concat(firstConso).concat("ay");
                line = line.substring(1);
            }

        }
        return line;
    }
}

    // todo: 6. prompt if they want to go again