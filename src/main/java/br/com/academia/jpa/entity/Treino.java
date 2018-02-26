package br.com.academia.jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.academia.bean.Exercicio;

@Entity
@Table(name = "T_TREINO")
public class Treino implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Exercicio> exercicios;
	
	@Id
	@Column(name = "id_treino")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	// @OneToMany
	// @JoinColumn
	// private 
}
