package OficinaMecanica_Paulo_Arthur;

public class Carro {
	private String modelo;
	private int ano;
	private String trocar;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int ano, String trocar) {
		this.modelo = modelo;
		this.ano = ano;
		this.trocar = trocar;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTrocar() {
		return trocar;
	}

	public void setTrocar(String trocar) {
		this.trocar = trocar;
	}
}
