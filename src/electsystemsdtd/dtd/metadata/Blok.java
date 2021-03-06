package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Blok {

    private int id = 1;
    private String name = "red";

    public int getId() {
        return id;
    }

    public Blok() {
    }

    public Blok(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bloc{" + "id=" + id + ", name=" + name + '}';
    }

}
