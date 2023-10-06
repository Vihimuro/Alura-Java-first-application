public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean isIncludedInPlan = true;
        double movieScore = 8.1;
        String planType = "plus";

        if (releaseYear >= 2022){
            System.out.println("Release that customers are liking!");
        } else {
            System.out.println("Old movie worth watching!");
        }

        if (isIncludedInPlan == true && planType.equals("plus")){
            System.out.println("Watch now!");
        }
        else {
            System.out.println("Must rent movie");
        }
    }
}
