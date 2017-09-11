package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class StedResult extends Result {

    private int parentId = 101;

    public StedResult(int id, String name) {
        super(10101, "1. Østerbro");
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "StedResult{" + "parentId=" + parentId + '}';
    }

}
