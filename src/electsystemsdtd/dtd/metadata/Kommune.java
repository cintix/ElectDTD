package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Kommune {

    private int id = 12;
    private int parentId = 9000208;
    private String name = "Ballerup";

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
        return "Kommune{" + "id=" + id + ", parentId=" + parentId + ", name=" + name + '}';
    }


}
