
package com.mc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador de Tipo Rest
@Slf4j //Enviar informacion al log con la libreria lombok
public class ControladorInicio {
    @GetMapping("/") //Indicarle al navegador que este metodo es el que se debe ejecutar
    public String inicio(){
        log.info("Ejecutando el controlador Rest");
        log.debug("Mas detalle del controlador");
        return "Hola con Spring Boot!!";
    }
    
    
}
