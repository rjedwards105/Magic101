public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    double wingspan;

    //constructors
    public Dragon(String name, int might, boolean isHostile, boolean hasFire, double wingspan)
    {
        super(name, might, isHostile);
        this.hasFire = hasFire;
        this.wingspan = validateWingspan(wingspan);
    }// end full constructor

    public Dragon()
    {
        super();
        hasFire = false;
        this.wingspan = 0;
    }//end null constructor

    public double getWingspan()
    {
        return wingspan;
    }

    public void setWingspan(double wingspan)
    {
        this.wingspan = validateWingspan(wingspan);
    }

    //Brain Methods
    //Data validation
    public double validateWingspan (double wingspan)
    {
        while (wingspan < 0)     //keep checking until wingspan is greater than equal to -1
        {
            System.out.println("You can't have a negative wingspan!  try again");
            wingspan++;      //cheat until allow user entry
        }


        return wingspan;
    }//end method to validate wingspan entry
    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\thasFire = " + hasFire +
                "\n\twingpan = " + wingspan;
    } // end toString (there is only one!)
}//end dragon classs