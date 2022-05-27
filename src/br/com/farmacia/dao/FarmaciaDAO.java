package br.com.farmacia.dao;

import java.sql.Connection;
//import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.farmacia.factory.ConnectionFactory;
import br.com.farmacia.model.Medicamentos;

public class FarmaciaDAO {
	
	public void save (Medicamentos medicamento) {
		String sql = "INSERT INTO medicamento(nome_laboratorio, preco, dt_vencimento, nome_medicamento, qtd_estoque) VALUES (?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//chama o método do outro package e tenta criar a conexao com o bdd
			conn = ConnectionFactory.createConnToSQL();
			
			//Passa os valores que serão inseridos na table sql
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, medicamento.getNome_laboratorio());
			pstm.setFloat(2, medicamento.getPreco());
			pstm.setString(3,  medicamento.getDt_vencimento());
			pstm.setString(4, medicamento.getNome_medicamento());
			pstm.setInt(5, medicamento.getQtd_estoque());
			
			pstm.execute();
			System.out.println("Registro efetuado com sucesso!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public List<Medicamentos> getMedicamentos() {
		String sql = "SELECT * FROM medicamento";
		
		List<Medicamentos> medicamentos = new ArrayList<Medicamentos>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//recupera os valores do banco
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnToSQL();	
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Medicamentos medicamento = new Medicamentos();
			
				medicamento.setId(rset.getInt("id"));
				medicamento.setNome_laboratorio(rset.getString("nome_laboratorio"));
				medicamento.setPreco(rset.getFloat("preco"));
				medicamento.setDt_vencimento(rset.getString("dt_vencimento"));
				medicamento.setNome_medicamento(rset.getString("nome_medicamento"));
				medicamento.setQtd_estoque(rset.getInt("qtd_estoque"));
				
				medicamentos.add(medicamento);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rset != null) {
					rset.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return medicamentos;
	}


	public void update(Medicamentos medicamento) {
		
		String sql = "UPDATE medicamento SET nome_laboratorio = ?, preco = ?, dt_vencimento = ?, nome_medicamento = ?, qtd_estoque = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//conexao
			conn = ConnectionFactory.createConnToSQL();
			
			pstm = conn.prepareStatement(sql);
			
			//variaveis que serão alteradas
			pstm.setString(1, medicamento.getNome_laboratorio());
			pstm.setFloat(2, medicamento.getPreco());
			pstm.setString(3, medicamento.getDt_vencimento());
			pstm.setString(4, medicamento.getNome_medicamento());
			pstm.setInt(5, medicamento.getQtd_estoque());
			
			//o id do medicamento que será alterado
			pstm.setInt(6, medicamento.getId());
			
			pstm.execute();
			System.out.println("Atualização feita com sucesso");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro na atualização");
		}finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(int id) {
		
		String sql = "DELETE FROM medicamento WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnToSQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			System.out.println("Exclusão efetuada com sucesso! ");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro no SQL");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro geral");
			}
		}
		
	}
	
	public List<Medicamentos> getMedicamentoById (int id) {
		
		String sql = "SELECT * FROM medicamento WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		List<Medicamentos> medicamentos = new ArrayList<Medicamentos>();
		
		try {
			
			conn = ConnectionFactory.createConnToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();
				
			
			while (rset.next()) {
				Medicamentos m1 = new Medicamentos();	
				
				m1.setNome_laboratorio(rset.getString("nome_laboratorio"));
				m1.setPreco(rset.getFloat("preco"));
				m1.setDt_vencimento(rset.getString("dt_vencimento"));
				m1.setNome_medicamento(rset.getString("nome_medicamento"));
				m1.setQtd_estoque(rset.getInt("qtd_estoque"));
				
				medicamentos.add(m1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rset != null) {
					rset.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return medicamentos;

	}
}

