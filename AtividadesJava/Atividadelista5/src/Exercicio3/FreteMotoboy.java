package Exercicio3;

public class FreteMotoboy implements Produto{
    @Override
    public void valor(float peso, int cep) {
        System.out.println("Cobrado por CEP");
        System.out.println("Se for 51 é 5 pila");
        if (cep == 51){
            System.out.println("vai ter que pagar 5 reais");
        } else if (cep == 48) {
            System.out.println("vai ter que pagar 10 reais");
        }
    }
    @Override
    public void prazo(int cep) {
        if (cep == 51){
            System.out.println("PRAZO 1 DIA");
        } else if (cep == 48) {
            System.out.println("PRAZO 5 DIAS");

        }
    }
}
