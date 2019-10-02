package StringBuilderAssignment2;

public class OpenUrl {
	
	public OpenUrl() {

	}

	public String checkOpenUrl(String url) {

		String str = null;
		String[] words = url.split("/");
		for (int i = words.length - 1; i > 0; i--) {

			str = words[i];
			break;

		}
		return str;

	}

}
