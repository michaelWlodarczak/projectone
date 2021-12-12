//package edu.sda.grcy.important;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//@Entity
//@Table(name = "pesel")
//@NoArgsConstructor
//public class Pesel2 {
//
//
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        private int id;
//        String peselNumber;
//        private Pesel2(String peselNumber) {
//            this.peselNumber = peselNumber;
//        }
//        public static Pesel2 createPesel(String peselNumber) {
//            if(peselNumber.matches("[0-9]*")) {
//                return new Pesel2(peselNumber);
//            }
//            System.out.println("Not correct number");
//            return null;
//        }
//        public String getPeselNumber() {
//            return peselNumber;
//        }
//    }
//
