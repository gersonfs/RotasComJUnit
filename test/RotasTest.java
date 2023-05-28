package test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import src.Rotas;


public class RotasTest {

    private final Rotas rotas = new Rotas();

    @Test
    public void isValida() {
        assertTrue("Rota é válida", rotas.isValida("RS,SC"));
        assertTrue("Rota é válida", rotas.isValida("AM,PA,MA,PI,CE,RN"));
        assertTrue("Rotaé válida", rotas.isValida("MG,GO,DF,GO,TO"));

        assertFalse("Rota não é válida", rotas.isValida("MS,MT,PA,AC"));
        assertFalse("Rota não é válida", rotas.isValida("ES,MG,GO,PA,AM"));
    }

}
