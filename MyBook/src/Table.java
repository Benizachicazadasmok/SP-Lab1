
public class Table implements Element {

	String title;

	public Table(String title) {
		this.title = title;
	}

	public String print() {
//		System.out.println(this.title);
		return this.title;
	}

}
