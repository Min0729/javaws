package day10.다른분들꺼;

public class AudioProgram {

	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.ShowAudioSpec();
		
		audio.selectModel("LG", "GramAudio", 500000);
		
		audio.ShowAudioSpec();
		
	}

}
