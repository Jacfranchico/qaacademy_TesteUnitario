package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class teste_positivo {
    @Test
    public void validaTrue(){
        Assert.assertTrue(ex_positivo.dividirNumeros());
    }
}