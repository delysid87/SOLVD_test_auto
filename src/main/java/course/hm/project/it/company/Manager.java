package course.hm.project.it.company;

abstract class Manager extends Employee {
    public String getDepartment() {
        return department;
    }

    private String department;
    private ProjectA projectA;


    public Manager(String name, int employeeId, String department, ProjectA projectA) {
        super(name, employeeId, projectA);
        this.department = department;
        this.projectA = projectA;
    }
    @Override
    public void workOnProject() {
        System.out.println(getName() + " is managing the project.");
    }
    public void getProjectInfo(){
        projectA.getTechnologies();
    }


    public abstract void manageTeam();
}
