public class MiniDuckSimulatorWithLambdas {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
		// Fill in the code in the DecoyDuck to set its behaviors 
		// Then uncomment the testing code at the end
		// DecoyDuck	decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPoweredBehavior());
		model.performFly();
		
		//decoy.performQuack();
		//decoy.performFly();
	}
}