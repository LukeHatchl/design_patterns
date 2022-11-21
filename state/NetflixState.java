package state;

public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
    private String[] tvShows = {"Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};

    /*
     * @param tv the current tv
     * Sets this instance of tv to the current tv
     */
    public NetflixState(TV tv) {
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
     * @return text stating the tv is alreayd at this state
     */
    public String pressNetflixButton() {
        return "TV is already on the Netflix Screen\n";
    }

    /*
     * Sets the current state to the Hulu state
     * @return text stating that the Hulu state is loading
     */
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading the Hulu Screen...\n";
    }

    /*
     * creates a list of the movies on the Netflix app
     * @return the string containg the list of movies
     */
    public String pressMovieButton() {
        String ret = "";
        for(int i = 0; i < movies.length; i++) {
            ret+= "- "+movies[i]+"\n";
        }
        return "Netflix Movies:\n"+ret;
    }

    /*
     * creates a list of the tv shows on the Netflix app
     * @return the string containg the list of tv shows
     */
    public String pressTVButton() {
        String ret = "";
        for(int i = 0; i < tvShows.length; i++) {
            ret+= "- "+tvShows[i]+"\n";
        }
        return "Netflix TV Shows:\n"+ret;
    }
    
}
