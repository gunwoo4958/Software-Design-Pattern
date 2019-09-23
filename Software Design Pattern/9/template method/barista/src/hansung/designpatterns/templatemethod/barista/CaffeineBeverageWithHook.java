package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverageWithHook {
 
	final void prepareRecipe() {
		prepareWater();
		brew();
		ferment();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void ferment();

	abstract void brew();
 
	abstract void addCondiments();
 
	abstract void prepareWater();
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}
