package main;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Elementos.Barra;
import Elementos.Fruta;
import Elementos.Mapa;
import Elementos.Pacman;
import Elementos.Tablero;

public class Acciones {
	static String[][] top = new String [6][4];
	public void jugar(Scanner sc) throws InterruptedException, IOException {
		Mapa nGame = new Mapa();
		Fruta fruta = new Fruta();
		Pacman pacman = new Pacman();
		
		nGame.setColumnas(41);
		nGame.setFilas(20);
		int[][] mapa = nGame.getMatrizMapa();
		mapa = fruta.nuevaFruta(5, mapa);
		mapa = pacman.ubicarPac(mapa);
		
		String mov;
		String horaInicio = hora();
		
		do {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			Barra.pacmanS();
			System.out.println();
			System.out.print(Tablero.getMapa(mapa, pacman));
			mov = sc.next();
			if(mov.equals("W") || mov.equals("w")) mapa = pacman.up(pacman.getPosX(), pacman.getPosY(), mapa);
			else if(mov.equals("S") || mov.equals("s")) mapa = pacman.down(pacman.getPosX(), pacman.getPosY(), mapa);
			else if(mov.equals("A") || mov.equals("a")) mapa = pacman.left(pacman.getPosX(), pacman.getPosY(), mapa);
			else if(mov.equals("D") || mov.equals("d")) mapa = pacman.right(pacman.getPosX(), pacman.getPosY(), mapa);
			else if(mov.equals("m") || mov.equals("M")) break;
		}while(pacman.getPuntos() < 30);	
		
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		String horaFin = hora();
		
		Barra.pacmanS();
		System.out.println();
		System.out.println(Tablero.getMapa(mapa,pacman).replace("Movimiento: ",""));
		System.out.println();
		System.out.println("  Puntaje total: " + pacman.getPuntos());
		System.out.println("  Movimientos totales: " + pacman.getMovimientos());
		System.out.print("  Ingrese su Nombre: ");
		String nombre = sc.next();
		insertar(nombre,pacman.getPuntos(),pacman.getMovimientos(),horaInicio + " - " + horaFin);
	}
	public void verPuntajes() {
		System.out.println(Tablero.getTableroPuntajes(top));
	}
	
	public void insertar(String nombre, int puntos, int movimientos, String hora) {
		for(int i = top.length - 1; i > 0; i--) {
			String tmp[] = top[i];
			top[i] = top[i - 1];
			top[i - 1] = tmp;
		}
		top[0][0] = nombre;
		top[0][1] = String.valueOf(puntos); 
		top[0][2] = String.valueOf(movimientos); 
		top[0][3] = hora;
	}
	public String hora() {
		String hora = DateTimeFormatter.ofPattern("HH:mm").format(LocalDateTime.now());
		String[] partes = hora.split(":");
		if(Integer.parseInt(partes[0]) >= 12 && Integer.parseInt(partes[1]) >= 0) {
			if(Integer.parseInt(partes[0]) >= 13) {
				if(Integer.parseInt(partes[0]) < 22) {
					return "0" + (Integer.parseInt(partes[0]) - 12) + ":" + partes[1] + " PM";
				}
				return Integer.parseInt(partes[0]) - 12 + ":" + partes[1] + " PM";
			}
			return Integer.parseInt(partes[0]) + ":" + partes[1] + " PM";
		}
		if(Integer.parseInt(partes[0]) < 10) {
			return "0" + Integer.parseInt(partes[0]) + ":" + partes[1] + " AM";
		}
		return partes[0] + ":" + partes[1] + " AM";
	}
}
