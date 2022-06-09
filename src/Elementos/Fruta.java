package Elementos;

import java.util.Random;

public class Fruta {
	Random aleatorio = new Random();
	public int[][] nuevaFruta(int cantidad,int[][] matriz){
		for(int i = 1; i <= cantidad; i++) {
			int x,y;
			do {
				x = aleatorio.nextInt(matriz.length - 2) + 1;
				y = aleatorio.nextInt(matriz[0].length - 2) + 1;
			}while(ocupado(x,y,matriz));
			matriz[x][y] = 2;
		}
		return matriz;
	}
	
	public boolean ocupado(int x, int y, int[][] matriz) {
		if(matriz[x][y] == 1 || matriz[x][y] == 2 || matriz[x][y] == 3) return true;
		return false;
	}
}
