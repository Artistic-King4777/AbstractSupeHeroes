package abstractsupeheroes;

public class Falcon extends SuperHero implements IFlightSpeed, IBlackHeroes {

    public Falcon(String realN, String[] specialP) {
        super(realN, specialP);
    }

    String[] listPowers() {
        return getSpecialPowers();
    }


    public double flightSpeed() {
        return 250.0; //mph
    }

    public String myBlackHero() {
        return "My black hero is Falcon";
    }

}
