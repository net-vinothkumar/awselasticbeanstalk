package com.beanstalk.beanstalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TouristTicketController {

    @GetMapping("/tour")
    public List<String> getTouristPlaces() {
        List<String> touristicPlaces = new ArrayList<>();
        touristicPlaces.add("Mahabalipuram");
        touristicPlaces.add("Pondicherry");
        touristicPlaces.add("Tanjore");
        touristicPlaces.add("Madurai");
        touristicPlaces.add("Chidambram");
        touristicPlaces.add("Chennai");
        touristicPlaces.add("Trichy");
        touristicPlaces.add("Kanchipuram");

        return touristicPlaces;
    }
}
