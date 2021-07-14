package lab_8;

public class HandHoldBag extends Bag {
	 private final boolean premiumQuality;

	    public HandHoldBag(boolean quality) throws IllegalArgumentException {
	        super(5);
	        this.premiumQuality = quality;
	    }

	    public boolean getPremiumQuality(){
	        return premiumQuality;
	    }

	    @Override
	    public String toString(){
	        return "Premium Quality: " + premiumQuality + ", " + super.toString();
	    }

	    public boolean equals(Object other){
	        return super.equals(other) && premiumQuality == ((HandHoldBag)other).getPremiumQuality();
	    }
	}


