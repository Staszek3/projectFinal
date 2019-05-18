package com.staszek.project_final.controller;

import com.staszek.project_final.model.Entry;
import com.staszek.project_final.model.Users;
import com.staszek.project_final.model.enums.StatusEntity;
import com.staszek.project_final.model.enums.StatusUser;
import com.staszek.project_final.model.enums.TypeEntity;
import com.staszek.project_final.model.enums.TypeUser;
import com.staszek.project_final.repository.EntryRepository;
import com.staszek.project_final.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class MyController {
    @Autowired
    EntryRepository entryRepository;

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/wall")
    String wall(Model model) {
        List<Entry> entryList = entryRepository.findAll();

        if (entryList.size() == 0) {
            return "emptyWall";
        } else {
            model.addAttribute("entryList", entryList);
            return "wall";
        }
    }

    @GetMapping("/dodajWpis")
    String dodajWpis() {
        return "nowyWpis";
    }

    @PostMapping("/nowyWpis")
    String nowyWpis(
            @RequestParam("contentOfEntry") String contentOfEntry,
            @RequestParam("data") String data,
            @RequestParam("status") String status,
            @RequestParam("tape") String tape,
            @RequestParam("nameOfAcount") String nameOfAcount,
            Model model
    ) {
        Users users = new Users("sss@gmail.com", "test", nameOfAcount, "17.05.2019", StatusUser.Nieaktywny, TypeUser.Prywatne);
        Entry entry = new Entry();
        entry.setContentOfEntry(contentOfEntry);
        entry.setData(data);
        entry.setStatus(Enum.valueOf(StatusEntity.class, status));
        entry.setTape(Enum.valueOf(TypeEntity.class, tape));

        Set<Entry> entrySet = new HashSet<>();
        entrySet.add(entry);
        users.setEntries(entrySet);
        entry.setUsers(users);

        model.addAttribute("entry", entrySet);
        model.addAttribute("users", users);

        usersRepository.save(users);
        entryRepository.save(entry);

        List<Entry> entryListAfterAddingPost=entryRepository.findAll();
        model.addAttribute("entryListAfterAddingPost",entryListAfterAddingPost );
        return "updatedWall";

    }

}
