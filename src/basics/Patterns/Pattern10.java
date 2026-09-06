package basics.Patterns;

public class Pattern10 {
    public static void main(String args[]){
        int n=5;
        for(int rows =1; rows<=2*n-1;rows++){
            int star = rows;
            if(rows> n){
                star =2*n - rows ;
            }
            for(int j =1; j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
