package state;

public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    public String pressHomeButton() {
        return "\nTV is already on the Home Screen\n";
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading the Netflix Screen...\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading the Hulu Screen...\n";
    }

    public String pressMovieButton() {
        return "In order to view movies select an app";
    }

    public String pressTVButton() {
        return "In order to view TV Shows select an app";
    }
    
}
