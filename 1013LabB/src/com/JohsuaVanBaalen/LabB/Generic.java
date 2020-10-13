package com.JohsuaVanBaalen.LabB;

public class Generic<T extends Number> {
	
	public Generic() {
		
	}
	
	public double add(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}
	
	public double sub(T a, T b) {
		return a.doubleValue() - b.doubleValue();
	}
	
	public double mult(T a, T b) {
		return a.doubleValue() * b.doubleValue();
	}
	
	public double div (T a, T b) {
		if(b.doubleValue() != 0) {
			return a.doubleValue() / b.doubleValue();
		}
		
		System.out.println("Divide by 0 error, returning 0");
		return 0;
	}
}
