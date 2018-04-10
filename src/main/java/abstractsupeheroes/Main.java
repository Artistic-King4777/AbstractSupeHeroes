package abstractsupeheroes;

public class Main {
    public static void main(String[] args) {


        SuperHero underoos = new SpiderMan("Peter Parker",  new String[]{"Spidey Sense, Wall Crawling, Web Shooters, Superhuman Flexibility and, Healing Factor"});

        SuperHero sam = new Falcon("Sam Wilson", new String[]{"Master Aerialist, Master Acrobat, Flight, Cybernetic Implants, Skilled Shield Fighter"});

        SuperHero wade = new Deadpool("Wade Wilson", new String[]{"EXTREME Healing Factor, Immortality, Superhuman Stamina, Skilled Swordsman, Resistance to Drugs/Poisons"});

        SuperHero danny = new DannyPhantom("Danny Fenton", new String[]{"Ghostly Abilities, Ghostly Wail, Ghost Sense, Cryokinesis, Going Ghost"});



        SuperHero[] supers = new SuperHero[]{underoos, sam, wade, danny};
        for(SuperHero su : supers){
            //System.out.println("\n" + su.getRealName() + " possesses these powers: " + su.listPowers() + "\n");
            System.out.println(su.toString());
        }


        System.out.print("Danny Phantom flies over " + ((DannyPhantom) danny).flightSpeed() + "mph!" + "\n" + "\n");

        System.out.println("==============================================================");
        System.out.println("\n" + "Falcon flies around " + ((Falcon) sam).flightSpeed() + "mph!" + "\n");
        System.out.println(((Falcon) sam).flightSpeed());
        System.out.println("=============================================================");
        System.out.println(((Falcon) sam).myBlackHero() + "! He can fly at speeds up to " + ((Falcon) sam).flightSpeed() + "mph, Wow!");

    }
}
