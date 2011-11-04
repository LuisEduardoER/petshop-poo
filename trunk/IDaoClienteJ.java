package Dao;

import negocio.basica.ClienteJ;

public interface IDaoClienteJ {

	void Incluir(ClienteJ cj);
	void Alterar(ClienteJ cj);
	void Excluir(int pessoa_cod_pessoa);
	
	
}
