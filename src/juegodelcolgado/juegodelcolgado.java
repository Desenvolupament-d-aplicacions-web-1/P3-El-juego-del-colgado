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
        
        // Solicito número de rondas
        System.out.print("¿Cuántas rondas quieren jugar?: ");
        int numRondas = s.nextInt();
        
        // Inicio las rondas
        for (int ronda = 1; ronda <= numRondas; ronda++) {
        System.out.println("\n--- Ronda " + ronda + " ---");
        
        // Pido la palabra secreta
           System.out.print("Administrador, introduce la palabra secreta: ");
           String palabraSecreta = s.nextLine().toLowerCase();
           String palabraOculta = "_".repeat(palabraSecreta.length());
           
        // Ronda activa
           boolean palabraAdivinada = false;
           int[] intentosRestantes = new int[numJugadores];
           for (int i = 0; i < numJugadores; i++) {
               intentosRestantes[i] = 6;
           }
           
           
		
	}

}
