
public class CarSale {
	private String carName;
	private float priceList;
	private float finalCost;
	private float discount;
	
	public CarSale(String carName, float priceList, float discount) {
		super();
		this.carName = carName;
		this.priceList = priceList;
		this.discount = discount;
	}	
	
	public String getCarName() {
		return carName;
	}
	
	public float getPriceList() {
		return priceList;
	}
	
	public float getFinalCost() {
		return finalCost;
	}
	
	public float getDiscount() {
		return discount;
	}

	
	public float countFinalCost() {
		finalCost = priceList - (priceList*(discount/100));
		return finalCost;
	}
	
	public String toString(CarSale car) {
		System.out.println("CarSale");
		System.out.println("Car Name : "+car.getCarName());
		System.out.println("Price list : "+"Rp."+car.getPriceList());
		System.out.println("Discount : "+car.getDiscount()+" %");
		System.out.println("Final Cost : "+"Rp."+car.getFinalCost());
		System.out.println("=====================================");
		System.out.println("");
		return super.toString();
	}
	
}
