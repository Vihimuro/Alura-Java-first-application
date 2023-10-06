import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favorite movie");
        String movie = sc.nextLine();
        System.out.println("Whats the release year?");
        int releaseYear =sc.nextInt();
        System.out.println("Whats your score?");
        double score = sc.nextDouble();
        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(score);
    }
}
