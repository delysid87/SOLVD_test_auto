package course.hm.project.it.company;

import course.hm.project.it.company.exceptions.InvalidNameException;

public class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        try {
            if (!isValidName(name)) {
                throw new InvalidNameException("Invalid name: " + name);
            }
            return name;
        } catch (InvalidNameException e) {
            System.err.println("Error: " + e.getMessage());
            return ""; // lub inna odpowiednia logika dla błędnego imienia
        }
    }
    private boolean isValidName(String name) {
        return name != null && name.matches("^[a-zA-Z]+( [a-zA-Z]+)*$");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}




