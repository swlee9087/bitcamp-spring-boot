package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

import java.util.List;

//2
/*
bankName=constant
이름 입력시 계좌 생성. 단 계번=****-****-****, 랜덤값.
금액 계번 입력후 입금후 잔액 확인
금액 계번 입력후 출금후 잔액 확인
금액 계번 입력후 잔액 확인하면 잔액 보임

이름 계번 입력후 계좌해지

*/
public interface BankAccountService {

    void createAccount(BankAccountDTO bank); //cons
    String count(); //suppl
    List<? extends BankAccountDTO> findAll();
    String[] findAllAccountNumbers();
    BankAccountDTO findAccountByAccountNumber (String bankAccountNumber);
    String findBalanceByAccountNumber (String bankAccountNumber); //fn
    void deposit (BankAccountDTO bank);
    void withdraw (BankAccountDTO bank);
    void dropAccount (BankAccountDTO bank);


}
