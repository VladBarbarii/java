public abstract class Crashable {
    boolean carDrivable=true;
    public void youCrashed(){
        this.carDrivable=false;
    }

    public abstract void setCarDrivable(int carStrength);
    public abstract int getCarStrength();
}
