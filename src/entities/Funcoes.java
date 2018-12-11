package entities;
// Generated 06/11/2018 18:48:23 by Hibernate Tools 4.3.1



/**
 * Funcoes generated by hbm2java
 */
public class Funcoes  implements java.io.Serializable {


     private Integer idFuncoes;
     private Contagem contagem;
     private String nome;
     private String tipoFuncao;
     private int qntTd;
     private int qntTr;
     private int complexidade;
     private int qntPf;

    public Funcoes() {
    }

    public Funcoes(Contagem contagem, String nome, String tipoFuncao, int qntTd, int qntTr, int complexidade, int qntPf) {
       this.contagem = contagem;
       this.nome = nome;
       this.tipoFuncao = tipoFuncao;
       this.qntTd = qntTd;
       this.qntTr = qntTr;
       this.complexidade = complexidade;
       this.qntPf = qntPf;
    }
   
    public Integer getIdFuncoes() {
        return this.idFuncoes;
    }
    
    public void setIdFuncoes(Integer idFuncoes) {
        this.idFuncoes = idFuncoes;
    }
    public Contagem getContagem() {
        return this.contagem;
    }
    
    public void setContagem(Contagem contagem) {
        this.contagem = contagem;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoFuncao() {
        return this.tipoFuncao;
    }
    
    public void setTipoFuncao(String tipoFuncao) {
        this.tipoFuncao = tipoFuncao;
    }
    public int getQntTd() {
        return this.qntTd;
    }
    
    public void setQntTd(int qntTd) {
        this.qntTd = qntTd;
    }
    public int getQntTr() {
        return this.qntTr;
    }
    
    public void setQntTr(int qntTr) {
        this.qntTr = qntTr;
    }
    public int getComplexidade() {
        return this.complexidade;
    }
    
    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }
    public int getQntPf() {
        return this.qntPf;
    }
    
    public void setQntPf(int qntPf) {
        this.qntPf = qntPf;
    }




}


