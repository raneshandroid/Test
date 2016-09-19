
/**
 * Ranesh Prasad
 * Mr. Ferrante
 * 09/06/2016
 * Period 3
 * Time Taken: 25 mins.
 * 
 * This was one of the most tideous labs I have done! What made this lab so annoying was the time it took to understand the directions on how to go about this problem (that's where
 * I spent almost 20 mins.). Initially, I thought that the miles were to be added up (onto the endMiles) until resetMPG was called. After some time, I saw the directions which 
 * stated "reset the startMiles to current odometers and gallons to zero" for the resetMPG method. That's when I knew that only the startMiles are set to last call, and the gallons
 * are incremented unless reseted otherwise. At every call, the number of miles are the myEndMiles initialized from fillUp minus myStartMiles. The gallons are incremented by the new
 * value, and the answered is returned by dividing the 2 values. Although annoying, I learned a neat thing about dividing to get a double: you can take the parameters as int and 
 * double and return the values by simply dividing them.
 */
public class P3_Prasad_Ranesh_Car
{
    // instance variables - replace the example below with your own
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;

    /**
     * Constructor for objects of class P3_Prasad_Ranesh_Car
     */
    public P3_Prasad_Ranesh_Car()
    {
        // initialise instance variables
        myStartMiles = 15;
    }
    
    public P3_Prasad_Ranesh_Car(int odometerReading){
        myStartMiles = odometerReading;
    }

    public void fillUp(int odometerReading, double gallons){
        myEndMiles = odometerReading;
        myGallonsUsed += gallons;
        
    }
    
    public double calculateMPG(){
        return (myEndMiles - myStartMiles)/myGallonsUsed;
    }
    
    public void resetMPG(){
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }
}
