public class CDPlayer extends Component implements IPlayPause, INextBack {

    private int numOfCds;

    public CDPlayer(String make, String model, int numOfCds) {
        super(make, model);
        this.numOfCds = numOfCds;
    }

    public int getNumOfCds() {
        return numOfCds;
    }

    public String play() {
        return "CD is playing";
    }

    public String pause() {
        return "CD is paused";
    }

    public String next() {
        return "Next song playing";
    }

    public String back() {
        return "Previous song playing";
    }
}
