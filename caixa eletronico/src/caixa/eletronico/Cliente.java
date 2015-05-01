
package caixa.eletronico;

public class Cliente {
    private String cpf;
    private String nome;
    private String datanasci;
    private String nomepai;
    private String nomemae;
    private Boolean spc;
    private Boolean serasa;
    private String endereco;
    
    Cliente(){
        this.cpf = null;
        this.datanasci = null;
        this.endereco = null;
        this.nome = null;
        this.nomemae = null;
        this.nomepai = null;
        this.serasa = false;
        this.spc = false;
        
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasci() {
        return datanasci;
    }

    public void setDatanasci(String datanasci) {
        this.datanasci = datanasci;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public Boolean getSpc() {
        return spc;
    }

    public void setSpc(Boolean spc) {
        this.spc = spc;
    }

    public Boolean getSerasa() {
        return serasa;
    }

    public void setSerasa(Boolean serasa) {
        this.serasa = serasa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    public Boolean verificarconta(){
            Boolean retorno;
            retorno = this.spc ==  false && this.serasa == false;
            return retorno;
        }
    
}
