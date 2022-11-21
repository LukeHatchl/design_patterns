package state;

public class HomeState implements State {
    private TV tv;

    /*
     * @param tv the current tv
     * Sets this instance of tv to the current tv
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /*
     * @return text stating the tv is alreayd at this state
     */
    public String pressHomeButton() {
        return "\nTV is already on the Home Screen\n";
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
     * Sets the current state to the Hulu state
     * @return text stating that the Hulu state is loading
     */
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading the Hulu Screen...\n";
    }

    /*
     * @return text explaining how to view movies on an app
     */
    public String pressMovieButton() {
        return "In order to view movies select an app";
    }

    /*
     * @return text explaining how to view tv shows on an app
     */
    public String pressTVButton() {
        return "In order to view TV Shows select an app";
    }
    
}
