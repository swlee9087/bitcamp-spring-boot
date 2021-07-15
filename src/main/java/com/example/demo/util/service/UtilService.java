package com.example.demo.util.service;
//2


import java.time.LocalDate;
import java.time.LocalTime;

public interface UtilService {
    LocalDate getLocalDate();
    LocalTime getLocalTime();
    String todayAndCurrentTime();
    String randomNumbers(int digits, boolean allowZeroValue);

}
