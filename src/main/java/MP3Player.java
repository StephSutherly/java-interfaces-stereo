public class MP3Player extends Component implements IConnect, IPlayPause, INextBack {

    public MP3Player(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "MP3 is playing";
    }

    public String pause() {
        return "MP3 is paused";
    }

    public String next() {
        return "Next song playing";
    }

    public String back() {
        return "Previous song playing";
    }

    public String connect(Stereo stereo) {
        return "I am connected to " + stereo.getName();
    }
}
