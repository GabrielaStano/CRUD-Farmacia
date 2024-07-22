package com.generation.farmacia.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/* criação da tabela produtos 
atributos: 
id - long, bigint
nome String VARCHAR (255)
descricao String VARCHAR (500)
preco Double
quantidade Integer
data LocalDateTime DATETIME(6)
*/

@Entity
@Table(name="tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do produto é obrigatório!")
	private String nome;
	
	@NotBlank(message = "A descrição do prouto é obrigatória!")
	@Size(min=10, max=500, message = "A descrição deve ter no mínimo 10 e no máximo 500 caracteres!")
	private String descricao;
	
	@NotNull(message = "Insira um valor para o produto!")
	private Double preco;
	
	@NotNull(message = "Insira uma quantidade para o produto!")
	@Min(value=0, message = "A quantidade não pode ser negátiva!")
	private Integer quantidade;
	
	@UpdateTimestamp
	private LocalDateTime data;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDateTime getData() {
		return this.data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
