public class Right_Half_Revers_Pyramid{

    public static void main(String[] args) {
        Pattern(6);
    }

    static void Pattern(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}