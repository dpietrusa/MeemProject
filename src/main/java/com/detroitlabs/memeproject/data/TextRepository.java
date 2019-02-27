package com.detroitlabs.memeproject.data;

import com.detroitlabs.memeproject.model.Text;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class TextRepository {

public List<String> memeFirstSentence = new ArrayList<>();
    public List<String> memeSecondSentence = new ArrayList<>();

public void addWords(){
    memeFirstSentence.add("That face when ");
    memeFirstSentence.add("That feeling when ");
    memeFirstSentence.add("What had happened was ");
    memeSecondSentence.add("you learned SpringBoot ");
    memeSecondSentence.add("we forgot to commit ");
    memeSecondSentence.add("GitHub blew up ");
}

public String combineSentencesAndReturnMemeText(){
Collections.shuffle(memeFirstSentence);
String firstHalf = memeFirstSentence.get(0);
Collections.shuffle(memeSecondSentence);
String secondHalf = memeSecondSentence.get(0);

return firstHalf + secondHalf;
}




}



