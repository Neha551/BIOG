package com.app.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class ImageUtils {

	public static String saveImage(String location, MultipartFile file) throws IllegalStateException, IOException {
		File newImage = new File(location, file.getOriginalFilename());
		file.transferTo(newImage);
		return newImage.getPath();
	}
}
