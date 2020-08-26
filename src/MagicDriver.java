import java.awt.*;
import java.util.ArrayList;

public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", 20, false, false, -5);
        Dragon nobody = new Dragon();
        Monster ogre = new Monster("OgreBob", 15, true, "air", false);
        Monster nothing = new Monster();
        Slime billy = new Slime("Billy", 25, false, false, false);
        Slime something = new Slime();
        Sorcerer katy = new Sorcerer("Joe", 130.32, 5.6, false, -5);
        Sorcerer someone = new Sorcerer();

        System.out.printf("Watch out, there are %d enemies attacking! %n%n", Enemy.countEnemies);
        System.out.printf("Watch out, there are %d dragons attacking! %n%n", Dragon.countDragons);
        System.out.printf("Watch out, there are %d monsters attacking! %n%n", Monster.countMonsters);
        System.out.printf("Watch out, there are %d slimes attacking! %n%n", Slime.countSlimes);


        ArrayList<Enemy> enemyArrayList = new ArrayList<>();
        enemyArrayList.add(happy);
        enemyArrayList.add(nobody);
        enemyArrayList.add(ogre);
        enemyArrayList.add(nothing);
        enemyArrayList.add(billy);
        enemyArrayList.add(something);

        for(int i = 0; i < enemyArrayList.size(); i++)
        {
            System.out.println(enemyArrayList.get(i));
            System.out.println();
        }

        ArrayList<Sorcerer> playerArrayList = new ArrayList<>();
        playerArrayList.add(katy);
        playerArrayList.add(someone);

        for(int x = 0; x < playerArrayList.size(); x++)
        {
            System.out.println(playerArrayList.get(x));
            System.out.println();
        }

        //Enemy[] enemyList = {happy, nobody, ogre, nothing, billy, something};
        System.out.println(happy.hasFireReacts());
        System.out.println(nobody.hasFireReacts());
        System.out.println();

        System.out.println(ogre.mightReact());
        System.out.println(ogre.compareTerrain());
        System.out.println();

        System.out.println(nothing.mightReact());
        System.out.println(nothing.compareTerrain());
        System.out.println();

        System.out.println(billy.poisonousReacts());
        System.out.println(billy.stickyReacts());
        System.out.println();

        System.out.println(katy.isPlayerMaleReacts());
        System.out.println(someone.isPlayerMaleReacts());


        //print out the object via toString

        System.out.println(happy.toString());
        System.out.println(nobody.toString());

        nobody.setWingspan(-2);
        System.out.println(nobody.toString());

        System.out.println(ogre.toString());
        System.out.println(nothing.toString());
        System.out.println();
        //test getters and setters
        happy.setName("Sad");
        System.out.println();
        System.out.println("Happy is now called " + happy.getName());
        System.out.println(happy.toString());

    }// end main method
}//end driver class