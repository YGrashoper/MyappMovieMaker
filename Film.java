public class Film {
    public String genre;
    public String cinemaToWatch;
    public String releaseYear;

    //set used to modify variable//
    //get used to approach variable//
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setCinemaToWatch(String cinemaToWatch) {
        this.cinemaToWatch = cinemaToWatch;
    }

    public String getCinemaToWatch() {
        return this.cinemaToWatch;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = String.valueOf(releaseYear);
    }

    public String getReleaseYear() {
        return this.releaseYear;
    }
}


