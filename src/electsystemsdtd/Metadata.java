package electsystemsdtd;

import electsystemsdtd.dtd.metadata.Blok;
import electsystemsdtd.dtd.metadata.Kandidat;
import electsystemsdtd.dtd.metadata.Kommune;
import electsystemsdtd.dtd.metadata.Kreds;
import electsystemsdtd.dtd.metadata.Land;
import electsystemsdtd.dtd.metadata.Landsdel;
import electsystemsdtd.dtd.metadata.Parti;
import electsystemsdtd.dtd.metadata.PartiGruppe;
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
    private List<Landsdel> landsdele = new LinkedList<>();
    private List<Region> regioner = new LinkedList<>();
    private List<Storkreds> storkredser = new LinkedList<>();
    private List<Kreds> kredser = new LinkedList<>();
    private List<Kommune> kommuner = new LinkedList<>();
    private List<Parti> partier = new LinkedList<>();
    private List<Kandidat> kandidater = new LinkedList<>();
    private List<Blok> bloks = new LinkedList<>();
    private List<PartiGruppe> partiGrupper = new LinkedList<>();

    public Metadata() {

        landsdele.add(new Landsdel());
        landsdele.add(new Landsdel(8, "Sjælland - Syddanmark"));

        regioner.add(new Region());
        regioner.add(new Region(84979, 8, "Region Sjælland"));

        storkredser.add(new Storkreds());
        storkredser.add(new Storkreds(9000500, 8, "Sjællands Storkreds"));

        kredser.add(new Kreds());
        kredser.add(new Kreds(9000500, 9000506, "Køgekredsen"));

        kommuner.add(new Kommune());
        kommuner.add(new Kommune(161, 9000208, 84982, "Glostrup"));

        partier.add(new Parti());
        partier.add(new Parti(8, "Venstre", "venstre", "V"));

        partiGrupper.add(new PartiGruppe());

        kandidater.add(new Kandidat());
        kandidater.add(new Kandidat(983, 8, "Lars Løkke Rasmussen"));

        bloks.add(new Blok(0, "none"));
        bloks.add(new Blok(1, "red"));
        bloks.add(new Blok(2, "blue"));

    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public List<Landsdel> getLandsdele() {
        return landsdele;
    }

    public void setLandsdele(List<Landsdel> landsdele) {
        this.landsdele = landsdele;
    }

    public List<Region> getRegioner() {
        return regioner;
    }

    public void setRegioner(List<Region> regioner) {
        this.regioner = regioner;
    }

    public List<Storkreds> getStorkredser() {
        return storkredser;
    }

    public void setStorkredser(List<Storkreds> storkredser) {
        this.storkredser = storkredser;
    }

    public List<Kreds> getKredser() {
        return kredser;
    }

    public void setKredser(List<Kreds> kredser) {
        this.kredser = kredser;
    }

    public List<Kommune> getKommuner() {
        return kommuner;
    }

    public void setKommuner(List<Kommune> kommuner) {
        this.kommuner = kommuner;
    }

    public List<Parti> getPartier() {
        return partier;
    }

    public void setPartier(List<Parti> partier) {
        this.partier = partier;
    }

    public List<Kandidat> getKandidater() {
        return kandidater;
    }

    public void setKandidater(List<Kandidat> kandidater) {
        this.kandidater = kandidater;
    }

    public List<Blok> getBloks() {
        return bloks;
    }

    public void setBloks(List<Blok> bloks) {
        this.bloks = bloks;
    }

    public List<PartiGruppe> getPartiGrupper() {
        return partiGrupper;
    }

    public void setPartiGrupper(List<PartiGruppe> partiGrupper) {
        this.partiGrupper = partiGrupper;
    }

    @Override
    public String toString() {
        return "Metadata{" + "land=" + land + ", landsdele=" + landsdele + ", regioner=" + regioner + ", storkredser=" + storkredser + ", kredser=" + kredser + ", kommuner=" + kommuner + ", partier=" + partier + ", kandidater=" + kandidater + ", bloks=" + bloks + ", partiGrupper=" + partiGrupper + '}';
    }

}
