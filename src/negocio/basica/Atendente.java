package negocio.basica;
// Generated 08/09/2011 20:33:14 by Hibernate Tools 3.2.0.CR1



/**
 * Atendente generated by hbm2java
 */
public class Atendente  implements java.io.Serializable {


     private int funcionarioPessoaCodPessoa;
     private Funcionario funcionario;

    public Atendente() {
    }

    public Atendente(int funcionarioPessoaCodPessoa, Funcionario funcionario) {
       this.funcionarioPessoaCodPessoa = funcionarioPessoaCodPessoa;
       this.funcionario = funcionario;
    }
   
    public int getFuncionarioPessoaCodPessoa() {
        return this.funcionarioPessoaCodPessoa;
    }
    
    public void setFuncionarioPessoaCodPessoa(int funcionarioPessoaCodPessoa) {
        this.funcionarioPessoaCodPessoa = funcionarioPessoaCodPessoa;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }




}

