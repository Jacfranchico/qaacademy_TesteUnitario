package teste_unitario;
import org.junit.Test;
import org.junit.Assert;

public class teste_ex01 {
    @Test
    public void validaPalavra(){
           Assert.assertEquals("Bom dia",Ex01.retornaPalavra());
           }
@Test
           public void validaPalavraIncorreta(){

        }
}

