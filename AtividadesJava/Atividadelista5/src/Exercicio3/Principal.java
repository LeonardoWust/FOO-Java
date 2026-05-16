package Exercicio3;

import Exercicio2.ServicoPagamento;

public class Principal {
    public static void main(String[] args) {
        ServicoEntrega se = new ServicoEntrega();
        FreteCorreios fc = new FreteCorreios();
        FreteMotoboy fm = new FreteMotoboy();
        FreteRetirada fr = new FreteRetirada();



        se.servicoEntrega(fr, 2, 51);
    }
}
