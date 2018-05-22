package Modelo;

import java.util.ArrayList;

import Observer.Observer;
import Observer.Subject;

public abstract class SimonModel implements Subject {

	private ArrayList<Integer> secuencia; 
	private ArrayList<Observer> observers;
	
	public SimonModel() {
		// TODO Apéndice de constructor generado automáticamente
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
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void notifyObserver() {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	
}
