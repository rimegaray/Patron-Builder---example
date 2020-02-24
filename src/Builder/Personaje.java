package Builder;

public class Personaje {
	
	private String alias;
	private Integer nivel;
	
	
	public void nextLvl(Integer num) {
		this.nivel = nivel + num;
	}
	
	public void nextLvl() {
		nivel++;
	}
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
}
