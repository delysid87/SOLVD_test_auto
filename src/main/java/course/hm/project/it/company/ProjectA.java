package course.hm.project.it.company;

public class ProjectA {
    private String projectName;
    private Technologies technologies;

    public String getProjectName() {
        return projectName;
    }

    public Technologies getTechnologies() {
        return technologies;
    }


    public ProjectA(String projectName, Technologies technologies) {
        this.projectName = projectName;
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "ProjectA{" +
                "projectName='" + projectName + '\'' +
                ", technologies='" + technologies.getDescription() + '\'' +
                '}';
    }
}
