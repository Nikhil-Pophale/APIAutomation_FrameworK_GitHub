package org.GITHUB.PayloadManager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.GITHUB.Faker.Random;
import org.GITHUB.Payload.CreateRepo;

public class PayloadManager {
    ObjectMapper objectMapper;


    public String createrepo() throws JsonProcessingException {
        objectMapper=new ObjectMapper();
        CreateRepo createRepo=new CreateRepo();
        createRepo.setName(Random.Reponame());
        createRepo.setDescription("This is new repo");
        createRepo.setHomepage( "https://github.com");
        createRepo.setIsTemplate(true);

        String CRepo=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(createRepo);
        return CRepo;
    }

    public String updaterepo() throws JsonProcessingException {
        ObjectMapper x=new ObjectMapper();
        CreateRepo updateRepo=new CreateRepo();
        updateRepo.setName(Random.Reponame());
        updateRepo.setDescription("This is Updated  repo");
        updateRepo.setHomepage( "https://github.com");
        updateRepo.setIsTemplate(true);

        String URepo=x.writeValueAsString(updateRepo);
        return URepo;
    }
}
