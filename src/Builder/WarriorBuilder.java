package Builder;

public class WarriorBuilder extends PersonajeBuilder{
	
	public WarriorBuilder() {
		super.pj = new Personaje();
	}

	@Override
	public void buildName() {
		pj.setAlias("war");
	}

	@Override
	public void buildNivel() {
		pj.setNivel(1);
	}
}
