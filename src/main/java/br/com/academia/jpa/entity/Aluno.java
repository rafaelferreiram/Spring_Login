package br.com.academia.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_ALUNO")
public class Aluno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "id_aluno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nm_aluno")
	private String nome;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "nr_rg")
	private String rg;
	
	@Column(name = "nr_cpf")
	private String cpf;
	
	// @OneToMany(mappedBy = "T_ALUNO", targetEntity = Treino.class, cascade = CascadeType.ALL)
	// @JoinColumn(name = "id_treino", table = "T_TREINO")
	private Treino treino;
	
	@Column(name = "ds_login")
	private String login;
	
	@Column(name = "ds_senha")
	private String senha;
	
	//Adicionar FK
	private Endereco endereco;
	
	@Column(name = "nr_tel")
	private String telefone;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Aluno(String nome, String email, String rg, String cpf, Treino treino, String login, String senha,
			Endereco endereco, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		this.treino = treino;
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Aluno() {
		
	}
	
	
}
