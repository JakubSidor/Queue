import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuerryTest {

    Querry<String> querry;

    @BeforeEach
    void setUp()
    {
        querry = new Querry<>();
        querry.add("Abc");
        querry.add("Dfe");
        querry.add("Wcb");
    }

    @Test
    void add(){
        querry.add("Bnm");
        querry.remove();
        querry.remove();
        querry.remove();
        Assertions.assertEquals("Bnm",querry.remove());
    }

    @Test
    void remove(){
        Assertions.assertEquals("Abc", querry.remove());
    }

    @Test
    void remove_empty(){
        try
        {
            querry.remove();
            querry.remove();
            querry.remove();
            querry.remove();
        }
        catch (IllegalStateException exception)
        {
            Assertions.assertEquals("Querry is already empty!", exception.getMessage());
        }
    }
}