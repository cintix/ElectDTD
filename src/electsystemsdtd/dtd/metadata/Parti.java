package electsystemsdtd.dtd.metadata;

/**
 *
 * @author migo
 */
public class Parti {

    private int id = 1;
    private String letter = "A";
    private String name = "Socialdemokraterne";
    private String shortName = "soc.dem";
    private int blocId = 1;
    private String parliamentary = "Y";
    private String majorParty = "Y";
    private String independent = "N";

    public Parti() {
    }

    public Parti(int id, String name, String shortName, String letter) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.letter = letter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getBlocId() {
        return blocId;
    }

    public void setBlocId(int blocId) {
        this.blocId = blocId;
    }

    public String getParliamentary() {
        return parliamentary;
    }

    public void setParliamentary(String parliamentary) {
        this.parliamentary = parliamentary;
    }

    public String getMajorParty() {
        return majorParty;
    }

    public void setMajorParty(String majorParty) {
        this.majorParty = majorParty;
    }

    public String getIndependent() {
        return independent;
    }

    public void setIndependent(String independent) {
        this.independent = independent;
    }

    @Override
    public String toString() {
        return "Parti{" + "id=" + id + ", letter=" + letter + ", name=" + name + ", shortName=" + shortName + ", blocId=" + blocId + ", parliamentary=" + parliamentary + ", majorParty=" + majorParty + ", independent=" + independent + '}';
    }

}
