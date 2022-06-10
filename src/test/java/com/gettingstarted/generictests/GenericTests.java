package com.gettingstarted.generictests;

import com.gettingstarted.domain.animal.Cat;
import com.gettingstarted.domain.animal.CatComparator;
import com.gettingstarted.genericclassesfortesting.Player;
import com.gettingstarted.genericclassesfortesting.PlayerAgeComparator;
import org.junit.Test;

import java.util.*;


public class GenericTests {

    @Test
    public void sortingArrayElement() {

        String[] names = {"Mary", "James", "Patricia", "John", "Jennifer", "Robert"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }


    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        } else if (o1.length() == o2.length()) {
            return 0;
        } else {
            return 1;
        }

    }

    @Test
    public void printCompareReturnValue() {

        int result = compare("Monday", "Tuesday");
        if (result < 0) {
            System.out.println("First String is less than the second String");
        } else if (result > 0) {
            System.out.println("The first String is greater than the second String");
        } else {
            System.out.println("Both Strings are equals");
        }

    }

    @Test
    public void compareObjectExampleOne() {

        List<Player> footballTeam = new ArrayList<>();

        Player player1 = new Player();
        player1.setRanking(59);
        player1.setName("John");
        player1.setAge(20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);

    }

    @Test
    public void compareObjectExampleTwo() {

        List<Cat> catList = new ArrayList<>();

        Cat firstCat = new Cat();
        firstCat.setAge(29);
        firstCat.setName("Jump");
        firstCat.setOwner("Mark");
        Cat secondCat = new Cat("Bull", 5, "Owner");
        Cat thirdCat = new Cat("Ayano", 9, "Madison");
        catList.add(firstCat);
        catList.add(secondCat);
        catList.add(thirdCat);

        System.out.println("Before Sorting : " + catList);
        Collections.sort(catList);
        System.out.println("After Sorting : " + catList);
    }

    @Test
    public void compareObjectExampleTwoComparator() {

        List<Cat> catList = new ArrayList<>();
        CatComparator catComparator = new CatComparator();

        Cat firstCat = new Cat();
        firstCat.setAge(29);
        firstCat.setName("Jump");
        firstCat.setOwner("Mark");
        Cat secondCat = new Cat("Bull", 5, "OwnerTY");
        Cat thirdCat = new Cat("Ayano", 9, "Madison");
        catList.add(firstCat);
        catList.add(secondCat);
        catList.add(thirdCat);

        System.out.println("Before Sorting : " + catList);
        Collections.sort(catList, catComparator);
        System.out.println("After Sorting : " + catList);
    }

    @Test
    public void testPlayerAgeComparator() {

        List<Player> footballTeam = new ArrayList<>();
        PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();

        Player player1 = new Player();
        player1.setRanking(59);
        player1.setName("John");
        player1.setAge(20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam, playerAgeComparator);
        System.out.println("After Sorting : " + footballTeam);

    }

    @Test
    public void Hash() {
            String a = "200";
            String b = "200";
            if(a.equals(b)){
                System.out.println("Equal variables:");
                System.out.println(a.hashCode() + "\n" + b.hashCode());
            }
            String c = "10";
            String d = "50";
            if(!c.equals(d)){
                System.out.println("\nUn-equal variables:");
                System.out.println(c.hashCode() + "\n" + d.hashCode());
            }
        }

        @Test
        public void testingTypeCasting(){

            int a = 2;
            double b = a;
            System.out.println("int 2 typeCast to double is: " + b);

            double d = 2.7d;
            int y = (int) d;
            int x = (int) d;
            System.out.println("\ndouble 2.7 typeCast to int is: " + x);
        }

        @Test
    public void testingWideningCasting(){
            //Widening or implicit casting, or automatic casting is done automatically when passing a
            // smaller size type to a larger size type
            //A widening or implicit casting is all about casting a data type with
            // lower values than the data type with higher values without data loss.
            // It can be difficult for a developer to use implicit casting methods because there lies a
            // significant risk of casting a lower value than the higher value, which can even lead to a small loss of data.
            int myInt = 9;
            double myDouble = myInt; // Automatic casting: int to double
            System.out.println("The integer value is: " + myInt);                   // Outputs 9
            System.out.println("int value 9 typeCast to double is: " + myDouble);   // Outputs 9.0

            //Example 2:
            int i = 150;
            //automatic type conversion
            long l = i;
            //automatic type conversion
            float f = l;
            System.out.println("\nint value is: " + i);
            System.out.println("int value 150 typeCast to long is: " + l);
            System.out.println("int value 150 typeCast to float is: " + f);
        }

        @Test
    public void testingNarrowingCasting(){
            //Narrowing or explicit casting must be done manually by placing the
            //type in parentheses in front of the value
            //Narrowing or Explicit casting is just the opposite of the widening approach.
            //So, instead of assigning a lower value here, the developer gives a higher value.
            //The narrower data type or the one with a lower value is set with a higher value and
            //requires careful executions to avoid data loss. While an implicit conversion performs automatically,
            //an explicit one takes the prowess of developer input.
            double myDouble = 9.78d;
            int myInt = (int) myDouble; // Manual casting: double to int
            System.out.println("The double value is: " + myDouble);                      // Outputs 9.78
            System.out.println("double value 9.78d converted to int is: " + myInt);      // Outputs 9

            //Example 2:
            //
            double d = 150.06d;
            //explicit type casting
            long l = (long) d;
            //explicit type casting
            int i = (int) l;
            System.out.println("\nThe double value is: " + d);
            //fractional part lost
            System.out.println("The double value 150.06d typeCasted to long is: " + l);
            System.out.println("The fractional part .06 has been lost");
            //fractional part lost
            System.out.println("\nThe double value 150.06d typeCasted to int is: " + i);
            System.out.println("The fractional part .06 has been lost");
        }
    }






