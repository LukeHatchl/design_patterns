package state;

public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Cars", "Cinderella", "Wall-E", "ET"};
    private String[] tvShows = {"sesame street", "care bears", "loney tunes"};


    public HuluState(TV tv) {
        this.tv = tv;
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading the Netflix Screen...\n";
    }

    public String pressHuluButton() {
        return "TV is already on the Hulu Screen\n";
    }

    public String pressMovieButton() {
        String ret = "";
        for(int i = 0; i < movies.length; i++) {
            ret+= "- "+movies[i]+"\n";
        }
        return "Hulu Movies:\n"+ret;
    }

    public String pressTVButton() {
        String ret = "";
        for(int i = 0; i < tvShows.length; i++) {
            ret+= "- "+tvShows[i]+"\n";
        }
        return "Hulu TV Shows:\n"+ret;
    }
    
}
