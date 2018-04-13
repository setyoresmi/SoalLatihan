package advance;

public enum Coins {
	
	HEADS,
	TAILS;
	
	public static Coins getFlip() {
	    return values()[(int) (Math.random() * values().length)];
	}
}
