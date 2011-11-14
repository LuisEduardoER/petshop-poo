package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Fornecedor;
import Dao.DaoFornecedorPostGree;
import Dao.IDaoFornecedor;

public class ControladorFornecedor {
	
	private IDaoFornecedor daoFornecedor;
    private static ControladorFornecedor Instance;
	
	private ControladorFornecedor(){
		daoFornecedor = new DaoFornecedorPostGree();
		
	}
	
	
	public static ControladorFornecedor GetControladorFornecedor(){
        if (Instance==null)
     	   Instance =  new ControladorFornecedor();
        return Instance;
		
	} 	
	
	
	public void Incluir(Fornecedor F){
		
		HibernateUtil.beginTransaction();

		daoFornecedor.Incluir(F);
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(Fornecedor F){
		
		HibernateUtil.beginTransaction();
		daoFornecedor.Alterar(F);
		HibernateUtil.commitTransaction();

		
		
	}
	
	
	public void Excluir(int Cod){
		
		
	}

     
	
}