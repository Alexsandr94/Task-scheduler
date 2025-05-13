import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {
    @Test
    public void testEpicTrue() {
        String[] subtasks = {"Купить продукты", "Позвонить другу", "Забрать посылку"};
        Epic epic = new Epic(1, subtasks);
        boolean actual = epic.matches("Позвонить");
        assertTrue(actual);
    }

    @Test
    public void testEpicFalse() {
        String[] subtasks = {"Купить продукты", "Позвонить другу", "Забрать посылку"};
        Epic epic = new Epic(2, subtasks);
        boolean actual = epic.matches("Написать письмо");
        assertFalse(actual);
    }

}