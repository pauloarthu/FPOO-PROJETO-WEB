package OficinaMecanica_Paulo_Arthur;

import java.util.List;

public class PecaDisponivel {
	private List<Funcionario> peca;
	
	public PecaDisponivel() {
		
	}

	public List<Funcionario> getPeca() {
		return peca;
	}

	public void setPeca(List<Funcionario> peca) {
		this.peca = peca;
	}

	public PecaDisponivel(List<Funcionario> peca) {
		this.peca = peca;
	}
	
}
