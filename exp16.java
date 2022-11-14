import java.util.Scanner;
public class exp16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Number of Matrix Rows");
            int matrixRow = scan.nextInt();
            System.out.println("Enter the Number of Matrix Columns");
            int matrixCol = scan.nextInt();
            matrix ob = new matrix();

            int[][] matrix1 = new int[matrixRow][matrixCol];
            int[][] matrix2 = new int[matrixRow][matrixCol];

            ob.read(scan, matrix1, matrixRow, matrixCol);
            System.out.println("Matrix 1 is: ");
            ob.display(matrix1, matrixRow, matrixCol);
            ob.read(scan, matrix2, matrixRow, matrixCol);
            System.out.println("Matrix 2 is: ");
            ob.display(matrix1, matrixRow, matrixCol);

            System.out.println("addition of matrix is: ");
            ob.transpose(matrix1,matrix2, matrixRow, matrixCol);
    } 
}

class matrix{
    void read(Scanner scan, int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Enter Matrix Data");
            for(int i=0; i<matrixRow; i++){
                for(int j=0; j<matrixCol; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }
    }

    void display(int[][] matrix, int matrixRow, int matrixCol){
        for(int i=0; i<matrixRow; i++){
            for(int j=0; j<matrixCol; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void transpose(int[][] matrix1 ,int[][]matrix2, int matrixRow, int matrixCol){
        for(int i=0; i<matrixRow; i++){
            for(int j=0; j<matrixCol; j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]+"\t");
            }
            System.out.println();
        }   
    }          
}
