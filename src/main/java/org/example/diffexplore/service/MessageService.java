package org.example.diffexplore.service;

import com.google.common.io.Resources;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

public class MessageService {

    public String getMessage() {

        try {
            return Resources.toString(Resources.getResource("messages/demo.txt"), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
