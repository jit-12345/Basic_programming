public class pattern_2 {
    // inverted and rotated half pyramid
    // _ _ _ *
    // _ _ * *
    // _ * * *
    // * * * *
    public static void main(String[] args) {
        int row = 6;
        int col = row;
        // int col=row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j <= col - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
