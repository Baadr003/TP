
 package beans;

public class Site {
    private int id;
    private String nom;

    public Site() {
    }

    public Site(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Site{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    
}
