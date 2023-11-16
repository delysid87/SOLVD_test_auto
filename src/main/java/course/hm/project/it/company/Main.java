package course.hm.project.it.company;

import course.hm.project.it.company.exceptions.InvalidNameException;
import course.hm.project.it.company.exceptions.InvalidTechnologiesException;
import course.hm.project.it.company.exceptions.UnauthorizedAccessException;
import course.hm.project.it.company.interfaces.CEOActions;
import course.hm.project.it.company.interfaces.Developer;
import course.hm.project.it.company.interfaces.TeamMember;
import course.hm.project.it.company.interfaces.Tester;

public class Main {
    public static void main(String[] args)  {

        AutomotiveSoftwareTester tester = new AutomotiveSoftwareTester("Michael", 1, new ProjectA("WEB App", Technologies.JAVA));
        SoftwareDeveloper developer = new SoftwareDeveloper("Ola", 2, new ProjectA("WEB App", Technologies.JAVA));
        ProjectManager projectManager = new ProjectManager("John", 3, "A", new ProjectA("App", Technologies.JAVA));
        CEO ceo = new CEO("Frank", 100);

        tester.runTests();
        tester.workOnProject();
        System.out.println(tester);
        System.out.println();


        try {
            developer.writeCode();
        } catch (InvalidTechnologiesException e) {
            throw new RuntimeException(e);
        }
        developer.workOnProject();
        System.out.println(developer);
        System.out.println();

        System.out.println();


        projectManager.manageTeam();
        projectManager.workOnProject();
        System.out.println(projectManager);
        System.out.println();


        ceo.workOnProject();
        ceo.defineCompanyStrategy();
        ceo.revealSecretCode();
        CEO.printSharePrice();
        System.out.println(ceo);




    }
}
