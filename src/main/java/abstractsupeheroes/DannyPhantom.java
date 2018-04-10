package abstractsupeheroes;

public class DannyPhantom extends SuperHero implements IFlightSpeed{


    public DannyPhantom(String realN, String[] specialP) {
        super(realN, specialP);
    }

    String[] listPowers() {
        return getSpecialPowers();
    }


    public double flightSpeed() {
        return 112.0; //mph and faster as he grows into it
    }

}
