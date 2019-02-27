package com.detroitlabs.memeproject.data;

import com.detroitlabs.memeproject.model.Image;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ImageRepository {

    private static final List<Image> ALL_PHOTOS = Arrays.asList(
            new Image("office1", 1),
            new Image("office2",1),
            new Image("office3", 1),
            new Image("office4",1),
            new Image("freshprince1",2),
            new Image("freshprince2",2),
            new Image("freshprince3",2)
    );

    public Image returnRandomImage() {
        Collections.shuffle(ALL_PHOTOS);
        return ALL_PHOTOS.get(0);
    }

}
