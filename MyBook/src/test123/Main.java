package test123;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		Client c = new Client();

		List<FelDeMancare> comanda_clientului1 = new ArrayList<FelDeMancare>();
		List<FelDeMancare> comanda_clientului2 = new ArrayList<FelDeMancare>();

		Pizza pizz1 = new Pizza("Pizza1", 1);
		pizz1.print();
		Paste pas2 = new Paste("Paste1", 2);
		pas2.print();
		Salata sal1 = new Salata("Salata1", 3);
		sal1.print();

		comanda_clientului1.add(sal1);
		comanda_clientului1.add(pas2);
		comanda_clientului1.add(pizz1);
		
		comanda_clientului1.add(sal1);
		comanda_clientului1.add(pizz1);
		

		Comanda c1 = new Comanda(comanda_clientului1);
		Comanda c2 = new Comanda(comanda_clientului2);

		c.Comanda(comanda_clientului1);
		c.Comanda(comanda_clientului2);
		c.print();

	}

}
