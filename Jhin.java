import java.util.*;

public class Jhin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Count the number of characters.");
            System.out.println("2. Find common characters between two words.");
            System.out.println("3. Convert the sentence to an ArrayList.");
            System.out.println("4. Exit");
            System.out.print("Make your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Read the new line

            switch (choice) {
                case 1:
                    System.out.print("Enter a sentence: ");
                    sentence = scanner.nextLine();
                    int charCount = sentence.length();
                    System.out.println("Number of characters: " + charCount);
                    break;
                case 2:
                    System.out.print("Enter the first word: ");
                    String firstWord = scanner.next();
                    System.out.print("Enter the second word: ");
                    String secondWord = scanner.next();
                    String commonChars = findCommonChars(firstWord, secondWord);
                    System.out.println("Common characters: " + commonChars);
                    break;
                case 3:
                    System.out.print("Enter a sentence: ");
                    sentence = scanner.nextLine(); // Read the new line
                    words = convertToArrayList(sentence);
                    System.out.println("ArrayList: " + words);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    public static String findCommonChars(String first, String second) {
        StringBuilder common = new StringBuilder();
        for (char c : first.toCharArray()) {
            if (second.contains(String.valueOf(c)) && !common.toString().contains(String.valueOf(c))) {
                common.append(c);
            }
        }
        return common.toString();
    }

    public static ArrayList<String> convertToArrayList(String sentence) {
        String[] array = sentence.split("\\s+");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }
}
