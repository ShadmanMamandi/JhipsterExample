package com.parsova.service;

import com.parsova.domain.Bank;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by shiva on 7/3/17.
 */

@Service
@Transactional
public class BankService {

    // POST METHOD FOR BANK MELLAT
    private final String BANK_URL = "https://bpm.shaparak.ir/pgwchannel/startpay.mellat";

    private final long TERMINAL_ID = 012345;



    private Map<Long, String> setRequestRegister(long amount, long subServiceId) {
        return null;
    }

    private String getCallBack(Bank bank) {
        return bank.getCallBackUrl();
    }

    private void getVerify() {
        Map<Long, String> longStringMap = setRequestRegister(123000,123);
        if (longStringMap.containsKey(0)) {
            System.out.println("your request is fine : ");

            //soap and interaction with bank

        }

        // nothing else matter

    }


    private static void mockBank() {


        Bank bank = new Bank();

        bank.setTerminalId(1234);
        bank.setSubServiceId(01);
        bank.setUserName("shiva");
        bank.setUserPassword("12345");
        bank.setCallBackUrl("http://www.google.com");
        bank.setPayerId(012345012345);


    }

    public Bank callPayment() {
        return null;
    }
}
