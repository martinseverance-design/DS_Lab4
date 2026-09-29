import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest {
	static MyStack stack;

	@BeforeEach
	void setUp() throws Exception {
		stack = new MyStack<>();
	}

	@Test
	void test() {
		//does it add to the stack and is it at the the top
		//also tests top because top has to work in order for this test to work
		stack.push("one");
		assertEquals("one", stack.top());
		stack.push("five");
		assertEquals("five", stack.top());
		stack.pop();
		assertEquals(false, stack.isEmpty());
		assertEquals("one", stack.top());
		stack.pop();
		assertEquals(true, stack.isEmpty());
		assertThrows(StackUnderFlowException.class, () -> {stack.pop();});
		
	}

}
