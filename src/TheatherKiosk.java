import java.util.Scanner;
//This is an age check for 21+, if not of age the code will do nothing.
public class TheatherKiosk {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age = 0;
        System.out.println("How old are you? (in years)");
        age = userInput.nextInt();
        if (age >= 21)

            System.out.println("Please get a paper wristband");
    }
}