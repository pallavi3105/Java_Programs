public class Palindrome_Triangular{

    public static void main(String[] args) {
        Pattern(6);
    }

    static void Pattern(int n){
        for(int row = 1; row <= 2 * n ; row++){
            int TotalColsInRow = row > n ? 2 * n - row : row;
            for(int space = 0 ; space < n - TotalColsInRow; space++){
                System.out.print("  ");
            }
            for(int col = TotalColsInRow ; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2 ; col <= TotalColsInRow; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}