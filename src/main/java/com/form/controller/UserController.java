package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.form.dto.ErrorDto;
import com.form.dto.SuccessDto;
import com.form.dto.UsersDto;
import com.form.entity.Users;
import com.form.service.UsersService;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class UserController {

	@Autowired
	private UsersService usersService;

	@PostMapping("/api/users/addUser")
	public ResponseEntity<?> addUser(@RequestBody UsersDto userDto) {

		this.usersService.addUser(userDto);

		return new ResponseEntity<>(new SuccessDto("Form Submitted", "Submitted"), HttpStatus.ACCEPTED);

	}

	@GetMapping("/users")
	public List<Users> getAllUser() {

		return usersService.getAllUser();

	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<?> updateUserById(@PathVariable Long id, @RequestBody UsersDto usersDto) {
		try {
			usersService.updateUserById(id, usersDto);
			System.out.println("Update");
			return new ResponseEntity<>(new SuccessDto("Updated User", "Updated User"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorDto("Invalid Id", "Invalid Id"), HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserByUserId(@PathVariable Long id) {
		try {
			System.out.println("Id" + id);
			usersService.deleteUser(id);

			return new ResponseEntity<>(new SuccessDto("Deleted", "User deleted.."), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorDto(e.getLocalizedMessage(), e.getMessage()), HttpStatus.BAD_REQUEST);
		}

	}
}
