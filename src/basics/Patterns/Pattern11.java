package basics.Patterns;

public class Pattern11 {
    public static void main(String args[]) {
        int n = 5;
        int start =1;
        for(int rows = 1;rows<=n;rows++){
            if(rows % 2 ==0){
                    start =0;
                }
                else { 
                    start = 1;
                }
            for(int i =1;i<=rows;i++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
