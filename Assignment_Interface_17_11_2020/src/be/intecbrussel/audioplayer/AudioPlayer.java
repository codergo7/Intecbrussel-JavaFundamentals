package be.intecbrussel.audioplayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            playMp3(fileName);
        } else {
            mediaAdapter = createAnInstanceOfMediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }

    private void playMp3(String fileName) {
        System.out.println("Playing mp3 file. Name: " + fileName);
    }

    private MediaAdapter createAnInstanceOfMediaAdapter(String audioType){
        return new MediaAdapter(audioType);
    }
}
