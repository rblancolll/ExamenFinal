
package registros;

public class ArrayDepartamentos extends ArrayCantidad{
   private String[] vectorTransacciones;  
    private int indiceVector;
    private String [] Nombredeldepartamento;
    private String [] Nombredeldepartamento2;
    private String [] Nombredeldepartamento4;
    private String [] Nombredeldepartamento6;
    private String [] Cantidaddemunicipios;
    private String [] Cantidaddemunicipios1;
    private String [] Cantidaddemunicipios2;
    private String [] Cantidaddemunicipios3;
    private String [] Cantidaddemunicipios4;
    private String [] Cantidaddemunicipios5;
    private String [] Cabecera;

public ArrayDepartamentos()
 {
    Nombredeldepartamento =new String[100];
    Nombredeldepartamento2 =new String[100];
    Nombredeldepartamento4 =new String[100];
    Nombredeldepartamento6 =new String[100];
    Cantidaddemunicipios =new String[100];
    Cantidaddemunicipios1 =new String[100];
    Cantidaddemunicipios2 =new String[100];
    Cantidaddemunicipios3 =new String[100];
    Cantidaddemunicipios4 =new String[100];
    Cantidaddemunicipios5 =new String[100];
    Cabecera =new String[100];
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
  
 public void registrarCantidaddemunicipios(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios(String Cantidaddemunicipios){
      this.registrarCantidaddemunicipios(Cantidaddemunicipios);
      
      }
 
 public void registrarCantidaddemunicipios1(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios1[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios1(String Cantidaddemunicipios1){
      this.registrarCantidaddemunicipios1(Cantidaddemunicipios1);
      
      }
 
  public void registrarCantidaddemunicipios2(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios2[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios2(String Cantidaddemunicipios2){
      this.registrarCantidaddemunicipios2(Cantidaddemunicipios2);
      
      }
 
 public void registrarCantidaddemunicipios3(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios3[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios3(String Cantidaddemunicipios3){
      this.registrarCantidaddemunicipios3(Cantidaddemunicipios3);
      
      }
 
  public void registrarCantidaddemunicipios4(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios4[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios4(String Cantidaddemunicipios4){
      this.registrarCantidaddemunicipios4(Cantidaddemunicipios4);
      
      }
 
 public void registrarCantidaddemunicipios5(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios5[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios5(String Cantidaddemunicipios5){
      this.registrarCantidaddemunicipios5(Cantidaddemunicipios5);
      
      }
 
 
 
 public void registrarCabecera(String tipo ){
        indiceVector= indiceVector+1;
               Cabecera[indiceVector]= " Cabecera = ┃"+ tipo +"┃ ";
        
    }
 public void Cabecera(String Cabecera){
      this.Cabecera(Cabecera);
      
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
  
   public void mostrarCantidaddemunicipios(){
      
            for (int i=1; i<Cantidaddemunicipios.length;i++){
                if(Cantidaddemunicipios[i] != null){
               
                    System.out.println(Cantidaddemunicipios[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios){
                if(transaccion != null){
                   
                }   
            } 
        }
   
   public void mostrarCantidaddemunicipios1(){
      
            for (int i=1; i<Cantidaddemunicipios1.length;i++){
                if(Cantidaddemunicipios1[i] != null){
               
                    System.out.println(Cantidaddemunicipios1[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios1){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios2(){
      
            for (int i=1; i<Cantidaddemunicipios2.length;i++){
                if(Cantidaddemunicipios2[i] != null){
               
                    System.out.println(Cantidaddemunicipios2[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios2){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios3(){
      
            for (int i=1; i<Cantidaddemunicipios3.length;i++){
                if(Cantidaddemunicipios3[i] != null){
               
                    System.out.println(Cantidaddemunicipios3[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios3){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios4(){
      
            for (int i=1; i<Cantidaddemunicipios4.length;i++){
                if(Cantidaddemunicipios4[i] != null){
               
                    System.out.println(Cantidaddemunicipios4[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios4){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios5(){
      
            for (int i=1; i<Cantidaddemunicipios5.length;i++){
                if(Cantidaddemunicipios5[i] != null){
               
                    System.out.println(Cantidaddemunicipios5[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios5){
                if(transaccion != null){
                   
                }   
            } 
        }

   public void mostrarCabecera(){
      
            for (int i=1; i<Cabecera.length;i++){
                if(Cabecera[i] != null){
               
                    System.out.println(Cabecera[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cabecera){
                if(transaccion != null){
                   
                }   
            } 
        }

   
}