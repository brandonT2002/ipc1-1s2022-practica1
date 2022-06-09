package main;

import java.io.IOException;
import java.util.Scanner;

import Elementos.Barra;

public class Menu {
	public static void menuP() throws InterruptedException, IOException {
		ProcessBuilder limpiarC = new ProcessBuilder("cmd","/c","cls");
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 3) {
			try {
				opciones();
				opcion = sc.nextInt();
				Acciones caso = new Acciones();
				switch(opcion) {
					case 1:
						caso.jugar(sc);
						limpiarC.inheritIO().start().waitFor();
						Barra.pacmanS();
						break;
					case 2:
						limpiarC.inheritIO().start().waitFor();
						Barra.pacmanS();
						caso.verPuntajes();
						break;
					case 3:
						System.out.println("  ¡Bien hecho!");
						break;
					default:
						limpiarC.inheritIO().start().waitFor();
						Barra.pacmanS();
						System.out.println("\n  Solo numeros entre 1 y 3");
						break;
				}
			}catch(Exception e) {
				limpiarC.inheritIO().start().waitFor();
				Barra.pacmanS();
				System.out.println("\n  Opcion invalida");
				menuP();
				break;
			}
			
		}
		sc.close();
	}
	
	public static void opciones() {
		System.out.println();
		System.out.println("  ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("  ║                                                                                                                             ║");
		System.out.println("  ║                                                        MENÚ PRINCIPAL                                                       ║");
		System.out.println("  ║                                                1. Iniciar nuevo juego                                                       ║");
		System.out.println("  ║                                                2. Ver últimas 5 puntuaciones                                                ║");
		System.out.println("  ║                                                3. Salir                                                                     ║");
		System.out.println("  ║                                                                                                                             ║");
		System.out.println("  ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
		System.out.print("  Opcion: ");
	}
}