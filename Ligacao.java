package br.com.ufc.model;

import java.util.Date;

public class Ligacao {
	
	private String nomeUsuario;
	private Contato contato;
	private String horaLigacao;
	
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public String getHoraLigacao() {
		return horaLigacao;
	}
	public void setHoraLigacao(String horaLigacao) {
		this.horaLigacao = horaLigacao;
	}
	@Override
	public String toString() {
		return "Ligacao [nomeUsuario=" + nomeUsuario + ", contato=" + contato + ", horaLigacao=" + horaLigacao + "]";
	}
	
	
	

}
