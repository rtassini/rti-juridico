package br.com.rti.juridico.models;

import java.util.Calendar;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Processo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private String resumo;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataEntrada;
	private String forum;
	
	@ElementCollection
	private List<Parte> parte;
	
	
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

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Parte> getParte() {
		return parte;
	}
	public void setParte(List<Parte> parte) {
		this.parte = parte;
	}
	@Override
	public String toString() {
		return "Processo [numero=" + numero + ", resumo=" + resumo + ", forum=" + forum + "]";
	}
	public Calendar getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}
