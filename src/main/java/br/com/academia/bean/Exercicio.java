package br.com.academia.bean;

import java.io.Serializable;

import br.com.academia.enums.TipoENUM;

public class Exercicio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc, String series, TipoENUM tipo) {
		this.desc = desc.toUpperCase() + " " + series.toUpperCase() + " " + tipo.toString();
	}		
	
}
