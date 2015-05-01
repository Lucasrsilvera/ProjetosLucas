
package caixa.eletronico;


public class Gerente {
    private String nome;
    private String datanasci;
    private Double salario;
    private Double bonus;
    private String dataadm;
    private String endereco;
    private String cpf;

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public String getDataadm() {
        return dataadm;
    }

    public void setDataadm(String dataadm) {
        this.dataadm = dataadm;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    Gerente(){
        this.bonus = 0d;
        this.cpf = null;
        this.dataadm = null;
        this.datanasci = null;
        this.endereco = null;
        this.nome = null;
        this.salario = 0d;
    }
    
    
}
