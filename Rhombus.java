public class Rhombus{

    public static void main(String[] args) {
        Pattern(6);
    }

    static void Pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 0 ; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}