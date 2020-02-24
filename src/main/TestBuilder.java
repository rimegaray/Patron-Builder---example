package main;

import Builder.Cuenta;
import Builder.Personaje;
import Builder.PriestBuilder;
import Builder.WarriorBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		
		Personaje pjWar = cuenta1.setBuilder(new WarriorBuilder())
								.crearPersonaje();
		System.out.println(pjWar.getAlias());
		pjWar.nextLvl(20);
		System.out.println(pjWar.getNivel());
		
		Personaje pjPriest = cuenta1.setBuilder(new PriestBuilder())
								.crearPersonaje();
		System.out.println(pjPriest.getAlias());
		
		Cuenta cuenta2 = new Cuenta();
		cuenta2.setBuilder(new WarriorBuilder()).crearPersonaje();
	}

}
