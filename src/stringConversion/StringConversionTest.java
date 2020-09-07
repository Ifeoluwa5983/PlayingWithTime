package stringConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringConversionTest {
	StringConversion stringC = new StringConversion(); ;

	@BeforeEach
	void setUp() throws Exception {	
	}

	@Test
	void test() {
		stringC.convertToString(0,00);
	}

}
