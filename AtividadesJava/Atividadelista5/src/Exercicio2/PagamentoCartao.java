package Exercicio2;

public class PagamentoCartao implements Checkout {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento Via CartÃ£o + taxa de 5%");

    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("Estornando Pagamento Id: " + idTransacao);

    }
}