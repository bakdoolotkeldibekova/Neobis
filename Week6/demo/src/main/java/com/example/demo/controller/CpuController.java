package com.example.demo.controller;

import com.example.demo.entity.CpuEntity;
import com.example.demo.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/cpu")
public class CpuController {

    @Autowired
    private CpuRepository cpuRepository;

    @PostMapping
    public CpuEntity create(@RequestBody CpuEntity cpu) {
        return cpuRepository.save(cpu);
    }

    @RequestMapping(value = "/addCpu", method = RequestMethod.POST)
    public @ResponseBody boolean addCpu (@RequestParam String model, @RequestParam int nucleus, @RequestParam double frequency) {
        CpuEntity cpu = new CpuEntity();
        cpu.setModel(model);
        cpu.setFrequency(frequency);
        cpu.setNucleus(nucleus);
        cpuRepository.save(cpu);
        return true;
    }

    @RequestMapping(value = "/deleteCpu/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCpu(@PathVariable("id") int id) {
        return cpuRepository.findById(id)
                .map(record -> {
                    cpuRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/updateCpu/{id}", method = RequestMethod.PUT)
    public ResponseEntity<CpuEntity> updateCpu(@PathVariable("id") int id,
                                         @RequestBody CpuEntity cpu) {

        return cpuRepository.findById(id)
                .map(record -> {
                    record.setModel(cpu.getModel());
                    record.setNucleus(cpu.getNucleus());
                    record.setFrequency(cpu.getFrequency());
                    CpuEntity put = cpuRepository.save(cpu);
                    return ResponseEntity.ok().body(put);
                }).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/getAllCpu", method = RequestMethod.GET)
    public @ResponseBody Iterable<CpuEntity> getAllCpu() {
        return cpuRepository.findAll();
    }
}