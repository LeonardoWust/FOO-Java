package Exercicio1ComMap;

public class Principal {
    public static void main(String[] args) {
        CentralDeAvisos minhaCentral = new CentralDeAvisos();

        System.out.println("### Iniciando disparos de avisos ###\n");

        minhaCentral.dispararAviso("email", "Sua fatura chegou!", "cliente@email.com");
        minhaCentral.dispararAviso("sms", "Seu código de acesso é 12345", "55999887766");
        minhaCentral.dispararAviso("push", "Você tem uma nova mensagem", "device_token_xyz");
        minhaCentral.dispararAviso("whatsapp", "Este não existe", "99999999");
    }
}
