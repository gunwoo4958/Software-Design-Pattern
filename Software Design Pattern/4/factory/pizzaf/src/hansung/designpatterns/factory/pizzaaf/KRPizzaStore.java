package hansung.designpatterns.factory.pizzaaf;


public class KRPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new KRPizzaIngredientFactory();
 
		if (item.equals("bulgogi")) {
  
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Korea Style Bulgogi Pizza");

		}
		return pizza;
	}
}
