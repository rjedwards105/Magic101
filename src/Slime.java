public class Slime extends Enemy
{
    //instance variables
    boolean isPoisonous;
    boolean isSticky;
    static int countSlimes = 0;

    //constructors
    public Slime(String name, int might, boolean isHostile, boolean isPoisonous, boolean isSticky)
    {
        super(name, might, isHostile);
        this.isPoisonous = isPoisonous;
        this.isSticky = isSticky;
        countSlimes++;
    }// end full constructor

    public Slime()
    {
        super();
        isPoisonous = true;
        isSticky = true;
        countSlimes++;
    }//end null constructor


    //getters
    public boolean getIsPoisonous()
    {
        return isPoisonous;
    }//end getIsPoisonous

    public boolean getIsSticky()
    {
        return isSticky;
    }//end getIsSticky

    public static int getCountSlimes()
    {
        return countSlimes;
    }//end getCountSlimes


    //Setters
    public void setIsPoisonous(boolean isPoisonous)
    {
        this.isPoisonous = isPoisonous;
    }// end setIsPoisonous

    public void setIsSticky (boolean isSticky)
    {
        this.isSticky = isSticky;
    }//end setIsPoisonous

    public void setCountSlimes(int countSlimes)
    {
        this.countSlimes = countSlimes;
    }//end setCountSlimes


    //BrainMethods
    public String poisonousReacts()
    {
        if (isPoisonous)
        {
            return "This slime is poisonous. Watch out!";
        }//end if
        else
        {
            return "This slime isn't poisonous.";
        }
    }// end brain method poisonousReacts

    public String stickyReacts()
    {
        if (isSticky)
        {
            return "This slime is sticky. Be careful!";
        }//end if
        else
        {
            return "This slime isn't sticky.";
        }
    }// end brain method stickyReacts




    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tisPoisonous = " + isPoisonous +
                "\n\tisSticky = " + isSticky;

    } // end toString (there is only one!)
}