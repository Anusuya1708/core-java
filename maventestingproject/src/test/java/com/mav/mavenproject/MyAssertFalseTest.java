package com.mav.mavenproject;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class MyAssertFalseTest {
	public boolean EvenNumber(int number) {
		boolean result=false;
		if(number%2==0) {
			result=true;
			}
		return result;
	}


		@Test
		public void EvenNumberTest() {
			MyAssertFalseTest asft = new MyAssertFalseTest();
			assertFalse(asft.EvenNumber(5));
		}
	}



