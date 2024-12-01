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
        
        // Solicito nùmero de jugadores
        String[] jugadores = new String[numJugadores];
        int[] puntajes = new int[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Introduce el nombre del jugador " + (i + 1) + ": ");
            jugadores[i] = s.nextLine();
        }
		
	}

}
