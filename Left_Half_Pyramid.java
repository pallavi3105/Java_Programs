public class Left_Half_Pyramid{

    public static void main(String[] args) {
        Pattern(7);
        Pattern1(8);
    }

    static void Pattern(int n){
        for(int row = n ; row >= 1 ; row--){
            for(int col = 1 ; col < row ; col++){
                System.out.print(" ");
            }
            for(int col = 0 ; col <= n - row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void Pattern1(int n){
        for(int row = 1; row <= n ; row++){
            for(int space = 1 ; space < n + row; space++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <=  n - row - 1 ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}