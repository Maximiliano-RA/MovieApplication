package mrs.data;

public class Movie {
    // Movie's private fields ------------------------------------------------------------------------------------------
    private String movieTitle;
    private String movieGenre;
    private String releaseDate;
    private boolean movieAvailability;
    private double rentalPrice;

    // Movie Constructors ----------------------------------------------------------------------------------------------
    public Movie(String movieTitle, String movieGenre, String releaseDate, double rentalPrice) {
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.releaseDate = releaseDate;
        this.movieAvailability = true;
        this.rentalPrice = rentalPrice;
    }

    // Movie Setters ---------------------------------------------------------------------------------------------------
    public void setMovieAvailability(boolean movieAvailability) {
        this.movieAvailability = movieAvailability;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    // Movie Getters ---------------------------------------------------------------------------------------------------
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public boolean isMovieAvailability() {
        return movieAvailability;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }

    public void getDetails() {
        System.out.println("---Movie Details---");
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Price: $" + rentalPrice);
    }
}
