import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {
    @Test
    public void testSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить жене");

        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertTrue(actual);

    }

    @Test
    public void testSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить жене");

        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);

    }
}
