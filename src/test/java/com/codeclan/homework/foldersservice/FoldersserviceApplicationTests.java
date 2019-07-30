package com.codeclan.homework.foldersservice;

import com.codeclan.homework.foldersservice.models.File;
import com.codeclan.homework.foldersservice.models.Folder;
import com.codeclan.homework.foldersservice.models.User;
import com.codeclan.homework.foldersservice.repositories.FileRepository;
import com.codeclan.homework.foldersservice.repositories.FolderRepository;
import com.codeclan.homework.foldersservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoldersserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUser(){
		User user = new User("Gerald");
		userRepository.save(user);

		Folder folder = new Folder("Photos", user);
		folderRepository.save(folder);

		File file = new File("Sunrise", "png", 900, folder);
		fileRepository.save(file);
	}

}
