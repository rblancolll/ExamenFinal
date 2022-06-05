
package registros;

public class ArrayDepartamentos extends ArrayCantidad{
   private String[] vectorTransacciones;  
    private int indiceVector;
    private String [] Nombredeldepartamento;
    private String [] Nombredeldepartamento2;
    private String [] Nombredeldepartamento4;
    private String [] Nombredeldepartamento6;

public ArrayDepartamentos()
 {
    Nombredeldepartamento =new String[100];
    Nombredeldepartamento2 =new String[100];
    Nombredeldepartamento4 =new String[100];
    Nombredeldepartamento6 =new String[100];
    vectorTransacciones= new String[100];
    this.indiceVector=0;
     

}

public void registrarNombredeldepartamento(String tipo ){
        indiceVector= indiceVector+1;
               Nombredeldepartamento[indiceVector]= " Nombre del departamento = ┃"+ tipo +"┃ ";
        
    }
 public void Nombredeldepartamento(String Nombredeldepartamento){
      this.Nombredeldepartamento(Nombredeldepartamento);
      
      }
      
 public void registrarNombredeldepartamento2(String tipo ){
        indiceVector= indiceVector+1;
               Nombredeldepartamento2[indiceVector]= " Nombre del departamento = ┃"+ tipo +"┃ ";
        
    }
 public void Nombredeldepartamento2(String Nombredeldepartamento2){
      this.Nombredeldepartamento2(Nombredeldepartamento2);
      
      }
 
 public void registrarNombredeldepartamento4(String tipo ){
        indiceVector= indiceVector+1;
               Nombredeldepartamento4[indiceVector]= " Nombre del departamento = ┃"+ tipo +"┃ ";
        
    }
 public void Nombredeldepartamento4(String Nombredeldepartamento4){
      this.Nombredeldepartamento4(Nombredeldepartamento4);
      
      }
 
 public void registrarNombredeldepartamento6(String tipo ){
        indiceVector= indiceVector+1;
               Nombredeldepartamento6[indiceVector]= " Nombre del departamento = ┃"+ tipo +"┃ ";
        
    }
 public void Nombredeldepartamento6(String Nombredeldepartamento6){
      this.Nombredeldepartamento6(Nombredeldepartamento6);
      
      }
 
 public void mostrarNombredeldepartamento(){
      
            for (int i=1; i<Nombredeldepartamento.length;i++){
                if(Nombredeldepartamento[i] != null){
               
                    System.out.println(Nombredeldepartamento[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Nombredeldepartamento){
                if(transaccion != null){
                   
                }   
            } 
        }
 
 public void mostrarNombredeldepartamento2(){
      
            for (int i=1; i<Nombredeldepartamento2.length;i++){
                if(Nombredeldepartamento2[i] != null){
               
                    System.out.println(Nombredeldepartamento2[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Nombredeldepartamento2){
                if(transaccion != null){
                   
                }   
            } 
        }
 
 public void mostrarNombredeldepartamento4(){
      
            for (int i=1; i<Nombredeldepartamento4.length;i++){
                if(Nombredeldepartamento4[i] != null){
               
                    System.out.println(Nombredeldepartamento4[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Nombredeldepartamento4){
                if(transaccion != null){
                   
                }   
            } 
        }
 
  public void mostrarNombredeldepartamento6(){
      
            for (int i=1; i<Nombredeldepartamento6.length;i++){
                if(Nombredeldepartamento6[i] != null){
               
                    System.out.println(Nombredeldepartamento6[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Nombredeldepartamento6){
                if(transaccion != null){
                   
                }   
            } 
        }
  
}