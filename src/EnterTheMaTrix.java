
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class EnterTheMaTrix {

    public EnterTheMaTrix() {
    }
      Scanner scanner = new Scanner(System.in);
      Utility utility = new Utility();
      
      public void menu(){
          System.out.println("====Calculator program====");
          System.out.println("1.Addition matrixs");
          System.out.println("2.Subtraction matrixs");
          System.out.println("3.Multiplication matrixs");
          System.out.println("4.Exit program.");         
      }
      public int[][] enterMatrix(String message,int row, int column){
          int[][] matrix = new int[row][column];
          for (int i = 0; i < row; i++) {
              for (int j = 0; j < column; j++) {
                  matrix[i][j] = utility.InputNumber(message+"["+(i+1)+"]"+"["+(j+1)+"]:", "pls,Enter the integer", 0, 500);
              }
              
          }
        return matrix;
      }
      public void displayMatrix(int[][] matrix)
      {
          int row = matrix.length;
          int column = matrix[0].length;
          for (int i = 0; i < row ; i++) {
              for (int j = 0; j < column; j++) {
                  System.out.print("["+matrix[i][j]+"]");
              }
              System.out.println();
          }
      }
}
