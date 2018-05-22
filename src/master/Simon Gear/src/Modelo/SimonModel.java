package Modelo;

import java.util.ArrayList;

import Observer.Observer;
import Observer.Subject;

public abstract class SimonModel implements Subject {

	private ArrayList<Integer> secuencia; 
	private ArrayList<Observer> observers;
	
	public SimonModel() {
		// TODO Ap�ndice de constructor generado autom�ticamente
	}
	
	private ArrayList<Integer> generarSecuencia(){
		
		return null;
	}
	
	public void nuevaSecuencia(){
		
	}
	
	public void esDeLaSecuencia(int index, int boton){
		
	}
	
	public int nextValor(int index){
		
		return 0;
		
	}
	
	public abstract void jugar(int boton);

	@Override
	public void registerObserver(Observer o) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void notifyObserver() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}
	
	
}
