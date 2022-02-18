package com.kep.KepTest.Recursos;

public class metodos {

	
	public static void Wait (int duracion) {
		
		try {
			Thread.sleep(duracion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
