package hansung.designpatterns.observer;

public interface Observer {
	//public void update(float temp, float humidity, float pressure);
	public void update(Subject subject);
}
