import java.util.ArrayList;
import java.util.List;

public interface Element {
	List<Paragraph> p = new ArrayList<Paragraph>();
	List<Image> i = new ArrayList<Image>();
	List<Table> t = new ArrayList<Table>();

	public String print();

}
