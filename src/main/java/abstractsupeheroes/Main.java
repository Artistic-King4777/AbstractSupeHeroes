package abstractsupeheroes;

public class Main {
    public static void main(String[] args) {


        SpiderMan underoos = new SpiderMan("Peter Parker",  new String[]{"Spidey Sense, Wall Crawling, Web Shooters, Superhuman Flexibility and, Healing Factor"});

        Falcon sam = new Falcon("Sam Wilson", new String[]{"Master Aerialist, Master Acrobat, Flight, Cybernetic Implants, Skilled Shield Fighter"});

        Deadpool wade = new Deadpool("Wade Wilson", new String[]{"EXTREME Healing Factor, Immortality, Superhuman Stamina, Skilled Swordsman, Resistance to Drugs/Poisons"});

        DannyPhantom danny = new DannyPhantom("Danny Fenton", new String[]{"Ghostly Abilities, Ghostly Wail, Ghost Sense, Cryokinesis, Going Ghost"});



        SuperHero[] supers = new SuperHero[]{underoos, sam, wade, danny};
        for(SuperHero su : supers){
            //System.out.println("\n" + su.getRealName() + " possesses these powers: " + su.listPowers() + "\n");
            System.out.println(su.toString());
        }


        System.out.print("Danny Phantom flies over " + danny.flightSpeed() + "mph!" + "\n" + "\n");

        System.out.println("==============================================================");
        System.out.println("\n" + "Falcon flies around " + sam.flightSpeed() + "mph!" + "\n");
        System.out.println(sam.flightSpeed());
        System.out.println("=============================================================");
        System.out.println(sam.myBlackHero() + "! He can fly at speeds up to " + sam.flightSpeed() + "mph, Wow!");


        IFlightSpeed[] flight = new IFlightSpeed[]{underoos, sam, danny};
        for(IFlightSpeed hero : flight){
            System.out.println(hero);
        }







        //end of psvm
    }

    //end of main
}
