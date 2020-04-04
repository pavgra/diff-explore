package org.example.diffexplore;

import org.example.diffexplore.service.MessageService;

public class Application {

    public static void main(String[] args) {

        var message = getMessage();
        System.out.println(message);
    }

    private static String getMessage() {

        return new MessageService().getMessage();
    }
}
