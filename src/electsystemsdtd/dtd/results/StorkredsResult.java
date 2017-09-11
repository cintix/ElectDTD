package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class StorkredsResult extends Result {

    public StorkredsResult(int id, String name) {
        super(9000100, "Københavns Storkreds");
    }

    private int parentId = 7;
    private int kommunes = 4;
    private int sted = 66;
    private int kreds = 12;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getKommunes() {
        return kommunes;
    }

    public void setKommunes(int kommunes) {
        this.kommunes = kommunes;
    }

    public int getSted() {
        return sted;
    }

    public void setSted(int sted) {
        this.sted = sted;
    }

    public int getKreds() {
        return kreds;
    }

    public void setKreds(int kreds) {
        this.kreds = kreds;
    }

    @Override
    public String toString() {
        return "StorkredsResult{" + "parentId=" + parentId + ", kommunes=" + kommunes + ", sted=" + sted + ", kreds=" + kreds + '}';
    }

}
