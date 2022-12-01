package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /*
     * assigns this instance of songs to the general variable songs
     * @param songs arraylist containing songs on cassette
     */
    public Cassette(ArrayList<String> songs) {
        this.songs = songs;
    }
    
    /*
     * plays the songs on the cassette in order
     * returns test ssaying at the end if cassette is at the end
     */
    public String play(){
        currentIndex++;
        if(currentIndex == songs.size()+1) {
            return "At the end of the Cassett you need to rewind";
        }
        else {
            return "Playing Song " + (currentIndex) + ": " + songs.get(currentIndex-1);
        }
    }

    /*
     * rewinds the cassette by one song
     * returns text saying fully rewound if back to the beginning
     */
    public String rewind() {
        if(currentIndex == 0) {
            return "Fully Re-wound";
        }
        else {
            currentIndex -= 1;
            return "Rewinding to song "+(currentIndex+1);
        }
    }

    /*
     * fast forwards cassette, skipping a song
     */
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

    /*
     * returns text saying cassette is pausing
     */
    public String pause() {
        return "Pausing";
    }

    /*
     * returns text saying cassette is stopping
     */
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
