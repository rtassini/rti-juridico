package br.com.rti.juridico.models;

import javax.persistence.Embeddable;

@Embeddable
public class Parte {

	private String nome;
	private TipoParte tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoParte getTipo() {
		return tipo;
	}
	public void setTipo(TipoParte tipoParte) {
		this.tipo = tipoParte;
	}
}
