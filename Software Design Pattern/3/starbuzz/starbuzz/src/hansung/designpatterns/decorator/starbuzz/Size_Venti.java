package hansung.designpatterns.decorator.starbuzz;

public class Size_Venti extends CondimentDecorator {

    public Size_Venti(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 벤티 사이즈";
    }

    public double cost() {
        return 3.0 * beverage.cost();
    }
}
