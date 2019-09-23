package hansung.designpatterns.factory.pizzafm;

public class KRPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("bulgogi")) {
			return new KRStyleBggPizza();
		} else return null;
	}
}
