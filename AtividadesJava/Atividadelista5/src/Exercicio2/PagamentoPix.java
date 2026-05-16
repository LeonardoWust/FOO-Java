package Exercicio2;

public class PagamentoPix implements Checkout {
    @Override
    public void processar(double valor) {
        System.out.println("Processando Pagamento Via pix");
    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("Estornando Pagamento Id: " + idTransacao);
    }
}