
package cassino;


public class Jogos {
    Integer gold;
    Integer numerojogado;
    Integer numerosorteado1;
    Integer numerosorteado2;
    Integer soma;
    Double aposta;

    public Boolean isValido() {
        return valido;
    }

    public void setValido(Boolean valido) {
        this.valido = valido;
    }
    Boolean valido;

    public Integer getPalpite() {
        return palpite;
    }

    public void setPalpite(Integer palpite) {
        this.palpite = palpite;
    }
    Integer palpite;

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getNumerojogado() {
        return numerojogado;
    }

    public void setNumerojogado(Integer numerojogado) {
        this.numerojogado = numerojogado;
    }

    public Integer getNumerosorteado1() {
        return numerosorteado1;
    }

    public void setNumerosorteado1(Integer numerosorteado1) {
        this.numerosorteado1 = numerosorteado1;
    }

    public Integer getNumerosorteado2() {
        return numerosorteado2;
    }

    public void setNumerosorteado2(Integer numerosorteado2) {
        this.numerosorteado2 = numerosorteado2;
    }

    public Integer getSoma() {
        return soma;
    }

    public void setSoma(Integer soma) {
        this.soma = soma;
    }

    public Double getAposta() {
        return aposta;
    }

    public void setAposta(Double aposta) {
        this.aposta = aposta;
    }

    Boolean jogodosdados(Integer numerojogado, Integer aposta) {

        numerosorteado1 = 0;
        numerosorteado2 = 0;
        soma = 0;

        numerosorteado1 = 1 + (int) (Math.random() * 6);
        numerosorteado2 = 1 + (int) (Math.random() * 6);

        soma = numerosorteado1 + numerosorteado2;

        if (aposta <= gold && soma == numerojogado) {

            gold = gold * 12;
            return true;

        } else if (soma == numerojogado + 1) {
            gold = gold * 5;
            return true;
        } else if (soma == numerojogado - 1) {
            gold = gold * 5;
            return true;
        } else {
            gold = gold - aposta;
            return false;
        }

    }

    Boolean jogodaroleta(Integer numerojogado, Integer aposta2, String op) {

        switch (op) {
            case "0-36": {
                numerosorteado1 = (int) (Math.random() * 36);
                if (aposta <= gold && aposta2 == numerosorteado1) {
                    gold = gold * 35;
                    return true;
                } else {
                    return false;
                }
            }

            case "1/12": {
                numerosorteado1 = (int) (Math.random() * 12);
                if (aposta < 1 && aposta > 12) {
                    valido = false;
                    if (valido == true && aposta <= gold && aposta2 == numerosorteado1) {
                        gold = gold * 2;
                        return true;
                    } else {
                        return false;
                    }

                }
            }

            case "13/24": {

                numerosorteado1 = (int) (Math.random() * 12);
                if (aposta < 13 && aposta > 24) {
                    valido = false;
                    if (valido == true && aposta <= gold && aposta2 == numerosorteado1) {
                        gold = gold * 2;
                        return true;
                    } else {
                        return false;
                    }

                }
            }
            case "25/36": {
                numerosorteado1 = (int) (Math.random() * 12);
                if (aposta < 25 && aposta > 36) {
                    valido = false;
                    if (valido == true && aposta <= gold && aposta2 == numerosorteado1) {
                        gold = gold * 2;
                        return true;
                    } else {
                        return false;
                    }

                }
            }

            case "1/18": {

                numerosorteado1 = (int) (Math.random() * 12);
                if (aposta < 1 && aposta > 12) {
                    valido = false;
                    if (valido == true && aposta <= gold && aposta2 == numerosorteado1) {
                        gold = gold * 2;
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            case "19/36": {

                numerosorteado1 = (int) (Math.random() * 12);
                if (aposta < 19 && aposta > 36) {
                    valido = false;
                    if (valido == true && aposta <= gold && aposta2 == numerosorteado1) {
                        gold = gold * 2;
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            default: {
                valido = false;
                return false;
            }

        }
    }

}
