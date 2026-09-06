package basics.Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n =5;
        int start = 1;
        for(int rows = 1;rows<= n;rows++){
            for(int i =1;i<= rows;i++){
                System.out.print(start+ "  ");
                start++;
            }
            System.out.println();
        }

    }
}
