package basics.Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n =5;
        for(int rows=0;rows<n;rows++){
            for(int ch='A';ch<'A' +(n - rows);ch++){
                System.out.print((char)ch + " ") ;

            }
            System.out.println();
        }
    }
}
