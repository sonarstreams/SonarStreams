package com.fino.dms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fino.dms.entity.Apps;

public interface AppRepo extends JpaRepository<Apps, Long> {

}
