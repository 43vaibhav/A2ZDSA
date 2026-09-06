package basics.Patterns;

public class Pattern5 {
    public static void main(String args[]) {
        int n = 5;
        for(int row =0;row<n;row++){
            for(int star=n - row;star>0;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
