package Exercicio1ComMap;
import java.util.HashMap;
import java.util.Map;

public class CentralDeAvisos {
    private Map<String, Aviso> canaisDeAviso;

    public CentralDeAvisos(){
        canaisDeAviso = new HashMap<>();

        canaisDeAviso.put("email", new EmailAviso());
        canaisDeAviso.put("sms", new SmsAviso());
        canaisDeAviso.put("push", new PushAviso());
    }

    public void dispararAviso(String tipo, String mensagem, String destino){
        Aviso canal = canaisDeAviso.get(tipo);

        if (canal != null){
            canal.enviar(mensagem, destino);

            System.out.println(canal.status());
            System.out.println("=======================================");
        }else {
            System.out.println("Tipo de aviso: " + tipo + "não suportado.");
        }
    }
}
