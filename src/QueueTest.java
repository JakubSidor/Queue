import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

    Queue<String> queue;

    @BeforeEach
    void setUp()
    {
        queue = new Queue<>();
        queue.add("Abc");
        queue.add("Dfe");
        queue.add("Wcb");
    }

    @Test
    void add(){
        queue.add("Bnm");
        queue.remove();
        queue.remove();
        queue.remove();
        Assertions.assertEquals("Bnm", queue.remove());
    }

    @Test
    void remove(){
        Assertions.assertEquals("Abc", queue.remove());
    }

    @Test
    void remove_empty(){
        try
        {
            queue.remove();
            queue.remove();
            queue.remove();
            queue.remove();
        }
        catch (IllegalStateException exception)
        {
            Assertions.assertEquals("Queue is already empty!", exception.getMessage());
        }
    }
}