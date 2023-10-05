import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int failCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static String name() {
        int nameTries = 0;
        while (nameTries < 3) {
            System.out.println("To get the first name of the user, you must first guess the number of letters in the name.");
            System.out.println("Please enter you guess:");
            int nameInput = scanner.nextInt();
            if (nameInput == 4) {
                return "Well done! This user's name is Mark.";
            }
            else {
                nameTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return null;

    }

    public static String sex() {
        int animalTries = 0;
        while (animalTries < 3) {
            System.out.println("To get the sex of the user, you must first guess this person's favorite animal.");
            System.out.println("Please enter you guess:");
            String animalInput = scanner.next();
            if (animalInput.equals("Dog")) {
                return "Well done! This user is a male.";
            } else {
                animalTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";
    }

    public static String age() {
        int sportTries = 0;
        while (sportTries < 3) {
            System.out.println("To get the age of the user, you must first guess this person's favourite sport");
            System.out.println("Please enter you guess:");
            String sportInput = scanner.next();
            if (sportInput.equals("Basketball")) {
                return "Well done! This user is 23.";
            } else {
                sportTries = sportTries + 1;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";
    }

    public static String email() {
        int gameTries = 0;
        while (gameTries < 3) {
            System.out.println("To get the email of the user, you must first guess this person's favourite video game");
            System.out.println("Please enter you guess:");
            String gameInput = scanner.next();
            if (gameInput.equals("Valorant")) {
                return "Well done! This user's email is marksmith@gmail.com";
            } else {
                gameTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";
    }


    public static String phoneNum() {
        int numTries = 0;
        int favNum = 15;
        int qx = favNum / 2;
        int rx = favNum % 2;
        int qxInput =0;
        int rxInput = 0;
        while (numTries < 5) {
            System.out.println("To get the phone number of the user, you must guess this person's favourite number's quotient and remainder when divided by 2. For this question, you will get 5 tries instead of 3. ");
            System.out.println("Please enter your guess for the quotient:");
            qxInput = scanner.nextInt();
            System.out.println("Please enter your guess for the remainder");
            rxInput = scanner.nextInt();
            System.out.println("That is not correct, please try again.");
        }
        if ((qxInput == qx) && (rxInput == rx)) {
            return "Well done! This user's phone number is 94017275";
        }
        failCount = 5;
        return "";
    }

    public static String occupation() {
        int bloodTries = 0;
        while (bloodTries < 3) {
            System.out.println("To get the occupation of the user, you must guess this person's blood type.");
            System.out.println("Please enter you guess:");
            String bloodInput = scanner.next();
            if (bloodInput.equals("O")) {
                return "Well done! This user's occupation is student";
            } else {
                bloodTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";
    }

    public static String creditCard() {
        int countriesTries = 0;
        while (countriesTries < 3) {
            System.out.println("To get the credit card number of the user, you must guess number of countries this person has been to.");
            System.out.println("Please enter you guess:");
            int countriesInput = scanner.nextInt();
            if (countriesInput == 5) {
                return "Well done! This user's credit card number is 4015710295729523";
            } else {
                countriesTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";

    }

    public static String ethnicity() {
        int ethTries = 0;
        while (ethTries < 3) {
            System.out.println("To get the ethnicity of this person, you must guess this person's favourite movie.");
            System.out.println("Please enter you guess:");
            String movInput = scanner.nextLine();
            if (movInput.equals("Harry Potter")) {
                return "Well done! This user is Chinese.";
            } else {
                ethTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";

    }

    public static String location() {
        int petTries = 0;
        while (petTries < 3) {
            System.out.println("To get the location of this person, you must guess how many pets this person has.");
            System.out.println("Please enter you guess:");
            int petInput = scanner.nextInt();
            if (petInput == 2) {
                return "Well done! This user lives in Hong Kong";
            } else {
                petTries++;
                System.out.println("That is not correct please try again.");
            }
        }
        failCount = 5;
        return "";


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome! You are now a hacker that has access to most information on a person, however, you must answer some of the questions to access the information.");
        System.out.println("To win this game, you must find all the commands that will access the user's information, and answer the questions correctly.");
        System.out.println("An example of these commands would be getting the passwords of the users.");
        System.out.println("If you enter 5 wrong commands, or you cannot answer the questions within 3 tries, you will lose the game. If the answer is a word, make sure to capitalize the first letter!");
        System.out.println("Good luck and have fun!");
        int commandCount = 0;
        int failCount = 0;
        while ((commandCount < 10) && (failCount < 5)) {
            System.out.println("Please enter your command:");
            String command = scanner.next();
            if ((command.equals("name")) || (command.equals("Name") || (command.equals("First name")))){
                String name = name();
                if (name!= null){
                    System.out.println(name);
                }
                else{
                    System.out.println(" ");
                }
                commandCount++;
                continue;
            }
            if ((command.equals("gender")) || (command.equals("sex"))) {
                String sex = sex();
                commandCount++;
                continue;
            }
            if ((command.equals("age")) || (command.equals("Age"))) {
                String age = age();
                commandCount++;
                continue;
            }
            if ((command.equals("email")) || (command.equals("Email"))){
                String email = email();
                commandCount++;
                continue;
            }
            if ((command.equals("phone number")) || (command.equals("Phone Number")) || (command.equals("Phone number")) || (command.equals("phone Number"))){
                String phoneNum = phoneNum();
                commandCount++;
                continue;
            }
            if ((command.equals("occupation")) || (command.equals("Occupation")) || (command.equals("job")) || (command.equals("Job"))) {
                String job = occupation();
                commandCount++;
                continue;
            }
            if ((command.equals("credit card")) || (command.equals("Credit Card")) || (command.equals("Credit card"))) {
                String cc = creditCard();
                commandCount++;
            }
            if ((command.equals("ethnicity")) || (command.equals("Ethnicity")) || (command.equals("race")) || (command.equals("Race")) || (command.equals("Nationality")) || (command.equals("nationality"))) {
                String eth = ethnicity();
                commandCount++;
                continue;
            }

            if ((command.equals("location")) || (command.equals("Location")) || (command.equals("Address")) || (command.equals("address"))){
                String location = location();
                commandCount++;
                continue;
            }
            failCount++;
            System.out.println("That was not correct, please try again.");
        }
        if (commandCount == 10) {
            System.out.println("Congratulations! You guessed all the commands and answered the questions correctly! You win!");
        }
        System.out.println("You entered 5 wrong commands, or you answered the questions wrongly. GAME OVER.");


    }
}
