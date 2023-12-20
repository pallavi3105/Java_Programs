public class Number_Changing{

    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n){
        int num = 1;
        for(int row = 0 ; row <= n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print(num + " ");
                num++; 
            }
            System.out.println();
        }
    }

}