package basics.Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        int start =1;
        for(int rows =1;rows<=n;rows++){
            for(int star = 1;star<=rows;star++){
                System.out.print(star+" ");

            }
            for(int space =1;space <=2*n - 2*rows;space++){
                System.out.print("  ");
            }
            
            for(int j = rows;j>=1;j--){
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }
}
