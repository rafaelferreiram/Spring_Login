package br.com.academia.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.academia.interfaces.InterfaceMetodos;
import br.com.academia.jpa.entity.Aluno;

public class AlunoBO implements InterfaceMetodos{

	@Override
	public boolean cadastrar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Aluno buscar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> buscarLista() {
		List<Aluno> lista = new ArrayList<>();
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar() {
		// TODO Auto-generated method stub
		return false;
	}

}
