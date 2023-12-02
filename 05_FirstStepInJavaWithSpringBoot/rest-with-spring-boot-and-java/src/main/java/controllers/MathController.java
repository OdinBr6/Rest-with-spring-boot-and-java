package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import converters.NumberConverter;
import exceptions.UnsupportedMathOperationException;
import math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sum(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }    
	 // Subtração
	
	@GetMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sub(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }    
	
	// Multiplicação
	
	@GetMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.mult(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    } 
	
	// Divisão
	
	@GetMapping("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.div(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }    
	
	// Média
	
	@GetMapping("/med/{numberOne}/{numberTwo}")
    public Double med(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.med(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }    
	
	// Raiz Quadrada
	
	@GetMapping("/raiz/{number}")
    public Double raiz(@PathVariable("number") String number) throws Exception {
        if (!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.raiz(NumberConverter.covertToDouble(number));
    }    
}

