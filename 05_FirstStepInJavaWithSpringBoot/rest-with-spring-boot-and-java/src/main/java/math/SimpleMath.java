package math;

public class SimpleMath {

	
    public Double sum(Double numberOne, Double numberTwo) {
        
        return numberOne + numberTwo;
    }    
	 // Subtração
	
    public Double sub(Double numberOne, Double numberTwo)  {
    
        return numberOne - numberTwo;
    }    
	
	// Multiplicação
	
    public Double mult(Double numberOne, Double numberTwo) {
       
        return numberOne * numberTwo;
    } 
	
	// Divisão
	
	
    public Double div( Double numberOne,Double numberTwo) {
        return numberOne / numberTwo;
    }    
	
	// Média
	
    public Double med( Double numberOne, Double numberTwo)  {
     
        return (numberOne + numberTwo) / 2;
    }    
	
	// Raiz Quadrada
	
	
    public Double raiz( Double number) {
     
        return Math.sqrt(number);
    }    
 
}
