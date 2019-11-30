package Übungsblatt01;

public interface Handelsware {

	double EUR_USD = 1.2;   // wechselkurs. kein final kein int, es ist immer alles public. muss 
							//	auch so sein und macht sonst keinen Sinn
	
	public void getEuroPreis();
	public double getDollarPreis();
	
	
}
