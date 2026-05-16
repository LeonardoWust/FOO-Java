package Exercicio3;

import java.sql.SQLOutput;

public class FreteCorreios implements Produto {
    @Override
    public void valor(float peso, int cep) {
        System.out.println("Cobrado por peso apartir de 2kg paga 1 real a mais");
        if (peso > 2){
            float taxa = peso;
        }else{
            System.out.println("Abaixo do peso ta suave nao paga nada");
        }
    }

    @Override
    public void prazo(int cep) {
        if (cep == 51) {
            System.out.println("prazo 2 semanas");
        } else if (cep == 48) {
            System.out.println("prazo 1 mes");
        }


    }
}
