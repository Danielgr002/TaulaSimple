package com.daniel.TaulaSimple.Error;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CiutatExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)

    public String handleException(Exception ex, Model model) {
        String missatgeError = "Se ha producido un error inesperat.";
        model.addAttribute("textError", missatgeError);
        return "plantillaError";
    }
}
