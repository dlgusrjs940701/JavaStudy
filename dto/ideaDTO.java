package dto;

public class ideaDTO {

	private int id = 0;
	private String name = null;
	private String memo = null;
	private String author = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "ideaDTO [id=" + id + ", name=" + name + ", memo=" + memo + ", author=" + author + "]";
	}

	public void setint(int int1) {
		// TODO Auto-generated method stub
		this.id = int1;
	}

	public int getint() {
		return id;
	}

}
