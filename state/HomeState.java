package state;
/**
 * this is the homestate for the TV
 * @author Jackson Williams
 */
public class HomeState implements State{
    private TV tv;
    
    /**
     * constructor for the homestate inside the TV
     * @param tv new instance of a tv
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }
/**
 * prints out string when the home button is pressed
 */
    @Override
    public String pressHomeButton() {
        return "Already on Home Screen";
    }

    /**
     * loads the netflix state whenever netflix button is pressed
     */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "\nLoading Netflix";
    }

    /**
     * loads the hulu state when hulu button is pressed
     */
    @Override
    public String pressHuluButton() {
       tv.setState(tv.getHuluState());
        return "Loading Hulu";
    }

    /**
     * string printed out if neither hulu nor netflix button is pressed first
     */
    @Override
    public String pressMovieButton() {
        return "Must pick an app to view movies";
    }

    /**
     * string printed out if neither hulu nor netflix button is pressed first
     */
    @Override
    public String pressTVButton() {
        return "must pick an app to view Tv shows";
    }

}
