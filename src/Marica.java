public class Marica {
    private String name;
    private String surname;
    private int anni;
    public Marica(String name, String surname, int anni){
        this.name = name;
        this.surname = surname;
        this.anni = anni;
    }

    public String toString(){
        return name + " " + surname + " " + anni;
    }
}
