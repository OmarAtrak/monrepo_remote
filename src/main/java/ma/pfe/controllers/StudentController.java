package ma.pfe.controllers;

import ma.pfe.dto.StudentDto;
import ma.pfe.dto.StudentIdDTO;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/students")
public class StudentController {
    public final static Logger LOGGER = LoggerFactory.getLogger(StudentDto.class);

    @Autowired
    private StudentService service;

//    StudentController(@Qualifier("service") StudentService service){
//        this.service = service;
//    }

    @PostMapping ("/save")
    public StudentDto save(@RequestBody StudentDto dto){
        LOGGER.debug("start method Save");
        return service.save(dto);
    }
    @PutMapping("/update")
    public StudentDto update(@RequestBody StudentDto dto){
        LOGGER.debug("start method Update");
        return service.update(dto);
    }
    @DeleteMapping ("/{id}")
    public boolean delete(@PathVariable("id") StudentIdDTO id) {
        LOGGER.debug("start method Delete");
        return service.delete(id);
    }
    @GetMapping("/index")
    public List<StudentDto> selectAll(){
        LOGGER.debug("start methode Select All");
        return service.selectAll();
    }
}