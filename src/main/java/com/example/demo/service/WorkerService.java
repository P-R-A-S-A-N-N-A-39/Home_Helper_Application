package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.WorkerModel;
import com.example.demo.repository.WorkerRepo;

@Service
public class WorkerService {

	 @Autowired
	    WorkerRepo wr;

	    public WorkerModel savewinfo(WorkerModel ss)
	    {
	    	return wr.save(ss);
	    }
	    public List<WorkerModel> showwinfo()
	    {
	    	return wr.findAll();
	    }
	    public WorkerModel changewinfo(WorkerModel ss)
	    {
	    	return wr.saveAndFlush(ss);
	    }
	    public void deletew(WorkerModel ss)
	    {
	    	wr.delete(ss);
	    }
	    public void deletewid(int id)
	    {
	    	wr.deleteById(id);
	    }
	    public List<WorkerModel > savewdetails(List<WorkerModel> ss) 
	    {
	    	return (List<WorkerModel> )wr.saveAll(ss);
	    }
	    public Optional<WorkerModel> getbywid(int id)
		{
			return wr.findById(id);
		}
		
		public String updateinfobywid(int id,WorkerModel ss) {
			wr.saveAndFlush(ss);
			if(wr.existsById(id)) {
				return "Updated";
			}
			else {
				return "Enter valid Id";
			}
		}
	
}
