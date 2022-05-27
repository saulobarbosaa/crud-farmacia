package br.com.farmacia.main;

//import java.util.Date;
import java.util.Scanner;


import br.com.farmacia.dao.FarmaciaDAO;
import br.com.farmacia.model.Medicamentos;

public class Main {
	
	public static void insert() {
		
		Medicamentos medicamento = new Medicamentos();
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
		String escolha;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("\n=========================");
		System.out.println("Inserir novo medicamento: ");
		
		System.out.println("Digite o nome do laboratorio: ");
		medicamento.setNome_laboratorio(sc2.nextLine());
		
		System.out.println("Digite o preço do medicamento: ");
		medicamento.setPreco(sc1.nextFloat());
		
		System.out.println("Digite a data de vencimento: ");
		medicamento.setDt_vencimento(sc2.nextLine());
		
		System.out.println("Digite o nome do medicamento: ");
		medicamento.setNome_medicamento(sc3.nextLine());
			
		System.out.println("Digite a quantidade em estoque: ");
		medicamento.setQtd_estoque(sc1.nextInt());

		farmaciaDAO.save(medicamento);
		
		
		System.out.println("\n=========================");
		System.out.println("Listagem de medicamentos: ");
		System.out.println("\nEscolha uma outra opção: ");
		System.out.println("(V) Voltar para o menu principal");
		System.out.println("(E) Exibir medicamento pelo ID");
		System.out.println("(A) Atualizar medicamento");
		System.out.println("(X) Apagar medicamento");
		
		escolha = sc2.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "V": {
			
			menuPrincipal();
			break;
		}
		case "E": {
			readById();
			break;
		}
		case "A": {
			update();
			break;
		}
		case "X": {
			delete();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
		
	}
	
	public static void readById() {
		
		Medicamentos medicamento = new Medicamentos();
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
		int idRead;
		String escolha;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("\n=========================");
		System.out.println("Digite o ID do medicamento que você deseja consultar: ");
		idRead = sc1.nextInt();
		
		farmaciaDAO.getMedicamentoById(idRead);
		
		for(Medicamentos m: farmaciaDAO.getMedicamentoById(idRead)) {		
			System.out.println("Nome do laboratório: " + m.getNome_laboratorio());
			System.out.println("Preço: " + m.getPreco());
			System.out.println("Data de vencimento: " + m.getDt_vencimento());
			System.out.println("Nome do medicamento: " + m.getNome_medicamento());
			System.out.println("Quantidade em estoque: " + m.getQtd_estoque());
		}
		
		System.out.println("\n=========================");
		System.out.println("\nEscolha uma outra opção: ");
		System.out.println("(V) Voltar para o menu principal");
		System.out.println("(I) Inserir novo medicamento");
		System.out.println("(A) Atualizar medicamento");
		System.out.println("(X) Apagar medicamento");
		escolha = sc2.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "V": {
			
			menuPrincipal();
			break;
		}
		case "I": {
			insert();
			break;
		}
		case "A": {
			update();
			break;
		}
		case "X": {
			delete();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
	}
	
	public static void read() {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("\n=========================");
		System.out.println("Listagem de medicamentos: ");
		
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
		String escolha;
		
		System.out.println("ID - Nome");
		for(Medicamentos m : farmaciaDAO.getMedicamentos()) {
			
			System.out.println(m.getId() + " - " + m.getNome_medicamento());
		}
		
		System.out.println("\nEscolha uma outra opção: ");
		System.out.println("(V) Voltar para o menu principal");
		System.out.println("(E) Exibir medicamento pelo ID");
		System.out.println("(A) Atualizar medicamento");
		System.out.println("(X) Apagar medicamento");
		escolha = sc1.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "V": {
			
			menuPrincipal();
			break;
		}
		case "E": {
			readById();
			break;
		}
		case "A": {
			update();
			break;
		}
		case "X": {
			delete();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
		
		
	}
	
	public static void update() {
		
		Medicamentos m2 = new Medicamentos();

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		String escolha;
		
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
		
		System.out.println("\n=========================");
		System.out.println("Atualização de medicamentos: ");
		
		System.out.println("Digite o novo nome do laboratorio: ");
		m2.setNome_laboratorio(sc2.nextLine());
		
		System.out.println("Digite o novo preço do medicamento: ");
		m2.setPreco(sc1.nextFloat());
		
		System.out.println("Digite a nova data de vencimento: ");
		m2.setDt_vencimento(sc2.nextLine());
		
		System.out.println("Digite o novo nome do medicamento: ");
		m2.setNome_medicamento(sc3.nextLine());
			
		System.out.println("Digite a nova quantidade em estoque: ");
		m2.setQtd_estoque(sc1.nextInt());
		
		System.out.println("Digite o ID relacionado ao medicamento que deseja alterar: ");
		m2.setId(sc1.nextInt());
		
		farmaciaDAO.update(m2);
		
		System.out.println("\n=========================");
		
		System.out.println("\nEscolha uma outra opção: ");
		System.out.println("(V) Voltar para o menu principal");
		System.out.println("(E) Exibir medicamento pelo ID");
		System.out.println("(I) Inserir medicamento");
		System.out.println("(X) Apagar medicamento");
		escolha = sc2.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "V": {
			
			menuPrincipal();
			break;
		}
		case "E": {
			readById();
			break;
		}
		case "I": {
			insert();
			break;
		}
		case "X": {
			delete();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
		
	}
	
	public static void delete() {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
		int idDelete;
		String escolha;
		
		System.out.println("\n=========================");
		System.out.println("Excluir medicamento: \n");
		
		System.out.println("Digite o ID do medicamento do qual você deseja excluir: ");
		idDelete = sc1.nextInt();
		
		farmaciaDAO.delete(idDelete);
		
		System.out.println("\n=========================");
		System.out.println("Escolha uma outra opção: ");
		System.out.println("(V) Voltar para o menu principal");
		System.out.println("(E) Exibir medicamento pelo ID");
		System.out.println("(A) Atualizar medicamento");
		System.out.println("(I) Inserir medicamento");
		escolha = sc2.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "V": {
			menuPrincipal();
			break;
		}
		case "E": {
			readById();
			break;
		}
		case "A": {
			update();
			break;
		}
		case "I": {
			insert();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
	}

	public static void menuPrincipal() {
		
		Scanner sc1 = new Scanner(System.in);
		String escolha;
		
		System.out.println("================================");
		System.out.println("Bem-vindo ao sistema de farmácia");
		System.out.println("================================\n");
		
		System.out.println("Escolha uma opção: ");
		System.out.println("(L) Listar todos os medicamentos");
		System.out.println("(I) Inserir novo medicamento");
		escolha = sc1.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "L": {
			
			read();
			break;
		}
		case "I": {
			
			insert();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc2 = new Scanner(System.in);
		String escolha;
		/*Scanner sc1 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		int idDelete;
		int idRead;

		Medicamentos medicamento = new Medicamentos();
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();*/
		
		System.out.println("================================");
		System.out.println("Bem-vindo ao sistema de farmácia");
		System.out.println("================================\n");
		
		System.out.println("Escolha uma opção: ");
		System.out.println("(L) Listar todos os medicamentos");
		System.out.println("(I) Inserir novo medicamento");
		escolha = sc2.nextLine();
		
		switch (escolha.toUpperCase()) {
		case "L": {
			
			read();
			break;
		}
		case "I": {
			
			insert();
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente!");
		}
		sc2.close();
		
	}
	
}
