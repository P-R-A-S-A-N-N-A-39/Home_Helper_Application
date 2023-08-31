package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo ur;
	
	public UserModel saveinfo(UserModel ss) {
		return ur.save(ss);
	}
	
	public List<UserModel> savedetails(List<UserModel> ss)
	{
		return (List<UserModel>) ur.saveAll(ss);
	}
	
	public List<UserModel> showinfo(){
		return ur.findAll();
	}
	
	public UserModel changeinfo(UserModel ss) {
		return ur.saveAndFlush(ss);
	}
	
	public void deleteinfo(UserModel ss) {
		ur.delete(ss);
	}
	
	public void deletemyid(int id) {
		ur.deleteById(id);
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
	
	public List<UserModel> sortinfo(String s)
	{
		return ur.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<UserModel> getbypage(int pgno,int pgsize)
	{
		Page<UserModel> p=ur.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public UserModel saveuserserdetails(UserModel ss) {
		return ur.save(ss);
	}
	
	public List<UserModel> showuserserinfo() 
	{
		return ur.findAll();
	}
	public List<UserModel> display(@PathVariable String wskills)
	{
		return ur.getinfobyskills(wskills);
	}
//	public List<UserModel> display1(@PathVariable String wgender)
//	{
//		return ur.getinfobygender(wgender);
//	}
	public List<UserModel> disp(@PathVariable String uname,@PathVariable int uid)
	{
		return ur.getinfobygen(uname,uid);
	}
	public int deluser(int uid) {
		return ur.deleteUserInfo(uid);
	}
	
	public int updateuser(int uid,int uid1) {
		return ur.updateUserInfo(uid,uid1);
	}
}