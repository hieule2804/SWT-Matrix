/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class manegerMatrix {

    public manegerMatrix() {
    }
    EnterTheMaTrix enterMatrix = new EnterTheMaTrix();
           Utility utility = new Utility();
             public int[][] enterMatrix1(){
       int rowOfMatrix1 = utility.InputNumber("Enter The Row Matrix1:", "The number must be integer", 1, 100);
       int columnOfMatrix1 = utility.InputNumber("Enter The Column Matrix1:", "The number must be integer", 1, 100);
       int[][] matrix1 = new int[rowOfMatrix1][columnOfMatrix1];
        matrix1 = enterMatrix.enterMatrix("Enter matrix1", rowOfMatrix1, columnOfMatrix1);
        return matrix1;
         }
          
             public int[][] enterMatrix2(){
                int rowOfMatrix2 = utility.InputNumber("Enter The Row Matrix2:", "The number must be integer", 1, 100);
       int columnOfMatrix2 = utility.InputNumber("Enter The Column Matrix2:", "The number must be integer", 1, 100);
       int[][] matrix2 = new int[rowOfMatrix2][columnOfMatrix2];
         matrix2 = enterMatrix.enterMatrix("Enter matrix2", rowOfMatrix2, columnOfMatrix2);
        return matrix2;
             }
    public int[][] addMatrix(int[][] matrix1,int[][] matrix2)
    {
            int rowMatrix1 = matrix1.length; //  xác định số hàng của ma trận này
            int columnMatrix1 = matrix1[0].length;// lay do dai o hang dau
            int rowMatrix2 = matrix2.length;
            int columnMatrix2 = matrix2[0].length;
                if(rowMatrix1== rowMatrix2 && columnMatrix1== columnMatrix2){
                         int[][] addMatrix = new int[rowMatrix2][columnMatrix2];

                for (int i = 0; i < rowMatrix2; i++) {
                    for (int j = 0; j < columnMatrix2; j++) {
                        addMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                    }
                }
                        return addMatrix;

            }else{
                System.out.println("Not add matrix!");
                        return null;

            }
        
    }
    
        public int[][] subMatrix(int[][] matrix1,int[][] matrix2)
    {
        
          int rowMatrix1 = matrix1.length; //  xác định số hàng của ma trận này
            int columnMatrix1 = matrix1[0].length;// lay do dai o hang dau
            int rowMatrix2 = matrix2.length;
            int columnMatrix2 = matrix2[0].length;
         int[][] subMatrix = new int[rowMatrix2][columnMatrix2];
            if(columnMatrix1== columnMatrix2 && rowMatrix1== rowMatrix2){
                for (int i = 0; i < rowMatrix2; i++) 
                {
                    for (int j = 0; j < columnMatrix2; j++) 
                    {
                        subMatrix[i][j]=matrix1[i][j]-matrix2[i][j];
                    }
                }
                        return subMatrix;

            }else{
                System.out.println("Not add matrix!");
                return null;
            }
    }
     
         public int[][] multipleMatrix(int[][] matrix1,int[][] matrix2)
         {
          int rowMatrix1 = matrix1.length; //  xác định số hàng của ma trận này
            int columnMatrix1 = matrix1[0].length;// lay do dai o hang dau
            int rowMatrix2 = matrix2.length;
            int columnMatrix2 = matrix2[0].length;
                      int[][] mutipleMatrix = new int[rowMatrix1][columnMatrix2];
                      // Kiểm tra nếu số cột của ma trận 1 không bằng số hàng của ma trận 2
                     if(columnMatrix1 == rowMatrix2)
                     {
                         for (int i = 0; i < rowMatrix1; i++) {
                             for (int j = 0; j < columnMatrix2; j++) {
                                 for (int k = 0; k < columnMatrix1  ;k++) {
                                     // Tính tổng các phần tử nhân trong hàng i của ma trận 1 và cột j của ma trận 
                                     mutipleMatrix[i][j] += matrix1[i][k]* matrix2[k][j];
                                 }
                             }
                         }
             return mutipleMatrix;
                     }else
                         return null;
}
    

    void displayResult(int[][] matrix1, int[][] matrix2, String mathsign, int[][] result) {
   enterMatrix.displayMatrix(matrix1);
             System.out.println(mathsign);
             enterMatrix.displayMatrix(matrix2);
             System.out.println("=");
           enterMatrix.displayMatrix(result);
    }

   
}
