import java.util.HashMap;
import java.util.Map;
public class Rotas
{
 public static void main (String args[])
 {
   Map<String, String[]> fronteiras = new HashMap<>();
   fronteiras.put("RS", new String [] {"SC"});
   fronteiras.put("SC", new String [] {"RS","PR"});
   fronteiras.put("PR", new String [] {"SC","SP","MS"});
   fronteiras.put("SP", new String [] {"PR","MS","MG","RJ"});
   fronteiras.put("MG", new String [] {"SP","MS","GO","ES","RJ","BA"});
   fronteiras.put("RJ", new String [] {"SP","ES","MG"});
   fronteiras.put("ES", new String [] {"RJ","MG","BA"});
   fronteiras.put("MS", new String [] {"PR","SP","MG","GO","MT"});
   fronteiras.put("MT", new String [] {"MS","GO","TO","PA","AM","RO"});
   fronteiras.put("GO", new String [] {"MS","MT","MG","BA","TO","DF"});
   fronteiras.put("DF", new String [] {"GO"});
   fronteiras.put("RO", new String [] {"MT","AM","AC"});
   fronteiras.put("AC", new String [] {"AM","RO"});
   fronteiras.put("AM", new String [] {"AC","RO","MT","RR","PA"});
   fronteiras.put("PA", new String [] {"AM","AP","RR","MT","TO","MA"});
   fronteiras.put("TO", new String [] {"MT","GO","BA","PI","MA","PA"});
   fronteiras.put("AP", new String [] {"PA"});
   fronteiras.put("RR", new String [] {"PA","AM"});
   fronteiras.put("BA", new String [] {"ES","MG","GO","TO","PI","PE","AL","SE"});
   fronteiras.put("PI", new String [] {"BA","TO","PE","CE","MA"});
   fronteiras.put("MA", new String [] {"TO","PA","PI"});
   fronteiras.put("CE", new String [] {"PI","PE","PB","RN"});
   fronteiras.put("RN", new String [] {"CE","PB"});
   fronteiras.put("PB", new String [] {"RN","PE","CE"});
   fronteiras.put("PE", new String [] {"BA","PI","CE","PB","AL"});
   fronteiras.put("AL", new String [] {"SE","PE","BA"});
   fronteiras.put("SE", new String [] {"BA","AL"});
   
   boolean rotaValida = true;
   
   String rota = Entrada.leiaString ("Digite a rota desejável, separe por vírgulas e sem espaços:");
   rota = rota.toUpperCase();
   String [] rota1 = rota.split(","); 
   
     for (int i = 0; i < (rota1.length - 1); i++) 
     {
            String estadoAt = rota1[i].trim();
            String estadoSeg = rota1[i + 1].trim();

            String [] fronteirasEstadoAt = fronteiras.get(estadoAt);
            
            if (fronteirasEstadoAt != null && fronteirasEstadoAt.length > 0) 
            {
                boolean fronteiraEncontrada = false;
                for (String estado : fronteirasEstadoAt) 
                {
                    if (estado.equals(estadoSeg)) 
                    {
                        fronteiraEncontrada = true;
                        break;
                    }
                }
                if (fronteiraEncontrada == false) 
                {
                    rotaValida = false;
                    break;
                }
            } 
            else 
            {
                rotaValida = false;
                break;
            }
        }
        System.out.println("Rota desejada: "+rota);

        if (rotaValida)
        {
            System.out.println("Rota válida!");
        }
        else 
        {
            System.out.println("Rota inválida!");
        }
    }
}