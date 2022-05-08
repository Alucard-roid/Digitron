package digitron;

import java.util.ArrayList;

public class Memorija{
	private static ArrayList<Double> memorija = new ArrayList<Double>();
	public static void addResult(double rez) {
		memorija.add(rez);
	}
	public static ArrayList<Double> getRez(){
		return memorija;
	}
	
}
