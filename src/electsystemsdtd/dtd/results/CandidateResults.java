package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class CandidateResults extends Result{

    private int id;
    private int votesLast = 3333;
    private int votesNow = 0;

    public CandidateResults(int id, String name) {
        super(1, "Helle Thorning-Schmidt");
    }

    public CandidateResults() {
        super(1, "Helle Thorning-Schmidt");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "CandidateResults{" + "id=" + id + ", votesLast=" + votesLast + ", votesNow=" + votesNow + '}';
    }

}
