package hu.helix.WA.WA_1206;

public class Car extends MotoricVehicle {

    private EngineType engineType;
    private static final int maxSpeed = 130;

    @Override
    public void go() {


          if  (getSpeed() > maxSpeed){
          throw new SpeedingException();}
    }




    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
