public class Wilder {
    private String firstname;
    private boolean present;

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI() {
        String output = "My name is " + this.firstname + " and I'm ";
        if (!this.present) output += "not ";
        output += "present.";
        return output;
    }
}