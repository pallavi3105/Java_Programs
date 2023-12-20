public class Square_Hollow{

    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n){
        for(int row = 0 ; row <  n ; row++){
            for(int col = 0 ; col < n; col++){
                if(row == 0 || col == 0 || row == n-1 || col == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}