public abstract class Component  {
    private String make;
    private String model;
    private boolean powerOn;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
        this.powerOn = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isPowerOn() {
        return powerOn;
    }
}
