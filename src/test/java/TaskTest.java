import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class TaskTest {

    @Test
    public void testConstructorWithId() {
        Task task = new Task(5);

        int actual = task.getId();

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testDefaultConstructor() {
        Task task = new Task();

        int actual = task.getId();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testEqualsSameObject() {
        Task task = new Task(1);

        boolean actual = task.equals(task);

        Assertions.assertTrue(actual);
    }

    @Test
    public void testEqualsNull() {
        Task task = new Task(1);

        boolean actual = task.equals(null);

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEqualsDifferentClass() {
        Task task = new Task(1);
        Object other = "not a task";

        boolean actual = task.equals(other);

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEqualsSameId() {
        Task task1 = new Task(1);
        Task task2 = new Task(1);

        boolean actual = task1.equals(task2);

        Assertions.assertTrue(actual);
    }

    @Test
    public void testEqualsDifferentId() {
        Task task1 = new Task(1);
        Task task2 = new Task(2);

        boolean actual = task1.equals(task2);

        Assertions.assertFalse(actual);
    }

    @Test
    public void testHashCode() {
        Task task = new Task(10);

        int actual = task.hashCode();

        Assertions.assertEquals(Objects.hash(10), actual);
    }

    @Test
    public void testHashCodeConsistency() {
        Task task = new Task(5);
        int expected = task.hashCode();

        int actual = task.hashCode();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHashCodeForEqualObjects() {
        Task task1 = new Task(3);
        Task task2 = new Task(3);

        int actual1 = task1.hashCode();
        int actual2 = task2.hashCode();

        Assertions.assertEquals(actual1, actual2);
    }

    @Test
    public void testMatchesFalse() {
        Task task = new Task(5);

        boolean actual = task.matches("any query");

        Assertions.assertFalse(actual);
    }
}