package main;

import Elementos.Barra;

public class mainPacman {

	public static void main(String[] args) {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			Barra.pacman();
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			Barra.pacmanS();
			Menu.menuP();
		}catch(Exception e) {
			
		}
	}
}