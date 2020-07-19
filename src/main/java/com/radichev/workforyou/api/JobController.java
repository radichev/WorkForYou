package com.radichev.workforyou.api;

import com.radichev.workforyou.model.bindingModels.job.jobBindingModel.JobBindingModel;
import com.radichev.workforyou.model.viewModels.jobViewModels.JobViewModel;
import com.radichev.workforyou.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/jobs")
@CrossOrigin(origins = "http://localhost:4200")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/all/{userId}")
    public ResponseEntity<List<JobViewModel>> addJob(@PathVariable String userId){
        return ResponseEntity.ok().body(this.jobService.findAllJobsByUserId(userId));
    }

    @PostMapping("/add/{userId}")
    public ResponseEntity<Void> addJob(@PathVariable String userId, @Valid @RequestBody JobBindingModel jobBindingModel){
        this.jobService.addJob(jobBindingModel, userId);
        return ResponseEntity.ok().build();
    }
}
