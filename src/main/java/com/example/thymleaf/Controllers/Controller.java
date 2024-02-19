package com.example.thymleaf.Controllers;

import com.example.thymleaf.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final StudentService studentService;

    @DeleteMapping
    public ResponseEntity<?> remove(@RequestParam String uuid){
        studentService.remove(uuid);
        return ResponseEntity.ok().build();
    }
}
