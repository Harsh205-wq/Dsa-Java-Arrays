import java.util.Scanner;

public class problem6 {
     static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) { // i = row number
            for (int j = 0; j < matrix[i].length; j++) { // j = column number
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][]  printSpiral(int n){
        int r=n;int c=n;
        int [][] matrix=new int[n][n];
        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
       int curr=1;
        while(curr<=r*c){
            // top row ->left col to right colm

            for(int j=leftCol;j<=rightCol && curr<=r*c;j++){
               matrix[topRow][j]=curr++;
            }
            topRow++;


            // right column-> top row to bottomRow

            for(int i=topRow;i<=bottomRow  && curr<=r*c;i++){
               matrix[i][rightCol]=curr++;
            }
            rightCol--;
            // bottomRow-> rightcol to leftcol

            for(int j=rightCol;j>=leftCol  && curr<r*c;j--){
                 matrix[bottomRow][j]=curr++;
            }
            bottomRow--;

            // leftCol->bottomRow to topRow
             for(int i=bottomRow;i>=topRow  && curr<r*c ;i--){
               matrix[i][leftCol]=curr++;
             }
             leftCol++;

        }
        return matrix;
    }
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int [][]matrix=printSpiral(n);
        printMatrix(matrix);

        


    }
}
