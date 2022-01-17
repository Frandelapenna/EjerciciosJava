package Juego;

public class juego extends main{
    jugador [] jugadores;
    revolver revolverUno;
    
    public juego(){
        jugadores = new jugador [numJugadores];
        revolverUno = new revolver();
    }
    
    public void completoJugadores (){
        for (int i=0;i<jugadores.length;i++){
            jugadores[i]=new jugador();
        }
    }
    
    public boolean finJuego(){
        boolean fin=false;
        int aux;
        for (int i=0;i<jugadores.length;i++){
            if (jugadores[i].vivo == false){
                fin = true;
                
            }
        }
        if (fin == true){
            System.out.println("Un jugador ha muerto el juego finaliza");
        }
        return fin;
    }
    
    public void ronda(){
        for (int i=0;i<jugadores.length;i++){
            System.out.println(revolverUno.toString());
            jugadores[i].disparar(revolverUno);
            if (jugadores[i].vivo == false){
                System.out.println("El jugador " + (i+1) + " ha muerto en esta ronda");
            }else{
                System.out.println("El jugador " + (i+1) + " ha sobrevivido esta ronda");
            }
            revolverUno.siguenteBala();           
        }
    }
}
