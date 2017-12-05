package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class livroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando livro "+ this.livro.getTitulo());
	}

}
