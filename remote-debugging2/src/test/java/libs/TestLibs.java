package libs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLibs {

	@Test
	public void testAdd() {
		assertEquals(Libs.add(1,2), 3);
		assertEquals(Libs.add(1,3), 4);
		assertEquals(Libs.add(1,4), 5);
	}

    @Test
    public void testSub() {
        assertEquals(Libs.subt(1,2), -1);
        assertEquals(Libs.subt(1,3), -2);
        assertEquals(Libs.subt(1,4), -3);
    }
}
