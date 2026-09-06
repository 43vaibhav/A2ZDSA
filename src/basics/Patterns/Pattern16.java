package basics.Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int rows = 0;rows<n;rows++){
            
            for(int i =0;i<=rows;i++){
                System.out.print(ch + " ");
                
            }
            ch++;
            System.out.println();
        }
    }
}
