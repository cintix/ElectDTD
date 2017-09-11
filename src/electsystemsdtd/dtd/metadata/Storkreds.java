package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Storkreds {

    private int id = 9000100;
    private int parentId = 7;
    private String name = "Københavns Storkreds";

    public Storkreds() {
    }

    public Storkreds(int id, int parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

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
        return "Storkreds{" + "id=" + id + ", parentId=" + parentId + ", name=" + name + '}';
    }

}
