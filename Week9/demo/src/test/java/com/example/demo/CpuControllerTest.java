package com.example.demo;

import com.example.demo.entity.CpuEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.HttpClientErrorException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CpuControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl(){
        return "http://localhost:" + port;
    }

    @Test
    public void testAddCpu(String model, int nucleus, double frequency) {
        CpuEntity cpuEntity = new CpuEntity(model, nucleus, frequency);
        ResponseEntity<CpuEntity> postResponse = restTemplate.postForEntity(getRootUrl() + "/cpu/addCpu", cpuEntity, CpuEntity.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void testDeleteCpu(int id){
        CpuEntity cpuEntity = restTemplate.getForObject(getRootUrl() + "/cpu/deleteCpu/" + id, CpuEntity.class);
        assertNotNull(cpuEntity);
        restTemplate.delete(getRootUrl() + "/cpu/deleteCpu/" + id);
        try {
            cpuEntity = restTemplate.getForObject(getRootUrl() + "/cpu/deleteCpu/" + id, CpuEntity.class);
        } catch (final HttpClientErrorException exception){
            assertEquals(exception.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testUpdateCpuById(int id, CpuEntity cpuEntity){
        CpuEntity cpu = restTemplate.getForObject(getRootUrl() + "/cpu/updateCpu/" + id, CpuEntity.class);
        cpu.setModel(cpuEntity.getModel());
        cpu.setNucleus(cpuEntity.getNucleus());
        cpu.setFrequency(cpuEntity.getFrequency());
        restTemplate.put(getRootUrl() + "/cpu/updateCpu/" + id, cpu);
        CpuEntity updateCpu = restTemplate.getForObject(getRootUrl() + "/cpu/updateCpu/" + id, CpuEntity.class);
        assertNotNull(updateCpu);
    }

    @Test
    public void testGetAllCpu(){
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/cpu/getAllCpu",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}