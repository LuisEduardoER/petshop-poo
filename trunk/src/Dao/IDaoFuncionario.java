package Dao;

import negocio.basica.Funcionario;

public interface IDaoFuncionario {

	void Incluir(Funcionario f);
	void Alterar(Funcionario f);
	void Excluir(int cod);
	
	
}
