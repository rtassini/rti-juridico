package br.com.rti.juridico.models;

public class Processo {

	String numero;
	String resumo;
	String forum;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getForum() {
		return forum;
	}
	public void setForum(String forum) {
		this.forum = forum;
	}

	@Override
	public String toString() {
		return "Processo [numero=" + numero + ", resumo=" + resumo + ", forum=" + forum + "]";
	}
}
