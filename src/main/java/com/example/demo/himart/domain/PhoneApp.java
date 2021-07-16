package com.example.demo.himart.domain;

//DTO&Service 여기로 통합
//유사 Controller 느낌


import lombok.Data;

public class PhoneApp {
    @Data public class Phone {
        protected String kind, company, call;

        @Override //alt insert
        public String toString() {
            return "Phone{" +
                    "kind='" + kind + '\'' +
                    ", company='" + company + '\'' +
                    ", call='" + call + '\'' +
                    '}';
        }
    }

    public class Cellphone extends Phone { //GSttr로 가져온다는
        protected boolean portable;
        protected String move;         //diff type = sep ln

        @Override
        public String toString() {
            return "Cellphone{" +
                    "kind='" + kind + '\'' +
                    ", company='" + company + '\'' +
                    ", call='" + call + '\'' +
                    ", move='" + move + '\'' +
                    '}';
        }
    }

    public class IPhone extends Cellphone{
        public final static String BRAND = "iPhone";
        protected String internet;

        @Override
        public String toString() {
            return "Smahon{" +
                    "kind='" + BRAND + '\'' +
                    ", call='" + call + '\'' +
                    ", move='" + move + '\'' +
                    ", internet='" + internet + '\'' +
                    '}';
        }
    }

    public class GalaxyNote extends IPhone {
        public final static String BRAND = "GalaxyPhone"; //override brand name
        protected String pencil;

        @Override
        public String toString() {
            return "Smahon{" +
                    "kind='" + BRAND + '\'' +
                    ", call='" + call + '\'' +
                    ", move='" + move + '\'' +
                    ", internet='" + internet + '\'' +
                    ", pencil='" + pencil + '\'' +
                    '}';
        }
    }
}