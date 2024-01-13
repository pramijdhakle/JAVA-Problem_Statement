package com.lead.controller;

import com.lead.dto.LeadFetchResponse;
import com.lead.dto.LeadRequest;
import com.lead.dto.LeadSaveResponse;
import com.lead.service.LeadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping("/save")
    public ResponseEntity<LeadSaveResponse> saveLeadData(@RequestBody @Valid LeadRequest leadRequest) {
        LeadSaveResponse lead = leadService.createLead(leadRequest);
        return new ResponseEntity<>(lead, HttpStatus.CREATED);
    }

    @GetMapping("/get-leads/{mobileNumber}")
    public ResponseEntity<LeadFetchResponse> getLeadData(@PathVariable Long mobileNumber) {
        LeadFetchResponse leadFetchResponse = leadService.fechAllLeads(mobileNumber);
        return new ResponseEntity<>(leadFetchResponse, HttpStatus.OK);
    }
}
