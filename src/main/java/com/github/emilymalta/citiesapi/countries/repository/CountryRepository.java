package com.github.emilymalta.citiesapi.countries.repository;

import com.github.emilymalta.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
