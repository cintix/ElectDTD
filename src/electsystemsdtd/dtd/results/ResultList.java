package electsystemsdtd.dtd.results;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author migo
 */
public class ResultList {

    private int partiId;
    private double shareLastRounded = 35.5;
    private double shareNowRounded = 0.0;
    private int votesLast = 3333;
    private int votesNow = 0;
    private List<CandidateResults> candidates = new LinkedList<>();

    public ResultList() {
        candidates.add(new CandidateResults());
    }

    public int getPartiId() {
        return partiId;
    }

    public void setPartiId(int partiId) {
        this.partiId = partiId;
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

    public List<CandidateResults> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<CandidateResults> candidates) {
        this.candidates = candidates;
    }

    @Override
    public String toString() {
        return "ResultList{" + "partiId=" + partiId + ", shareLastRounded=" + shareLastRounded + ", shareNowRounded=" + shareNowRounded + ", votesLast=" + votesLast + ", votesNow=" + votesNow + ", candidates=" + candidates + '}';
    }

}
