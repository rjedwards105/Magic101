public class Monster extends Enemy
{
    //instance variables
    String terrain;
    boolean hasHorns;

    //constructors
    public Monster(String name, int might, boolean isHostile, String terrain, boolean hasHorns)
    {
        super(name, might, isHostile);
        this.terrain = terrain;
        this.hasHorns = hasHorns;
    }// end full constructor

    public Monster()
    {
        super();
        terrain = "land";
        hasHorns = true;
    }//end null constructor

    //BrainMethods
    public String mightReact()
    {
        if (might < 10)
        {
            return "Weak!";
        }//end if
        else if (might >= 10 && might < 20)
        {
            return "Careful";
        }//endd else if
        else          //(might > 20)
        {
            return "Whoa!";
        }
    }// end brain method mightReact

    public String compareTerrain()
    {
        if (terrain.equalsIgnoreCase("land"))
        {
            return "You can run away";
        }
        else if (terrain.equalsIgnoreCase("water"))
        {
            return "You can swim away";
        }
        else
        {
            return "Bummer for you!";
        }
    }


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tterrain = " + terrain +
                 "\n\thasHorns = " + hasHorns;

    } // end toString (there is only one!)
}