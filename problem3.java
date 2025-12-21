import java.util.Scanner;

public class problem3 {
    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) { // i = row number
            for (int j = 0; j < matrix[i].length; j++) { // j = column number
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
static void reverseArray(int [] arr){
    int i=0, j=arr.length-1;
    while (i<j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
    }
}
    static void rotate(int [][] matrix,int n){
        // tranpose
        tranposeInplace(matrix, n, n);

         // reverse each row of the transposed matrix
         for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
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

        rotate(matrix,r);

        System.out.println("Roatation of the matrix");
        printMatrix(matrix);
    }
}
