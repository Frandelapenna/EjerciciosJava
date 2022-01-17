package Juego;

public class revolver {
    int posicionActual;
	   int posicionBala;
	   
	   public revolver(){
	       posicionActual= numerosAleatorios.generaNumeroAleatorio(0,6);
	       posicionBala= numerosAleatorios.generaNumeroAleatorio(0,6);
	   }
	   
	   public boolean disparar (){
	       if (posicionActual == posicionBala){
	           return true;
	       }else{
	           return false;
	       }     
	   }
	   
	   public void siguenteBala(){
	       posicionActual++;
	       if (posicionActual >= 7){
	           posicionActual = 1;
	       }
	   }
	   
	   @Override
	   public String toString(){
	       return "La posicion actual es " + posicionActual + ", y la posicion de la bala es " + posicionBala;
	   }
}
