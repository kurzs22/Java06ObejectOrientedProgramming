public class Classroom {
    public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        Wilder stefan = new Wilder("Stefan", false);

        if (!stefan.isPresent()) stefan.setPresent(true);

        Wilder andi = stefan;
        if (andi.getFirstname().equals("Stefan")) andi.setFirstname("Andi");

        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());

        System.out.println(stefan.whoAmI()); // Stefan heisst nun Andi
    }
}