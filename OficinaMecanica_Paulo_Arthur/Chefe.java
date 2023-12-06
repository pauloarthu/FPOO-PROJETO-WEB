package OficinaMecanica_Paulo_Arthur;

public class Chefe {
	private String nome;
	private int numeroFun; //numero de funcionarios

	public Chefe() {
		
	}
	public Chefe(String nome, int numeroFun) {
		this.nome = nome;
		this.numeroFun = numeroFun;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroFun() {
		return numeroFun;
	}
	public void setNumeroFun(int numeroFun) {
		this.numeroFun = numeroFun;
	}
}
