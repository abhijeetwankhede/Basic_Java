package StringBuilderAssignment1;

public class Document {
	
	private String title;
	private String filepath;

	public String showDocumentinformation() {

		String str = ("title: " + getTitle() + " " + "filepath: " + getFilepath());
		return str;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
