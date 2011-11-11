package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Funcionario;
import Dao.DaoFuncionarioPostGree;
import Dao.IDaoFuncionario;

public class ControladorFuncionario {
	
	private IDaoFuncionario daoFuncionario;
    private static ControladorFuncionario Instance;  // Declaração para uso de Singleton
	
	private ControladorFuncionario(){
		daoFuncionario = new DaoFuncionarioPostGree();
		
	}
	

	/* 
	 *     Alessandro Gonçalves
	 *     Método para chamar a chamada do construtor usando Singleton
	 */
	public static ControladorFuncionario GetControladorFuncionario(){
        if (Instance==null)
     	   Instance =  new ControladorFuncionario();
        return Instance;
		
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
