public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void seDeplacer(){
        System.out.println("Je me déplace comme un animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
