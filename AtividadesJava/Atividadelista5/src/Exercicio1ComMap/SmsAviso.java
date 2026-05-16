package Exercicio1ComMap;

public class SmsAviso implements Aviso {
    private String ultimoStatus = "Pendente";
    private boolean simularFalha = true;

    @Override
    public void enviar(String mensagem, String destino) {
        System.out.println("Enviando SMS para: " + destino);
        System.out.println("Mensagem: " + mensagem);

        if (simularFalha){
            this.ultimoStatus = "FALHA";
        }else {
            this.ultimoStatus = "OK";
        }
        System.out.println("================================");
    }

    @Override
    public String status() {
        return "Status do SMS: " + this.ultimoStatus;
    }
}
