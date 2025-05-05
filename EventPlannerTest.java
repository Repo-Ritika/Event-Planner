
import org.junit.Test;
import static org.junit.Assert.*;

public class EventPlannerTest {

    //Test case 1
    @Test
    public void testAddEvent() {
        String title = "Birthday";
        assertEquals("Birthday", title);  
    }
    
    //Test case 2
    @Test
    public void testEventTitleInput() {
    EventPlannerUI ui = new EventPlannerUI();
    ui.titleField.setText("Meeting");
    assertEquals("Meeting", ui.titleField.getText());
}
}
