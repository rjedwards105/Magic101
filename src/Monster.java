public class Monster extends Enemy
{
    //instance variables
    String terrain;
    boolean hasHorns;
    static int countMonsters = 0;

    //constructors
    public Monster(String name, int might, boolean isHostile, String terrain, boolean hasHorns)
    {
        super(name, might, isHostile);
        this.terrain = terrain;
        this.hasHorns = hasHorns;
        countMonsters++;
    }// end full constructor

    public Monster()
    {
        super();
        terrain = "land";
        hasHorns = true;
        countMonsters++;
    }//end null constructor

    //getters
    public String getTerrain()
    {
        return terrain;
    }//end getTerrain

    public boolean getHasHorns()
    {
        return hasHorns;
    }//end getHasHorns

    public static int getCountMonsters()
    {
        return countMonsters;
    }//end getCountMonsters

    //Setters
    public void setTerrain(String terrain)
    {
        this.terrain = terrain;
    }//end setTerrain

    public void setHasHorns(boolean hasHorns)
    {
        this.hasHorns = hasHorns;
    }//end setHasHorns

    public void  setCountMonsters(int countMonsters)
    {
        this.countMonsters = countMonsters;
    }//end setCountMonsters


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
        }//end else if
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
    }// end brain method compareTerrain


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tterrain = " + terrain +
                 "\n\thasHorns = " + hasHorns;

    } // end toString (there is only one!)
}