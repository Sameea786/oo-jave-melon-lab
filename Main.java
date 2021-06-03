
public class Main {

	public static void main(String[] args) {
		MelonType musk= new MelonType("musk", "Muskmelon", 1998, "green", true,true);
		MelonType casaba= new MelonType("as", "Casaba", 2003, "yellow", false, false);
		MelonType crenshaw= new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType yellowWatermelon= new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);
		
		MelonType[] melonTypes = new MelonType[4];
		
		melonTypes[0] = musk;
		melonTypes[1] = casaba;
		melonTypes[2] = crenshaw;
		melonTypes[3] = yellowWatermelon;

		Melon melon1 = new Melon(melonTypes[3], 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(melonTypes[3], 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(melonTypes[1], 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(melonTypes[2], 8, 9, 35, "Michael");
		Melon melon5 = new Melon(melonTypes[2], 8, 2, 35, "Michael");
		Melon melon6 = new Melon(melonTypes[0], 6, 7, 4, "Michael");
		Melon melon7 = new Melon(melonTypes[3], 7, 10, 3, "Sheila");

		Melon[] melons = new Melon[7];
		melons[0] = melon1;
		melons[1] = melon2;
		melons[2] = melon3;
		melons[3] = melon4;
		melons[4] = melon5;
		melons[5] = melon6;
		melons[6] = melon7;

		getSellabilityReport(melons);

	
	}
	public static void getSellabilityReport(Melon[] melons) {
		for(int i=0; i < melons.length; i++){
			String sellable;
			if(melons[i].isSellable()){
				sellable = "(CAN BE SOLD)";
			}
			else{
				sellable = "(NOT SELLABLE)";
			}
			System.out.println("Harvested by " + melons[i].harvester + " from Field " + melons[i].field + sellable);
		}

	}

}
