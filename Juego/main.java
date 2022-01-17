package Juego;
import java.util.*;
public class main {
    public static int numJugadores;
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        //Le pido al usuario que ingrese por teclado el numero de jugadores
        System.out.println("Ingrese el numero de jugadores entre 1 y 6");
        numJugadores = sc.nextInt();
        
        // Me aseguro que el usuario no se pase de 6 jugadores
        if (numJugadores > 6){
            numJugadores = 6;
        }
        
        //Creo el juego
        juego juegoUno;
        
        juegoUno = new juego();
        
        juegoUno.completoJugadores();
        juegoUno.ronda();
        juegoUno.finJuego();
        
    } 
}
