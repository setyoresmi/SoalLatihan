import java.util.ArrayList;

public class MainClass {
	
	public enum Coins {
		
		HEADS,
		TAILS;
		
		public static Coins getFlip() {
		    return values()[(int) (Math.random() * values().length)];
		}
	}
	
	 public static void main (String[] args) {
	
			ArrayList<Item> items = new ArrayList<Item>();
			items.add(new CarSale("Avanza",350000,10));
			items.add(new CarSale("Fortuner",950000,5));
			items.add(new PaperclipSale("Red",20000,32));
			items.add(new PaperclipSale("Red",20000,32));
			
			Item.getTotalCost(items);
			Item.getCheapest(items);
			
			for (int i = 0; i < 6; i++) {
			System.out.println();
	        System.out.println("Flip : "+Coins.getFlip());
			}
		
		
	}
}
