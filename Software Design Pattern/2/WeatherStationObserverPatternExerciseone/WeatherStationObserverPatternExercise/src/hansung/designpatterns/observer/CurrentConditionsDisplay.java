package hansung.designpatterns.observer;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private String measuredTime;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(Subject subject) {
		TimeWeatherData weatherData = (TimeWeatherData)subject;
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.measuredTime = weatherData.getTime();

		display();
	}
	
	public void display() {
		System.out.println("Time: " + measuredTime);
		System.out.println("Current conditions: " + temperature
			+ "F degrees and " + humidity + "% humidity");
	}
}
