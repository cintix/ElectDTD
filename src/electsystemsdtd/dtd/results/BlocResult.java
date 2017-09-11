package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class BlocResult {

    private int id = 1;
    private double shareLastRounded = 35.5;
    private double shareNowRounded = 0.0;
    private int votesLast = 3333;
    private int votesNow = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getShareLastRounded() {
        return shareLastRounded;
    }

    public void setShareLastRounded(double shareLastRounded) {
        this.shareLastRounded = shareLastRounded;
    }

    public double getShareNowRounded() {
        return shareNowRounded;
    }

    public void setShareNowRounded(double shareNowRounded) {
        this.shareNowRounded = shareNowRounded;
    }

    public int getVotesLast() {
        return votesLast;
    }

    public void setVotesLast(int votesLast) {
        this.votesLast = votesLast;
    }

    public int getVotesNow() {
        return votesNow;
    }

    public void setVotesNow(int votesNow) {
        this.votesNow = votesNow;
    }

    @Override
    public String toString() {
        return "BlocResult{" + "id=" + id + ", shareLastRounded=" + shareLastRounded + ", shareNowRounded=" + shareNowRounded + ", votesLast=" + votesLast + ", votesNow=" + votesNow + '}';
    }

}
