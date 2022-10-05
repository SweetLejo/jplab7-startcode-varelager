package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {

		Vare cheapest = varer[0];
		for(int i = 1; i < varer.length; i++){
			cheapest = varer[i].getPris() < cheapest.getPris()? varer[i] : cheapest;
		}

		return cheapest;
	}
	
	public static double totalPris(Vare[] varer) {		

		double sum = 0;
		for(Vare i : varer){
			sum += i.getPris();
		}
		return sum;
	}
	
	public static int[] finnVarenr(Vare[] varer) {

		int[] storageNums = new int[varer.length];
		for(int i = 0; i < storageNums.length; i ++){
			storageNums[i] = varer[i].getVarenr();
		}
		return storageNums;

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {

		double[] priceDiff = new double[varer.length-1];
		for(int i = 0; i < priceDiff.length; i++){
			priceDiff[i] = varer[i+1].getPris() - varer[i].getPris();
		}

		return priceDiff;
	}
}
