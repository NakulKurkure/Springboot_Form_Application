package com.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.crud.exception.ResourceNotFound;
import com.form.dto.UsersDto;
import com.form.entity.Users;
import com.form.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public void addUser(UsersDto userDto) {

		Users users = new Users();
		users.setName(userDto.getName());
		users.setEmail(userDto.getEmail());
		users.setPassword(userDto.getPassword());
		System.out.println(userDto.getConfPassword());
		users.setConfPassword((userDto.getConfPassword()));

		this.usersRepository.save(users);

	}

//	public Page<IUserListDto> getAllUser(String search, String pageNumber, String pageSize) {
//		Pageable pagable = new com.form.util.Pagination().getPagination(pageNumber, pageSize);
//		if ((search == "") || (search == null) || (search.length() == 0)) {
//			return usersRepository.findByOrderById(pagable, IUserListDto.class);
//		} else {
//			return usersRepository.findByName(search, pagable, IUserListDto.class);
//		}
//
//	}

	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	public ResponseEntity<?> updateUserById(Long id, UsersDto usersDto) {
		Users user = this.usersRepository.findById(id).orElseThrow();
//		if (user.getId().equals(id)) {
		user.setEmail(usersDto.getEmail());
		user.setName(usersDto.getName());
		user.setPassword(usersDto.getPassword());
		user.setConfPassword(usersDto.getConfPassword());
		this.usersRepository.save(user);
//		}

		return null;

//		return null;

	}

	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		Users userId = usersRepository.findById(id).orElseThrow();
		if (userId.getId() == id) {
			usersRepository.deleteById(id);
		}

	}

}
