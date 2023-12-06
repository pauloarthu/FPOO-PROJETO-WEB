package OficinaMecanica_Paulo_Arthur;

public class Funcionario {
	private String nome;
	private int horaEntrada;       //horaTrabalho
	private int horaSaida;           //horaTrabalho
	public Funcionario () {
		
	}
	
	
	
	  
	public Funcionario(String nome, int horaEntrada, int horaSaida) {
		super();
		this.nome = nome;
		this.setHoraEntrada(horaEntrada);
		this.setHoraSaida(horaSaida);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getHoraEntrada() {
		return horaEntrada;
	}




	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}




	public int getHoraSaida() {
		return horaSaida;
	}




	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
}
