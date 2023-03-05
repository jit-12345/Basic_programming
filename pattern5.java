public class pattern5 {
    //butterfly pattern
    // *      *
    // **    **
    // ***  ***
    // ********
    // ********
    // ***  ***
    // **    **
    // *      *

    //this is a butterfly pattern
    public static void main(String[] args) {
        int row=8;
        int col=row;
        //1 st half
        for (int i = 1; i <=row/2; i++) {
            for (int j = 1; j <=col/2; j++) {
               if (j<=i) {
                System.out.print("*");
               } 
               else{
                System.out.print(" ");
               }
            }
            for (int j = (col/2)+1; j <=col; j++) {
                if (j<=col-i) {
                  System.out.print(" ");  
                }
                else{
                    System.out.print("*");
                }
            }
             System.out.println();
        }
        //2nd half
        for (int i = (row/2)+1; i <= row; i++) {
           
        }
    }
}