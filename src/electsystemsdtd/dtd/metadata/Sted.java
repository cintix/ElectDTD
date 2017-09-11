package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Sted {

    private int id = 10101;
    private int parentId = 101;
    private String name = "1. Østerbro";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sted{" + "id=" + id + ", parentId=" + parentId + ", name=" + name + '}';
    }

}
