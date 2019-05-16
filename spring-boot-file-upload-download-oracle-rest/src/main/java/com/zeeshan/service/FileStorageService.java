package com.zeeshan.service;

import org.springframework.web.multipart.MultipartFile;

import com.zeeshan.model.FileModel;

public interface FileStorageService {

	public FileModel storeFile(MultipartFile file);

	public FileModel getFile(String fileId);

}
