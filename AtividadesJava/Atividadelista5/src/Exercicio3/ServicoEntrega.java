package Exercicio3;

public class ServicoEntrega {
    public void servicoEntrega(Produto metodoEntrega, float peso, int cep){
        metodoEntrega.valor(peso, cep);
        metodoEntrega.prazo(cep);
    }
}
