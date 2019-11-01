package br.com.ufc.test;

import java.util.Date;

import br.com.ufc.model.Contato;
import br.com.ufc.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		Contato contato1 = new Contato("Ronaldinho","97756431");
		Contato contato2 = new Contato("Goku", "98765433");
		Contato contato3 = new Contato("Meliodas", "57844443");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Julio");
		usuario.adicionarContato(contato1);
		usuario.adicionarContato(contato2);
		
		
		usuario.fazerLigacao(usuario, contato1, new Date());
		
		System.out.println("Dados dos contatos:");
		usuario.visualizarDadosContatos();
		System.out.println("Ligações Feitas:");
		usuario.visualizarDadosLigacoes();
		
		System.out.println("Contatos buscados:");
		Contato contato = usuario.retonarContatoPorTelefone("97756431");
		System.out.println(contato);

	}

}
