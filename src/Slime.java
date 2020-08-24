public class Slime extends Enemy
{
    //instance variables
    boolean isPoisonous;

    //constructors
    public Slime(String name, int might, boolean isHostile, boolean isPoisonous)
    {
        super(name, might, isHostile);
        this.isPoisonous = isPoisonous;
    }// end full constructor

    public Slime()
    {
        super();
        isPoisonous = true;
    }//end null constructor

    //BrainMethods
    public String poisonousReacts()
    {
        if (isPoisonous)
        {
            return "This enemy is poisonous. Watch out!";
        }//end if
        else
        {
            return "This monster isn't poisonous.";
        }
    }// end brain method mightReact


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tisPoisonous = " + isPoisonous;

    } // end toString (there is only one!)
}