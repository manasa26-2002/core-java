class TheaterRunner{
	public static void main(String [] args){
		boolean isMovieAdded = Theater.addMovie("raayan");
		System.out.println("isMovieAdded:"+isMovieAdded);
		
		isMovieAdded = Theater.addMovie("bheema");
		System.out.println("isMovieAdded :"+isMovieAdded);
		
		isMovieAdded = Theater.addMovie("kalki");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("shole");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("super 30");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("sanam tere kasam");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("kantara");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("katera");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("ugram");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("jackie");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("anna bond");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("dj tillu");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("mad");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("rider");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		isMovieAdded = Theater.addMovie("master");
		System.out.println("isMovieAdded :" +isMovieAdded);
		
		Theater.getMovie();
		
		boolean isMovieUpdated = Theater.updateMovieName("yuvarathna" , "dj tillu");
		System.out.println("isMovieUpdated :" +isMovieUpdated);
		
		Theater.getMovie();
		boolean isDeleted = Theater.deleteMovieByName("dj tillu");
		
		Theater.getMovie();
		
		System.out.println("main ended");
	}
}