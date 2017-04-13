package model;

import java.util.ArrayList;

public class Quadrado {
	
	private ArrayList<Integer> lados;
	
	public Quadrado() {
		lados = new ArrayList<>();
	}

	public ArrayList<Integer> getLados() {
		return lados;
	}
	
	public void setLado(Integer lado) {
		for (int i = 0; i < 3; i++) {
			this.lados.add(lado) ;
		}
	}

	
	public int calculaArea() {
		return lados.get(1) * lados.get(2);
	}

	public int calculaPerimetro() {
		return  lados.get(1) * 4;
	}
	


}
