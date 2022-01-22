package student
public class Stack {

	private List<Item> stack;

	Public Stack() {
		Stack = new List<>();
	}

	Public Item pop() {
		If (!stack.isEmpty()) {
		// treat the stack as a list, the last item in the list
		// is the “top” of the stack and the first item to popped
		// off.
			Item popped = stack.get(stack.size() - 1);
		Return popped;
		}

		Return null;
}

Public void push(Item item) {
	// since add() adds to the end of the list and 
	// the end of the list works as the “top” of the	
	// stack, this works as a “push”.
	stack.add(item);
}

}
