package pl.sdacademy.java.oopschool;

import java.util.List;
import java.util.UUID;

public class InMemoryStudentDataProvider implements StudentDataProvider {
    @Override
    public List<Student> getData() {
        return List.of(
            new Student(
                UUID.fromString("fd60b673-43d2-482f-b020-68cf6d4af132"),
                "Tomasz",
                "Majbaum",
                "1B"
            )
        );
    }
}
