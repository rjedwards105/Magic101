public abstract class Enemy
{
    String name;
    int might;
    boolean isHostile;

    public Enemy(String name, int might, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.isHostile = isHostile;
    }// end full constructor

    public Enemy()
    {
        this.name = null;
        this.might = 0;
        this.isHostile = true;
    }// end full constructor


    //getters
    public String getName()
    {
        return name;
    }//end getname

    public int getMight()
    {
        return might;
    }// end getMight

    //setters
    public void setName(String name)
    {
        this.name = name;
    } //end setname

    public void setMight(int might)
    {
        this.might = might;
    }


    public String toString()
    {
        return "This Enemy has:" +
                "\n\tName = " + name +
                "\n\tmight = " + might +
                "\n\tisHostile = " + isHostile;
    } // end toString (there is only one!)
}//end class Enemy