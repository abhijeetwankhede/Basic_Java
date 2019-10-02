package StringBuilderAssignment2;

public class NumberToString {
	
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int numberOutputInString(String str)

	{
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != '.') {
				count++;
			} else {
				break;
			}
		}

		return count;

	}
}
