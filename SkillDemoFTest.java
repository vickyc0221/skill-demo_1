import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoFTest {
    SkillDemoF myDemo = new SkillDemoF();
    @Test
	public void addition() {
		assertEquals(2, SkillDemoF.add(1, 3));
	}
    
}
