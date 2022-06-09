package Elementos;

import java.util.Random;

public class Pacman {
	Random aleatorio = new Random();
	private int posX; 
	private int posY;
	private int puntos;
	private int movimientos;
	private int ultFr;
	
	public Pacman() {
		setPuntos(0);
		setMovimientos(0);
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(int movimientos) {
		this.movimientos = movimientos;
	}
	public int getUltFr() {
		return ultFr;
	}
	public void setUltFr(int ultFr) {
		this.ultFr = ultFr;
	}

	public int[][] ubicarPac(int[][] matriz){
		int x,y;
		do {
			x = aleatorio.nextInt(matriz[0].length - 2) + 1;
			y = aleatorio.nextInt(matriz.length - 2) + 1;
		}while(ocupado(x,y,matriz));
		matriz[y][x] = 3;
		setPosX(x);
		setPosY(y);
		return matriz;
	}
	
	public boolean ocupado(int x, int y, int[][] matriz) {
		if(matriz[y][x] == 1 || matriz[y][x] == 2) return true;
		return false;
	}
	
	public int[][] up(int x,int y,int[][] matriz){
		if(matriz[y - 1][x] == 2) {
			int p = getPuntos();
			int nAl = aleatorio.nextInt(5) + 1;
			p += nAl;
			setPuntos(p);
			setUltFr(nAl);
			matriz = new Fruta().nuevaFruta(1, matriz);
		}
		int m = getMovimientos();
		if(matriz[y - 1][x] != 1) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[y - 1][x] = 3;
			setPosY(y - 1);
		}
		else if(y == 1) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[matriz.length - 2][x] = 3;
			setPosY(matriz.length - 2);
		}
		return matriz;
	}
	
	public int[][] down(int x,int y,int[][] matriz){
		if(matriz[y + 1][x] == 2) {
			int p = getPuntos();
			int nAl = aleatorio.nextInt(5) + 1;
			p += nAl;
			setPuntos(p);
			setUltFr(nAl);
			matriz = new Fruta().nuevaFruta(1, matriz);
		}
		int m = getMovimientos();
		if(matriz[y + 1][x] != 1) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[y + 1][x] = 3;
			setPosY(y + 1);
		}
		else if(y == matriz.length - 2) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[1][x] = 3;
			setPosY(1);
		}
		return matriz;
	}

	public int[][] left(int x,int y,int[][] matriz){
		if(matriz[y][x - 1] == 2) {
			int p = getPuntos();
			int nAl = aleatorio.nextInt(5) + 1;
			p += nAl;
			setPuntos(p);
			setUltFr(nAl);
			matriz = new Fruta().nuevaFruta(1, matriz);
		}
		int m = getMovimientos();
		if(matriz[y][x - 1] != 1) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[y][x - 1] = 3;
			setPosX(x - 1);
		}
		else if(x == 1) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[y][matriz[0].length - 2] = 3;
			setPosX(matriz[0].length - 2);
		}
		return matriz;
	}

	public int[][] right(int x,int y,int[][] matriz){
		if(matriz[y][x + 1] == 2) {
			int p = getPuntos();
			int nAl = aleatorio.nextInt(5) + 1;
			p += nAl;
			setPuntos(p);
			setUltFr(nAl);
			matriz = new Fruta().nuevaFruta(1, matriz);
		}
		int m = getMovimientos();
		if(matriz[y][x + 1] != 1) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[y][x + 1] = 3;
			setPosX(x + 1);
		}
		else if(x == matriz[0].length - 2) {
			m ++ ; 
			setMovimientos(m);
			matriz[y][x] = 0;
			matriz[y][1] = 3;
			setPosX(1);
		}
		return matriz;
	}
}
