package mk.ukim.finki.lab2emt193060.web.rest;

import mk.ukim.finki.lab2emt193060.model.Author;
import mk.ukim.finki.lab2emt193060.model.Country;
import mk.ukim.finki.lab2emt193060.service.CountryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://react-193060.herokuapp.com/")
@RequestMapping("/api/country")
public class CountryRestController {
    private final CountryService countryService;

    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> findAll() {
        return this.countryService.findAll();
    }
}
