package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class LandsdelResult extends Result {

    public LandsdelResult(int id, String name) {
        super(7, "Hovedstaden");
    }

    private int parentId = 999;
    private int kommunes = 22;
    private int sted = 1236;
    private int kreds = 30;
    private int storkreds = 4;

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

    public int getStorkreds() {
        return storkreds;
    }

    public void setStorkreds(int storkreds) {
        this.storkreds = storkreds;
    }

    @Override
    public String toString() {
        return "LandsdelResult{" + "parentId=" + parentId + ", kommunes=" + kommunes + ", sted=" + sted + ", kreds=" + kreds + ", storkreds=" + storkreds + '}';
    }

}
