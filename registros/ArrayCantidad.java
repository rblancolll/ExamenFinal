
package registros;


public class ArrayCantidad {
   private String[] vectorTransacciones;  
    private int indiceVector;
    private String [] Cantidaddemunicipios6;
    private String [] Cantidaddemunicipios7;
    private String [] Cantidaddemunicipios8;
    private String [] Cantidaddemunicipios9;
    private String [] Cantidaddemunicipios10;
    private String [] Cantidaddemunicipios11;
    private String [] Cantidaddemunicipios12;
    private String [] Cantidaddemunicipios13;
    private String [] Cantidaddemunicipios14;
    private String [] Cantidaddemunicipios15;


public ArrayCantidad()
 {
    
    Cantidaddemunicipios6 =new String[100];
    Cantidaddemunicipios7 =new String[100];
    Cantidaddemunicipios8 =new String[100];
    Cantidaddemunicipios9 =new String[100];
    Cantidaddemunicipios10 =new String[100];
    Cantidaddemunicipios11 =new String[100];
    Cantidaddemunicipios12 =new String[100];
    Cantidaddemunicipios13 =new String[100];
    Cantidaddemunicipios14 =new String[100];
    Cantidaddemunicipios15 =new String[100];
    vectorTransacciones= new String[100];
    this.indiceVector=0;
 }

 public void registrarCantidaddemunicipios6(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios6[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios6(String Cantidaddemunicipios6){
      this.registrarCantidaddemunicipios6(Cantidaddemunicipios6);
      
      }
 
  public void registrarCantidaddemunicipios7(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios7[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios7(String Cantidaddemunicipios7){
      this.registrarCantidaddemunicipios7(Cantidaddemunicipios7);
      
      }
 
 public void registrarCantidaddemunicipios8(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios8[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios8(String Cantidaddemunicipios8){
      this.registrarCantidaddemunicipios8(Cantidaddemunicipios8);
      
      }
 
  public void registrarCantidaddemunicipios9(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios9[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios9(String Cantidaddemunicipios9){
      this.registrarCantidaddemunicipios9(Cantidaddemunicipios9);
      
      }
 
 public void registrarCantidaddemunicipios10(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios10[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios10(String Cantidaddemunicipios10){
      this.registrarCantidaddemunicipios10(Cantidaddemunicipios10);
      
      }


 public void registrarCantidaddemunicipios11(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios11[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios11(String Cantidaddemunicipios11){
      this.registrarCantidaddemunicipios11(Cantidaddemunicipios11);
      
      }
 
  public void registrarCantidaddemunicipios12(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios12[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios12(String Cantidaddemunicipios12){
      this.registrarCantidaddemunicipios12(Cantidaddemunicipios12);
      
      }
 
 public void registrarCantidaddemunicipios13(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios13[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios13(String Cantidaddemunicipios13){
      this.registrarCantidaddemunicipios13(Cantidaddemunicipios13);
      
      }
 
  public void registrarCantidaddemunicipios14(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios14[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios14(String Cantidaddemunicipios14){
      this.registrarCantidaddemunicipios14(Cantidaddemunicipios14);
      
      }
 
 public void registrarCantidaddemunicipios15(String tipo ){
        indiceVector= indiceVector+1;
               Cantidaddemunicipios15[indiceVector]= " Municipio = ┃"+ tipo +"┃ ";
       
    }
 
 public void Cantidaddemunicipios15(String Cantidaddemunicipios15){
      this.registrarCantidaddemunicipios15(Cantidaddemunicipios15);
      
      }

 
 public void mostrarCantidaddemunicipios6(){
      
            for (int i=1; i<Cantidaddemunicipios6.length;i++){
                if(Cantidaddemunicipios6[i] != null){
               
                    System.out.println(Cantidaddemunicipios6[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios6){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios7(){
      
            for (int i=1; i<Cantidaddemunicipios7.length;i++){
                if(Cantidaddemunicipios7[i] != null){
               
                    System.out.println(Cantidaddemunicipios7[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios7){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios8(){
      
            for (int i=1; i<Cantidaddemunicipios8.length;i++){
                if(Cantidaddemunicipios8[i] != null){
               
                    System.out.println(Cantidaddemunicipios8[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios8){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios9(){
      
            for (int i=1; i<Cantidaddemunicipios9.length;i++){
                if(Cantidaddemunicipios9[i] != null){
               
                    System.out.println(Cantidaddemunicipios9[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios9){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios10(){
      
            for (int i=1; i<Cantidaddemunicipios10.length;i++){
                if(Cantidaddemunicipios10[i] != null){
               
                    System.out.println(Cantidaddemunicipios10[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios10){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios11(){
      
            for (int i=1; i<Cantidaddemunicipios11.length;i++){
                if(Cantidaddemunicipios11[i] != null){
               
                    System.out.println(Cantidaddemunicipios11[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios11){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios12(){
      
            for (int i=1; i<Cantidaddemunicipios12.length;i++){
                if(Cantidaddemunicipios12[i] != null){
               
                    System.out.println(Cantidaddemunicipios12[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios12){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios13(){
      
            for (int i=1; i<Cantidaddemunicipios13.length;i++){
                if(Cantidaddemunicipios13[i] != null){
               
                    System.out.println(Cantidaddemunicipios13[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios13){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios14(){
      
            for (int i=1; i<Cantidaddemunicipios14.length;i++){
                if(Cantidaddemunicipios14[i] != null){
               
                    System.out.println(Cantidaddemunicipios14[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios14){
                if(transaccion != null){
                   
                }   
            } 
        }

public void mostrarCantidaddemunicipios15(){
      
            for (int i=1; i<Cantidaddemunicipios15.length;i++){
                if(Cantidaddemunicipios15[i] != null){
               
                    System.out.println(Cantidaddemunicipios15[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : Cantidaddemunicipios15){
                if(transaccion != null){
                   
                }   
            } 
        }

}

