/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: Interface Item.
 * Step 20
 */

import java.util.Date;

public interface Item {

    public static final String MANUFACTURER = "OracleProduction";

    public void setProductionNumber(int prodNumber);

    public void setName(String name);

    public String getName();

    public Date getManufactureDate();

    public int getSerialNumber();
}