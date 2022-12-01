package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex);
    }

    public String playSong(int num) {
        currentIndex = num;
        if(currentIndex >= songs.size() || currentIndex < 0) {
            return "Not valid song number";
        }
        else {
            return "Playing "+songs.get(currentIndex);
        }
    }

    public String prevSong() {
        if(currentIndex == 0) {
            return "Playing "+songs.get(currentIndex);
        }
        else {
            currentIndex -= 1;
            return "Skipping back and playing: "+songs.get(currentIndex-1);
        }
    }

    public String nextSong() {
        currentIndex += 1;
        if(currentIndex == (songs.size()+1)) {
            currentIndex = 0;
        }
        return "Playing "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    public String stop() {
        return "Stopping";
    }

    public String pause() {
        return "Pausing";
    }
}
