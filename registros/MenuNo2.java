
package registros;

import java.util.Scanner;  
public class MenuNo2  {
 static  Scanner leer=new Scanner (System.in);
    ArrayDepartamentos registro=new ArrayDepartamentos();

    
public void MenuNo2(int opcion){
        
        do{
           System.out.print(" Eliga un departamento ");
           System.out.println();
           System.out.println("1" + " Jutiapa ");
           System.out.println("2" + " Petén ");
           System.out.println("3" + " Quiché ");
           System.out.println("4" + " Izabal ");
           System.out.println("5" + " Huehuetenango ");
           System.out.println("6" + " Escuintla ");
           System.out.println("7" + " Mostrar los registros ");
          
           
           opcion = leer.nextInt();
            
       switch(opcion){

case 1 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento=leer.next();
           registro.registrarNombredeldepartamento(Nombredeldepartamento+" "+"Posicion No1");
          
}

case 2 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento2=leer.next();
           registro.registrarNombredeldepartamento2(Nombredeldepartamento2+" "+"Posicion No2");
}

case 3 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento=leer.next();
           registro.registrarNombredeldepartamento(Nombredeldepartamento+" "+"Posicion No3");
           
}

case 4 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento4=leer.next();
           registro.registrarNombredeldepartamento4(Nombredeldepartamento4+" "+"Posicion No4");
}

case 5 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento=leer.next();
           registro.registrarNombredeldepartamento(Nombredeldepartamento+" "+"Posicion No5");
           
}

case 6-> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento6=leer.next();
           
           registro.registrarNombredeldepartamento6(Nombredeldepartamento6+" "+"Posicion No6");
           
}
case 7 -> {
           System.out.println("Mostrar todos los registros ");
           
           //registro.mostrarNombredeldepartamento();   
           registro.mostrarNombredeldepartamento();
           registro.mostrarNombredeldepartamento2();
           registro.mostrarNombredeldepartamento4();
           registro.mostrarNombredeldepartamento6();
           
               }
   

    }
    
}while (opcion !=8);
}
}
       
        
        
