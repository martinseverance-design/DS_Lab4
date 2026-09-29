
public class MyStack<T>
{
	private Node head;

	public MyStack()
	{
		head = null;
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		head = new Node(val, head);

	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}

		return head.val;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		T val = head.val;
		head = head.next;
		return val;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		if(head == null) {
			return true;
		}
		return false;
	}
	
	class Node{
		public T val;
		public Node next;
		public Node(T val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

}
