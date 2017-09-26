package br.com.db1.controller;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ComboController {

	private String estado;  
    private static Set<String> estados = new HashSet<String>();
    
    static{
    estados.add("PR");
    estados.add("SC");
    estados.add("RS");
    }
    
    
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Set<String> getEstados() {
		return estados;
	}
	public void setEstados(Set<String> estados) {
		ComboController.estados = estados;
	}

	
}
