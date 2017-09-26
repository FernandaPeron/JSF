package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatadorController {

	private Integer valor;
	private String valorFormatado;
	
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getValorFormatado() {
		return valorFormatado;
	}

	public void setValorFormatado(String valorFormatado) {
		this.valorFormatado = valorFormatado;
	}
	
	public void formatar() {
		valorFormatado = "R$" + valor +",00";
	}
}
