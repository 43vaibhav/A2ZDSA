package basics.Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n =5;
        for(int rows =1;rows<=n;rows++){
            for(int space =0;space<n-rows;space++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }
}
