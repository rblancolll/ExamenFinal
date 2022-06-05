
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
           System.out.println("8" + " Mostrar los registros pares ");
          
           
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
           System.out.println("Ingrese 5 municipios de Petén");
           String Cantidaddemunicipios1=leer.next();
           String Cantidaddemunicipios2=leer.next();
           String Cantidaddemunicipios3=leer.next();
           String Cantidaddemunicipios4=leer.next();
           String Cantidaddemunicipios5=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento2(Nombredeldepartamento2+" "+"Posicion 2");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCantidaddemunicipios1(Cantidaddemunicipios1);
           registro.registrarCantidaddemunicipios2(Cantidaddemunicipios2);
           registro.registrarCantidaddemunicipios3(Cantidaddemunicipios3);
           registro.registrarCantidaddemunicipios4(Cantidaddemunicipios4);
           registro.registrarCantidaddemunicipios5(Cantidaddemunicipios5);
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
           System.out.println("Ingrese 5 municipios de Izabal");
           String Cantidaddemunicipios6=leer.next();
           String Cantidaddemunicipios7=leer.next();
           String Cantidaddemunicipios8=leer.next();
           String Cantidaddemunicipios9=leer.next();
            String Cantidaddemunicipios10=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento4(Nombredeldepartamento4+" "+"Posicion 4");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCantidaddemunicipios6(Cantidaddemunicipios6);
           registro.registrarCantidaddemunicipios7(Cantidaddemunicipios7);
           registro.registrarCantidaddemunicipios8(Cantidaddemunicipios8);
           registro.registrarCantidaddemunicipios9(Cantidaddemunicipios9);
           registro.registrarCantidaddemunicipios10(Cantidaddemunicipios10);
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
           System.out.println("Ingrese 5 municipios de Escuintla");
           String Cantidaddemunicipios11=leer.next();
           String Cantidaddemunicipios12=leer.next();
           String Cantidaddemunicipios13=leer.next();
           String Cantidaddemunicipios14=leer.next();
           String Cantidaddemunicipios15=leer.next();
           System.out.println("Ingrese su cabecera");
           String Cabecera=leer.next();
           registro.registrarNombredeldepartamento6(Nombredeldepartamento6+" "+"Posicion 6");
           registro.registrarCantidaddemunicipios(Cantidaddemunicipios);
           registro.registrarCantidaddemunicipios11(Cantidaddemunicipios11);
           registro.registrarCantidaddemunicipios12(Cantidaddemunicipios12);
           registro.registrarCantidaddemunicipios13(Cantidaddemunicipios13);
           registro.registrarCantidaddemunicipios14(Cantidaddemunicipios14);
           registro.registrarCantidaddemunicipios15(Cantidaddemunicipios15);
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
   
case 8 -> {
           System.out.println("Mostrar los registros pares ");
           
           registro.mostrarNombredeldepartamento2();
           
           registro.mostrarCantidaddemunicipios1();
           registro.mostrarCantidaddemunicipios2();
           registro.mostrarCantidaddemunicipios3();
           registro.mostrarCantidaddemunicipios4();
           registro.mostrarCantidaddemunicipios5();
           
           registro.mostrarNombredeldepartamento4();
           
           registro.mostrarCantidaddemunicipios6();
           registro.mostrarCantidaddemunicipios7();
           registro.mostrarCantidaddemunicipios8();
           registro.mostrarCantidaddemunicipios9();
           registro.mostrarCantidaddemunicipios10();
           
           registro.mostrarNombredeldepartamento6();
          
           registro.mostrarCantidaddemunicipios11();
           registro.mostrarCantidaddemunicipios12();
           registro.mostrarCantidaddemunicipios13();
           registro.mostrarCantidaddemunicipios14();
           registro.mostrarCantidaddemunicipios15();
           
           
               }
    }
    
}while (opcion !=9);
}
}
       
        
        
