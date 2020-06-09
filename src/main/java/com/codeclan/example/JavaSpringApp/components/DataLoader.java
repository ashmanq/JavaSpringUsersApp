package com.codeclan.example.JavaSpringApp.components;

import com.codeclan.example.JavaSpringApp.models.File;
import com.codeclan.example.JavaSpringApp.models.Folder;
import com.codeclan.example.JavaSpringApp.models.User;
import com.codeclan.example.JavaSpringApp.repositories.FileRepository;
import com.codeclan.example.JavaSpringApp.repositories.FolderRepository;
import com.codeclan.example.JavaSpringApp.repositories.UserRepository;
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

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User Jimmy = new User("Jimmy J");
        userRepository.save(Jimmy);

        User Neil = new User("Neil Diamond");
        userRepository.save(Neil);

        User Sandra = new User("Sandra Thomson");
        userRepository.save(Sandra);

        Folder pictures = new Folder("Pictures", Jimmy);
        folderRepository.save(pictures);

        Folder resumes = new Folder("Resumes", Neil);
        folderRepository.save(resumes);

        Folder documents = new Folder("Documents", Sandra);
        folderRepository.save(documents);

        File cv = new File("CV", ".doc", 400.00, resumes);
        fileRepository.save(cv);

        File myPic = new File("My Picture", ".png", 2000.00, pictures);
        fileRepository.save(myPic);

        File report = new File("School Report", ".pdf", 3000.00, documents);
        fileRepository.save(report);
    }
}
