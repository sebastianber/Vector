package Vector;

import javax.swing.*;
public class Vector {
   public static void main(String[] args) {
        int num=0;
         int vec1[]= new int[5];
         for (int i=0; i<5; i++){
           num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion " +i));
             if(num>10){
             vec1[i]= num;
             }else{
                 System.out.println("porfavor ingresar numeros mayores  8");
                  }
        }
         for (int i=0; i<5; i++){
             System.out.print(vec1[i]); 
         }
         System.out.println();
   }
 }