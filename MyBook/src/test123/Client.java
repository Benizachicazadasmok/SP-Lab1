package test123;

import java.util.ArrayList;
import java.util.List;

public class Client {

	Comanda c;
	int pret_total;
	List<FelDeMancare> cos = new ArrayList<FelDeMancare>();

	public Client() {

	}

	public void Comanda(List<FelDeMancare> fdm) {

		this.c = new Comanda(fdm);
		for (int i = 0; i < fdm.size(); i++) {
			this.cos.add(fdm.get(i));
			pret_total += fdm.get(i).pret;
		}

		for (int i = 0; i < fdm.size(); i++) {

		}

	}

	public void print() {

		System.out.println("\nComanda: ");
		for (int i = 0; i < cos.size(); i++) {
			cos.get(i).print();
		}

		System.out.println("Pret total: " + this.pret_total);
		if(this.pret_total==0) {
			
			System.out.println("Wow, comanda ta e gratuita :D");
		}
	}

}
