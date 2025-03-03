import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VoteEligibility {
    public static void main(String args[]) {
        try {
            File file = new File("inputVote.txt");
            Scanner sc = new Scanner(file);

            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            e.printStackTrace();
        }
    }
}
