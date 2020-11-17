package be.intecbrussel.audioplayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();

        }
        else if (audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }
        else if (audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
        else {
            invalidFormatMessage(audioType);
        }
    }

    private void invalidFormatMessage(String audioType) {
        System.out.println("Invalid media. " + audioType + " format not supported");

    }


}
