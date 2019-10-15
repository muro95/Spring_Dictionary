package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String dictionary(){
        return "index";
    }
    @PostMapping("/dictionary")
    public String translate(@RequestParam String engWord, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin Chao");
        dictionary.put("apple", "qua tao");
        dictionary.put("car", "oto");
        dictionary.put("dictionary", "tu dien");
        dictionary.put("sleep", "ngu");
        model.addAttribute("engWord", engWord);
        String result = engWord + " is not in the dictionary!";
        if (dictionary.containsKey(engWord)){
            result = dictionary.get(engWord);
        }
        model.addAttribute("result", result);
        return "index";
    }
}
