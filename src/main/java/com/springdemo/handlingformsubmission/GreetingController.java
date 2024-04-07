package com.springdemo.handlingformsubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // Markerer denne klasse som en Spring MVC Controller. Dette gør det muligt for Spring at genkende denne klasse som en del af MVC-arkitekturen til webanmodningshåndtering.
public class GreetingController {

  @GetMapping("/greeting") // Mapper HTTP GET-anmodninger til "/greeting". Når en bruger anmoder om denne sti i deres webbrowser, vil denne metode blive kaldt.
  public String greetingForm(Model model) {
    // Tilføjer et nyt Greeting-objekt til modellen. Dette gør det muligt for Thymeleaf-templateet at tilgå Greeting-objektet for at vise data eller binde formularfelter.
    model.addAttribute("greeting", new Greeting());
    return "greeting"; // Returnerer navnet på Thymeleaf-templateet, der skal renderes. Spring vil søge efter et template med navnet "greeting" og vise det for brugeren.
  }

  @PostMapping("/greeting") // Mapper HTTP POST-anmodninger til "/greeting". Denne metode kaldes, når formularen indsendes.
  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    // Tilføjer det indsendte Greeting-objekt til modellen. Dette gør det muligt for resultatsiden at tilgå og vise de indsendte data.
    model.addAttribute("greeting", greeting);
    return "result"; // Returnerer navnet på Thymeleaf-templateet, der skal renderes som svar på formularens indsendelse. Spring vil søge efter et template med navnet "result" for at vise det for brugeren.
  }

}
