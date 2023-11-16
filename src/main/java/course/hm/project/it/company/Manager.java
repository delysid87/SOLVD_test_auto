package course.hm.project.it.company;

import course.hm.project.it.company.exceptions.InvalidTeamManagementException;
import course.hm.project.it.company.exceptions.log.ExceptionLogger;

abstract class Manager extends Employee {
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

    public void getProjectInfo() {
        projectA.getTechnologies();
    }

    public void manageTeam() {
        try {
            if (isTeamManagementProblem()) {
                int teamSize = getTeamSize();
                String errorMessage = "Error in managing the team: Insufficient team members. Current team size: " + teamSize;
                System.err.println(errorMessage);
                ExceptionLogger.logExceptionToFile(new InvalidTeamManagementException(errorMessage));
                throw new InvalidTeamManagementException(errorMessage);
            }
        } catch (Exception e) {

            ExceptionLogger.logExceptionToFile(e);
            System.err.println("Exception during team management: " + e.getMessage());
        }
    }

    private boolean isTeamManagementProblem() {
        return getTeamSize() < 3;
    }

    protected abstract int getTeamSize();
}
