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
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/rejestracja")
    String rejestracja() {
        return "formLogowania";
    }




    @PostMapping("/rejestracja")
    String rejestracja(
    @RequestParam("login") String login,
    @RequestParam("password") String password,
    @RequestParam("uniqueNameOfAccont") String uniqueNameOfAccont,
    @RequestParam("nameOfAcount") String nameOfAcount,
    Model model)
    {
        Users users = new Users(login, password,uniqueNameOfAccont, nameOfAcount, "17.05.2019",
                StatusUser.Nieaktywny, TypeUser.Prywatne);
        usersRepository.save(users);
        return "formLogowania";
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
        Users users1 = usersRepository.findByNameOfAcount(nameOfAcount).get();
        Entry entry = new Entry();
        entry.setContentOfEntry(contentOfEntry);
        entry.setData(data);
        entry.setStatus(Enum.valueOf(StatusEntity.class, status));
        entry.setTape(Enum.valueOf(TypeEntity.class, tape));
        entry.setUsers(users1);

        Set<Entry> entrySet = new HashSet<>();
        entrySet.add(entry);
//        users.setEntries(entrySet);
//        entry.setUsers(users);

        model.addAttribute("entry", entrySet);
//        model.addAttribute("users", users);
//
//        usersRepository.save(users);
        entryRepository.save(entry);

        List<Entry> entryListAfterAddingPost=entryRepository.findAll();
        model.addAttribute("entryListAfterAddingPost",entryListAfterAddingPost );
        return "updatedWall";

    }


  @GetMapping("/usunWpis/{id}")
  public String deleteWpis(@PathVariable("id") Long id, Model model) {
     //
     entryRepository.deleteById(id);
      List<Entry> entryListAfterAddingPost=entryRepository.findAll();
      model.addAttribute("entryListAfterAddingPost",entryListAfterAddingPost );
      return "updatedWall";
  }

}
