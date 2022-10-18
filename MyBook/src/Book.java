import java.util.ArrayList;
import java.util.List;

public class Book {

	String title;

	Author a;

	List<Chapter> c = new ArrayList<Chapter>();

	public Book(String title) {
		this.title = title;

	}

	public void addAuthor(Author auth) {

		this.a = auth;

	}

	public int createChapter(String chapter) {
		Chapter ch = new Chapter(chapter);
		this.c.add(ch);
		return this.c.indexOf(ch);
	}

	public Chapter getChapter(int indexChapter) {

		return this.c.get(indexChapter);
	}

	public void print() {

		System.out.println(this.title + " " + this.a.print());

	}
}
