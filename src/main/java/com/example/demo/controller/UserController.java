package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.UserModel;

import com.example.demo.service.UserService;

@RestController
public class UserController {
@Autowired
UserService user;

@PostMapping("adduser")
public UserModel add(@RequestBody UserModel ss)
{
	return user.saveinfo(ss);
}
@GetMapping("showuser")
public List<UserModel> show()
{
	return user.showinfo();
}
@PutMapping("updateuser")
public UserModel modify(@RequestBody UserModel ss)
{
	return user.changeinfo(ss);
}
@DeleteMapping("deleteuser")
public String del(@RequestBody UserModel ss)
{
	 user.delete(ss);
	 return "Deleted Successfully";
}
@PostMapping("addnuser")
public List<UserModel> addndetails(@RequestBody List<UserModel> ss)
{
	  return user.savedetails(ss);
}
@GetMapping("getuser/{id}")
public Optional<UserModel> showid(@PathVariable int id)
{
	return user.getbyid(id);
}

@PutMapping("updateuserid/{id}")
public String modifybyid(@PathVariable int id,@RequestBody UserModel ss) {
	return user.updateinfobyid(id, ss);
}
}
