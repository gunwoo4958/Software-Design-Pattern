package hansung.designpatterns.observer;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	//pull로 바꾸면서 measuredTime 도 가져오기
//	public void update(float temperature, float humidity, float pressure) {
//		this.temperature = temperature;
//		this.humidity = humidity;
//		display();
//	}
	public void update(Subject subject) {
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)subject;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
