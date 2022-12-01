package adapter;

public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /*
     * assigns this instance of album to the general 
     * variable album
     * @param album the instance of a digital album
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }
    
    /*
     * calls next song on the album
     */
    public String play(){
        return album.nextSong();
    }

    /*
     * calls previous song on the album
     */
    public String rewind() {
        return album.prevSong();
    }

    /*
     * calls next song on the album
     */
    public String ffwd() {
        return album.nextSong();
    }

    /*
     * calls pause on the album
     */
    public String pause() {
        return album.pause();
    }

    /*
     * calls stop on the album
     */
    public String stopEject() {
        return album.stop();
    }
}
