package projefull;
public class teamİnfo {
    
     private String teamName;
    private String director;
    private String color;
    private String date;
    private String stadium;
    private int sayi;

    public teamİnfo(String teamName, String director, String color, String date, String stadium, int sayi) {
        this.teamName = teamName;
        this.director = director;
        this.color = color;
        this.date = date;
        this.stadium = stadium;
        this.sayi = sayi;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the stadium
     */
    public String getStadium() {
        return stadium;
    }

    /**
     * @param stadium the stadium to set
     */
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    /**
     * @return the sayi
     */
    public int getSayi() {
        return sayi;
    }

    /**
     * @param sayi the sayi to set
     */
    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
    
    
    
}
