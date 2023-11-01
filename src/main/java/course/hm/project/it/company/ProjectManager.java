package course.hm.project.it.company;

import java.util.Objects;

public class ProjectManager extends Manager {
private ProjectA projectA;

    public ProjectManager(String name, int employeeId,String department, ProjectA projectA) {
        super(name, employeeId, department, projectA);
        this.projectA = projectA;

    }


    @Override
    public void workOnProject() {
        System.out.println(getName() + " is managing the project scope.");
    }

    @Override
    public ProjectA getProjectA() {
        return projectA;
    }

    @Override
    public void manageTeam() {
        System.out.println(getName() + " - Project Manager is managing the team.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(projectA, that.projectA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), projectA);
    }

    @Override
    public String toString() {
        return getName()+
                " - ProjectManager{" +
                "projectA=" + projectA +
                '}';
    }
}
