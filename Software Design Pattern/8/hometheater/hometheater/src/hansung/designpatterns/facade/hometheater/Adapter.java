package hansung.designpatterns.facade.hometheater;

public class Adapter extends LGDvdPlayer implements Target {

    public Adapter(String description, Amplifier amplifier) {
        super(description, amplifier);

    }

    @Override
    public void eject() {
        super.eject();
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    @Override
    public void next() {
        super.next();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void previous() {
        super.previous();
    }

    @Override
    public void setTwoChannelAudio() {
        super.setTwoChannelAudio();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
