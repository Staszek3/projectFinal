package com.staszek.project_final;

import com.staszek.project_final.model.Entry;
import com.staszek.project_final.repository.EntryRepository;
import com.staszek.project_final.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectFinalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectFinalApplication.class, args);
    }
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    EntryRepository entryRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
