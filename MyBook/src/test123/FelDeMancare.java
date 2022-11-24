package test123;

import java.util.ArrayList;
import java.util.List;

public interface FelDeMancare {

	String nume = "";
	int pret = 0;
	
	List<Pizza> pizz = new ArrayList<Pizza>();
	List<Paste> past = new ArrayList<Paste>();
	List<Salata> sal = new ArrayList<Salata>();

	public void print();

}
