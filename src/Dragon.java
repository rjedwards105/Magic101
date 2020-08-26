public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    double wingspan;
    static int countDragons = 0;

    //constructors
    public Dragon(String name, int might, boolean isHostile, boolean hasFire, double wingspan)
    {
        super(name, might, isHostile);
        this.hasFire = hasFire;
        this.wingspan = validateWingspan(wingspan);
        countDragons++;
    }// end full constructor

    public Dragon()
    {
        super();
        hasFire = true;
        this.wingspan = 0;
        this.countDragons++;
    }//end null constructor

    //getters
    public boolean getHasFire()
    {
        return hasFire;
    }//end getHasFire

    public double getWingspan()
    {
        return wingspan;
    }//end getWingspan

    public static int getCountDragons()
    {
        return countDragons;
    }//end getCountDragons


    //Setters
    public void setWingspan(double wingspan)
    {
        this.wingspan = validateWingspan(wingspan);
    }//end setWingspan

    public void setHasFire(boolean hasFire)
    {
    this.hasFire = hasFire;
    }//end setHasFire

    public void setCountDragons(int countDragons)
    {
        this.countDragons = countDragons;
    }//end setCountDragons

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

    public String hasFireReacts()
    {
        if (hasFire)
        {
            return "This dragon is fire-breathing. Watch out!";
        }//end if
        else
        {
            return "This dragon isn't fire breathing.";
        }
    }// end brain method hasFireReacts. Checks to see if enemy can breathe fire


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\thasFire = " + hasFire +
                "\n\twingspan = " + wingspan;
    } // end toString (there is only one!)
}//end dragon class