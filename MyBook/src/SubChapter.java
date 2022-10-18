import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubChapter {

	String name;

	List<Element> e = new ArrayList<Element>();

	public SubChapter(String name) {
		this.name = name;
	}

	public void createNewParagraph(String paragraph) {
		Paragraph para = new Paragraph(paragraph);
		this.e.add(para);
	}

	public void createNewImage(String image) {
		Image img = new Image(image);
		this.e.add(img);
	}

	public void createNewTable(String table) {
		Table titl = new Table(table);
		this.e.add(titl);
	}

	public String print() {

		System.out.println(this.name);

		Iterator<Element> i = this.e.iterator();


		while (i.hasNext()) {

			System.out.println( i.next().print());
		}
		return " ";
		
		


	}

}
