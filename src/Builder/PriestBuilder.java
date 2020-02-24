package Builder;

public class PriestBuilder extends PersonajeBuilder {
	public PriestBuilder() {
		super.pj = new Personaje();
	}

	@Override
	public void buildName() {
		pj.setAlias("sacer");
	}

	@Override
	public void buildNivel() {
		pj.setNivel(1);
	}
}
