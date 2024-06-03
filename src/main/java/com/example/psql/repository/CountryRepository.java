package com.example.psql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CountryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> findCountriesWithEnglish() {
        String sql = "SELECT c.name AS country_name " +
                "FROM countries c " +
                "JOIN country_languages cl ON c.id = cl.country_id " +
                "JOIN languages l ON cl.language_id = l.id " +
                "WHERE l.name = 'English'";

        return jdbcTemplate.queryForList(sql, String.class);
    }




    public List<String> findCountriesWithMoreThenThreeLanguages() {
        String sql = "SELECT c.name AS country_name, COUNT(cl.language_id) AS num_languages " +
                "FROM countries c " +
                "JOIN country_languages cl ON c.id = cl.country_id " +
                "GROUP BY c.name " +
                "HAVING COUNT(cl.language_id) > 3";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> findCountriesWithFrancheEnglish() {
        String sql = "SELECT c.name AS country_name " +
                "FROM countries c " +
                "JOIN country_languages cl ON c.id = cl.country_id " +
                "JOIN languages l ON cl.language_id = l.id " +
                "WHERE l.name IN ('English', 'French') " +
                "GROUP BY c.name " +
                "HAVING COUNT(DISTINCT l.name) = 2";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> findCountriesWithMoreThenTenMillionPopulation() {
        String sql = "SELECT c.name AS country_name, c.population " +
                "FROM countries c " +
                "WHERE c.population > 10000000";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> findCountriesWhere_CapitalCitizensPopulation_isMoreThan_OthersCitiesPopulation() {
        String sql = "SELECT c.name AS country_name, c.capital_city, c.population AS total_population, c.capital_city_population " +
                "FROM countries c " +
                "WHERE c.capital_city_population > (c.population - c.capital_city_population)";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> findCountriesWithoutEnglish() {
        String sql = "SELECT c.name AS country_name " +
                "FROM countries c " +
                "WHERE c.id NOT IN (" +
                "  SELECT cl.country_id " +
                "  FROM country_language cl " +
                "  JOIN language l ON cl.language_id = l.id " +
                "  WHERE l.name = 'English'" +
                ")";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> findCountriesWithBiggestLanguagesCount() {
        String sql = "SELECT c.name AS country_name, COUNT(cl.language_id) AS num_languages " +
                "FROM countries c " +
                "JOIN country_language cl ON c.id = cl.country_id " +
                "GROUP BY c.name " +
                "ORDER BY num_languages DESC " +
                "LIMIT 1";

        return jdbcTemplate.queryForList(sql, String.class);
    }
}
