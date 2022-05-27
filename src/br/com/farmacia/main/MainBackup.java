package br.com.farmacia.main;

/* package br.com.farmacia.main;

//import java.util.Date;
import java.util.Scanner;


import br.com.farmacia.dao.FarmaciaDAO;
import br.com.farmacia.model.Medicamentos;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		int idDelete;
		int idRead;
		
		Medicamentos medicamento = new Medicamentos();
		FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
		
		//Registro de dados - CREATE/INSERT
		/*System.out.println("Digite o nome do laboratorio: ");
		medicamento.setNome_laboratorio(sc2.nextLine());
		
		System.out.println("Digite o preço do medicamento: ");
		medicamento.setPreco(sc1.nextFloat());
		
		System.out.println("Digite a data de vencimento: ");
		medicamento.setDt_vencimento(sc2.nextLine());
		
		System.out.println("Digite o nome do medicamento: ");
		medicamento.setNome_medicamento(sc3.nextLine());
			
		System.out.println("Digite a quantidade em estoque: ");
		medicamento.setQtd_estoque(sc1.nextInt());

		farmaciaDAO.save(medicamento);*/
		
		//Visualização de dados - READ/SELECT
		
		/*System.out.println("ID - Nome");
		for(Medicamentos m : farmaciaDAO.getMedicamentos()) {
			
			System.out.println(m.getId() + " - " + m.getNome_medicamento());
		}
		
		//Visualização de dados pelo id - READ/SELECT BY ID
		
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

		//Atualizar dados - UPDATE/SET
		
		/* Medicamentos m2 = new Medicamentos();
		
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
		
		farmaciaDAO.update(m2); */
		
		
		//Deletar dados - DELETE
		
		/*System.out.println("Excluir medicamento: ");
		System.out.println("Digite o ID do medicamento do qual você deseja excluir: ");
		idDelete = sc1.nextInt();
		
		farmaciaDAO.delete(idDelete);	*/
		
// Criar dois bigodes pra completar o escopo da classe 