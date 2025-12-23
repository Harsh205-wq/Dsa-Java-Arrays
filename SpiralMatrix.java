import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) { // i = row number
            for (int j = 0; j < matrix[i].length; j++) { // j = column number
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiral(int [][] matrix,int r,int c){
        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            // top row ->left col to right colm

            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.println(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;


            // right column-> top row to bottomRow

            for(int i=topRow;i<=bottomRow  && totalElements<r*c;i++){
                System.out.println(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            // bottomRow-> rightcol to leftcol

            for(int j=rightCol;j>=leftCol  && totalElements<r*c;j--){
                  System.out.println(matrix[bottomRow][j]+" ");
                  totalElements++;
            }
            bottomRow--;

            // leftCol->bottomRow to topRow
             for(int i=bottomRow;i>=topRow  && totalElements<r*c ;i--){
                 System.out.println(matrix[i][leftCol]+" ");
                 totalElements++;
             }
             leftCol++;

        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter values for Matrix:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Input matrix");
        printMatrix(matrix);

        System.out.println("the spiral order matrix is :");

        printSpiral(matrix, r, c);

    }
}
