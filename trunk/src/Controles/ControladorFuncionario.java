package Controles;

import negocio.basica.Funcionario;
import Dao.DaoFuncionarioPostGree;
import Dao.IDaoFuncionario;

public class ControladorFuncionario {
	
	private IDaoFuncionario daoFuncionario;
	
	public ControladorFuncionario(){
		daoFuncionario = new DaoFuncionarioPostGree();
		
	}
	
	public void Incluir(Funcionario F){
		
		
	}
	
	public void Alterar(Funcionario F){
		
		
	}
	
	
	public void Excluir(int Cod){
		
		
	}

     
	
}
