package negocio.basica;
// Generated 22/09/2011 20:56:27 by Hibernate Tools 3.2.0.CR1



/**
 * Veterinario generated by hbm2java
 */
public class Veterinario  implements java.io.Serializable {


     private int funcionarioCodPessoa;
     private Funcionario funcionario;
     private String crv;

    public Veterinario() {
    }

    public Veterinario(int funcionarioCodPessoa, Funcionario funcionario, String crv) {
       this.funcionarioCodPessoa = funcionarioCodPessoa;
       this.funcionario = funcionario;
       this.crv = crv;
    }
   
    public int getFuncionarioCodPessoa() {
        return this.funcionarioCodPessoa;
    }
    
    public void setFuncionarioCodPessoa(int funcionarioCodPessoa) {
        this.funcionarioCodPessoa = funcionarioCodPessoa;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getCrv() {
        return this.crv;
    }
    
    public void setCrv(String crv) {
        this.crv = crv;
    }




}


