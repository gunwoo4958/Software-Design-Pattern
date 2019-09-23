package hansung.designpatterns.facade.hometheater;

//다른 인터페이스를 어댑터를 이용하여 변환 시켜라

//타입 변경과  플레이 무비의 변경
public class LGDvdPlayer{
    String description;
    int currentTrack;
    Amplifier amplifier;
    static final int MAXTRACK = 10;

    public LGDvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
        currentTrack=0;
    }

    public void on() {
        System.out.println(description + " on");

    }


    public void off() {
        System.out.println(description + " off");

    }


    public void eject() {
        System.out.println(description + " eject");

    }


    public void play() {
        System.out.println(description + " playing track " + currentTrack);

    }

    public void previous() {
        if (currentTrack >0)
            --currentTrack;
    }

    public void next() {
        if (currentTrack< MAXTRACK)
            ++currentTrack;
    }


    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped \"" );
    }


    public void pause() {
        System.out.println(description + " paused \"" );

    }


    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");

    }

}
