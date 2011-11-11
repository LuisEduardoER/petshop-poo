package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Pessoa;
import Dao.DaoFuncionarioPostGree;
import Dao.DaoPessoaPostGree;
import Dao.IDaoFuncionario;
import Dao.IDaoPessoa;
import negocio.basica.Funcionario;

public class ControladorPessoa {

	private IDaoPessoa daoPessoa;
	private static ControladorPessoa Instance;
	
	private ControladorPessoa(){
		daoPessoa = new DaoPessoaPostGree();
	
	}
	
	/* 
	 *     Alessandro Gonçalves
	 *     Método para chamar a chamada do construtor usando Singleton
	 */
	
	public static ControladorPessoa GetControladorPessoa(){
           if (Instance==null)
        	   Instance =  new ControladorPessoa();
           return Instance;
		
	} 	
	
	
	public void Incluir(Pessoa P){
		
		HibernateUtil.beginTransaction();

		daoPessoa.Incluir(P);

//		ControladorFuncionario Controlf = null;
		
	//	Controlf = ControladorFuncionario.GetControladorFuncionario();
	//	Controlf.Incluir(F);
		
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(Pessoa P){
		
		HibernateUtil.beginTransaction();
		daoPessoa.Alterar(P);
	
		//ControladorFuncionario ControlF3 =  ControladorFuncionario.GetControladorFuncionario();
        //ControlF3.Alterar(F);
		
		
		HibernateUtil.commitTransaction();

		
	}
	
	
	public void Excluir(int Cod){
		
		
	}
	
	
}
