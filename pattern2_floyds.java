public class pattern2_floyds {
   //floyd's triangle
//    1
//    2 3
//    4 5 6
//    7 8 9 10
//   11 12 13 14 15
public static void main(String[] args) {
    
        int row=6;
        int col=row;
        int count=0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j<=i) {
                   System.out.print(++count + " "); 
                }
                // else{
                //     System.out.print("  ");
                // }
            }
            System.out.println();
        }
    }
}

