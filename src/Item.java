import java.util.ArrayList;

public interface Item {
	float getPrice();
	
	public static float getTotalCost(ArrayList<Item> items) {
		float sum=0;
		for (int i = 0; i < items.size(); i++) {
			sum = sum + items.get(i).getPrice();
		}
		System.out.println("Total cost : "+sum);
		return sum;
	}
	
	public static float getCheapest(ArrayList<Item> items) {
		float min = items.get(0).getPrice();
		for (int i = 0; i < items.size(); i++) {
			if(items.get(i).getPrice()<min)
				min = items.get(i).getPrice();
		}
		System.out.println("Cheapest : "+min);
		return min;
	}

}
