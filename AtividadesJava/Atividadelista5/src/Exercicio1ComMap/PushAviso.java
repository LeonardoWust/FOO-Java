package Exercicio1ComMap;

public class PushAviso implements Aviso {
    private String ultimoStatus = "Pendente";

    @Override
    public void enviar(String mensagem, String destino) {
        System.out.println("Enviando Push para: " + destino);
        System.out.println("Mensagem: " + mensagem);
        this.ultimoStatus = "OK";
        System.out.println("======================================");
    }

    @Override
    public String status() {
        return "Status do Push: " + this.ultimoStatus;
    }
}
