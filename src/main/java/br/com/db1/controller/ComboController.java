package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ComboController {

	private Uf uf;

	public Uf[] getListaUf() {
		return Uf.values();
		
	}
	
	public Uf getUf() {
		return uf;
	}
	
	

	
}
