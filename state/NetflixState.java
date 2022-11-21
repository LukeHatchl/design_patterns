package state;

public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
    private String[] tvShows = {"Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};

    public NetflixState(TV tv) {
        this.tv = tv;
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    public String pressNetflixButton() {
        return "TV is already on the Netflix Screen\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading the Hulu Screen...\n";
    }

    public String pressMovieButton() {
        String ret = "";
        for(int i = 0; i < movies.length; i++) {
            ret+= "- "+movies[i]+"\n";
        }
        return "Netflix Movies:\n"+ret;
    }

    public String pressTVButton() {
        String ret = "";
        for(int i = 0; i < tvShows.length; i++) {
            ret+= "- "+tvShows[i]+"\n";
        }
        return "Netflix TV Shows:\n"+ret;
    }
    
}
