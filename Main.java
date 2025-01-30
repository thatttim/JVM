import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int randomNumber = 14 + random.nextInt(1488 - 14 + 1); // შემთხვევითი რიცხვის გენერაცია 14-დან 1488-მდე
            int attempts = 0;
            boolean guessed = false;

            logger.info("ახალი თამაში დაიწყო! გამოცანით რიცხვი 14-იდან 1488-ამდე.");

            while (!guessed) {
                System.out.print("შეიყვანეთ რიცხვი: ");
                int guess = scanner.nextInt();
                attempts++;

                // შედარება მომხმარებლის შეყვანილ რიცხვთან
                if (guess > randomNumber) {
                    logger.info("შეყვანილი რიცხვი მეტია საჭირო რიცხვზე.");
                    System.out.println("შეყვანილი რიცხვი მეტია საჭირო რიცხვზე :(");
                } else if (guess < randomNumber) {
                    logger.info("შეყვანილი რიცხვი ნაკლებია საჭირო რიცხვზე.");
                    System.out.println("შეყვანილი რიცხვი ნაკლებია საჭირო რიცხვზე :(");
                } else {
                    logger.info("მომხმარებელმა გამოიცნო რიცხვი " + randomNumber + " " + attempts + " ცდაში.");
                    System.out.println("მშვენიერია! რიცხვი გამოიცანი! მაგიური რიცხვი იყო " + randomNumber + ". გამოიცანი " + attempts + " ცდაში.");
                    guessed = true;
                }
            }

            // ვკითხავთ, სურს თუ არა მოთამაშეს ხელახლა თამაში
            System.out.print("კიდევ ერთელ ხომ არ გვეთამაშა? (Y, y, Yes, YES, yes): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes"));

        logger.info("თამაში დასრულდა. წარმატებები!");
        System.out.println("წარმატებები!");
        scanner.close();
    }
}
