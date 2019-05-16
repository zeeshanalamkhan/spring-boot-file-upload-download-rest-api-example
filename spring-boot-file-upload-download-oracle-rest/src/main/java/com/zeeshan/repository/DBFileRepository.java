package com.zeeshan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeeshan.model.FileModel;

@Repository
public interface DBFileRepository extends JpaRepository<FileModel, String> {

}
