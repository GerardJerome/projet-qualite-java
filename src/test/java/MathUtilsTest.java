import org.junit.jupiter.api.Test;
import tp2.MathUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathUtilsTest {

	@Test
	void maxShouldReturnFirstParamWhenFirstParamIsHigher(){
		assertEquals(1, MathUtils.max(1, 2));
	}

	@Test
	void maxShouldReturnSecondParamWhenSecondParamIsHigher(){
		assertEquals(2, MathUtils.max(1, 2));
	}
	@Test
	void maxShouldReturnAValueWhenBothParamAreEquals(){
		assertEquals(1, MathUtils.max(1, 1));
	}

	@Test
	void factorialSouldReturnTheFactorial(){
		assertEquals(1, MathUtils.factorial(1));
		assertEquals(6, MathUtils.factorial(3));

	}

	@Test
	void factorialShouldThrowExceptionWhenParamIsNegative(){
		assertThrowsExactly(IllegalArgumentException.class,() -> MathUtils.factorial(-2));
	}


	@Test
	void averageShouldReturnAverage(){
		//given
		int[] tableau = new int[]{1,2,3,4,5,6};
		//when
		//then
		assertEquals(3.5,MathUtils.average(tableau));
	}

	@Test
	void averageShouldReturnZeroWhenParamIsNull(){
		//given
		int[] tableau = null;
		//when
		//then
		assertEquals(0,MathUtils.average(tableau));
	}

	@Test
	void averageShouldReturnZeroWhenArrayIsEmpty(){
		int[] tableau = new int[]{};
		assertEquals(0,MathUtils.average(tableau));
	}
	@Test
	void isEvenShouldReturnTrueWhenParamIsEven(){
	assertTrue(MathUtils.isEven(2));
	}

	@Test
	void isEvenShouldReturnFalseWhenParamIsNotEven(){
		assertFalse(MathUtils.isEven(1));
	}



}
