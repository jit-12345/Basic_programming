public class pattern4 {
    //this is 0-1 triangle pattern
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    //here the intitial index of i and j = 1
    //think it my imgine matrix

    //if i+j= even number then that position hold 1
    // if i+j= odd number then that position hold 0
    public static void main(String[] args) {
        int row=8;
        int col=row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
              if (j<=i) {
                if ((i+j)%2==0) {
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
              }  
            }
            System.out.println();
        }
    }

}
