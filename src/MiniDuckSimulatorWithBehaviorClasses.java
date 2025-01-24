
public class MiniDuckSimulatorWithBehaviorClasses {

	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		// Add a RedHeadDuck, test its behaviors
   
		Duck model = new ModelDuck();
		model.performFly();
		// We can change behaviors "on the fly"
		model.setFlyBehavior(new FlyRocketPoweredBehavior());
		model.performFly();

	}
}
