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
	public UserModel add(@RequestBody UserModel ss) {
		return user.saveinfo(ss);
	}
	
	@GetMapping("showuser")
	public List<UserModel> show(){
		return user.showinfo();
	}
	
	@PutMapping("updateuser")
	public UserModel modify(@RequestBody UserModel ss) {
		return user.changeinfo(ss);
	}
	
	@DeleteMapping("deleteuser")
	public String del(@RequestBody UserModel ss) {
		user.deleteinfo(ss);
		return "Deleted successfully";
	}
	
	@DeleteMapping("delid/{id}")
	public void deleteuid(@PathVariable int id) {
		user.deletemyid(id);
	}
	
	@PostMapping("addnuser")
	public List<UserModel>addndetails(@RequestBody List<UserModel> ss){
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
	
	@GetMapping("sort/{uname}")
	public List<UserModel> getsortinfo(@PathVariable String uname)
	{
		return user.sortinfo(uname);
	}
	
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<UserModel> showpageinfo(@PathVariable int pageno, @PathVariable int pagesize )
	{
		return user.getbypage(pageno, pagesize);
	}
	
	@PostMapping("addservice")
	public UserModel addser(@RequestBody UserModel ss) {
		return user.saveuserserdetails(ss);
	}
	
	@GetMapping("showservice")
	public List<UserModel> showser(){
		return user.showuserserinfo();
	}
	@GetMapping("wskills/{wskills}")
	public List<UserModel> showinfo1(@PathVariable String wskills){
		return user.display(wskills);
	}
//	@GetMapping("wgender/{wgender}")
//	public List<UserModel> showinfo3(@PathVariable String wgender){
//		return user.display1(wgender);
//	}
	@GetMapping("uname/{uname}/uid/{uid}")
	public List<UserModel> showinfo2(@PathVariable String uname,@PathVariable int uid)
	{
		return user.disp(uname, uid);
	}
	@DeleteMapping("deletequery/{uid}")
	public String deluserdetails(@PathVariable int uid)
	{
		return user.deluser(uid)+"deleted";
	}
	
	@PutMapping("updatequery/{newid}/{oldid}")
	public String updateuserdetails(@PathVariable int newid,@PathVariable int oldid) {
		return user.updateuser(newid, oldid) +"Updated";
	}
}