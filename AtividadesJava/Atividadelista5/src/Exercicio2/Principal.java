package Exercicio2;

public class Principal {
    public static void main(String[] args) {
        ServicoPagamento pagamento = new ServicoPagamento();
        PagamentoCartao cartao = new PagamentoCartao();
        PagamentoBoleto boleto = new PagamentoBoleto();
        PagamentoPix pix = new PagamentoPix();

        pagamento.realizarEstorno(pix, "1");



    }
}