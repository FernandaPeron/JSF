package br.com.db1.controller;

import java.text.NumberFormat;
import java.util.Locale;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatadorController {

	private Double valor;
	private String valorFormatado;
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getValorFormatado() {
		return valorFormatado;
	}

	public void setValorFormatado(String valorFormatado) {
		this.valorFormatado = valorFormatado;
	}
	
	public void formatar() {
		Locale ptBr = new Locale("pt", "BR");
		valorFormatado = NumberFormat.getCurrencyInstance(ptBr).format(valor);
	}
}
