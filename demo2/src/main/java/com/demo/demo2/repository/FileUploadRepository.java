package com.demo.demo2.repository;

import com.demo.demo2.models.Fileupload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUploadRepository extends JpaRepository<Fileupload,Integer> {
}
