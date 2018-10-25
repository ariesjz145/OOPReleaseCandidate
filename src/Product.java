/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: abstract .java class named Product that implements the .java interface Item.
 */

import java.util.Date;

public abstract class Product implements Item {

    int serialNumber;
    Date manufacturedOn;
    String name;
    static  Integer currentProductionNumber = 1;

    /*
    Add a constructor that will take in the name of the product and set this to the field variable name.
    You will also assign a serial number from the currentProductionNumber.
    The currentProductionNumber should be incremented in readiness for the next instance.
    Set manufacturedOn as the current date and time.
    */

    public Product(String name) {

        this.name = name;
        /*
         Add an integer class variable called currentProductionNumber.
         This will store the next number to be assigned to serialNumber.
        */
        serialNumber = currentProductionNumber;
        currentProductionNumber++;      //unary operator
        //Set manufacturedOn as the current date and time.
        manufacturedOn = new Date(System.currentTimeMillis());
    }

    public void setProductionNumber(int productionNumber) {
        currentProductionNumber = productionNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    //Add a toString method that will return the following
    @Override
    public String toString() {

        return "Manufacturer : " + manufacturer + "\n "
            + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name;
    }
}