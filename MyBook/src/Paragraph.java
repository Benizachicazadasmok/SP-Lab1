
public class Paragraph implements Element {

	String text;

	public Paragraph(String text) {
		this.text = text;
	}

	public String print() {
//		System.out.println(this.text);
		return this.text;
	}

}
