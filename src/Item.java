/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/2018
 * UPDATED: 10/25/2018
 * FILE: .java interface named Item.
 */

import java.util.Date;

public interface Item {

    //A constant called manufacturer that would be set to “OracleProduction”
    final String manufacturer = "OracleProduction";

    /**
     *
     * @param productionmember
     */

    //A method setProductionNumber that would have one integer parameter
    void setProductionNumber(int productionNumber);

    //A method setName that would have one String parameter
    void setName(String na);

    //A method getName that would return a String
    String getName();

    //A method getManufactureDate that would return a Date
    Date getManufactureDate();


    //A method getSerialNumber that would return an int
    int getSerialNumber();
}