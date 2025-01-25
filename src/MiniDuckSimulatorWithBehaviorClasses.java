
public class MiniDuckSimulatorWithBehaviorClasses {

	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		// Add a RedHeadDuck, test its behaviors
		Duck rhDuck = new RedHeadDuck();
		rhDuck.display();
		rhDuck.performQuack();
		rhDuck.performFly();
		
   
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		// We can change behaviors "on the fly"
		model.setFlyBehavior(new FlyRocketPoweredBehavior());
		model.performFly();
		// Is the change per class or per object?
		
		
		Duck model1 = new ModelDuck();
		model1.display();
		model1.performFly();
	}
}
