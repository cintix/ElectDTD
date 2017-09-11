package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class KredsResult extends Result {

    public KredsResult(int id, String name) {
        super(9000102, "Sundbyvesterkredsen");
    }

    private int parentId = 9000100;
    private int kommunes = 2;
    private int sted = 10;

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

    @Override
    public String toString() {
        return "KredsResult{" + "parentId=" + parentId + ", kommunes=" + kommunes + ", sted=" + sted + '}';
    }

}
