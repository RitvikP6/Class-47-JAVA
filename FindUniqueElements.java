import java.util.ArrayList;
import java.util.Scanner;

public class FindUniqueElements {
    public static ArrayList<String> findUniqueElements(ArrayList<String> input) {
        ArrayList<String> uniqueElements = new ArrayList<>();

        for (String element : input) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }

        return uniqueElements;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many strings will you enter? ");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> input = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                input.add(sc.nextLine());
            }

            ArrayList<String> uniqueElements = findUniqueElements(input);
            System.out.println("Unique elements: " + uniqueElements);
        }
    }
}
