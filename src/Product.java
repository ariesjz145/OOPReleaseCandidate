/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: abstract .java class named Product that implements the .java interface Item.
 * Step 20
 */
import java.util.ArrayList;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

    private int serialNumber;
    private Date manufacturedOn;
    private String name;
    private String manufacturer = Item.MANUFACTURER;

    private static int currentProductionNumber = 1;
/*
   Adding a constructor that will take in the name of the product
   and set this to the field variable name.
*/
    Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();

    }
    /*
    method to print an array list that will only print the type of product given
    */
    static <T> void printType(ArrayList<T> arrayList, Class c) {
        for (T element: arrayList){
            if (element.getClass() == c)
                System.out.println(element);
        }

    }

    public void setProductionNumber(int number) {
        serialNumber = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return "Manufacturer : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name + "\n";
    }

    @Override
    public int compareTo(Product product) {
        return this.name.compareTo(product.name);
    }

}