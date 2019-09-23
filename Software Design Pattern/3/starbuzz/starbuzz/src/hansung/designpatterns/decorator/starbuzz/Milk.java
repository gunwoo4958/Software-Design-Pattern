package hansung.designpatterns.decorator.starbuzz;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", 밀크";
	}
	//기존 디스크립션에 추가 시키기 -> 리턴
	public double cost() {
		return .30 + beverage.cost();
	}
}
