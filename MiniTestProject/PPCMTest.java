package MiniTestProject;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PPCMTest {

	//Nominal
	@Test
	void testToPass() {
		int a = 2;
		int b = 3;
		PPCM calculator = new PPCM();
		int result = calculator.ppcm(a, b);
		assertEquals(6, result);
	}
	
	//Robustness
	@Test
	void testToFail() {
		int a = -2;
		int b = -3;
		PPCM calculator = new PPCM();
		int result = calculator.ppcm(a, b);
		assertEquals(-1, result);
	}

}
