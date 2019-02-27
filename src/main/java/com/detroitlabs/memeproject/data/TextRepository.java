package com.detroitlabs.memeproject.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class TextRepository {

private static final List<String> MEME_FIRST_SENTENCE = Arrays.asList(
  "That face when ",
        "That feeling when ",
        "What had happened was "
);



private static final List<String> MEME_SECOND_SENTENCE = Arrays.asList(
      "you learned SpringBoot",
      "we forgot to commit",
      "GitHub blew up"
);

public String combineSentencesAndReturnMemeText() {
    Collections.shuffle(MEME_FIRST_SENTENCE);
    String firstHalf = MEME_FIRST_SENTENCE.get(0);
    Collections.shuffle(MEME_SECOND_SENTENCE);
    String secondHalf = MEME_SECOND_SENTENCE.get(0);

    String memeText = firstHalf + secondHalf;
    return memeText;
}




}


