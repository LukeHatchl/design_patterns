package state;

public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Cars", "Cinderella", "Wall-E", "ET"};
    private String[] tvShows = {"sesame street", "care bears", "loney tunes"};


    /*
     * @param tv the current tv
     * Sets this instance of tv to the current tv
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    /*
     * Sets the current state to the Home state
     * @return text stating that the Home state is loading
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    /*
     * Sets the current state to the Netflix state
     * @return text stating that the Neflix state is loading
     */
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading the Netflix Screen...\n";
    }

    /*
     * @return text stating the tv is alreayd at this state
     */
    public String pressHuluButton() {
        return "TV is already on the Hulu Screen\n";
    }

    /*
     * creates a list of the movies on the Hulu app
     * @return the string containg the list of movies
     */
    public String pressMovieButton() {
        String ret = "";
        for(int i = 0; i < movies.length; i++) {
            ret+= "- "+movies[i]+"\n";
        }
        return "Hulu Movies:\n"+ret;
    }

    /*
     * creates a list of the tv shows on the Hulu app
     * @return the string containg the list of tv shows
     */
    public String pressTVButton() {
        String ret = "";
        for(int i = 0; i < tvShows.length; i++) {
            ret+= "- "+tvShows[i]+"\n";
        }
        return "Hulu TV Shows:\n"+ret;
    }
    
}
