package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MinMaiController {

	private String palavra;
	
	public void palavraMin() {
		palavra = palavra.toLowerCase();
	}
	
	public void palavraMai() {
		palavra = palavra.toUpperCase();
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	
}
