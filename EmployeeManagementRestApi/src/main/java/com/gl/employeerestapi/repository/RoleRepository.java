package com.gl.employeerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeerestapi.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
