package Elementos;

import java.util.Random;

public class Mapa {
	Random aleatorio = new Random();
	private int filas;
	private int columnas;
	public Mapa() {
		setFilas(15);
		setColumnas(40);
	}
	public Mapa(int filas, int columnas) {
		setFilas(filas);
		setColumnas(columnas);
	}
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public int [][] getMatrizMapa(){
		int [][] matrizM = new int [getFilas() + 2][getColumnas() + 2];
		for(int i = 0; i < matrizM.length; i++) {
			matrizM[i][0] = 1;
			matrizM[i][matrizM[i].length - 1] = 1;
		}
		for(int j = 0; j < matrizM[0].length; j++) {
			matrizM[0][j] = 1;
			matrizM[matrizM.length - 1][j] = 1;
		}
		for(int i = 2; i < matrizM.length - 2;) {
			int paso;
			for(int j = 2; j < matrizM[i].length - 2;) {
				matrizM[i][j] = aleatorio.nextInt(100);
				if(matrizM[i][j] < 60) matrizM[i][j] = 0;
				else matrizM[i][j] = 1;
				paso = aleatorio.nextInt(2) + 1;
				j += paso;
			}
			paso = aleatorio.nextInt(2) + 1;
			i += paso;
		}
		return matrizM;
	}
}
