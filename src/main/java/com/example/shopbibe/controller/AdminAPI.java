package com.example.shopbibe.controller;

import com.example.shopbibe.dto.response.ResponMessage;
import com.example.shopbibe.model.User;
import com.example.shopbibe.service.impl.RoleServiceImpl;
import com.example.shopbibe.service.impl.UserServiceImpl;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("users")
public class AdminAPI {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    RoleServiceImpl roleService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity<?> save(@Valid @RequestBody User user, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return new ResponseEntity<>(new ResponMessage("loi form"), HttpStatus.OK);
//        }
//        userService.save(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    @PutMapping
    public ResponseEntity<?> edit(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            if (bindingResult.hasFieldErrors("password")) {
                User oldUser = userService.findById(user.getId());
                user.setPassword(oldUser.getPassword());
                userService.save(user);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(new ResponMessage("loi form"),HttpStatus.OK);
        }
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/roles")
    public ResponseEntity<?> getRoles(){
        return new ResponseEntity<>(roleService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<User>> findByName(@PathVariable String name){
        return new ResponseEntity<>(userService.findByName(name),HttpStatus.OK);
    }

}
