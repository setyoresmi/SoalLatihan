package advance;

public class PaperclipSale implements Item{

	private String colorClip;
	private float perBoxPrice;
	private float soldBox;
	private float finalCost;
	
	public PaperclipSale(String colorClip, float perBoxPrice, float soldBox) {
		super();
		this.colorClip = colorClip;
		this.perBoxPrice = perBoxPrice;
		this.soldBox = soldBox;
	}
	
	public String getColorClip() {
		return colorClip;
	}

	public float getPerBoxPrice() {
		return perBoxPrice;
	}

	public float getSoldBox() {
		return soldBox;
	}

	public float getFinalCost() {
		return finalCost;
	}
	
	public float countFinalCost(){
		finalCost = perBoxPrice * soldBox;
		return finalCost;
	}
	
	public String toString(PaperclipSale paperclip) {
		System.out.println("Paperclip Sale");
		System.out.println("Color clip : "+paperclip.getColorClip());
		System.out.println("Per box price : "+"Rp."+paperclip.getPerBoxPrice());
		System.out.println("Sold box : "+paperclip.getSoldBox());
		System.out.println("Final cost : "+"Rp."+paperclip.getFinalCost());
		System.out.println("=====================================");
		System.out.println("");
		return super.toString();
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return countFinalCost();
	}
	
}
