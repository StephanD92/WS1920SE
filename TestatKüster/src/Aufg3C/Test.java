package Aufg3C;

public class Test {

	public static void main(String[] args) {
		
		Reiseabrechnung otto = new Reiseabrechnung(12,54);
		Beleg ottob1 = new Hotel("Israel Hotel",1000,"JerusalemResortSafeAndSound","14.07.2019","17.07.2019");
		Beleg ottob2 = new Ticket("IsraelReise",300,"Flug","Berlin","Eilat");
		otto.belegeHinzufuegen(ottob1);
		otto.belegeHinzufuegen(ottob2);
		otto.ausgeben();
		
		
		Reiseabrechnung lea = new Reiseabrechnung(14,56);
		Beleg leab1 = new Hotel("BeautyKur",2400,"WellnessOase","03.Maerz.2018","15.Maerz.2019");
		Beleg leab2 = new Ticket("ZugFahrtZurKur",55,"FlixTrain","Bochum","BadOeynhausen");
		Beleg leab3 = new Ticket("Rückreise",65,"DeutscheBahnZug","BadOeynhausen","Bochum");
		lea.belegeHinzufuegen(leab1);
		lea.belegeHinzufuegen(leab2);
		lea.belegeHinzufuegen(leab3);
		lea.ausgeben();
		
		
		Reiseabrechnung willi = new Reiseabrechnung(13,55);
		Hotel willib1 = new Hotel("Flitterwochen",2000,"MallorcaResortDeluxe","27.06.19","10.08.19");
		Ticket willib2 = new Ticket("FlugNachMalle",30,"Ryhan Air","Düsseldorf","Mallorca");
		willi.belegeHinzufuegen(willib1);
		willi.belegeHinzufuegen(willib2);
		willi.ausgeben();
		

		

	}

}
