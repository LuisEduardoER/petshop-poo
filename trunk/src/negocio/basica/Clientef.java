package negocio.basica;
// Generated 22/09/2011 20:56:27 by Hibernate Tools 3.2.0.CR1


import java.util.Date;

/**
 * Clientef generated by hbm2java
 */
public class Clientef  implements java.io.Serializable {


     private int codPessoa;
     private Pessoa pessoa;
     private String nome;
     private String cpf;
     private String rg;
     private Date datanasc;

    public Clientef() {
    }

    public Clientef(int codPessoa, Pessoa pessoa, String nome, String cpf, String rg, Date datanasc) {
       this.codPessoa = codPessoa;
       this.pessoa = pessoa;
       this.nome = nome;
       this.cpf = cpf;
       this.rg = rg;
       this.datanasc = datanasc;
    }
   
    public int getCodPessoa() {
        return this.codPessoa;
    }
    
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Date getDatanasc() {
        return this.datanasc;
    }
    
    public void setDatanasc(Date datanasc2) {
        this.datanasc = datanasc2;
    }




}


