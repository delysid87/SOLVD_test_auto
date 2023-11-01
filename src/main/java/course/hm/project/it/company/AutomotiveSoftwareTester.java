package course.hm.project.it.company;

import course.hm.project.it.company.interfaces.Tester;

import java.util.Objects;

public class AutomotiveSoftwareTester extends Employee implements Tester {
    private ProjectA projectA;



    public AutomotiveSoftwareTester(String name, int employeeId, ProjectA projectA) {
        super(name, employeeId, projectA);
        this.projectA = projectA;
    }
@Override
    public void runTests() {
        System.out.println(getName() + " - Automotive Software Tester is running tests.");
    }
    @Override
    public void workOnProject() {
        System.out.println(getName() + " is running tests on the  " + getProjectA());
    }
    @Override
    public ProjectA getProjectA() {
        return projectA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AutomotiveSoftwareTester that = (AutomotiveSoftwareTester) o;
        return Objects.equals(projectA, that.projectA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), projectA);
    }

    @Override
    public String toString() {
        return getName() +
                " ,project= " + projectA +
                '}';
    }
}
