package Exercicio1ComMap;

public class EmailAviso implements Aviso {
    private String ultimoStatus = "Pendente";

    @Override
    public void enviar(String mensagem, String destino) {
        System.out.println("Enviando E-MAIL para: " + destino);
        System.out.println("Mensagem: " + mensagem);
        this.ultimoStatus = "OK";
        System.out.println("=========================================");
    }

    @Override
    public String status() {
        return "Status do E-mail: " + this.ultimoStatus;
    }
}
