package com.codeclan.homework.foldersservice.repositories;

import com.codeclan.homework.foldersservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
