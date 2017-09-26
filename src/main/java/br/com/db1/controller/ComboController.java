package br.com.db1.controller;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ComboController {

	private String estado;  
    private static Set<String> estadosDoSul = new HashSet<String>();
    static{
    estadosDoSul.add("PR");
    estadosDoSul.add("SC");
    estadosDoSul.add("RS");
    }
    
    
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Set<String> getEstados() {
		return estadosDoSul;
	}
	public void setEstados(Set<String> estados) {
		ComboController.estadosDoSul = estados;
	}

	
	
	
	

	
	
}
