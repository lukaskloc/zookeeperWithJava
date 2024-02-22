import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int startHours = scanner.nextInt();
        int startMinutes = scanner.nextInt();
        int startSeconds = scanner.nextInt();
        int endHours = scanner.nextInt();
        int endMinutes = scanner.nextInt();
        int endSeconds = scanner.nextInt();

        System.out.println((endHours - startHours) * 60 * 60 + (endMinutes - startMinutes) * 60 +
                (endSeconds - startSeconds));
    }
}