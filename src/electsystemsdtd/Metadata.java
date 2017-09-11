package electsystemsdtd;

import electsystemsdtd.dtd.metadata.Kandidat;
import electsystemsdtd.dtd.metadata.Kommune;
import electsystemsdtd.dtd.metadata.Kreds;
import electsystemsdtd.dtd.metadata.Land;
import electsystemsdtd.dtd.metadata.Landsdel;
import electsystemsdtd.dtd.metadata.Parti;
import electsystemsdtd.dtd.metadata.Region;
import electsystemsdtd.dtd.metadata.Storkreds;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author migo
 */
public class Metadata {

    private Land land = new Land();
    private List<Landsdel> landsdel = new LinkedList<>();
    private List<Region> region = new LinkedList<>();
    private List<Storkreds> storkreds = new LinkedList<>();
    private List<Kreds> kreds = new LinkedList<>();
    private List<Kommune> kommune = new LinkedList<>();
    private List<Parti> parti = new LinkedList<>();
    private List<Kandidat> kandidat = new LinkedList<>();

    public Metadata() {
        
        landsdel.add(new Landsdel());
        region.add(new Region());
        storkreds.add(new Storkreds());
        kreds.add(new Kreds());
        kommune.add(new Kommune());
        parti.add(new Parti());
        kandidat.add(new Kandidat());
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public List<Landsdel> getLandsdel() {
        return landsdel;
    }

    public void setLandsdel(List<Landsdel> landsdel) {
        this.landsdel = landsdel;
    }

    public List<Region> getRegion() {
        return region;
    }

    public void setRegion(List<Region> region) {
        this.region = region;
    }

    public List<Storkreds> getStorkreds() {
        return storkreds;
    }

    public void setStorkreds(List<Storkreds> storkreds) {
        this.storkreds = storkreds;
    }

    public List<Kreds> getKreds() {
        return kreds;
    }

    public void setKreds(List<Kreds> kreds) {
        this.kreds = kreds;
    }

    public List<Kommune> getKommune() {
        return kommune;
    }

    public void setKommune(List<Kommune> kommune) {
        this.kommune = kommune;
    }

    public List<Parti> getParti() {
        return parti;
    }

    public void setParti(List<Parti> parti) {
        this.parti = parti;
    }

    public List<Kandidat> getKandidat() {
        return kandidat;
    }

    public void setKandidat(List<Kandidat> kandidat) {
        this.kandidat = kandidat;
    }

}
