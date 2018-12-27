package com.user.user.contoller;

import com.user.user.model.Movie;
import com.user.user.model.User;
import com.user.user.repository.MovieRepository;
import com.user.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class LoginControler {

    @Qualifier("userRepository")
    @Autowired
    UserRepository userRepository;


    @PostMapping("/login")
    public User login(@RequestBody Map<String,String> body ){
        String email = body.get("email");
        String password = body.get("password");
        if (userRepository.findByEmail(email) != null)
        {
            System.out.println("password = " + password);
            System.out.println("userRepository.findByEmail(email).getPassword() = " + userRepository.findByEmail(email).getPassword());
            if(userRepository.findByEmail(email).getPassword().equals(password))
            {
                return userRepository.findByEmail(email);
            }
            else return new User();
        }
        else {
            return new User();
        }
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> users(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id ){
        User user = new User();
        user = userRepository.findById(id);
        user.setFavMovies(userRepository.getBestMovies(id));
        return user;
    }


    @CrossOrigin
    @GetMapping("/user/{id}/fav")
    public List<Integer> getFav(@PathVariable int id){
        return userRepository.getBestMovies(id);
    }
}
