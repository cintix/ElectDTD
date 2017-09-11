package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Landsdel {

    private int id = 7;
    private int parentId = 999;
    private String name = "Hovedstaden";

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
        return "Landsdel{" + "id=" + id + ", parentId=" + parentId + ", name=" + name + '}';
    }


}
