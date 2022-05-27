package br.com.farmacia.model;

import java.util.Date;

public class Medicamentos {

	//Declaração das variáveis
	private int id;
	private String nome_laboratorio;
	private float preco;
	private String dt_vencimento;
	private String nome_medicamento;
	private int qtd_estoque;
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_laboratorio() {
		return nome_laboratorio;
	}
	public void setNome_laboratorio(String nome_laboratorio) {
		this.nome_laboratorio = nome_laboratorio;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDt_vencimento() {
		return dt_vencimento;
	}
	public void setDt_vencimento(String dt_vencimento) {
		this.dt_vencimento = dt_vencimento;
	}
	public String getNome_medicamento() {
		return nome_medicamento;
	}
	public void setNome_medicamento(String nome_medicamento) {
		this.nome_medicamento = nome_medicamento;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	
}
