public class Stereo {
    private String name;
    private CDPlayer cdPlayer;
    private Radio radio;

    public Stereo(String name, CDPlayer cdPlayer, Radio radio) {
        this.name = name;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
    }

    public String getName() {
        return name;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public Radio getRadio() {
        return radio;
    }

    public String playCD() {
        return cdPlayer.play();
    }

    public String tuneRadio() {
        return radio.tune("Radio4");
    }
}
