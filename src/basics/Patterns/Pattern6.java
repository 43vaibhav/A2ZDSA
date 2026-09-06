package basics.Patterns;

public class Pattern6 {
    public static void main(String args[]) {
        int n = 5;
        for(int row =0;row<=n;row++){
            for(int star=1;star<=n-row;star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
