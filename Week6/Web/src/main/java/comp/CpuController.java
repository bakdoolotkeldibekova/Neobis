package comp;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CpuController {

    private final CpuRepository repository;

    CpuController(CpuRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/cpu")
    List<Cpu> all() {
        return repository.findAll();
    }

    @PostMapping("/cpu")
    Cpu newCpu(@RequestBody Cpu newCpu) {
        return repository.save(newCpu);
    }

    // Single item

    @GetMapping("/cpu/{id}")
    Cpu one(@PathVariable int id) {

        return repository.findById(id)
                .orElseThrow(() -> new CpuNotFoundException(id));
    }

    @PutMapping("/cpu/{id}")
    Cpu replaceCpu(@RequestBody Cpu newCpu, @PathVariable int id) {
        return repository.findById(id)
                .map(cpu -> {
                    cpu.setModel(newCpu.getModel());
                    cpu.setNucleus(newCpu.getNucleus());
                    cpu.setFrequency(newCpu.getFrequency());
                    return repository.save(cpu);
                })
                .orElseGet(() -> {
                    newCpu.setId(id);
                    return repository.save(newCpu);
                });
    }

    @DeleteMapping("/cpu/{id}")
    void deleteCpu(@PathVariable int id) {
        repository.deleteById(id);
    }
}