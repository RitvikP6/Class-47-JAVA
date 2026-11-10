
import java.util.ArrayList;
import java.util.Scanner;

class Review {
    private String comment;

    public Review(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}

public class main {

    // Method to collect and format comments
    public ArrayList<String> collectComments(ArrayList<Review> reviews) {
        ArrayList<String> comments = new ArrayList<>();

        // Loop through all reviews
        for (int i = 0; i < reviews.size(); i++) {
            String comment = reviews.get(i).getComment();

            // If the comment contains an exclamation mark
            if (comment.contains("!")) {

                // Format the comment with its index
                String formattedComment = String.format("%d-%s", i, comment);

                // Ensure the comment ends with a period or exclamation mark
                if (!comment.endsWith("!") && !comment.endsWith(".")) {
                    formattedComment += ".";
                }

                // Add the formatted comment
                comments.add(formattedComment);
            }
        }

        return comments;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            main obj = new main();

            // Enter the number of reviews
            System.out.print("Enter the number of reviews: ");
            int n = sc.nextInt();
            sc.nextLine();

            // Create an ArrayList to store reviews
            ArrayList<Review> reviews = new ArrayList<>();

            // Enter the reviews
            for (int i = 0; i < n; i++) {
                System.out.print("Enter review " + (i + 1) + ": ");
                String comment = sc.nextLine();
                reviews.add(new Review(comment));
            }

            // Collect and print formatted comments
            ArrayList<String> comments = obj.collectComments(reviews);

            System.out.println("Collected Comments:");
            for (String comment : comments) {
                System.out.println(comment);
            }
        }
    }
}
