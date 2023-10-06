import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double averageScore = 0;
        double score = 0;
        int scoresCount = 0;
        while(score >= 0 ) {
            System.out.println("Whats your score?");
            score = sc.nextDouble();
            if (score < 0) {
                break;
            }
            averageScore += score;
            scoresCount++;
        }
        if (scoresCount == 0){
            System.out.println("No scores given!");
        }
        else {
            System.out.println("Average score: " + averageScore/scoresCount);
        }
    }
}
