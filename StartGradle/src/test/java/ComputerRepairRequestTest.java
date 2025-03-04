import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.mpp2025.model.ComputerRepairRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest test = new ComputerRepairRequest();
        assertEquals("",test.getOwnerName());
        assertEquals("",test.getOwnerAddress());
    }

    @Test
    @DisplayName("Second Test")
    public void testExample2(){
        ComputerRepairRequest test = new ComputerRepairRequest(1,"A A","Address A","072222","Asus","13/10/2020","Broken display");
        assertEquals("A A",test.getOwnerName());
        assertEquals("Address A",test.getOwnerAddress());
    }


}