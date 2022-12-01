package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassette(ArrayList<String> songs) {
        this.songs = songs;
    }
    
    public String play(){
        currentIndex++;
        if(currentIndex == songs.size()+1) {
            return "At the end of the Cassett you need to rewind";
        }
        else {
            return "Playing Song " + (currentIndex) + ": " + songs.get(currentIndex-1);
        }
    }

    public String rewind() {
        if(currentIndex == 0) {
            return "Fully Re-wound";
        }
        else {
            currentIndex -= 1;
            return "Rewinding to song "+(currentIndex+1);
        }
    }

    public String ffwd() {
        currentIndex += 1;
        if(currentIndex == songs.size()) {
            return "At the end of the cassette you need to rewind";
        }
        else if(currentIndex == (songs.size()-1)) {
            return "Forwarded to the end of the cassette";
        }
        else {
            return "Forwarded to song "+(currentIndex+1);
        }
    }

    public String pause() {
        return "Pausing";
    }

    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
