package basics.Patterns;

public class Pattern9 {
    public static void main(String args[]){
        int n=5;
        for(int rows =0; rows<n;rows++){
            for(int space =0; space<n - rows - 1;space++){
                System.out.print("  ");
            }
            for(int star = 0;star< 2*rows + 1;star++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for(int rows = 0;rows<n;rows++){
            for(int space =0;space<rows;space++){
                System.out.print("  ");
            }
            for(int star=0;star<2*n - 2*rows -1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
