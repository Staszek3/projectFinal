package com.staszek.project_final.repository;

import com.staszek.project_final.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository <Entry, Long>{

}
