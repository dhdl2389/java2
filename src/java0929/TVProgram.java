package java0929;

public class TVProgram {
	String name;
	String Category;
	String genre;

	public TVProgram() {
		// TODO Auto-generated constructor stub
	}

	public TVProgram(String name, String category, String genre) {
		this.name = name;
		Category = category;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "TVProgram [name=" + name + ", Category=" + Category + ", genre=" + genre + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
