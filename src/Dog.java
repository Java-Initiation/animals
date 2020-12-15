public class Dog extends Animal {

    private boolean joueur;

    public Dog(String name, boolean joueur) {
        super(name);
        this.joueur = joueur;
    }

    public boolean isJoueur() {
        return joueur;
    }

    public void setJoueur(boolean joueur) {
        this.joueur = joueur;
    }

}
