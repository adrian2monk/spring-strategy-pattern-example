package com.gp.controllers;

import com.gp.dto.SelfieMxRequestDto;
import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.service.Kyc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KycController {

    @Autowired
    private Kyc kycService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/requirements", method = RequestMethod.GET)
    public ResponseEntity<Data> list(@RequestParam() long userId,
			@RequestHeader("country") Country country, @RequestHeader("transaction") String transaction) {
        String[] requirements = kycService.list(country,userId,transaction);
        return new ResponseEntity(requirements, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/jumio", method = RequestMethod.POST)
    public ResponseEntity<Data> selfieJumio(@RequestParam() long rppUserId,
			@RequestHeader("country") Country country,@RequestBody SelfieMxRequestDto data) {
        boolean dataIsOk = kycService.selfie(country, rppUserId,data);
        return new ResponseEntity(dataIsOk, HttpStatus.OK);
    }


}
