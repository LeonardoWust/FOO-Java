package Exercicio3;

public class FreteRetirada implements Produto {
    @Override
    public void valor(float peso, int cep) {
        System.out.println("Nesta opção é de graça");
        System.out.println("SÓ VAI GASTA A GASOLINA KAKAK E O TEMPO KAKAK");
    }

    @Override
    public void prazo(int cep) {
        System.out.println("PRAZO zero PEGUE QUANDO QUISER");
    }
}
