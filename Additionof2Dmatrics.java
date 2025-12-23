import java.util.Scanner;

public class Additionof2Dmatrics {

    static void printmatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) { // i = row number
            for (int j = 0; j < matrix[i].length; j++) { // j = column number
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input given: Matrices dimensions must match!");
            return;
        }

        int[][] sum = new int[r1][c1]; // r1 and r2 are same
        for (int i = 0; i < r1; i++) { // row
            for (int j = 0; j < c1; j++) { // column

                sum[i][j] = a[i][j] + b[i][j]; // sum=sum[a]+ sum[j]
            }
        }

        System.out.println("Sum of matrices:");
        printmatrix(sum);
    }

    static void matricsMultiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1!=r2){
            System.out.println("Multiplication is not possible");
        }

        int [][] mul=new int[r1][c2];

        for(int i=0;i<r1;i++){ // row
            for(int j=0;j<c2;j++){ /// column

                for(int k=0;k<c1;k++){
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("The multiplication of two matriks are:");
        printmatrix(mul);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows and Columns in Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter values for Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no of Rows and Columns in Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter values for Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

       System.out.println("Matrix 1");
       printmatrix(a);
       System.out.println("Matrix 2:");
       printmatrix(b);

    //    addMatrices(a, r1, c1, b, r2, c2);
    matricsMultiplication(a, r1, c1, b, r2, c2);

       
    }
}
