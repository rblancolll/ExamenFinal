
package registros;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuNo1 {
   private Scanner leer = new Scanner(System.in);
   private String cod;
   private int op;
   private boolean res;
   private ListasDepartamento f;
   private ArrayList <ListasDepartamento> lista = new ArrayList<ListasDepartamento> ();
    
   
       public void menu(){
        System.out.println(" Menu ");
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
        System.out.println(" 3. Buscar ");
        System.out.println(" 4. Eliminar ");
        System.out.println(" 5. Salir ");
        System.out.println(" Digite una opcion ");
        op = leer.nextInt();
        switch(op){
            case 1: agregar ();break;
            case 2: listar ();break;
            case 3: buscar ( ); break;
            case 4: salir(); break;
            default: errorOpcion(); break;
        }
            
    }
    
    private void agregar(){
        do{
            System.out.println("Ingrese el Departamento ("+(lista.size()+1)+") : ");
            cod = leer.next();
            res = false;
            for (int i = 0; i < lista.size(); i++){
                f = lista.get(i);
                if(cod.equals(f.getDepartamento())){
                    res = true;
                    System.out.println("El Departamento"+ cod + " Ya existe ");
                    break;
                }
            }//cierra ciclo for
        }while(res);
    
        leer.nextLine();
    
    
      f = new ListasDepartamento();
      f.setDepartamento(cod);
      lista.add(f);
      
      System.out.println("------------------------------------------");
      System.out.println("---Registro Almacenado Correctamente---");
      System.out.println("------------------------------------------");
            menu(); 
    }//se cierra agregar
    
    private void listar(){
        if(lista.isEmpty()){
            System.out.println("No hay Datos para mostrar");
        }else{
            System.out.println("LISTADO");
            for (int i = 0; i < lista.size(); i++){
                f = lista.get(i);
                System.out.println("Departamento : " + f.getDepartamento());
               
            }
        }
        menu ();
    }//Se cierra listar
    
     private void buscar (){
        if(lista.isEmpty()){
            System.out.println("No hay Datos para buscar");
        }else{
            System.out.println("Digite el departamento que quiere buscar");
            cod = leer.next();
            res = false;
            for (int i = 0; i < lista.size(); i++){
                f = lista.get(i);
               if(cod == null ? f.getDepartamento() == null : cod.equals(f.getDepartamento())){
                res = true;
                System.out.println("Departamento encontrado");
                System.out.println("Departamento : " + f.getDepartamento());
               
                break;
               }
            }
            if(res == false){
                System.out.println("Departamento " + cod + " No encontrado"); 
            }
        }
        menu ();
        
    }//Se cierra buscar
    
    private void salir(){
        System.out.println("Adios");
        System.exit(0);
    }
    
    private void errorOpcion(){
        System.out.println("Error de opcion");
        menu();
    }
}
