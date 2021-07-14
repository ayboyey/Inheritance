package lab_8;
import lab_7.ProductType;
import lab_7.Item;
public class Main {
	 public static void main(String[] args){
	        Bag bag = new Bag(10);
	        System.out.println(bag);
	        System.out.println();
	        
	        Item item = new Item(ProductType.TEA, 5);
	        Item item2 = new Item(ProductType.TEA, 1);
	        Item item3 = new Item(ProductType.TEA, 2);
	        Item item4 = new Item(ProductType.MILK, 1);

	        bag.putIn(item);
	        bag.putIn(item2);
	        bag.putIn(item3);

	        System.out.println(bag);
	        System.out.println();
	        bag.removeAllItems();
	        System.out.println(bag);
	        System.out.println();
	        
	        bag.putIn(item);
	        bag.putIn(item2);
	        bag.putIn(item3);
	        bag.putIn(item4);

	        bag.remove(ProductType.TEA);
	        System.out.println("Total quantity of a bag: " + bag);
	        System.out.println(bag.getQuantityOfItems());
	        System.out.println();
	        
	        bag.putIn(item);
	        bag.putIn(item2);
	        bag.putIn(item3);
	        bag.putIn(item4);
	        bag.remove(ProductType.TEA, 4);
	        System.out.println(bag);
	        System.out.println();
	        
	        Bag bag2 = new Bag(10);
	        bag2.putIn(item);
	        bag2.putIn(item2);
	        bag2.putIn(item3);
	        bag2.putIn(item4);

	        bag2.remove(ProductType.TEA);
	        bag2.putIn(item);
	        bag2.putIn(item2);
	        bag2.putIn(item3);
	        bag2.putIn(item4);
	        bag2.remove(ProductType.TEA, 4); // all above steps are the same as for bag

	        System.out.println(bag.equals(bag2));
	        System.out.println();
	        
	        HandHoldBag handBag = new HandHoldBag(true);
	        HandHoldBag handBag2 = new HandHoldBag(true);
	        handBag.putIn(item2);
	        handBag2.putIn(item2);

	        System.out.println(handBag);
	        System.out.println();
	        System.out.println(handBag.equals(handBag2));
	        System.out.println();
	        
	        handBag.removeAllItems();
	        System.out.println(handBag);
	        System.out.println();
	        
	        ShoppingBag shoppingBag = new ShoppingBag(true);
	        ShoppingBag shoppingBag2 = new ShoppingBag(true);

	        shoppingBag.putIn(item);
	        shoppingBag2.putIn(item);
	        System.out.println(shoppingBag);
	        System.out.println();
	        System.out.println(shoppingBag.equals(shoppingBag2));
	        System.out.println();
	        System.out.println(shoppingBag.getTotalWeight());
	        
	    }
	}


