package Builder;

public class Cuenta {
	PersonajeBuilder builder;
	
	public Cuenta setBuilder(PersonajeBuilder builder) {
		this.builder = builder;
		return this;
	}
	public Personaje getPersonaje() {
		return builder.getPj();
	}
	
	public Personaje crearPersonaje() {
		builder.buildName();
		builder.buildNivel();
		return getPersonaje();
	}
}
