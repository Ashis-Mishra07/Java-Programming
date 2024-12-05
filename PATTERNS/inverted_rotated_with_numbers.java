package PATTERNS;

public class inverted_rotated_with_numbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int num = 1;
            for (int j = 5; j >= i; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // floyd's triangle
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
}
