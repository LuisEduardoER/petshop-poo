package Dao;

import negocio.basica.Pessoa;

public interface IDaoPessoa {
	
	void Incluir(Pessoa p);
	void Alterar(Pessoa p);
	void Excluir(int cod);
	

}
