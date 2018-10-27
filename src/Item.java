/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/2018
 * UPDATED: 10/25/2018
 * FILE: .java interface named Item.
 * Step 1
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