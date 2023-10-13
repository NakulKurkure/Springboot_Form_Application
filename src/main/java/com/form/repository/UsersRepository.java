package com.form.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.IDto.IUserListDto;
import com.form.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	Page<IUserListDto> findByOrderById(Pageable pagable, Class<IUserListDto> class1);

	Page<IUserListDto> findByName(String search, Pageable pagable, Class<IUserListDto> class1);

}
