package jp.te4a.spring.boot.myapp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloConterollerTest {
	@Test
	void test() {
		HelloController hellowController = new HelloController();
		String expected = "this is Spring Boot sample.";
		String actual = hellowController.index();
		
		assertEquals(expected,actual);
	}
}
