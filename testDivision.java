/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author user
 */
public class testDivision extends testOperation {
    
    public void division(){
        double[][] matrix1 = new double[2][2];
        double[][] matrix2 = new double[2][2];
        double[][] matrix3 = new double[2][2];
        double[][] matrixadj = new double[2][2];
        double[][] matrixin = new double[2][2];
        double det1, sum1;
        
        // input matrix elements
        System.out.println("\nEnter the elements of the first matrix: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++){
                System.out.print("["+(i+1)+","+(j+1)+"] : ");matrix1[i][j] = scan.nextDouble();
            }
        }
        System.out.println("\nEnter the elements of the second matrix: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++){
            System.out.print("["+(i+1)+","+(j+1)+"] : ");matrix2[i][j] = scan.nextDouble();
            }   
        }
            
        // calculating
        det1 = (matrix2[0][0] * matrix2[1][1]) - (matrix2[0][1] * matrix2[1][0]);
        if(det1!=0){
        matrixadj[0][0]=matrix2[1][1];
        matrixadj[1][1]=matrix2[0][0];
        matrixadj[0][1]=0-matrix2[0][1];
        matrixadj[1][0]=0-matrix2[1][0];
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                matrixin[i][j]=matrixadj[i][j]/det1;
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                sum1=0;
                for(int k=0; k<2; k++){
                    sum1 = sum1 + matrix1[i][k] * matrixin[k][j];
                }
                matrix3[i][j] = sum1;
            }
        }
            
        //displaying
        System.out.println("\nThe first matrix: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nThe second matrix: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nThe addition: ");
            for(int i=0; i<2; i++) {
                for(int j=0; j<2; j++) {
                    System.out.print(matrix3[i][j]+"\t");
                }
                System.out.println();
        }
    }
        else{
            System.out.println("\nThis operation cannot be executed.");
        }
    }
}
