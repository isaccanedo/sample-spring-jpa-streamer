package pl.isaccanedo.samples.spring.jpastreamer.dto;

import pl.isaccanedo.samples.spring.jpastreamer.model.Department;

public record DepartmentDTO(Integer id, String name) {
    public DepartmentDTO(Department department) {
        this(department.getId(), department.getName());
    }
}
