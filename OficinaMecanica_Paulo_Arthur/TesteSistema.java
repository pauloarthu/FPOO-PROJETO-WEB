package OficinaMecanica_Paulo_Arthur;

import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		java.util.List<String> lista1 = new java.util.ArrayList<String>();
		lista1.add("tinta, martelo, removedor, chave de fenda");
		java.util.List<String> lista2 = new java.util.ArrayList<String>();
		lista2.add("fio, alicate, arame");
		java.util.List<String> lista3 = new java.util.ArrayList<String>();
		lista3.add("pistão, parafuso, chave, cola");
		int opicao;
		String text;
		do {
		System.out.println("faça o login: ");
		text = s.next();
		switch (text) {
		case "chefe":
			do {
			System.out.println("carregando...." + "\nlogou na conta do chefe" + "\n1 - fornecedor" + "\n2 - salario" + "\n3 - numero de funcionarios");
			opicao = s.nextInt();
			switch (opicao) {
			case 1:
				Fornecedor fo1 = new Fornecedor("Shopify", "pecas automotivas", 70000);
				System.out.println("\nnome: " + fo1.getNome() + "\nproduto: " + fo1.getProduto() + "\npreço: " + fo1.getPreco() + "\n9 - voltar");
				opicao = s.nextInt();
				break;

			case 2:
				Salario sa1 = new Salario(300000, 230000, 30000);
				System.out.println("nesse mes o valor de ganho total é de: " + sa1.getvTotal() + "\nO que tera que tera de dispesas é de: " + sa1.getvGasto() + "\nO locro desse mes é de: " + sa1.getvLucro() + "\n9 - voltar");
				opicao = s.nextInt();
				break;
				
			case 3: 
				System.out.println("atualmente possui 3 funcionarios" + "\n9 - voltar");	
				opicao = s.nextInt();
				break;
				
			default:
				break;
			
			}
		} while (opicao == 9);
			
			break;
			
		case "funcionario1":
			do {
			Funcionario fun1 = new Funcionario("Funcionario1", 7, 17);
			System.out.println("carregando...." + "\nlogou na conta funcionario1.");
			System.out.println("seu horario de entrada é: " + fun1.getHoraEntrada() + "\ne de saida é: " + fun1.getHoraSaida());
			System.out.println("1 - Carro" + "\n2 - peças disponíveis");
			opicao = s.nextInt();
			switch (opicao) {
			case 1:
				Carro c1 = new Carro("Lancer", 2009, "arrumar o amassado do Lancer na parte traseira e fazer a pintura da porta direita");
				System.out.println("nome do carro: " + c1.getModelo() + "\nano do carro: " + c1.getAno() + "\nO que fazer: " + c1.getTrocar() + "\n9 - voltar");
				opicao = s.nextInt();
				break;
				
			case 2:
				for (String olho : lista1) {
					System.out.println(olho + "\n9 - voltar");
				}
				
				opicao = s.nextInt();	
				break;
				
			default:
				break;
			} 
		} while (opicao == 9);
			break;
			
		case "funcionario2":
			do {
				Funcionario fun2 = new Funcionario("Funcionario2", 7, 17);
				System.out.println("carregando...." + "\nlogou na conta funcionario2");
				System.out.println("seu horario de entrada é: " + fun2.getHoraEntrada() + "\ne de saida é: " + fun2.getHoraSaida());
				System.out.println("1 - carro" + "\n2 - peça disponível");
				opicao = s.nextInt();
				switch (opicao) {
				case 1:
					Carro c2 = new Carro("civic", 2017, "arrumar a parte eletrica dos farois traseiros");
					System.out.println("nome do carro: " + c2.getModelo() + "\nano do carro: " + c2.getAno() + "\nO que fazer: " + c2.getTrocar() + "\n9 - voltar");
					opicao = s.nextInt();
					break;
				case 2: 	
					for (String olho : lista2) {
						System.out.println(olho + "\n9 - voltar");
					}
					opicao = s.nextInt();				
					break;
				default:
					break;
				}
			} while (opicao == 9);
			break;
			
		case "funcionario3":
			do {
			Funcionario fun3 = new Funcionario("Funcionario3", 7, 17);
			System.out.println("carregando...." + "\nlogou na conta funcionario3");
			System.out.println("seu horario de entrada é: " + fun3.getHoraEntrada() + "\ne de saida é: " + fun3.getHoraSaida());
			System.out.println("1 - carro" + "\n2 - peça disponível");
			opicao = s.nextInt();
			switch (opicao) {
			case 1:
				Carro c3 = new Carro("corola", 2015, "fazer a troca do carburador");
				System.out.println("nome do carro: " + c3.getModelo() + "\nano do carro: " + c3.getAno() + "\nO que fazer: " + c3.getTrocar() + "\n9 - voltar");
				opicao = s.nextInt();
				break;
				
			case 2:
				for (String olho : lista3) {
					System.out.println(olho + "\n9 - voltar");
				}
				opicao = s.nextInt();
				break;

			default:
				break;
			}
		} while (opicao == 9);

			break;
			
		default:
			break;
		}

			System.err.println("erro");	
		} while (text == null);
		
	}

}
