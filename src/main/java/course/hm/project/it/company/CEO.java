package course.hm.project.it.company;

import course.hm.project.it.company.interfaces.CEOActions;
import course.hm.project.it.company.interfaces.TeamMember;

import java.util.Objects;

public final class CEO extends People implements CEOActions, TeamMember {
    private static final int sharePrice = 100;
    private final String secretCode = "XYZ123";

    public static void printSharePrice()  {
        System.out.println("CEO's share price is " + sharePrice);
    }

    private static int totalCEOs = 0;
    static {
        totalCEOs++;
    }

    private int shares;

    public CEO(String name, int shares) {
        super(name);
        this.shares = shares;
    }
    public final void revealSecretCode() {
        System.out.println("The CEO's secret code is: " + secretCode);
    }
    public int getShares() {
        return shares;
    }
    @Override
    public void workOnProject() {
        System.out.println(getName() + " is defining the company strategy.");
    }


    @Override
    public void defineCompanyStrategy() {
        System.out.println("CEO is defining the company strategy.");
    }

    @Override
    public String toString() {
        return "CEO{" +
                "name=" + getName() +
                " ; " +
                "shares=" + shares +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CEO ceo = (CEO) o;
        return shares == ceo.shares;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shares);
    }
}
