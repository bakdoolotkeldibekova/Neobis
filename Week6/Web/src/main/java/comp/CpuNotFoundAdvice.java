package comp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class CpuNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(CpuNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String cpuNotFoundHandler(CpuNotFoundException ex) {
        return ex.getMessage();
    }
}