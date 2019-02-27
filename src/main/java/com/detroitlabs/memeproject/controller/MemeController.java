package com.detroitlabs.memeproject.controller;

import com.detroitlabs.memeproject.data.ImageRepository;
import com.detroitlabs.memeproject.data.TextRepository;
import com.detroitlabs.memeproject.model.Image;
import com.detroitlabs.memeproject.model.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemeController {

    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private TextRepository textRepository;


    @RequestMapping("/")
    public String home(ModelMap modelMap){

        String sentence = textRepository.combineSentencesAndReturnMemeText();
        modelMap.put("Sentence", sentence);

        Image image = imageRepository.returnRandomImage();
        modelMap.put("Image", image);
        return "home";
    }
}
