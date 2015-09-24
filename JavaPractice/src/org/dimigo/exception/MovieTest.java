package org.dimigo.exception;

public class MovieTest {

		public static void main(String[] args) {
			Movie[] movies = {
					
					new Movie("앤트맨", 12), new Movie("사도", 12), 
					new Movie("베테랑", 15)
			};
			
			int age = 13;
			
			for(Movie movie : movies)
				buyTicket(movie, age);
		}
		
		private static void buyTicket(Movie movie, int age) {
			try {
				if(age < movie.getLimitAge())
					throw new AgeCheckException(movie);
				
				System.out.println(movie.getTitle()+" 즐거운 영화 관람 되세요.");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
