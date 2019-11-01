package br.com.ufc.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String cpf;
	private List<Contato> contatos = new ArrayList<Contato>();
	private List<Ligacao> ligacoes = new ArrayList<Ligacao>();
	
	public Usuario() {}
	
	public Usuario(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}



	public void fazerLigacao(Usuario usuario,
			Contato contato, Date date) {
		
		Ligacao ligacao = new Ligacao();
		ligacao.setNomeUsuario(usuario.getNome());
		ligacao.setContato(contato);
		ligacao.setHoraLigacao(retornarHoraDataAtual(date)); //estou setando a string
		
		ligacoes.add(ligacao); //adiciono essa ligacao na lista de ligacoes
	}
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}
	
	public void removerContato(Contato contato) {
		contatos.remove(contato);
	}
	
	public Contato retonarContatoPorTelefone(String telefone) {
		for (int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getTelefone().equals(telefone)) {
				return contatos.get(i); // se achou retorna o contato
			}
			
		}
		
		return null; // senao achou retorna nulo
	}
	
	public void visualizarDadosContatos() {
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}
	}
	
	
	public void visualizarDadosLigacoes() {
		for (int i = 0; i < ligacoes.size(); i++) {
			System.out.println(ligacoes.get(i));
		}
	}
	
	// método privado onde eu uso esse método nessa mesma classe
	//método privado existe quando eu quero usar somente dentro da classe
	//exemplo lá em cima quando eu uso esse método pra setar a data e hora atual da ligação
	private String retornarHoraDataAtual(Date date) { 
						
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		  return dateFormat.format(date);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public List<Contato> getContatos() {
		return contatos;
	}


	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}


	public List<Ligacao> getLigacoes() {
		return ligacoes;
	}


	public void setLigacoes(List<Ligacao> ligacoes) {
		this.ligacoes = ligacoes;
	}
	
	
	
	
}
