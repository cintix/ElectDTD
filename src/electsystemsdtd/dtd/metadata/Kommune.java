package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Kommune {

    private int id = 12;
    private int kredsId = 9000208;
    private int regionId = 84982;
    private String name = "Ballerup";

    public Kommune() {
    }

    public Kommune(int id, int kredsId, int regionId, String name) {
        this.id = id;
        this.kredsId = kredsId;
        this.regionId = regionId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKredsId() {
        return kredsId;
    }

    public void setKredsId(int kredsId) {
        this.kredsId = kredsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "Kommune{" + "id=" + id + ", kredsId=" + kredsId + ", regionId=" + regionId + ", name=" + name + '}';
    }

}
