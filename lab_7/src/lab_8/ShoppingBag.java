package lab_8;

public class ShoppingBag extends Bag {
	 private final boolean extremeRobustness;

	    public ShoppingBag(boolean extremeRobustness) {
	        super(30);
	        this.extremeRobustness = extremeRobustness;
	    }

	    public double getTotalWeight(){
	        double totalWeight = 0.0;
	        for (int i = 0; i < getDifferentObj(); i++){
	            totalWeight += getItems()[i].getTotalWeight();
	        }
	        return totalWeight;
	    }

	    public boolean getExtremeRobustness(){
	        return extremeRobustness;
	    }

	    @Override
	    public String toString(){
	        return "Extremely Robust: " + extremeRobustness + ", " + super.toString();
	    }

	    public boolean equals(Object other){
	        return super.equals(other) && extremeRobustness == ((ShoppingBag)other).getExtremeRobustness();
	    }
	}

