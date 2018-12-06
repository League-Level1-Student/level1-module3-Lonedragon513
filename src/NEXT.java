
public class NEXT {

Movie m1 = new Movie ("night",4);
Movie m2 = new Movie ("Life",3);
Movie m3 = new Movie ("Liphe",5);
Movie m4 = new Movie ("GOD",4);
Movie m5 = new Movie ("LOL",1);

NetflixQueue NQ = new NetflixQueue();
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
new NEXT().sundog();
}

void sundog () {
	m3.getTicketPrice();
	NQ.addMovie(m1);
	NQ.addMovie(m2);
	NQ.addMovie(m3);
	NQ.addMovie(m4);
	NQ.addMovie(m5);

	NQ.printMovies();
	Movie best = NQ.getBestMovie();
	System.out.println("the best movie is  " + best);
	Movie SEC = NQ.getMovie(1);
	System.out.println("the second best movie is  " + SEC);
}


}
