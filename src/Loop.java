import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double averageScore = 0;
        double score;
        for (int i = 0; i < 3; i++){
            System.out.println("Whats your score?");
            score = sc.nextDouble();
            averageScore += score;
        }
        System.out.println("Average score: " + averageScore/3);
    }
}
