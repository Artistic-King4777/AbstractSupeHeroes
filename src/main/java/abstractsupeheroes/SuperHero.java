package abstractsupeheroes;

import java.util.Arrays;

public abstract class SuperHero {

    private String realName;        //realN
    private String[] specialPowers; //specialP

    abstract String[] listPowers();



    public SuperHero(String realN, String[] specialP){
        this.realName = realN;
        this.specialPowers = specialP;
    }



    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String[] getSpecialPowers() {
        return specialPowers;
    }



    @Override
    public String toString() {
        return  realName +
                " possesses these powers: " + Arrays.toString(specialPowers) + "\n" +
                "==============================================================================================================================================="
                + "\n";
    }

    public void setSpecialPowers(String[] specialPowers) {
        this.specialPowers = specialPowers;


    }




    /*
       SuperHero - Part 1

//Create An Abstract SuperHero Class with two PRIVATE instance variables
// realName: String
// specialPowers: String[ ]
//
//Create an Abstract Method called listPowers for the SuperHero Class.
//The class should have all the things necessary to construct and print out your objects

//Create a four more Classes that extends the SuperHero Class (eg: Superman, Hulk etc)


//SuperHero - Part 2A
//Create an Interface called IFlightSpeed and give it one abstract method called flightSpeed which returns the flight speed for the heroes that implement it.
//Make sure Two of your superhero classes are superheroes that can fly
//Implement the IFlightSpeed Interface
//
//SuperHero - Part 2B
//Create an Interface called IBlackHeroes and give it one abstract method called myBlackHero that returns the name of your black hero like this "My black hero is (name of your black hero goes here)___"
//Use it on one of your heroes that is black!!!
//
//HINT: Your black superhero should implement both Interfaces!!!!:
//
//SuperHero - Part 3
//Create an object of each of your superheroes. Next Create an Array to hold each one and loop through to print out their special powers . Then just print out the heroes that can fly one at a time right after that...
// Below is the expected output


Expected Output!!!

Clark Kent possesses these super powers: [flight, x-ray vision, heat vision]
===============================================================
Diana Prince possesses these super powers: [Superhuman strength, flight, durability]
===============================================================
Bruce Banner possesses these super powers: [Transformation, Superhuman Speed, Superhuman Leaping Ability]
===============================================================
 WonderWoman Can fly at 3,000 miles per hour
===============================================================
 SuperMan can fly at 2000 miles per sec
===============================================================
 My black hero is BlackPanther  He can fly at a million miles per sec
     */



}
