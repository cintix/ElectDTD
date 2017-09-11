package electsystemsdtd.dtd.results;

/**
 *
 * @author migo
 */
public class LandResult extends Result {

    public LandResult(int id, String name) {
        super(999, "Hele landet");
    }

    private int kommunes = 22;
    private int sted = 1236;
    private int kreds = 30;
    private int storkreds = 4;
    private int landsdele = 3;

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

    public int getLandsdele() {
        return landsdele;
    }

    public void setLandsdele(int landsdele) {
        this.landsdele = landsdele;
    }

    @Override
    public String toString() {
        return "LandResult{" + "kommunes=" + kommunes + ", sted=" + sted + ", kreds=" + kreds + ", storkreds=" + storkreds + ", landsdele=" + landsdele + '}';
    }

}
