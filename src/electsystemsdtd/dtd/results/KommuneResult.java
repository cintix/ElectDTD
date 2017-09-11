package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class KommuneResult extends Result {

    private int parentId = 9000208;
    private int steds = 12;

    public KommuneResult(int id, String name) {
        super(101, "Ballerup");
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getSteds() {
        return steds;
    }

    public void setSteds(int steds) {
        this.steds = steds;
    }

    @Override
    public String toString() {
        return "KommuneResult{" + "parentId=" + parentId + ", steds=" + steds + '}';
    }

}
