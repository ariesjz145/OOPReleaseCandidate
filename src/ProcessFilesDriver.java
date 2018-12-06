/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: ProcessFileDriver .java class.
 * Step 20
 */

import java.io.FileReader;

public class ProcessFilesDriver {
  public static void main(String[] args){
/*        ProcessFiles p = new ProcessFiles();
        try{
            p.WriteFile();
        } catch (Exception ex) {
            System.out.println("Could not write");
        }
*/
    // pass the path to the file as a parameter
    try {
      FileReader fr =
          new FileReader("C:\\LineTests\\TestResults.txt");


      int i;
      while ((i = fr.read()) != -1)
        System.out.print((char) i);
    } catch (Exception ex) {
      System.out.println("File reader didn't work");
    }
  }
}