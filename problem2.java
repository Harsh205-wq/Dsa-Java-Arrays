import java.util.Scanner;

public class problem2 {
    static void printMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposematrix(int[][] matrix,int r,int c){
            int [][]ans=new int[c][r];
            for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    ans[i][j]=matrix[j][i];
                }
            }
            return ans;
    }
    static void tranposeInplace(int [][] matrix,int r,int c){ // only square matrix is tranposed by this method
        for(int i=0;i<c;i++){
            for(int j=i+1;j<r;j++){
                // swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
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

        System.out.println("tranpose of the matrix :");
    //    int [][] ans=transposematrix(matrix, r, c);
    //    printMatrix(ans);
         tranposeInplace(matrix, r, c);
         printMatrix(matrix);

        
    }
}
