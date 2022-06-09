package Elementos;

public class Tablero {
	public static String getMapa(int[][] matriz, Pacman pacman) {
		String tablero = "";
		String pots = "Puntos: " + pacman.getPuntos();
		String movs = "Movimientos: " + pacman.getMovimientos();
		String sp1 ="", sp2 = "";
		for(int i = 1; i <= 18 - pots.length(); i++) sp1 += " ";
		for(int i = 1; i <= 18 - movs.length(); i++) sp2 += " ";
		for(int i = 0; i < matriz.length; i++) {
			tablero += "  ";
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 0) tablero += " · ";
				else if(matriz[i][j] == 1 && j == 0 || j == matriz[i].length - 1) tablero += "▒▒";
				else if(matriz[i][j] == 1) tablero += "▒▒▒";
				else if(matriz[i][j] == 2) tablero += " ■ ";
				else if(matriz[i][j] == 3) tablero += " C ";
			}
			if(i == 2) tablero +=  "  ╔═══════════════════╗";
			else if(i == 3) tablero +=  "  ║     Controles     ║";
			else if(i == 4) tablero +=  "  ╚═══════════════════╝";
			else if(i == 5) tablero +=  "          ╔═══╗        ";
			else if(i == 6) tablero +=  "          ║ W ║        ";
			else if(i == 7) tablero +=  "          ╚═══╝        ";
			else if(i == 9) tablero +=  "  ╔═══╗   ╔═══╗   ╔═══╗";
			else if(i == 10) tablero += "  ║ A ║   ║ S ║   ║ D ║";
			else if(i == 11) tablero += "  ╚═══╝   ╚═══╝   ╚═══╝";  
			else if(i == 13) tablero += "  ╔═══════════════════╗";
			else if(i == 14) tablero += "  ║       Juego       ║";
			else if(i == 15) tablero += "  ╠═══════════════════╣";
			else if(i == 16) tablero += "  ║ " + pots + sp1 + "║";
			else if(i == 17) tablero += "  ║ " + movs + sp2 + "║";
			else if(i == 18) tablero += "  ║ Última Fruta: "+pacman.getUltFr() + "   ║";
			else if(i == 19) tablero += "  ╚═══════════════════╝";
			else if(i == matriz.length - 1) tablero += "  Movimiento: ";
			
			if(i < matriz.length - 1) tablero += "\n";
		}
		
		return tablero;
	}
	
	public static String getTableroPuntajes(String[][] top) {
		String puntos = "\n";
		try {
			int cant = 0;
			if(top[0][0] == null) cant = 5;
			for(int i = 0; i < top.length; i++) {
				if(top[i][0] != null) cant++;
			}
			int[] aux = new int[cant];
			for(int j = 0; j < aux.length; j++) {
				aux[j] = top[j][0].length();
			}
			int mayor = getMayor(aux);
			String sp1 = "";
			String br1 = "";
			if(mayor < 6) mayor = 6;
			for(int i = 1; i <= mayor - 6; i++) {
				sp1 += " ";
				br1 += "═";
			}
			puntos += "  ╔════╦═══════" + br1 + "═╦════════╦═════════════╦═════════════════════╗\n";
			puntos += "  ║ No ║ Nombre" + sp1 + " ║ Punteo ║ Movimientos ║   Marca de Tiempo   ║\n";
			puntos += "  ╠════╬═══════" + br1 + "═╬════════╬═════════════╬═════════════════════╣\n";
			
			for(int i = 0; i < 5; i++) {
				String nom = "";
				String pts = "  ";
				String mov = "   ";
				String hrs = "                   ";
				if(top[i][0] != null) {
					nom = top[i][0];
					pts = top[i][1];
					mov = top[i][2];
					hrs = top[i][3];
				}
				sp1 = "";
				for(int x = 1; x <= mayor - nom.length(); x++) {
					sp1 += " ";
				}
				puntos += "  ║ " + (i + 1) + "  ║ " + nom + sp1 + " ║   " + pts;
				sp1 = "";
				for(int x = 1; x <= 4 - pts.length(); x++) {
					sp1 += " ";
				}
				puntos +=  sp1+ " ║     " + mov;
				sp1 = "";
				for(int x = 1; x <= 7 - mov.length(); x++) {
					sp1 += " ";
				}
				puntos += sp1 + " ║ " + hrs + " ║\n";
			}
			sp1 = "";
			for(int i = 1; i <= mayor; i++) {
				sp1 += "═";
			}
			puntos += "  ╚════╩═" + sp1 + "═╩════════╩═════════════╩═════════════════════╝";
		}catch(Exception e) {
			puntos += "  ╔════╦════════╦════════╦═════════════╦═════════════════════╗\n";
			puntos += "  ║ No ║ Nombre ║ Punteo ║ Movimientos ║   Marca de Tiempo   ║\n";
			puntos += "  ╠════╬════════╬════════╬═════════════╬═════════════════════╣\n";
			puntos += "  ║ 1  ║        ║        ║             ║                     ║\n";
			puntos += "  ║ 2  ║        ║        ║             ║                     ║\n";
			puntos += "  ║ 3  ║        ║        ║             ║                     ║\n";
			puntos += "  ║ 4  ║        ║        ║             ║                     ║\n";
			puntos += "  ║ 5  ║        ║        ║             ║                     ║\n";
			puntos += "  ╚════╩════════╩════════╩═════════════╩═════════════════════╝";
		}
		return puntos;
	}
	public static int getMayor(int[] dim) {
		for(int i = 0; i < dim.length - 1; i++) {
			for(int x = 0; x < dim.length - i - 1; x++) {
				if(dim[x] < dim[x + 1]) {
					int aux = dim[x];
					dim[x] = dim[x + 1];
					dim[x + 1] = aux;
				}
			}
		}
		return dim[0];
	}
}
