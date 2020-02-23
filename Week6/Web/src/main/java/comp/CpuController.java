package comp;

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
    public Cpu create(@RequestBody Cpu cpu) {
        return cpuRepository.save(cpu);
    }

    @RequestMapping(value = "/addCpu", method = RequestMethod.POST)
    public @ResponseBody boolean addCpu (@RequestParam String model, @RequestParam int nucleus, @RequestParam double frequency) {
        Cpu cpu = new Cpu(model, nucleus, frequency);
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
    public ResponseEntity<Cpu> updateCpu(@PathVariable("id") int id,
                                                   @RequestBody Cpu cpu) {
        return cpuRepository.findById(id)
                .map(record -> {
                    record.setModel(cpu.getModel());
                    record.setNucleus(cpu.getNucleus());
                    record.setFrequency(cpu.getFrequency());
                    Cpu put = cpuRepository.save(cpu);
                    return ResponseEntity.ok().body(put);
                }).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/getAllCpu", method = RequestMethod.GET)
    public @ResponseBody Iterable<Cpu> getAllCpu() {
        return cpuRepository.findAll();
    }
}
