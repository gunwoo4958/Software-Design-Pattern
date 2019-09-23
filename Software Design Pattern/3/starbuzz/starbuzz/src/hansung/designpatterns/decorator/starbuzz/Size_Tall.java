package hansung.designpatterns.decorator.starbuzz;

public class Size_Tall extends CondimentDecorator {

    public Size_Tall(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 톨 사이즈";
    }

    public double cost() {
        return 1.0 * beverage.cost();
    }
}
