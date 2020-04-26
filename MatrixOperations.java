/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoperations;

import java.util.Scanner;

/**
 *
 * @author M N Khakse
 */
public class MatrixOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a= new int[3][3];
        int[][] b= new int[3][3];
        
        System.out.println("Enter the data for the matrices below(3X3)");
        
        System.out.println("Matrix a:");
        for(int p=0; p<3; p++){
        for(int q=0; q<3; q++){
            System.out.print("a["+p+"]"+"["+q+"]= ");
            Scanner s= new Scanner(System.in);
            a[p][q]= s.nextInt();
        }    
        }
        
        System.out.println("Matrix b:");
        for(int p=0; p<3; p++){
        for(int q=0; q<3; q++){
            System.out.print("b["+p+"]"+"["+q+"]= ");
            Scanner sc= new Scanner(System.in);
            b[p][q]= sc.nextInt();
        }    
        }
        
        System.out.println("Addition of given matrices is");
        
        for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){    
            System.out.print(a[i][j]+b[i][j]+" ");
        }
        System.out.println();
        }
        
        System.out.println("Multiplication of given matrices is");
        int[][] r= new int[3][3];
        int sum=0;
       for(int i=0; i<3; i++){
       for(int j=0; j<3; j++){
       for(int k=0; k<3; k++){
          sum= sum+a[i][k]*b[k][j];
       }
         r[i][j]=sum;
         sum=0;
       }    
       }
        
       for(int i=0; i<3; i++){
       for(int j=0; j<3; j++){
           System.out.print(r[i][j]+" ");
       }
         System.out.println();
       }
  }
    
}
