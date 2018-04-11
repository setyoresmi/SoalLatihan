import java.util.ArrayList;

public class MainClass {
	ArrayList<CarSale> car;
	ArrayList<PaperclipSale> paperclip;
	
	public enum Coins {
		
		HEADS,
		TAILS;
		
		public static Coins getFlip() {
		    return values()[(int) (Math.random() * values().length)];
		}
	}
	
	 public static int cheapest(int[] array){
		if(array.length>0) {
			int min=array[0];
			for(int i=0;i<array.length;i++){
				if(array[i]<min){
					min=array[i];
				}    
			}
			System.out.println("Cheapest : "+min);
		}
		return 0;
		 
	  }
	 
	 public static int totalCost(int[] array){
		if(array.length>0) {
			int sum=0;
			for(int i=0;i<array.length;i++){ 
				sum=sum+array[i];
			}
			System.out.println("Total cost : "+sum);
		}
		return 0;
	 }

	 public static void main (String[] args) {
		 
		CarSale car1 = new CarSale("Avanza",350000,10);
		car1.countFinalCost();
		car1.toString(car1);
		CarSale car2 = new CarSale("Fortuner",950000,5);
		car2.countFinalCost();
		car2.toString(car2);
		
		PaperclipSale paperclip1 = new PaperclipSale("Blue",14500,50);
		paperclip1.countFinalCost();
		paperclip1.toString(paperclip1);
		PaperclipSale paperclip2 = new PaperclipSale("Red",20000,32);
		paperclip2.countFinalCost();
		paperclip2.toString(paperclip2);
		
		int costCar1 = (int)Math.round(car1.countFinalCost());
		int costCar2 = (int)Math.round(car2.countFinalCost());
		int costPaperClip1 = (int)Math.round(paperclip1.countFinalCost());
		int costPaperClip2 = (int)Math.round(paperclip2.countFinalCost());
		
		int[] array = {costCar1,costCar2,costPaperClip1,costPaperClip2};
		MainClass.cheapest(array);
		MainClass.totalCost(array);
		
		for (int i = 0; i < 6; i++) {
			System.out.println();
            System.out.println("Flip : "+Coins.getFlip());
        }
		
	}
}
