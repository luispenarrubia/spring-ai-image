package guru.springframework.springaiimage.services;


import guru.springframework.springaiimage.model.Question;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    byte[] getImage(Question question);

    String getDescription(MultipartFile file) throws IOException;
}
