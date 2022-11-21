package state;
/**
 * this is the hulustate for the TV
 * @author Jackson Williams
 */
public class HuluState implements State{

    private TV tv;
    private String[] movies = new String [] {"\n-\scars","\n-\scinderella","\n-\swall-e","\n-\set"};
    private String[] tvShows = new String [] {"\n-\ssesame street","\n-\scare bears","\n-\sLooney Tunes"};
    /**
     * constructo for the hulustate inside the tv
     * @param tv new instance of tv
     */
    public HuluState(TV tv) {
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
    *  if netflix button is pressed, changes to the netflixstate.
    * @return returns a string
    */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix";
    }

    /**
     *  when hulu button is pressed within hulustate
     * @return returns a string
     */
    @Override
    public String pressHuluButton() {
        return "Already on Hulu";
    }

    /**
     * displays list of movies when movie button is pressed
     * @return returns a movie list that is string array as a list of strings 
     */
    @Override
    public String pressMovieButton() {
        String movieList = toString(movies, " ");
        return "Hulu Movies: " + movieList;
    }
    
    /**
     * displays list of tv shows when tv shows button is pressed
     * @return returns a tv show list that is a string array as a of strings 
     */
    @Override
    public String pressTVButton() {
        String tvShowsList = toString(tvShows, " ");
        return "Hulu Tv shows: " + tvShowsList;
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
