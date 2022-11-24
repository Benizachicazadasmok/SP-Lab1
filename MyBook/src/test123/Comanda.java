package test123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comanda {

	List<FelDeMancare> l = new ArrayList<FelDeMancare>();

	public Comanda(List<FelDeMancare> l) {
		super();
		this.l = l;
	}

	public void print() {

		Iterator<FelDeMancare> it = this.l.iterator();
		System.out.println("Comanda: ");
		while (it.hasNext()) {
			it.next().print();
		}

	}

}
