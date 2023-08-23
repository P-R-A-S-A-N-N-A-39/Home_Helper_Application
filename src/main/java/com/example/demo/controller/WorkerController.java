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

import com.example.demo.model.WorkerModel;
import com.example.demo.service.WorkerService;


@RestController
public class WorkerController {
	@Autowired
 WorkerService work;
	@PostMapping("addworker")
	public WorkerModel add(@RequestBody WorkerModel ss)
	{
		return work.savewinfo(ss);
	}
	@GetMapping("showworker")
	public List<WorkerModel> show()
	{
		return work.showwinfo();
	}
	@PutMapping("updateworker")
	public WorkerModel modify(@RequestBody WorkerModel ss)
	{
		return work.changewinfo(ss);
	}
	@DeleteMapping("deleteworker")
	public String del(@RequestBody WorkerModel ss)
	{
		 work.deletew(ss); 
		 return "Deleted Successfully";
	}
  @PostMapping("addnworker")
  public List<WorkerModel> addndetails(@RequestBody List<WorkerModel> ss)
  {
	  return work.savewdetails(ss);
  }
  @GetMapping("get/{id}")
	public Optional<WorkerModel> showid(@PathVariable int id)
	{
		return work.getbywid(id);
	}
	
	@PutMapping("updateid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody WorkerModel ss) {
		return work.updateinfobywid(id, ss);
	}
}
