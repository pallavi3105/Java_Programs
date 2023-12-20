public class Pascal_Right_Traingle{

    public static void main(String[] args) {
        Pattern(6);
    }

    static void Pattern(int n){
        for(int row = 1 ; row < 2 * n; row++){
            int TotalcolInRow = row > n ? 2 * n - row : row;
            for(int space = 1; space < n - TotalcolInRow; space++){
                System.out.print("");
            }
            for(int col = 1; col < TotalcolInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}