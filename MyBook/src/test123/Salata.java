package test123;

public class Salata implements FelDeMancare {

	String nume = "";
	int pret = 0;

	public Salata(String nume, int pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}

	@Override
	public void print() {
		System.out.println("Numele fel de mancare: " + nume + " Pret: " + pret + " lei");

	}
}
