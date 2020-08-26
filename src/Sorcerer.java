public class Sorcerer
{
    //instance variables
    String playerName;
    double playerWeight;
    double playerHeight;
    boolean isPlayerMale;
    int spellCount;
    static int countPlayers = 0;

    //constructors
    public Sorcerer(String playerName, double playerWeight, double playerHeight, boolean isPlayerMale, int spellCount)
    {
        this.playerName = playerName;
        this.playerWeight = playerWeight;
        this.playerHeight = playerHeight;
        this.isPlayerMale = isPlayerMale;
        this.spellCount = validateSpellCount(spellCount);
        countPlayers++;
    }// end full constructor

    public Sorcerer()
    {
        this.playerName = null;
        this.playerWeight = 0.0;
        this.playerHeight = 0.0;
        this.isPlayerMale = true;
        this.spellCount = 0;
        this.countPlayers++;
    }//end null constructor

    //getters
    public String getPlayerName()
    {
        return playerName;
    }//end getPlayerName

    public double getPlayerWeight()
    {
        return playerWeight;
    }//end getPlayer Weight

    public double getPlayerHeight()
    {
        return playerHeight;
    }//end getPlayerHeight

    public boolean getIsPlayerMale()
    {
        return isPlayerMale;
    }//end get IsPlayerMale

    public int getSpellCount()
    {
        return spellCount;
    }//end getSpellCount. this is to see how many spells our player has.


    //Setters
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }//end setPlayerName

    public void setPlayerWeight(double playerWeight)
    {
        this.playerWeight = playerWeight;
    }//end setPlayerWeight

    public void setPlayerHeight(double playerHeight)
    {
        this.playerHeight = playerHeight;
    }//end setPlayerHeight

    public void getIsPlayerMale(boolean isPlayerMale)
    {
        this.isPlayerMale = isPlayerMale;
    }//end setIsPlayerMale

    public void setSpellCount(int spellCount)
    {
        this.spellCount = spellCount;
    }//end setSpellCount

    //Brain Methods
    //Data validation
    public int validateSpellCount (int spellCount)
    {
        while (spellCount < 0)     //keep checking until wingspan is greater than equal to -1
        {
            System.out.println("You can't have a negative amount of spells!  try again");
            spellCount++;      //cheat until allow user entry
        }
        return spellCount;
    }//end method to validate spell count

    public String isPlayerMaleReacts()
    {
        if (isPlayerMale)
        {
            return "Your character is male.";
        }//end if
        else
        {
            return "You're character is female.";
        }
    }// end brain method isPlayerMaleReacts. Determines if the user is male or female.


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return "\n\tName = " + playerName +
                "\n\tplayerWeight = " + playerWeight +
                "\n\tplayerHeight = " + playerHeight +
                "\n\tisPlayerMale = " + isPlayerMale +
                "\n\tspellCount = " + spellCount;
    } // end toString (there is only one!)
}//end dragon class