
package cassino;


public class Conta {
    
    private String nome;
    private String login;
    private String senha;
    private Boolean jogando;
    private String roupa;
    private String acessorio;
    private String sapato;
    private Integer gold;
    private Float cash;
    private Boolean ativa;
    private String confirma;
    private String numerocartao;
    private String valorcash;
   

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean isJogando() {
        return jogando;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSapato() {
        return sapato;
    }

    public void setSapato(String sapato) {
        this.sapato = sapato;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public String getConfirma() {
        return confirma;
    }

    public void setConfirma(String confirma) {
        this.confirma = confirma;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getValorcash() {
        return valorcash;
    }

    public void setValorcash(String valorcash) {
        this.valorcash = valorcash;
    }

    Conta() {
        nome = null;
        login = null;
        senha = null;
        jogando = false;
        roupa = null;
        acessorio = null;
        sapato = null;
        gold = 0;
        cash = 0f;
        confirma = null;
        ativa = null;
    }

    Boolean entrar(String vsenha, String vlogin) {
        if (vsenha.equals(this.senha) && vlogin.equals(this.login)) {
            jogando=true;
            return true;
        } else {
            return false;
        }
    }

    Boolean abrircadastro(String vlogin, String vsenha, String confirmasenha, String vnome) {
        if (vsenha.equals(confirmasenha) == true) {
            nome = vnome;
            login = vlogin;
            senha = vsenha;
            gold = 50;
            cash = 0f;
            jogando = false;
            roupa = "Calça e camisa";
            acessorio = "Relógio vagabundo ";
            sapato = "ryder";

            return true;
        } else {

            return false;

        }

    }

    Boolean colocarcash(Float valorcash, String numerocartao) {

        if (numerocartao.length() == 16) {
            if (valorcash <= 10) {
                cash = cash + valorcash;
                return true;
            } else if (valorcash <= 50 && valorcash >= 11) {
                cash = cash + (valorcash * 2);
                return true;
            } else {
                cash = cash + (valorcash * 3);
                return true;
            }
        } else {

            return false;
        }
    }

    Boolean compraroupa(String opcao) {

        if (jogando == true) {
            switch (opcao) {
                case "Terno": {
                    int valor = 40;
                    if (cash < valor) {
                        return false;
                    } else {
                        return true;
                    }

                }

                case "Smoking": {
                    int valor = 45;
                    if (cash < valor) {
                        return false;
                    } else {
                        return true;
                    }

                }

                case "Vestido rosa": {
                    int valor = 35;
                    if (cash < valor) {
                        return false;
                    } else {
                        return true;
                    }
                }

                case "Tubinho rosa": {
                    int valor = 55;
                    if (cash < valor) {
                        return false;
                    } else {
                        return true;
                    }
                }

                default: {
                    return false;
                }

            }
        } else {
            return false;
        }

    }


}
