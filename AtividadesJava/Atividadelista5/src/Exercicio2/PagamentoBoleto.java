package Exercicio2;

public class PagamentoBoleto implements Checkout {
    @Override
    public void processar(double valor) {
        System.out.println("Processando Pagamento Via Boleto, aprova só amanhã");

    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("Estornando Pagamento Id: " + idTransacao);
    }
}