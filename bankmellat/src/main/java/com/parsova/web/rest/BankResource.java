package com.parsova.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.parsova.domain.Bank;
import com.parsova.domain.User;
import com.parsova.repository.UserRepository;
import com.parsova.security.AuthoritiesConstants;
import com.parsova.service.BankService;
import com.parsova.service.MailService;
import com.parsova.service.UserService;
import com.parsova.web.rest.util.HeaderUtil;
import com.parsova.web.rest.vm.ManagedUserVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by shiva on 7/3/17.
 */

@RestController
@RequestMapping("/api")
public class BankResource {



    private final Logger log = LoggerFactory.getLogger(BankResource.class);

    private final BankService bankService;


    public BankResource(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/bank")
    @Timed
    public ResponseEntity callBankService() {

        Bank bank = bankService.callPayment();

        try {
            return new ResponseEntity(bank, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }

}
