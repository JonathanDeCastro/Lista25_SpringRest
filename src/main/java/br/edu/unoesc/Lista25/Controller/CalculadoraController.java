package br.edu.unoesc.Lista25.Controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.Lista25.Util.Calculadora;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
	
	Logger logger = Logger.getLogger(CalculadoraController.class.getName());
	
	Calculadora calc = new Calculadora();
	
	// Soma
	@GetMapping("/somar-query")
	public Double somarQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
			logger.info("Resultado = " + calc.soma(numero1, numero2));
			return calc.soma(numero1, numero2);
	}    
	@RequestMapping(value = "/somar-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double somarPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
			logger.info("Resultado = " + calc.soma(numero1, numero2));
			return calc.soma(numero1, numero2);
	}
	
	// Subtração
	@GetMapping("/subtrair-query")
	public Double subtrairQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
			logger.info("Resultado = " + calc.subtracao(numero1, numero2));
			return calc.subtracao(numero1, numero2);
	}
	@RequestMapping(value = "/subtrair-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double subtratirPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
			logger.info("Resultado = " + calc.subtracao(numero1, numero2));
			return calc.subtracao(numero1, numero2);
	}
	
	// Divisão
	@GetMapping("/dividir-query")
	public Double dividirQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
		try {
			logger.info("Resultado = " + calc.divisao(numero1, numero2));
			return calc.divisao(numero1, numero2);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			return 0D;
		}
}		
	@RequestMapping(value = "/dividir-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double dividirPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
			try {
				logger.info("Resultado = " + calc.divisao(numero1, numero2));
				return calc.divisao(numero1, numero2);
			} catch (IllegalArgumentException e) {
				System.out.println(e);
				return 0D;
			}
	}
	
	// Multiplicação
	@GetMapping("/multiplicar-query")
	public Double multiplicarQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
			logger.info("Resultado = " + calc.multiplicacao(numero1, numero2));
			return calc.multiplicacao(numero1, numero2);
	}
	@RequestMapping(value = "/multiplicar-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double multiplicarPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
			logger.info("Resultado = " + calc.multiplicacao(numero1, numero2));
			return calc.multiplicacao(numero1, numero2);
	}
	
	// Média
	@GetMapping("/media-query")
	public Double mediaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
			logger.info("Resultado = " + calc.media(numero1, numero2));
			return calc.media(numero1, numero2);
	}
	@RequestMapping(value = "/media-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double mediaPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
			logger.info("Resultado = " + calc.media(numero1, numero2));
			return calc.media(numero1, numero2);
	}
	
	// Potência 
	@GetMapping("/potencia-query")
	public Double potenciaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {		
			try {
				logger.info("Resultado = " + calc.potenciacao(numero1, numero2));
				return calc.potenciacao(numero1, numero2);
			} catch (IllegalArgumentException e) {
				System.out.println(e);
				return 0D;
			}
	}
	@RequestMapping(value = "/potencia-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double potenciaPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
			try {
				logger.info("Resultado = " + calc.potenciacao(numero1, numero2));
				return calc.potenciacao(numero1, numero2);
			} catch (IllegalArgumentException e) {
				System.out.println(e);
				return 0D;
			}
	}
	
	// Radiciação
	@GetMapping("/raiz-query")
	public Double raizQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
			 				 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
			try {
				logger.info("Resultado = " + calc.radiciacao(numero1, numero2));
				return calc.radiciacao(numero1, numero2);
			} catch (IllegalArgumentException e) {
				System.out.println(e);
				return 0D;
			}
	}
	@RequestMapping(value = "/raiz-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double raizPath(@PathVariable(value = "numero1") String numero1,
							@PathVariable(value = "numero2") String numero2) {
		try {
			logger.info("Resultado = " + calc.radiciacao(numero1, numero2));
			return calc.radiciacao(numero1, numero2);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			return 0D;
		}
	}


}
		
		
		
		