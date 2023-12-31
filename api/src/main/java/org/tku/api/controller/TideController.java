package org.tku.api.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tku.database.entity.Tide;
import org.tku.database.repository.TideRepository;

import java.util.Date;
import java.util.List;

@RestController
@Log4j2
public class TideController {

    @Autowired
    TideRepository tideRepository;

    @GetMapping("/tide")
    public String showTideTable(Model model, @RequestParam(name = "selectedDate", required = false) Date selectedDate) {
        List<Tide> tides;

        if (selectedDate != null) {
            tides = tideRepository.findByDate(selectedDate);
        } else {
            tides = tideRepository.findAll();
        }

        model.addAttribute("tides", tides);
        return "tide";
    }
}
