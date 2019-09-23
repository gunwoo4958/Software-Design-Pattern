package hansung.designpatterns.decorator.starbuzz;

public class Caramel extends CondimentDecorator {

	public Caramel(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", 카라멜";
	}
	//기존 디스크립션에 추가 시키기 -> 리턴
	public double cost() {
		return .10 + beverage.cost();
	}
}
