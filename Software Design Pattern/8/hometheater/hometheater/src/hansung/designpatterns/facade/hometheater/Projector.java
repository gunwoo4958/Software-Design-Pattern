package hansung.designpatterns.facade.hometheater;

public class Projector {
	String description;
	DvdPlayer dvdPlayer;
	LGDvdPlayer lgDvdPlayer;
	
	public Projector(String description, LGDvdPlayer lgDvdPlayer) {
		this.description = description;
		this.lgDvdPlayer=lgDvdPlayer;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void wideScreenMode() {
		System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
	}

	public void tvMode() {
		System.out.println(description + " in tv mode (4x3 aspect ratio)");
	}
  
        public String toString() {
                return description;
        }
}
