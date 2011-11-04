package Dao;

import negocio.basica.ClienteF;

public interface IDaoClienteF {

	void Incluir(ClienteF cf);
	void Alterar(ClienteF cf);
	void Excluir(int pessoa_cod_pessoa);
	
	
}
