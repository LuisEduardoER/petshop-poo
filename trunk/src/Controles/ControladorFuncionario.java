package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Funcionario;
import Dao.DaoFuncionarioPostGree;
import Dao.IDaoFuncionario;

public class ControladorFuncionario {
	
	private IDaoFuncionario daoFuncionario;
	
	public ControladorFuncionario(){
		daoFuncionario = new DaoFuncionarioPostGree();
		
	}
	
	public void Incluir(Funcionario F){
		
		HibernateUtil.beginTransaction();

		daoFuncionario.Incluir(F);
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(Funcionario F){
		
		HibernateUtil.beginTransaction();
		daoFuncionario.Alterar(F);
		HibernateUtil.commitTransaction();

		
		
	}
	
	
	public void Excluir(int Cod){
		
		
	}

     
	
}
