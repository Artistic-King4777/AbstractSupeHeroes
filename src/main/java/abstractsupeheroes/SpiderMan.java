package abstractsupeheroes;

public class SpiderMan extends SuperHero implements IFlightSpeed{


    public SpiderMan(String realN, String[] specialP) {
        super(realN, specialP);
    }

    String[] listPowers() {
        return getSpecialPowers();
    }


    public double flightSpeed() {
        return 45.50; //GLIDING
    }
}
