package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Kandidat {

    private int id = 1;
    private int partiId = 1;
    private String name = "Helle Thorning-Schmidt";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartiId() {
        return partiId;
    }

    public void setPartiId(int partiId) {
        this.partiId = partiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kandidat{" + "id=" + id + ", partiId=" + partiId + ", name=" + name + '}';
    }

}
