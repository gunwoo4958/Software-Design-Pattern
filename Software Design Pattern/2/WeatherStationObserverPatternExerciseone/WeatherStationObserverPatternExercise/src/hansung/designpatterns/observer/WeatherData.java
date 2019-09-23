package hansung.designpatterns.observer;

import java.util.*;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	private boolean changed;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
				//observer.update(temperature, humidity, pressure);
			observer.update(this);
		}
//		if(changed){ //내용이 바뀌었다면
//			observers.update(this); //pull방식에서는 인자 "기상정보 오브젝트"를 안씀! 옵저버에서 this만 가져다 씀.
//		}
//		changed = false;
	}

	//??
	public void NotifyObservers(){ //pull방식에서 호출되는 방식.
		notifyObservers();
	}


	void setChanged(){     //기상정보 변화 플래그
		changed=true;
	}

	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
