package StringBuilderAssignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Document {
	
	private int id;
	private String title;;
	private String description;
	private String filepath;
	private Date createDate;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date date;

	public Document(int id, String title, String description, String filepath, Date createDate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.filepath = filepath;
		this.createDate = createDate;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getStringCreateDate() {
		return dateFormat.format(this.createDate);

	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", description=" + description + ", filepath=" + filepath
				+ ", createDate=" + getStringCreateDate() + "]";
	}

}
