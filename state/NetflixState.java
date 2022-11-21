package state;
/**
 * this is the netflixstate for the TV
 * @author Jackson Williams
 */
public class NetflixState implements State{

    private TV tv;
    private String[] movies = new String[] {"\n-\sland before time","\n-\sfrozen","\n-\sthe little mermaid","\n-\sice age"};
    private String[] tvShows = new String[] {"\n-\speppa pig","\n-\smy little pony","\n-\sgarfield","\n-\sTMNG"};
    /**
     * constructo for the netflixstate inside the tv
     * @param tv new instance of tv
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }


    /**
     * if homebutton is pressed, changes to homestate.
     * @return returns a string
     */
    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen";
    }

    /**
     *  when netflix button is pressed within netflixstate
     * @return returns a string
     */
    @Override
    public String pressNetflixButton() {
        return "Already on Netflix";
    }

    /**
    *  if hulu button is pressed, changes to the hulustate.
    * @return returns a string
    */
    @Override
    public String pressHuluButton() {
       tv.setState(tv.getHuluState());
        return "\nLoading Hulu";
    }

    /**
     * displays list of movies when movie button is pressed
     * @return returns a movie list that is string array as a list of strings 
     */
    @Override
    public String pressMovieButton() {
       String movieList = toString(movies, " ");
        return "Netflix Movies: " + movieList;
    }

    /**
     * displays list of tv shows when tv shows button is pressed
     * @return returns a tv show list that is a string array as a of strings 
     */
    @Override
    public String pressTVButton() {
        String tvShowsList = toString(tvShows, " ");
        return "Netflix Tv shows: " + tvShowsList;
    }

    /**
     * A helper method that converts the string array to a string for printing out under the lists of movies and tv shows
     * @param stringArr the array of strings
     * @param delimiter the spacing between the strings 
     * @return returns the string builder so the array is converted
     */
    public String toString(String[] stringArr, String delimiter) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String movies : stringArr)
        stringBuilder.append(movies).append(delimiter);
		return stringBuilder.substring(0, stringBuilder.length() - 1);
	}

}
