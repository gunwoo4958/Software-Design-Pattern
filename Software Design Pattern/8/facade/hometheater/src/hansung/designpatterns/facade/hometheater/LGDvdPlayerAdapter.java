package hansung.designpatterns.facade.hometheater;

public class LGDvdPlayerAdapter extends LGDvdPlayer implements DvdPlayer {

    LGDvdPlayer dvd;

    public LGDvdPlayerAdapter(String description, Amplifier amplifier) {
        super(description, amplifier);
    }

//    public LGDvdPlayerAdapter(LGDvdPlayer dvd){
//        this.dvd= dvd;
//    }

    //LG디비디를 이용하여 구현하라 그 후 교체
    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
       super.off();
    }

    @Override
    public void eject() {
        super.eject();
    }

    @Override
    public void play(String movie) {
        super.play();
    }

    @Override
    public void play(int track) {

    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void setTwoChannelAudio() {
        super.setTwoChannelAudio();
    }

    @Override
    public void setSurroundAudio() {

    }
}
