package com.edadPersona.edad.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class CalculoEdad {
    private int edad;
    private int dayAc;
    private int monthAc;
    private int yearAc;

    public CalculoEdad() {
        this.dayAc = LocalDate.now().getDayOfMonth();
        this.monthAc = LocalDate.now().getMonthValue();
        this.yearAc = LocalDate.now().getYear();
    }
    
    
    
    public String edadAlDia(int day, int month, int year) {
        this.edad=this.yearAc-year;
        if (this.monthAc<month) {
                this.edad=this.edad-1;
        }else if (month==this.monthAc){
            if (this.dayAc>day) {
                this.edad=this.edad-1;
            }
        }
        return "Tiene la edad de "+edad;
    }
}
