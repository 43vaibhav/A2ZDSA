package basics.Patterns;

public class Pattern7 {
    public static void main(String args[]) {
        int n = 4;
        for(int rows =0;rows<n;rows++){
            for(int space =0; space < n - rows - 1;space++){
                System.out.print("  ");
            }
            for(int star = 0;star< 2*rows + 1; star++){
                System.out.print("* ");
            }
            
            System.out.println();

        }
    }
}