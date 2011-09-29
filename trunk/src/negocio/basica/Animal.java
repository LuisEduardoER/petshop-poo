package negocio.basica;
// Generated 22/09/2011 20:56:27 by Hibernate Tools 3.2.0.CR1


import java.util.Date;

/**
 * Animal generated by hbm2java
 */
public class Animal  implements java.io.Serializable {


     private int codAnimal;
     private Pessoa pessoa;
     private String nome;
     private String raca;
     private String pedigre;
     private Date nascimento;
     private String pelagem;
     private String cor;
     private Integer foto;
     private String observacao;

    public Animal() {
    }

	
    public Animal(int codAnimal, Pessoa pessoa, String nome, String raca, String pedigre, Date nascimento, String pelagem, String cor) {
        this.codAnimal = codAnimal;
        this.pessoa = pessoa;
        this.nome = nome;
        this.raca = raca;
        this.pedigre = pedigre;
        this.nascimento = nascimento;
        this.pelagem = pelagem;
        this.cor = cor;
    }
    public Animal(int codAnimal, Pessoa pessoa, String nome, String raca, String pedigre, Date nascimento, String pelagem, String cor, Integer foto, String observacao) {
       this.codAnimal = codAnimal;
       this.pessoa = pessoa;
       this.nome = nome;
       this.raca = raca;
       this.pedigre = pedigre;
       this.nascimento = nascimento;
       this.pelagem = pelagem;
       this.cor = cor;
       this.foto = foto;
       this.observacao = observacao;
    }
   
    public int getCodAnimal() {
        return this.codAnimal;
    }
    
    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
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
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getPedigre() {
        return this.pedigre;
    }
    
    public void setPedigre(String pedigre) {
        this.pedigre = pedigre;
    }
    public Date getNascimento() {
        return this.nascimento;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getPelagem() {
        return this.pelagem;
    }
    
    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getFoto() {
        return this.foto;
    }
    
    public void setFoto(Integer foto) {
        this.foto = foto;
    }
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }




}


