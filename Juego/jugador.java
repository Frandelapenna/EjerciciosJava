package Juego;

public class jugador {
    static int actualizaId = 0;
	    int id;
	    String nombre;
	    boolean vivo;
	    
	    public jugador (){
	        id = actualizaId++;
	        nombre = "Jugador " + actualizaId;
	        vivo = true;
	    }
	    
	    public void disparar (revolver r){
	        if (r.disparar() == true){
	            vivo=false;
	        }
	    }
    
}
