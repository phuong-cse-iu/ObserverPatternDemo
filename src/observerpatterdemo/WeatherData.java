/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterdemo;

import java.util.ArrayList;

/**
 *
 * @author TranTPhuong
 */
public class WeatherData implements WeatherSubject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregisterObserver(Observer deletedObserver) {
        int observerIndex = observers.indexOf(deletedObserver);
        if (observerIndex >= 0) {
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.updateWeatherData(temp, humidity, pressure);
        }
    }
    
    public void monitorChanged() {
        notifyObserver();
    }
    
    public void setWeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        monitorChanged();
    }
 
}
