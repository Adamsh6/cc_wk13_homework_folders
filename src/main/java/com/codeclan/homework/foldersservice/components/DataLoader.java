package com.codeclan.homework.foldersservice.components;

import com.codeclan.homework.foldersservice.models.File;
import com.codeclan.homework.foldersservice.models.Folder;
import com.codeclan.homework.foldersservice.models.User;
import com.codeclan.homework.foldersservice.repositories.FileRepository;
import com.codeclan.homework.foldersservice.repositories.FolderRepository;
import com.codeclan.homework.foldersservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        User user = new User("Gerald");
        userRepository.save(user);

        Folder folder = new Folder("Photos", user);
        folderRepository.save(folder);

        File file = new File("Sunrise", "png", 900, folder);
        fileRepository.save(file);

    }
}
