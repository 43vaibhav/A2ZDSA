package basics.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n =5;
        for(int rows = 0;rows<n;rows++){
            for(char ch ='A'; ch <= 'A' + rows;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

}
