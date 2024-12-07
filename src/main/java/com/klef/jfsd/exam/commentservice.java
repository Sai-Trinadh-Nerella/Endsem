package com.klef.jfsd.exam.;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class commentservice {
    private final RestTemplate restTemplate;

    public commentservice() {
        this.restTemplate = new RestTemplate();
    }

    public List<comment> fetchAllComments() {
        String apiUrl = "https://jsonplaceholder.typicode.com/comments";
        comment[] commentsArray = restTemplate.getForObject(apiUrl, comment[].class);
        return Arrays.asList(commentsArray);
    }
}
