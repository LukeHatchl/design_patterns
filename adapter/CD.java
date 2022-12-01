package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /*
     * Assigns this instance of songs to general variable songs
     * @param songs arraylist containing the songs in the CD
     */
    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    /*
     * sets the current index to 0 and plays the song at that index
     */
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex);
    }

    /*
     * sets the current index to number of selected song
     * if selected index is not within array list of songs returns invalid
     * if selected index is within array list of songs, returns statement staying what is playing
     */
    public String playSong(int num) {
        currentIndex = num;
        if(currentIndex >= songs.size() || currentIndex < 0) {
            return "Not valid song number";
        }
        else {
            return "Playing "+songs.get(currentIndex);
        }
    }

    /*
     * plays previous song by decrementing the current index
     * if the current index is zero it remains at zero and plays the first song
     */
    public String prevSong() {
        if(currentIndex == 0) {
            return "Playing "+songs.get(currentIndex);
        }
        else {
            currentIndex -= 1;
            return "Skipping back and playing: "+songs.get(currentIndex-1);
        }
    }

    /*
     * plays next song by incrementing the current index
     * if current index is at the end of the cd current index
     * is set to 0 and it plays the first song on the cd
     */
    public String nextSong() {
        currentIndex += 1;
        if(currentIndex == (songs.size()+1)) {
            currentIndex = 0;
        }
        return "Playing "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    /*
     * returns text saying the cd is stopping
     */
    public String stop() {
        return "Stopping";
    }

    /*
     * returns text saying the cd is pausing
     */
    public String pause() {
        return "Pausing";
    }
}
