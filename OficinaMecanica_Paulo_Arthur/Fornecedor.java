package OficinaMecanica_Paulo_Arthur;

public class Fornecedor {
	private String nome;
	private String produto;
	private int preco;
	
	public Fornecedor() {
		
	}

	public Fornecedor(String nome, String produto, int preco) {
		this.setNome(nome);
		this.setProduto(produto);
		this.setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}
