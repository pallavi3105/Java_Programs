public class Square_Fill{

    public static void main(String[] args) {
        Pattern(7);
    }

    static void Pattern(int n){
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}