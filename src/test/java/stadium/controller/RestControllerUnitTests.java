package stadium.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import stadium.model.Client;
import stadium.service.beans.ClientService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RestControllerUnitTests {

    @Autowired
    ClientService clientService;

    private int GENERATE_COUNT = 100;

    @Test
    public void clientCRUD() throws Exception{

        // CREATE
        List<Long> clientIds = new ArrayList<>();
        for(int i=0;i<GENERATE_COUNT;i++){
            clientIds.add(clientService.save(getTestClient()));
        }
        assertTrue("Sizes must be same", GENERATE_COUNT==clientIds.size());


        // READ
        List<Client> clients = new ArrayList<>();
        for(int i=0;i<clientIds.size();i++){
            clients.add(clientService.getById(clientIds.get(0)));
        }
        assertTrue("Sizes must be same", GENERATE_COUNT==clients.size());


        // UPDATE
        Random random = new Random();
        long randomId = random.nextInt(GENERATE_COUNT)+1;
        Client randomClient = clientService.getById(randomId);
        randomClient.setName(getRandomString(255));
        randomClient.setEmail(getRandomString(255));
        clientService.patch(randomClient);
        Client updatedClient = clientService.getById(randomId);
        assertEquals(randomClient, updatedClient);


        // DELETE
        for(int i=0;i<clientIds.size();i++){
            clientService.delete(clientIds.get(i));
        }
        assertTrue("clientService must be empty", 0==clientService.getCount());
    }

    private Client getTestClient(){
        Client client = new Client();
        client.setName(getRandomString(255));
        client.setSurName(getRandomString(255));
        client.setOldName(getRandomString(255));
        client.setEmail(getRandomString(255));
        client.setRegDate(new Timestamp(System.currentTimeMillis()));
        client.setRemDate(new Timestamp(System.currentTimeMillis()));
        client.setPassword(getRandomString(255));
        client.setIsValidated(true);
        return client;
    }

    private String getRandomString(int length){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
