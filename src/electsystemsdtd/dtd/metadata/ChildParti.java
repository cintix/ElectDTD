package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class ChildParti {

    private int partiId;

    public ChildParti() {
    }

    public ChildParti(int partiId) {
        this.partiId = partiId;
    }

    public int getPartiId() {
        return partiId;
    }

    public void setPartiId(int partiId) {
        this.partiId = partiId;
    }

    @Override
    public String toString() {
        return "ChildParti{" + "partiId=" + partiId + '}';
    }

}
