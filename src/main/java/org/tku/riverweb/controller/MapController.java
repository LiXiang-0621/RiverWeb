package org.tku.riverweb.controller;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.tku.riverweb.entity.Coordinate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class MapController {
    @GetMapping("/map")
    public String viewMap(Model model) {
        // 指定固定的 CSV 檔案路徑
        String filePath = "static/assets/coordinate.csv";

        // parse CSV file to create a list of `TideTable` objects
        try (Reader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(filePath))))) {

            // create csv bean reader
            CsvToBean<Coordinate> csvToBean = new CsvToBeanBuilder<Coordinate>(reader)
                    .withType(Coordinate.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            // convert `CsvToBean` object to list of TideTables
            List<Coordinate> coordinates = csvToBean.parse();

            // save TideTables list on model
            model.addAttribute("tideTables", coordinates);
            model.addAttribute("status", true);

        } catch (Exception ex) {
            model.addAttribute("message", "An error occurred while processing the CSV file.");
            model.addAttribute("status", false);
        }

        return "index";
    }
}
