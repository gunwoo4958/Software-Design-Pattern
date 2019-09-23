package hansung.designpatterns.facade.hometheater;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {

		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner",amp);
        Adapter adapter = new Adapter("LGDVD",amp); //어댑터 객체 생성
		//DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp); //기존 코드
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", adapter);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, adapter, cd,
						projector, screen, lights, popper);
 
		homeTheater.watchMovie();
		homeTheater.endMovie();
	}
}
