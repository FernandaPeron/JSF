package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RadioController {

	private Console console;
	
	public Console getConsole() {
		return console;
	}

	public Console[] getListaConsole() {
		return Console.values();
	}
	
	
	
}
