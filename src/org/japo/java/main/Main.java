/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constante
        final int DIA_SEM = 7;
        final int MIN_LLUVIA = 0;
        final int MAX_LLUVIA = 500;

        //variable
        int lluviaAct;
        int lluviaMax = 0;
        int lluviaMin = 0;
        int diaMax = 0;
        int diaMin = 0;
        int acumLluvia = 0;
        
        //Variables switch
        String nombreAct = "";
        String nombreMax = "";
        String nombreMin = "";

        //Cabecera
        System.out.println("Rango de lluvias semanales");
        System.out.println("==========================");

        //Bucle
        for (int diaAct = 0; diaAct < DIA_SEM; diaAct++) {
            
            // Generar LLuvia Dia Actual
            lluviaAct = RND.nextInt(MAX_LLUVIA - MIN_LLUVIA + 1) + MIN_LLUVIA;

            //LLuvia Máxima
            if (diaAct == 0) {
                diaMax = diaAct;
                lluviaMax = lluviaAct;
            } else if (lluviaAct > lluviaMax) {
                diaMax = diaAct;
                lluviaMax = lluviaAct;
            }

            //Lluvia Mínima
            if (diaAct == 0) {
                diaMin = diaAct;
                lluviaMin = lluviaAct;
            } else if (lluviaAct < lluviaMin) {
                diaMin = diaAct;
                lluviaMin = lluviaAct;
            }

            // Acumular Lluvia
            acumLluvia += lluviaAct;

            //Switch dia Actual
            switch (diaAct) {
                case 0:
                    nombreAct = "Lunes";
                    break;
                case 1:
                    nombreAct = "Martes";
                    break;
                case 2:
                    nombreAct = "Miercoles";
                    break;
                case 3:
                    nombreAct = "Jueves";
                    break;
                case 4:
                    nombreAct = "Viernes";
                    break;
                case 5:
                    nombreAct = "Sabado";
                    break;
                case 6:
                    nombreAct = "Domingo";
            }

            // Mostrar LLuvia Generada Dia Actual
            System.out.printf("Lluvia %s .: %d L/m²%n", nombreAct, lluviaAct);
        }

        //Switch dia Máximo
        switch (diaMax) {
            case 0:
                nombreMax = "Lunes";
                break;
            case 1:
                nombreMax = "Martes";
                break;
            case 2:
                nombreMax = "Miercoles";
                break;
            case 3:
                nombreMax = "Jueves";
                break;
            case 4:
                nombreMax = "Viernes";
                break;
            case 5:
                nombreMax = "Sabado";
                break;
            case 6:
                nombreMax = "Domingo";
        }

        //Switch día Mínimo
        switch (diaMin) {
            case 0:
                nombreMin = "Lunes";
                break;
            case 1:
                nombreMin = "Martes";
                break;
            case 2:
                nombreMin = "Miercoles";
                break;
            case 3:
                nombreMin = "Jueves";
                break;
            case 4:
                nombreMin = "Viernes";
                break;
            case 5:
                nombreMin = "Sabado";
                break;
            case 6:
                nombreMin = "Domingo";
        }
        //Separador
        System.out.println("");

        //Cabecera máximos, mínimos y media
        System.out.println("Máximo, mínimo y media.");
        System.out.println("=======================");

        //Salida por pantalla lluvia máxima
        System.out.printf("Día máximo lluvia ........: %d L/m² - %s%n", lluviaMax, nombreMax);

        //Separador
        System.out.println("-----");

        //Salida por pantalla lluvia mínima
        System.out.printf("Día mínimo lluvia ........: %d L/m² - %s%n", lluviaMin, nombreMin);

        //Separador
        System.out.println("-----");

        //Salido por pantalla media de lluvia semanal.
        System.out.printf("Media lluvia semanal .....: %d L/m²%n", acumLluvia / DIA_SEM);
    }
}
