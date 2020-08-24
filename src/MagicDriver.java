public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", 20, false, true, -5);
        Dragon nobody = new Dragon();
        Monster ogre = new Monster("OgreBob", 15, true, "air", false);
        Monster nothing = new Monster();
        Slime billy = new Slime("Billy", 25, false, false);
        Slime something = new Slime();

        Enemy[] enemyList = {happy, nobody, ogre, nothing, billy, something};
        System.out.println(ogre.mightReact());
        System.out.println(nothing.mightReact());
        System.out.println(ogre.compareTerrain());
        System.out.println(nothing.compareTerrain());
        System.out.println(billy.poisonousReacts());
        System.out.println();
        for (Enemy e: enemyList)
        {
            System.out.println(e.toString());
            System.out.println();
        }//end loop to print out the list of enemies



        //print out the object via toString

        System.out.println(happy.toString());
        System.out.println(nobody.toString());

        nobody.setWingspan(-2);
        System.out.println(nobody.toString());
/*
        System.out.println(ogre.toString());
        System.out.println(nothing.toString());
        System.out.println();
        //test getters and setters
        happy.setName("Sad");
        System.out.println();
        System.out.println("Happy is now called " + happy.getName());
        System.out.println(happy.toString());
*/
    }// end main method
}//end driver class