package state;
/**
 * the tv 
 * @author Jackson Williams
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * constructor that creates different states in the tv.
     */
    public TV(){
        HomeState = new HomeState(this);
		NetflixState = new NetflixState(this);
		HuluState = new HuluState(this);

        state = HomeState;
    }

    /**
     * homebutton takes you to the home state
     * @return returns the string that is attached to the homebutton 
     */
    public String pressHomeButton(){
        return state.pressHomeButton();
    }

    /**
     * netflixbutton takes you to the netflix state
     * @return returns the string that is attached to the netflixbutton 
     */
    public String pressNetflixButton(){
        return state.pressNetflixButton();
    }

    /**
     * hulubutton takes you to the hulu state
     * @return returns the string that is attached to the hulubutton 
     */
    public String pressHuluButton(){
        return state.pressHuluButton();
    }

    /**
     * moviebutton shows you the movies within that state
     * @return returns the string of movies attached to the specific sate 
     */
    public String pressMovieButton(){
        return state.pressMovieButton();
    }
    
    /**
     * TVbutton shows you the tv shows within that state
     * @return returns the string of tv shows attached to the specific sate 
     */
    public String pressTVButton(){
        return state.pressTVButton();
    }

    /**
     * sets the current state
     * @param state new state 
     */
    public void setState(State state){
        this.state = state;
    }

    public State getHomeState(){
        return HomeState;
    }

    public State getNetflixState(){
        return NetflixState;
    }

    public State getHuluState(){
        return HuluState;
    }
}
