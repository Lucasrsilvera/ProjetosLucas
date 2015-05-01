
package cassino;

import javax.swing.JOptionPane;


public class Cassino {

    
    public static void main(String[] args) {
       Conta c = new Conta();
        Jogos a = new Jogos();
        int opcao = 0;

        while (opcao != 3) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPCAO DESEJADA: \n"
                    + "1- Criar o cadastro no cassino \n"
                    + "2-Fazer o login \n"
                    + "3-Sair \n"));

            switch (opcao) {
                case 1: {
                    String nomeuser;
                    String senhauser;
                    String loginuser;
                    String confirmasenha;

                    nomeuser = JOptionPane.showInputDialog("Informe o nome do jogador");
                    loginuser = JOptionPane.showInputDialog("Informe o login do usuário");
                    senhauser = JOptionPane.showInputDialog("Digite a senha escolhida");
                    confirmasenha = JOptionPane.showInputDialog("Digite a senha novamente");

                    if ((c.abrircadastro(loginuser, senhauser, confirmasenha, nomeuser)) == true) {
                        JOptionPane.showMessageDialog(null, "Conta criada ");

                    } else {
                        JOptionPane.showInputDialog(null, "Tente novamente");
                    }

                    break;
                }

                case 2: {
                    int escolha = 0;
                    if (c.entrar(JOptionPane.showInputDialog("Informe a senha"), JOptionPane.showInputDialog("Informe o login")) == true) {
                        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");

                        while (escolha != 4) {
                            escolha = Integer.parseInt(JOptionPane.showInputDialog("1-LOJA \n 2-COLOCAR CASH \n 3- JOGOS(+18) \n 4-SAIR"));

                            switch (escolha) {

                                case 1: {

                                    String roupa = JOptionPane.showInputDialog("Digite o item que deseja comprar. \n "
                                            + "Terno \n"
                                            + "smoking \n"
                                            + "Vestido rosa \n"
                                            + "tubinho dourado \n");

                                    if (true == c.compraroupa(roupa)) {
                                        JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso");
                                    } else if (c.compraroupa(roupa) == false) {
                                        JOptionPane.showMessageDialog(null, "Não foi possível completar a compra, tente novamente");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Opção inválida");
                                    }

                                    break;

                                }

                                case 2: {
                                    String numerocartao;
                                    Float cash;
                                    numerocartao = (JOptionPane.showInputDialog("Insira o número do cartão:"));
                                    cash = (Float.parseFloat(JOptionPane.showInputDialog("Insira o valor desejado:")));
                                    if (c.colocarcash(cash, numerocartao) == true) {
                                        JOptionPane.showMessageDialog(null, "VALOR DEPOSITADO COM EXITO!\n SEU SALDO ATUAL É: " + c.getCash());
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cartão de Crédito inválido ou operação não aprovada.", "OPERAÇÃO REALIZADA", JOptionPane.WARNING_MESSAGE);
                                    }
                                    break;

                                }

                                case 3: {
                                    int opcaojogos = 0;
                                    while (opcaojogos != 3) {

                                        opcaojogos = Integer.parseInt(JOptionPane.showInputDialog("1-Jogo dos dados (+18) \n 2-Jogo da roleta (+18) \n 3-SAIR "));

                                        switch (opcaojogos) {
                                            case 1: {
                                                String valoraposta = null;
                                                String palpite = null;
                                                a.setGold(c.getGold());
                                                Boolean ganhou = a.jogodosdados(Integer.parseInt(JOptionPane.showInputDialog("Insira o seu palpite")), Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));

                                                c.setGold(c.getGold());
                                                if (ganhou == true) {
                                                    JOptionPane.showMessageDialog(null, "Número sorteado:" + a.soma + "\n voce ganhou, e o gold ganho nesta jogada foi de:" + a.gold);

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Número sorteado" + a.soma + "\n voce perdeu, e o seu gold é:" + a.gold);
                                                }
                                                break;
                                            }

                                            case 2: {
                                                String valoraposta;
                                                String palpite = null;
                                                String modalidade = JOptionPane.showInputDialog("Escolha uma das modalidades para o jogo da roleta: \n"
                                                        + "1/12 \n"
                                                        + "13/24 \n"
                                                        + "25/36 \n"
                                                        + "1/18 \n"
                                                        + "19/36 \n");
                                                a.setGold(c.getGold());
                                                Boolean ganhou = a.jogodosdados(Integer.parseInt(JOptionPane.showInputDialog("Insira o seu palpite")), Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                                a.setGold(a.getGold());

                                                if (ganhou == true) {
                                                    JOptionPane.showMessageDialog(null, "Número sorteado:" + a.numerosorteado1 + "\n voce ganhou, e o gold ganho nesta jogada foi de:" + a.gold);

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Número sorteado" + a.numerosorteado1 + "\n voce perdeu, e o seu gold é:" + a.gold);
//////                                                }
                                                break;
                                            }

                                        }

        
                                    }
                                }

                            }

                        }

                    }

                }

            }

        }
    }
}
}

    
    

