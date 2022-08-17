
package com.mycompany.repositorio;


public class Ciclos{
    
    
    
    
  public static void main(String args[]){
    
   int i = 0;

   System.out.println("Serie con for: ");
   for(i = 1; i <= 10; i++){
    if(1 < 10){
     System.out.print(i + ", ");
    } else {
     System.out.print(i);
    }
   }
  i = 1; 
  System.out.println("");
 
  System.out.println("Serie con while: ");
  while(i <= 10){
   if(1 < 10){
     System.out.print(i + ", ");
    } else {
     System.out.print(i);
    }
    i++;
  }
  i = 1;
  System.out.println("");

  System.out.println("Serie con do-while: ");
  do{
   if(1 < 10){
     System.out.print(i + ", ");
    } else {
     System.out.print(i);
    }
    i++;
  }while(i <= 10);
 }
}
