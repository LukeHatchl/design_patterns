package state;

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;

    private State state;

    /*
     * Assigns each state to this instance of the states
     * sets the default state to HomeState
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }

    /*
     * Returns the result of pressing the home button for this instance of a state
     */
    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /*
     * Returns the result of pressing the Netflix button for this instance of a state
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }

    /*
     * Returns the result of pressing the Hulu button for this instance of a state
     */
    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    /*
     * Returns the result of pressing the Movie button for this instance of a state
     */
    public String pressMovieButton() {
        return state.pressMovieButton();
    }

    /*
     * Returns the result of pressing the TV button for this instance of a state
     */
    public String pressTVButton() {
        return state.pressTVButton();
    }

    /*
     * @param state the current state
     * Sets this instance of state equal to the current state
     */
    public void setState(State state) {
        this.state = state;
    }

    /*
     * Gets the Home state
     * @return the HomeState
     */
    public State getHomeState() {
        return HomeState;
    }

    /*
     * Gets the Netflix state
     * @return the NetflixState
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /*
     * Gets the Hulu state
     * @return the HuluState
     */
    public State getHuluState() {
        return HuluState;
    }
}
