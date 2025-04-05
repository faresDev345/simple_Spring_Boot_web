package tuto.dev.mssg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    private List<String> messages = new ArrayList<>();
    private String latestData = "Initial Data";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("messages", messages);
        model.addAttribute("latestData", latestData);
        return "index";
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        if (message != null && !message.trim().isEmpty()) {
            messages.add(message);
        }
        return "redirect:/";
    }

    // Method to simulate regular data updates
    public void updateData() {
        // Here you could have logic to fetch dynamic data
        this.latestData = "Updated Data at " + System.currentTimeMillis();
    }

    // Schedule regular updates (e.g., every 3 seconds)
    @org.springframework.scheduling.annotation.Scheduled(fixedRate = 3000)
    public void scheduledDataUpdate() {
        updateData();
    }
}