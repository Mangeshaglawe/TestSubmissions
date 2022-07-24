package com.gl.employeerestapi.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gl.employeerestapi.model.Role;
import com.gl.employeerestapi.model.Employee;
import com.gl.employeerestapi.model.User;
import com.gl.employeerestapi.repository.RoleRepository;
import com.gl.employeerestapi.repository.EmployeeRepository;
import com.gl.employeerestapi.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BootStrapAppData implements ApplicationListener<ApplicationReadyEvent>{
	
	private final EmployeeRepository employeeRepository;
	private final RoleRepository roleRepository;
	private final UserRepository userRepository;
	
	private final PasswordEncoder passwordEncoder;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// implement faker here
		for(int i=0; i<10; i++) {
			Employee employee = new Employee();
			employee.setFirstName("Sameer" + i);
			employee.setLastName("asd" + i);
//			employee.setCountry("In" + i);
			employee.setEmail("asd" + i + "@gmail.com");
			employeeRepository.save(employee);
		}
		
		
		Role userRole=new Role();
		userRole.setRoleName("ROLE_USER");
		
		Role adminRole=new Role();
		adminRole.setRoleName("ROLE_ADMIN");
		
		User user=new User();
		user.setUserName("user");
		user.setPassword(passwordEncoder .encode("user"));
		
		User admin=new User();
		admin.setUserName("admin");
		admin.setPassword(passwordEncoder .encode("admin"));
				
		admin.addRole(adminRole);
		admin.addRole(userRole);
		
		user.addRole(userRole);
		
		userRepository.save(user);
		userRepository.save(admin);
		
		roleRepository.save(userRole);
		roleRepository.save(adminRole);
	}

}
