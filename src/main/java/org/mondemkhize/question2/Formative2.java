/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.mondemkhize.question2;

/**
 *
 * @author Aboobaker
 */
// the file name is Formative2.java
// comments were added for code that was updated/changed in order to run without any errors

public class Formative2 {

    public static void main(String[] args) 
    {
        Lot parkingLot = new Lot(); // this needed to be changed in order to work
        // the object was declared but it was not initalized
        
        Car chevy = new Car();
        Car camry = new Car();
        MotorCycle harley = new MotorCycle(3);
        MotorCycle honda = new MotorCycle();
        
        parkingLot.park(chevy);
        parkingLot.park(honda);
        parkingLot.park(harley);
        parkingLot.park(camry);
        
        System.out.println(parkingLot.toString());
    }
}

// Parking Lot class
class Lot { // here i had to remove the access modifier
    
    private final static int MAX_VEHICLES = 20;
    private int nrVehicles;
    private Vehicle[] vehicles;
    
    public Lot()
    {
        nrVehicles = 0;
        vehicles = new Vehicle[MAX_VEHICLES];
    }
    
    public int nrParked()
    {
        return nrVehicles;
    }
    
    public void park (Vehicle v)
    {
        vehicles[nrVehicles++] = v;
    }
    
    public int totalWheels()
    {
        int nrWheels = 0;
        for (int v = 0; v < nrVehicles; v++) 
        {
            nrWheels += vehicles[v].getWheels();
        }
        return nrWheels;
    }
    
    public String toString() 
    {
        String s = "";
        for (int v = 0; v < nrVehicles; v++) // i had to add 'int' to 'v'
        {
            s += vehicles[v].toString() + "\n";
        }
        return s;
    }
}

// Vehicle class
class Vehicle { // here i had to remove the access modifier
    
    private int nrWheels;
    
    public Vehicle() 
    {
        this(4);
    }
    
    public Vehicle(int nrWheels)
    {
        setWheels(nrWheels);
    }
    
    public String toString() 
    {
        return "Vehicle with " + getWheels() + " wheels.";
    }
    
    public int getWheels()
    {
        return nrWheels;
    }
    
    public void setWheels(int wheels)
    {
        nrWheels = wheels;
    }   
}

// MotorCycle class
class MotorCycle extends Vehicle { // here i had to remove the access modifier
    
    public MotorCycle() 
    {
        this(2);        
    }
    
    public MotorCycle(int wheels)
    {
        super(wheels);
    }
}

// Car class
class Car extends Vehicle { // here i had to remove the access modifier
    
    public Car() 
    {
        super(4);
    }
    
    public String toString() 
    {
        return "Car with " + getWheels() + " wheels";
    }
}

/* 
now the code should compile and run without any errors.

the expected output should be: 

Car with 4 wheels
Vehicle with 2 wheels.
Vehicle with 3 wheels.
Car with 4 wheels 
*/
