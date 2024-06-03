package com.example.psql.service;

import com.example.psql.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<String> getCountriesWithEnglish() {
        return countryRepository.findCountriesWithEnglish();
    }

    public List<String> getCountriesWithMoreThenThreeLanguages() {
        return countryRepository.findCountriesWithMoreThenThreeLanguages();
    }

    public List<String> getCountriesWithFrancheEnglish() {
        return countryRepository.findCountriesWithFrancheEnglish();
    }

    public List<String> getCountriesWithMoreThenTenMillionPopulation() {
        return countryRepository.findCountriesWithMoreThenTenMillionPopulation();
    }

    public List<String> getCountriesWhere_CapitalCitizensPopulation_isMoreThan_OthersCitiesPopulation() {
        return countryRepository.findCountriesWhere_CapitalCitizensPopulation_isMoreThan_OthersCitiesPopulation();
    }

    public List<String> getCountriesWithoutEnglish() {
        return countryRepository.findCountriesWithoutEnglish();
    }

    public List<String> getCountriesWithBiggestLanguagesCount() {
        return countryRepository.findCountriesWithBiggestLanguagesCount();
    }
}

