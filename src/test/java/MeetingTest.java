import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {

    @Test
    public void testMatchesTopic() {
        Meeting meeting = new Meeting(1, "Планирование проекта", "Новый проект", "10:00");
        boolean actual = meeting.matches("Планирование");
        assertTrue(actual);
    }

    @Test
    public void testMatchesProject() {
        Meeting meeting = new Meeting(2, "Обсуждение задач", "Старый проект", "14:00");
        boolean actual = meeting.matches("Старый");
        assertTrue(actual);
    }

    @Test
    public void testMatchesNotFound() {
        Meeting meeting = new Meeting(3, "Код-ревью", "Разработка", "16:00");
        boolean actual = meeting.matches("Презентация");
        assertFalse(actual);
    }
}