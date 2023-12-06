package OficinaMecanica_Paulo_Arthur;

public class Salario {
	private int vTotal;
	private int vGasto;
	private int vLucro;
	
	public Salario() {
		
	}

	public Salario(int vTotal, int vGasto, int vLucro) {
		this.setvTotal(vTotal);
		this.setvGasto(vGasto);
		this.setvLucro(vLucro);
	}

	public int getvTotal() {
		return vTotal;
	}

	public void setvTotal(int vTotal) {
		this.vTotal = vTotal;
	}

	public int getvGasto() {
		return vGasto;
	}

	public void setvGasto(int vGasto) {
		this.vGasto = vGasto;
	}

	public int getvLucro() {
		return vLucro;
	}

	public void setvLucro(int vLucro) {
		this.vLucro = vLucro;
	}
	
}
