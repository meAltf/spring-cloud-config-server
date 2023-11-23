package com.alataf.microservices.springcloudconfigserver;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class TEST {

	public static void main(String[] args) {
		  String directoryPath = "D:\\OneDrive - Olam International\\Desktop\\learning-Microservices-beginner";

	        Path path = Paths.get(directoryPath);

	        if (!java.nio.file.Files.exists(path)) {
	            System.out.println("Directory does not exist: " + path);
	            // Handle the situation, such as creating the directory or reporting an error.
	            try {
	                java.nio.file.Files.createDirectories(path);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("Directory exists: " + path);
	        }

	}

}
