package caixa.eletronico;

public class Conta {
    
    private String agencia;
    private String numeroconta;
    private Cliente nomecorrentista;
    private Double saldo;
    private Boolean ativa;

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    private Gerente gerente;

    

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public Cliente getNomecorrentista() {
        return nomecorrentista;
    }

    public void setNomecorrentista(Cliente nomecorrentista) {
       this.nomecorrentista = nomecorrentista;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    
    public String getagencia(){
        return this.agencia;
    }
    
    public String getmumeroconta(){
        return this.numeroconta;
    }
    
    public Cliente getnomecorrentista(){
        return this.nomecorrentista;
    }
    public Double getsaldo(){
        return this.saldo;
    }
    
    public void setagencia(String agencia){
        this.agencia = agencia;
    }
    public void setnumeroconya(String vnumeroconta){
        this.numeroconta = vnumeroconta;
    }
    
    public void setnomecorrentista(Cliente venomecorrentista){
        this.nomecorrentista = venomecorrentista;
    }
    
    public Conta(){
        agencia = null;
        numeroconta = null;
        nomecorrentista = null;
        saldo = null;
        ativa = false;
    }

    public void abrir(String vnome, String vagencia, String vnumero) {
        this.agencia = vagencia;
        this.numeroconta = vnumero;
        this.nomecorrentista = new Cliente();
        this.saldo = 0.0;
        this.ativa = true;
    }

    public Boolean saque(Double valortransacao) {
        if (ativa == true && saldo >= valortransacao) {
            saldo = saldo - valortransacao;
            return true;
        } else {
            return false;
        }
    }

    public Boolean deposito(Double valor) {
        if (ativa == true) {
            saldo = saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public Boolean fecharconta() {
        Boolean fechar;
        if (saldo == 0) {
            ativa = false;
            fechar = true;
        } else {
            fechar = false;
            return fechar;
        }
        return fechar;

    }

    public Double retornar() {
        return saldo;
    }
}
