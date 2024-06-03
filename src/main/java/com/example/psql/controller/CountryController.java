package com.example.psql.controller;

import com.example.psql.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/countries/")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/english")
    public ResponseEntity<List<String>> getCountriesWithEnglish() {
        List<String> countries = countryService.getCountriesWithEnglish();
        return ResponseEntity.ok(countries);
    }


    @GetMapping("/more_3_languages")
    public ResponseEntity<List<String>> getCountriesWithMoreThenThreeLanguages() {
        List<String> countries = countryService.getCountriesWithMoreThenThreeLanguages();
        return ResponseEntity.ok(countries);
    }


    @GetMapping("/franche_english_languages")
    public ResponseEntity<List<String>> getCountriesWithFrancheEnglish() {
        List<String> countries = countryService.getCountriesWithFrancheEnglish();
        return ResponseEntity.ok(countries);
    }

    @GetMapping("/more_10m_population")
    public ResponseEntity<List<String>> getCountriesWithMoreThenTenMillionPopulation() {
        List<String> countries = countryService.getCountriesWithMoreThenTenMillionPopulation();
        return ResponseEntity.ok(countries);
    }

    @GetMapping("/capital_population")
    public ResponseEntity<List<String>> getCountriesWhere_CapitalCitizensPopulation_isMoreThan_OthersCitiesPopulation() {
        List<String> countries = countryService.getCountriesWhere_CapitalCitizensPopulation_isMoreThan_OthersCitiesPopulation();
        return ResponseEntity.ok(countries);
    }

    @GetMapping("/no_english")
    public ResponseEntity<List<String>> getCountriesWithoutEnglish() {
        List<String> countries = countryService.getCountriesWithoutEnglish();
        return ResponseEntity.ok(countries);
    }

    @GetMapping("/biggest_langs_count")
    public ResponseEntity<List<String>> getCountriesWithBiggestLanguagesCount() {
        List<String> countries = countryService.getCountriesWithBiggestLanguagesCount();
        return ResponseEntity.ok(countries);
    }
}
