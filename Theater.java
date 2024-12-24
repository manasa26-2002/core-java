import java.util.Arrays;
class Theater{
	static String movies[] = {null , null , null, null, null, null, null, null, null, null, null, null, null, null, null };
	static int index;
	
	public static boolean addMovie(String Movie){
		
		System.out.println("add movie started");
		boolean isMovieAdded = false;
		if(Movie !=null){
		System.out.println("movies name proceed");
	    movies[index] = Movie;
		index++;
		isMovieAdded = true;
	}else{
		System.out.println("movie is null");
	}
	System.out.println("add movies ended");
	return isMovieAdded;
	}
	public static void getMovie(){
		System.out.println("getMovies started");
		System.out.println("list of movies are:");
		for(String Movie : movies){
			System.out.println(Movie);
		}
	}
	public static boolean updateMovieName(String newMovieName , String oldMovieName){
		boolean isMovieNameUpdated = false;
		for(int stop =0; stop<movies.length; stop++){
			if(movies[stop] == oldMovieName){
				movies[stop] = newMovieName;
				isMovieNameUpdated = true;
				break;
			}
		}
		if(isMovieNameUpdated == false) System.out.println(oldMovieName + "not found");
		return isMovieNameUpdated;
	}
	public static boolean deleteMovieByName(String movieName){
		System.out.println("deleteMovieByName started");
		boolean isMovieDeleted = false;
		int index ,newIndex;
		for(index =0,newIndex=0; index<movies.length; index++){
			String existingMovieName = movies[index];
			if(existingMovieName !=movieName){
				movies[newIndex++] = existingMovieName;
			}else{
				isMovieDeleted = true;
			}
		}
		movies = Arrays.copyOf(movies , newIndex);
		return isMovieDeleted;
	}
}
