package electsystemsdtd.dtd.results;

import electsystemsdtd.dtd.results.ResultList;

/**
 *
 * @author migo
 */
public abstract class Result {

    private int id;
    private String name;
    private int electorateLast = 13115;
    private int electorateNow = 13411;
    private double turnoutPctLastRounded = 90.4;
    private double turnoutPctNowRounded = 0.0;
    private int validVotesLast = 11282;
    private int validVotesNow = 0;
    private int blankVotesLast = 61;
    private int blankVotesNow = 0;
    private int badVotesLast = 12;    
    private int badVotesNow = 0;
    private String estDeclareTime = "1900-01-01T00:00:00";
    private String actualDeclareTime = "1900-01-01T00:00:00";
    private int blocId = 1;
    private ResultList resultList = new ResultList();

    public Result(int id, String name) {
        this.id = id;
        this.name = name;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElectorateLast() {
        return electorateLast;
    }

    public void setElectorateLast(int electorateLast) {
        this.electorateLast = electorateLast;
    }

    public int getElectorateNow() {
        return electorateNow;
    }

    public void setElectorateNow(int electorateNow) {
        this.electorateNow = electorateNow;
    }

    public double getTurnoutPctLastRounded() {
        return turnoutPctLastRounded;
    }

    public void setTurnoutPctLastRounded(double turnoutPctLastRounded) {
        this.turnoutPctLastRounded = turnoutPctLastRounded;
    }

    public double getTurnoutPctNowRounded() {
        return turnoutPctNowRounded;
    }

    public void setTurnoutPctNowRounded(double turnoutPctNowRounded) {
        this.turnoutPctNowRounded = turnoutPctNowRounded;
    }

    public int getValidVotesLast() {
        return validVotesLast;
    }

    public void setValidVotesLast(int validVotesLast) {
        this.validVotesLast = validVotesLast;
    }

    public int getValidVotesNow() {
        return validVotesNow;
    }

    public void setValidVotesNow(int validVotesNow) {
        this.validVotesNow = validVotesNow;
    }

    public int getBlankVotesLast() {
        return blankVotesLast;
    }

    public void setBlankVotesLast(int blankVotesLast) {
        this.blankVotesLast = blankVotesLast;
    }

    public int getBlankVotesNow() {
        return blankVotesNow;
    }

    public void setBlankVotesNow(int blankVotesNow) {
        this.blankVotesNow = blankVotesNow;
    }

    public int getBadVotesLast() {
        return badVotesLast;
    }

    public void setBadVotesLast(int badVotesLast) {
        this.badVotesLast = badVotesLast;
    }

    public int getBadVotesNow() {
        return badVotesNow;
    }

    public void setBadVotesNow(int badVotesNow) {
        this.badVotesNow = badVotesNow;
    }

    public String getEstDeclareTime() {
        return estDeclareTime;
    }

    public void setEstDeclareTime(String estDeclareTime) {
        this.estDeclareTime = estDeclareTime;
    }

    public String getActualDeclareTime() {
        return actualDeclareTime;
    }

    public void setActualDeclareTime(String actualDeclareTime) {
        this.actualDeclareTime = actualDeclareTime;
    }

    public int getBlocId() {
        return blocId;
    }

    public void setBlocId(int blocId) {
        this.blocId = blocId;
    }

    public ResultList getResultList() {
        return resultList;
    }

    public void setResultList(ResultList resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return "Result{" + "id=" + id + ", name=" + name + ", electorateLast=" + electorateLast + ", electorateNow=" + electorateNow + ", turnoutPctLastRounded=" + turnoutPctLastRounded + ", turnoutPctNowRounded=" + turnoutPctNowRounded + ", validVotesLast=" + validVotesLast + ", validVotesNow=" + validVotesNow + ", blankVotesLast=" + blankVotesLast + ", blankVotesNow=" + blankVotesNow + ", badVotesLast=" + badVotesLast + ", badVotesNow=" + badVotesNow + ", estDeclareTime=" + estDeclareTime + ", actualDeclareTime=" + actualDeclareTime + ", blocId=" + blocId + ", resultList=" + resultList + '}';
    }

}
