package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Kreds {

    private int id = 9000102;
    private int parentId = 9000100;
    private String name = "Sundbyvesterkredsen";

    public Kreds() {
    }

    public Kreds(int id, int parentId, String name) {
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
        return "Kreds{" + "id=" + id + ", parentId=" + parentId + ", name=" + name + '}';
    }

}
