package com.driver;

public class F1Car {
	private String carName;
    private double speed;
    private int racesWon;

    public F1Car(String carName, double speed, int racesWon) {
       // your code goes here
        this.carName=carName;
        this.speed=speed;
        this.racesWon=racesWon;
    }

    public String getCarName() {
    	// your code goes here
        return carName;
    }

    public double getSpeed() {
    	// your code goes here
        return speed;
    }

    public int getRacesWon() {
    	// your code goes here
        return racesWon;
    }
}
