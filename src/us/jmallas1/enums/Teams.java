package us.jmallas1.enums;

/**
 * Enumeration of valid teams
 * @author Jared Mallas
 * @version 1.0
 */
public enum Teams
{
    DAL("Dallas", "Cowboys"), NYG("New York", "Giants"), PHI("Philadelphia", "Eagles"), WAS("Washington", "Redskins"),
    CHI("Chicago", "Bears"), DET("Detroit", "Lions"), GBP("Green Bay", "Packers"), MIN("Minnesota", "Vikings"),
    ATL("Atlanta", "Falcons"), CAR("Carolina", "Panthers"), NOS("New Orleans", "Saints"), TBB("Tampa Bay", "Buccaneers"),
    AZI("Arizona", "Cardinals"), LAR("Los Angeles", "Rams"), SFO("San Francisco", "49ers"), SEA("Seattle", "Seahawks");
    private String city;
    private String mascot;

    /**
     * Constructor for teams
     * @param city City which team represents (as the actual cities of team ownership may be different)
     * @param mascot Mascot of the team
     */
    Teams(String city, String mascot)
    {
        this.city = city;
        this.mascot = mascot;
    }

    /**
     * Override of toString
     * @return the city and mascot
     */
    @Override
    public String toString() {
        return this.city + " " + this.mascot;
    }

    public String getCity() {
        return city;
    }

    public String getMascot() {
        return mascot;
    }
}