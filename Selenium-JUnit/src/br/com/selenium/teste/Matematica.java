package br.com.selenium.teste;

public class Matematica {

	public double Raiz(int valor){
		
		return Math.sqrt(valor);
		
	}
	
	public int Divide(int valor, int valor2){
		return valor / valor2;
	}
	
	public int Maior (int valor, int valor2){
		
		if (valor > valor2) {
			return valor;
		}else{
			return valor2;			
		}		
	}
}
