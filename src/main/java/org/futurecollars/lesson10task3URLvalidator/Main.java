package org.futurecollars.lesson10task3URLvalidator;

public class Main {
    public static void main(String[] args) {

        URLvalidator urLvalidator = new URLvalidator();
        System.out.println(urLvalidator.isURLvalidate("http://www.onet.pl"));
        System.out.println(urLvalidator.isURLvalidate("https://mail.google.com"));
        System.out.println(urLvalidator.isURLvalidate("http://wiadmosci.onet.pl"));
        System.out.println(urLvalidator.isURLvalidate("http://onet.pl"));
        System.out.println(urLvalidator.isURLvalidate("httrp://onet.pl"));
        System.out.println(urLvalidator.isURLvalidate("http://onet.l"));
    }
}
