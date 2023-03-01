package com.javainuse.imageuploadanddownload.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.imageuploadanddownload.entity.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name);
}

