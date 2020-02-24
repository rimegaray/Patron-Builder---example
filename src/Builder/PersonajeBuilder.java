package Builder;

public abstract class PersonajeBuilder {
	Personaje pj;

	public Personaje getPj() {
		return pj;
	}
	
	public abstract void buildName();
	public abstract void buildNivel();
}
