package Dao;

import negocio.basica.Fornecedor;

public interface IDaoFornecedor {

	void Incluir(Fornecedor f);
	void Alterar(Fornecedor f);
	void Excluir(int cod);
	
	
}
