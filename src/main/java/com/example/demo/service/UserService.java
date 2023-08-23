package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;

import com.example.demo.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo ur;

    public UserModel saveinfo(UserModel ss)
    {
    	return ur.save(ss);
    }
    public List<UserModel> showinfo()
    {
    	return ur.findAll();
    }
    public UserModel changeinfo(UserModel ss)
    {
    	return ur.saveAndFlush(ss);
    }
    public void delete(UserModel ss)
    {
    	ur.delete(ss);
    }
    public void deletemyid(int id)
    {
    	ur.deleteById(id);
    }
    public List<UserModel > savedetails(List<UserModel> ss) 
    {
    	return (List<UserModel> )ur.saveAll(ss);
    }
    public Optional<UserModel> getbyid(int id)
	{
		return ur.findById(id);
	}
	
	public String updateinfobyid(int id,UserModel ss) {
		ur.saveAndFlush(ss);
		if(ur.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter valid Id";
		}
	}
}
