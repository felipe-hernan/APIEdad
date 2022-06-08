
package com.edadPersona.edad.controller;

import com.edadPersona.edad.model.CalculoEdad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdadController {
    
    @GetMapping
    public String fecha(){
        
        var fecha = new CalculoEdad();
        return "Dia "+String.valueOf(fecha.getDayAc())+" Mes "+String.valueOf(fecha.getMonthAc())+" Año "+String.valueOf(fecha.getYearAc());
    }
    @GetMapping("nacimiento/{dia}/{mes}/{año}")
    public String edad(@PathVariable int dia,
                                    @PathVariable int mes,
                                    @PathVariable int año){
        var edadActual = new CalculoEdad();
        return edadActual.edadAlDia(dia, mes, año);
    }
    
}
