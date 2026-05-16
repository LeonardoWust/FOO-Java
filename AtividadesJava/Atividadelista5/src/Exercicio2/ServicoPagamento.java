package Exercicio2;

public class ServicoPagamento {
    public void realizarPagamento(Checkout formaPagamento, float valor){
        formaPagamento.processar(valor);
    }

    public void realizarEstorno(Checkout formaPagamento, String idTransacao){
        formaPagamento.estornar(idTransacao);
    }
}
