package MiniTestProject;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PPCMTest {

	@Test
	void testPPCMPrimaryNumbers() {
		// Arrange
		int a = 2;
		int b = 3;
		PPCM calculator = new PPCM();
		// Act
		int result = calculator.ppcm(a, b);

		// Assert
		assertEquals(6, result);
	}

}
