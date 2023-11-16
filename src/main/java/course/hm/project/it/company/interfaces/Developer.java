package course.hm.project.it.company.interfaces;

import course.hm.project.it.company.exceptions.InvalidTechnologiesException;

public interface Developer {
    void writeCode() throws InvalidTechnologiesException;
}
