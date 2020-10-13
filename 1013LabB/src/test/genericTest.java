package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.JohsuaVanBaalen.LabB.Generic;

class genericTest {

	Generic<Integer> calc;
	Generic<Double> dCalc;
	
	@Nested
	@DisplayName("int test")
	class intTest{
		@BeforeEach
		void setUp() {
			calc = new Generic<>();
		}
		
		@Test
		@DisplayName("Test add")
		void testAdd() {
			 assertEquals(calc.add(2, 4), 6);
		}
		
		@Test
		@DisplayName("Test sub")
		void testSub() {
			assertEquals(calc.sub(4, 6), -2);
		}
		
		@Test
		@DisplayName("Test mult")
		void testMult() {
			assertEquals(calc.mult(5, 5), 25);
		}
		
		@Test
		@DisplayName("Test Div")
		void testDiv() {
			assertEquals(calc.div(4, 2), 2);
		}
		
		@Test
		@DisplayName("Div by 0 test")
		void testDivZero() {
			assertEquals(calc.div(100, 0), 0);
		}
	}
	
	@Nested
	@DisplayName("double test")
	class doubleTest{
		@BeforeEach
		void setUp() {
			dCalc = new Generic<>();
		}
		
		@Test
		@DisplayName("Test add")
		void testAdd() {
			 assertEquals(dCalc.add(2.0, 4.0), 6.0);
		}
		
		@Test
		@DisplayName("Test sub")
		void testSub() {
			assertEquals(dCalc.sub(4.5, 6.0), -1.5);
		}
		
		@Test
		@DisplayName("Test mult")
		void testMult() {
			assertEquals(dCalc.mult(5.5, 5.5), 30.25);
		}
		
		@Test
		@DisplayName("Test Div")
		void testDiv() {
			assertEquals(dCalc.div(4.0, 2.0), 2.0);
		}
		
		@Test
		@DisplayName("Div by 0 test")
		void testDivZero() {
			assertEquals(dCalc.div(10.0, 0.0), 0.0);
		}
	}

}
