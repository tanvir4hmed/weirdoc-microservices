package com.weirdoc.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weirdoc.userservice.entity.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findUserRoleByRoleName(String roleName);
}
