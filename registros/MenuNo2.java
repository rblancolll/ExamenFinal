
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
           System.out.println("Ingrese la cantidad de municipios que tiene");
           String Cantidaddemunicipios=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento(Nombredeldepartamento+" "+"Posicion 1");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCabecera(Cabecera);
          
}

case 2 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento2=leer.next();
           System.out.println("Ingrese la cantidad de municipios que tiene");
           String Cantidaddemunicipios=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento2(Nombredeldepartamento2+" "+"Posicion 2");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCabecera(Cabecera);
}

case 3 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento=leer.next();
           System.out.println("Ingrese la cantidad de municipios que tiene");
           String Cantidaddemunicipios=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento(Nombredeldepartamento+" "+"Posicion 3");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCabecera(Cabecera);
           
}

case 4 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento4=leer.next();
           System.out.println("Ingrese la cantidad de municipios que tiene");
           String Cantidaddemunicipios=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento4(Nombredeldepartamento4+" "+"Posicion 4");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCabecera(Cabecera);
}

case 5 -> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento=leer.next();
           System.out.println("Ingrese la cantidad de municipios que tiene");
           String Cantidaddemunicipios=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento(Nombredeldepartamento+" "+"Posicion 5");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCabecera(Cabecera);
           
}

case 6-> { 
           System.out.println("➤➤➤➤➤➤➤➤➤➤➤");
           System.out.println("Ingrese el nombre del departamento");
           String Nombredeldepartamento6=leer.next();
           System.out.println("Ingrese la cantidad de municipios que tiene");
           String Cantidaddemunicipios=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento6(Nombredeldepartamento6+" "+"Posicion 6");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCabecera(Cabecera);
           
}
case 7 -> {
           System.out.println("Mostrar todos los registros ");
           
           //registro.mostrarNombredeldepartamento();   
           registro.mostrarNombredeldepartamento();
           registro.mostrarNombredeldepartamento2();
           registro.mostrarNombredeldepartamento4();
           registro.mostrarNombredeldepartamento6();
           registro.mostrarCantidaddemunicipios();
           registro.mostrarCabecera();
               }
   

    }
    
}while (opcion !=8);
}
}
       
        
        
