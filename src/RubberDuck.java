
public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWayBehavior();
		quackBehavior = new SqueakBehavior();
		//quackBehavior = () -> System.out.println("Squeak");
	}
	
	/*
	 * A constructor that allows you to set the behaviors.
	 */
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
