
package registros;
import java.util.Scanner;


public class Registros {
 static  Scanner scanner=new Scanner (System.in);
    
    public static void main(String[] args) {
       // TablaAlumno hola=new TablaAlumno();
        //MenuVectores ji=new MenuVectores();
        MenuNo1 m1= new MenuNo1();
        MenuNo2 m2= new MenuNo2();
    int opcion  = 0;
  do{
        System.out.println("\n Bienvenidos A La Escuela Connor:");
          System.out.println("<<<<>>>>>>>>>>>>>>>>>>");
           System.out.println(" 1"+" metodo Listas");
            System.out.println(" 2"+" metodo Arrays");
             System.out.println(" 3"+" SALIR");
           System.out.println(" "+"Escoja el metodo que desea");
           System.out.println("<<<<>>>>>>>>>><<<>>>>>>>>>>>>>>>>><<<<>>");
          
                 opcion = scanner.nextInt();
       switch(opcion){
               
         case 1 -> { 
           
          
             m1.menu();
           
               }
          
         case 2 -> {
             
             m2.MenuNo2(opcion);
         }  
                   
    }
    
}while (opcion !=3);
    }
    
}
