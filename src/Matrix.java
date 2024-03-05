/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Utility utility = new Utility();
       EnterTheMaTrix enterMatrix = new EnterTheMaTrix();
       manegerMatrix matrix = new manegerMatrix();
         while(true){    
       int[][] matrix1 = matrix.enterMatrix1();
       int[][] matrix2 = matrix.enterMatrix2();
         enterMatrix.menu();
             int choose = utility.InputNumber("Input Your Choose :","The number must be integer", 1, 4);
         
             switch(choose){
                 case 1://add matrix 1 vs 
                     if(matrix1.length== matrix2.length && matrix1[0].length== matrix2[0].length){
                     int[][] result =  matrix.addMatrix(matrix1, matrix2);
                     matrix.displayResult(matrix1, matrix2 ,"+",result);
                 }else{
                                 System.err.println("don't add");
                             }
                     break;
                 case 2://sub matrix 1 vs 2
                     if(matrix1.length== matrix2.length && matrix1[0].length== matrix2[0].length)
                     {
                     int[][] result =  matrix.subMatrix(matrix1, matrix2);
                     matrix.displayResult(matrix1, matrix2 ,"-",result);
                     }else
                     {
                                 System.err.println("don't sub!");
                     }
                     break;
                 case 3: //mutiple matrix 1 vs 2
                     if(matrix1[0].length== matrix2.length)
                 {
                     int[][] result =  matrix.multipleMatrix(matrix1, matrix2);
                     matrix.displayResult(matrix1, matrix2 ,"*",result);
                 }else{
                                 System.err.println("don't multiple");
                             }
                     break;
                 case 4://exist 
                     return;
             
            }
    
 
        }
    }
    
}
