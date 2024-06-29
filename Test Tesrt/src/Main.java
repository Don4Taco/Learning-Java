import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int question1 = 9;
        int question2 = 151;
        int question3 = 1025;
        int points = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this little Pokemon Quiz! But first, what is your name?");
        String input = scanner.next();
                System.out.println("Alright " + input   + " ,lets do this!");
                System.out.println("How many Pokemon Generations are there? " +
                        "| 6 | " +
                        "7 | " +
                        "8 | " +
                        "9 |");

        question1 = scanner.nextInt();
        if(question1 == 9 ) {
            System.out.println("Yes that is correct, there is 9 Generations of Pokemon games.");
            points ++;
        } else {
            System.out.println("EEEEEEGH!!!! Wrong answer!! There is 9 Generations of Pokemon games. Lets continue.");
        }


        System.out.println("How many Pokemon where there in the first Generation?" +
                " | 120 | " +
                "175 | " +
                "151 | " +
                "98 |");

        question2 = scanner.nextInt();
        if(question2 == 151 ) {
            System.out.println("Yes that is correct, there was 151 Pokemon in the first Generation.");
            points ++;
        } else {
            System.out.println("EEEEEEGH!!!! Wrong answer!! There was 151 Pokemon in the first Generation. Lets continue.");
        }


        System.out.println("How many Pokemon are there in total?" +
                " | 1025| " +
                "987 | " +
                "1093 | " +
                "1004 |");

        question3 = scanner.nextInt();
        if(question3 == 1025 ) {
            System.out.println("Yes that is correct, there is 1025 Pokemon in total (as of June 2024)");
            points ++;
        } else {
            System.out.println("EEEEEEGH!!!! Wrong answer!! There is 1025 Pokemon in total (as of June 2024). Lets continue."); }


        System.out.println("Thank you for participating " + input +" , you have reached " + points + " /3 points.");
    }
}