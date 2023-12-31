package org.tku.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    @GetMapping(value = {"/map", "/"})
    public String viewMap(Model model) {

        return "index";
    }
}
