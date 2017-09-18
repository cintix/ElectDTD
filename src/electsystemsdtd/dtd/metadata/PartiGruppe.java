package electsystemsdtd.dtd.metadata;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author migo
 */
public class PartiGruppe {

    private int parentPartiId = 2;
    private List<ChildParti> partier = new LinkedList<>();

    public PartiGruppe() {
        partier.add(new ChildParti(1));
        partier.add(new ChildParti(3));
        partier.add(new ChildParti(4));
    }

    public int getParentPartiId() {
        return parentPartiId;
    }

    public void setParentPartiId(int parentPartiId) {
        this.parentPartiId = parentPartiId;
    }

    public List<ChildParti> getChildParti() {
        return partier;
    }

    public void setChildParti(List<ChildParti> childParti) {
        this.partier = childParti;
    }

    @Override
    public String toString() {
        return "PartiGruppe{" + "parentPartiId=" + parentPartiId + ", partier=" + partier + '}';
    }

}
