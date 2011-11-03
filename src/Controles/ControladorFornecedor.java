package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Fornecedor;
import Dao.DaoFornecedorPostGree;
import Dao.IDaoFornecedor;

public class ControladorFornecedor {
	
	private IDaoFornecedor daoFornecedor;
	
	public ControladorFornecedor(){
		daoFornecedor = new DaoFornecedorPostGree();
		
	}
	
	public void Incluir(Fornecedor F){
		
		HibernateUtil.beginTransaction();

		daoFuncionario.Incluir(F);
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(Fornecedor F){
		
		HibernateUtil.beginTransaction();
		daoFuncionario.Alterar(F);
		HibernateUtil.commitTransaction();

		
		
	}
	
	
	public void Excluir(int Cod){
		
		
	}

     
	
}