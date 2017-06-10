package com.dh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController //implementa todas las cosas GET, PUT, DELETE, POST
public class DemoApplication {
/*

	@RequestMapping("/") //esto es como la siguiente linea, osea GET
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(){
		return "Ostia!";
	}

    @RequestMapping("/richard")
	public String richardID(){
	    return "Hallo, mein Name ist Richard xD";
    }

    @RequestMapping("/hallo/{parametro}")
    public String helloPerson(@PathVariable String parametro){
	    return "Hallo "+parametro + ", wie geht es dir?";

    }

    @RequestMapping("/{name}/edad/{edad}")
    public String helloPerson(@PathVariable String name, @PathVariable int edad ){
        return "Hallo "+name+" mein Freund, du bist "+edad ;

    }
*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
