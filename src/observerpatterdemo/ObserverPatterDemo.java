/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterdemo;

/**
 *
 * @author TranTPhuong
 */
public class ObserverPatterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherData subject = new WeatherData();
        // create new observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(subject);
        
        subject.setWeatherData(68.3f, 30.0f, 78.4f);
        subject.setWeatherData(82, 74, 29.3f);
    }
    
}
