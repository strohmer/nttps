	public static String decodeString(String s) {
		if (s == null || s == "") return "";
		int i;
		StringBuilder builder = new StringBuilder();
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c != ']') stack.push(c);
		}
		while (!stack.empty()) {
			while (stack.peek() != '[') {
				builder.insert(0,stack.pop());
			}
			stack.pop();
			i = Character.getNumericValue(stack.pop());
			builder.append(result);
			result = new StringBuilder();
			for (int j = 0; j < i; j++) {
				result.insert(0,builder);
			}
			builder = new StringBuilder();
		}
		return result.toString();
	}
}