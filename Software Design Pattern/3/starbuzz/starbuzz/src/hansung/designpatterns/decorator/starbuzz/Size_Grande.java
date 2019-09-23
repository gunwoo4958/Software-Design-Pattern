package hansung.designpatterns.decorator.starbuzz;

public class Size_Grande extends CondimentDecorator {

    public Size_Grande(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 그란데 사이즈";
    }

    public double cost() {
        return 2.0 * beverage.cost();
    }
}
