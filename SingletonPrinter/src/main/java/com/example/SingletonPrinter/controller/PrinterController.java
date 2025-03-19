package com.example.singletonprinter.controller;

import com.example.singletonprinter.service.Printer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrinterController {

    private final Printer printer;

    // Injecting Singleton Printer Bean
    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    @GetMapping("/print")
    public String print(@RequestParam String message) {
        printer.printMessage(message);
        return "Message sent to printer: " + message;
    }
}
