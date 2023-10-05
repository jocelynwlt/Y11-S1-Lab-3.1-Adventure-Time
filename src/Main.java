import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static String name(String name){
        System.out.println("To get the first name of the user, you must first guess the number of letters in the name.");
        String nameInput = scanner.next();
        int nameTries = 0;
        while (!nameInput.equals("Mark")){
            nameTries ++;
            System.out.println("That was not correct, please try again");
            if (nameTries == 3){
                System.out.println("You have tried more than three times and didn't get the name, game over.");
            }

        }

    }
    public static String gender(String ){
        System.out.println("To get the gender of the user, you must first guess this person's favorite animal.");
    }

    public static int age(int ){
        System.out.println("To get the age of the user, you must first guess this person's favourite sport");
    }

    public static String email(String ){
        System.out.println("To get the email of the user, you must first guess this person's favourite video game");

    }

    public static String dateOfBirth(String) {
        System.out.println("To get the date of birth of the user, you must guess this person's favorite dessert");

    }

    public static String phoneNum(int ){
        System.out.println("To get the phone number of the user, you must guess this person's favourite number");

    }

    public static String occupation(String ){
        System.out.println("To get the occupation of the user, you must guess this person's blood type.");

    }

    public static int creditCard(int ){
        System.out.println("To get the credit card number of the user, you must guess number of countries this person has been to.");

    }

    public static String ethnicity(String ){
        System.out.println("To get the ethnicity of this person, you must guess this person's favourite movie.");

    }

    public static String location(){
        System.out.println("To get the location of this person, you must guess how many pets this person has.");

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome! You are now a hacker that has access to most information on a person, however, you must answer some of the questions to access the information.");
        System.out.println("To win this game, you must find all the commands that will access the user's information.");
        System.out.println("An example of these commands would be getting the passwords of the users.");
        System.out.println("If you enter 3 wrong commands in a row, or you cannot win the minigames within 3 tries, you will lose the game.");
        System.out.println("Let's start!");
        System.out.println("Please enter your first command: ");
        String firstCommand = scanner.next();
        if (firstCommand ==



    }
}