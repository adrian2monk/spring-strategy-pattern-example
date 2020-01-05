package com.gp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gp.dto.SelfieMxRequestDto;
import com.gp.dto.SelfieMxResponseDto;
import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.service.Selfie;

public class selfieController {

	@Autowired
	Selfie selfie;
	
    @RequestMapping(value = "/jumio-status", method = RequestMethod.POST)
    public ResponseEntity<Data> selfieJumio(@RequestParam() long rppUserId,
			@RequestHeader("country") Country country,@RequestBody SelfieMxResponseDto data) {
        selfie.selfieResponse(country, rppUserId, data);
        return new ResponseEntity("", HttpStatus.OK);
    }
	
}
