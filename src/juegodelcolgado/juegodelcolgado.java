package juegodelcolgado;

import java.util.Scanner;

public class juegodelcolgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creo el scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("¡Bienvenidos al juego del Colgado!");
		
		// Pido cuantos jugadores quieren jugar
		System.out.print("¿Cuántos jugadores quieren jugar? (mínimo 2): ");
        int numJugadores = s.nextInt();
        
        if (numJugadores < 2) {
            System.out.println("Debe haber al menos 2 jugadores para jugar.");
            return;
        }
		
	}

}
