package Dao;

import negocio.basica.Pessoa;
import negocio.basica.Funcionario;

public interface IDaoPessoa {
	
	void Incluir(Pessoa p);
	void Alterar(Pessoa p);
	void Excluir(int cod);
	

}
