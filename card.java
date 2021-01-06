import java.util.Scanner;

static class card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String temp = scanner.nextLine();
            System.out.println(temp);
        }
    }
}