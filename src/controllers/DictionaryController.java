package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @GetMapping(value = "/translate")
    public String translate(@RequestParam String word, Model model){
        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("hello","Xin Chao");
        dictionary.put("miss","Nho");
        dictionary.put("kiss","Hon");
        dictionary.put("out","ngoai");
        dictionary.put("her","Co ay");

        String search = dictionary.get(word);

        if (search==null){
            search="Khong co ket qua";
        }

        model.addAttribute("search",search);
        model.addAttribute("word",word);

        return "translate";
    }
}
