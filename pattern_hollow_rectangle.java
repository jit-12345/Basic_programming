public class pattern_hollow_rectangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}

// [bruteforce approch]
// this is in outer for loop
// if (i==0 || i == row-1) {
// for (int j = 0; j < col; j++) {
// System.out.print('*'+" ");
// }

// }
// else{
// for (int j = 0; j < col; j++) {
// if (j==0 || j== col-1) {
// System.out.print('*'+" ");
// }
// else{
// System.out.print(" ");
// }
// }

// }
// System.out.println();