public class Main {
    public static void main(String[] args) {
        System.out.println("That's the Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int releaseYear = 2022;
        boolean isIncludedInPlan = true;

        double average = (9.8 + 6.3 + 8.0)/3;
        System.out.printf("Average: %.2f%n", average);
        String synopsis = """
                    Top Gun Movie
                    Adventure Movie with 80's heartthrob
                    Very Good!
                    Release Year:""" + " " + releaseYear;
        System.out.println(synopsis);

        int classification = (int) (average/2);
        System.out.println("Classification: " +classification + "/5");
    }
}