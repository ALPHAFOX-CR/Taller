
package programacioni;

import java.util.Scanner;

public class ProgramacionI {
    
    public static void main(String[] args) {
        
        Scanner punto = new Scanner (System.in);
        int op;
        System.out.println("1. RESULTADO DE INSTRUCCIONES.");
        System.out.println("2. SUMA,PROMEDIO,PRODUCTO,COCIENTE Y MODULO DE 3 VARIABLES.");
        System.out.println("3. PRECIO DE VENTA DE UN ARTICULO DE TIENDA.");
        System.out.println("4. COSTO TOTAL DE UN VIAJE.");
        System.out.println("5. CALORIAS CONSUMIDAS POR JUAN.");
        System.out.println("0. SALIR.");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Escoja El Numero Del Ejercicio: ");
        op = punto.nextInt();
        
        switch (op){
            case 1:  float x;
                     x = 10;
                     System.out.printf("x = %.0f\n", x );
                     System.out.printf("El valor de %.0f + %.0f es %.0f\n", x, x, ( x + x ) );
                     System.out.printf("El valor de %.0f / 2 = %.2f\n", x, x / 2);
                     System.out.printf("El valor de %.0f mod 3 = %.0f\n", x, x%3 );
                     break;
            case 2: int a = 2;
                    int b = 4;
                    int c = 6;
                    float suma = (a + b + c);
                    float promedio = ((a + b + c)/3);
                    float producto = a * b * c;
                    float modulo = a % b % c;
                    System.out.println("La suma es : "+ suma);
                    System.out.println("El promedio es: "+ promedio);
                    System.out.println("El producto es : "+ producto);
                    System.out.println("El modulo es : "+ modulo);
                    break;
            case 3: Scanner valor = new Scanner (System.in);
                    float Iva = 0.21f;
                    float CostoFijo;
                    float PorcentajeIva;
                    float PorcentajeUtilidad;
                    float PrecioVenta;
                    System.out.println("Ingrese el valor fijo : ");
                    CostoFijo = valor.nextFloat();
                    PorcentajeIva = CostoFijo * Iva;
                    System.out.println("El prcentaje de Iva es : "+ PorcentajeIva);
                    System.out.println("Ingrese El Porcentaje De Utilidad : ");
                    PorcentajeUtilidad = valor.nextFloat();
                    PrecioVenta = ((CostoFijo + PorcentajeIva)* PorcentajeUtilidad);
                    System.out.println("EL VALOR TOTAL DEL PRECIO DE VENTA ES : "+ PrecioVenta);
                    break;
            case 4: Scanner viaje = new Scanner (System.in);
                    float ValorTotalViaje;
                    int DiasViaje;
                    float KmDia;
                    float KmDia2;
                    float ValorGasolinaDia;
                    float ValorGasolinaDia2;
                    float LitroGasolina;
                    float PromedioKmLitro;
                    float EstacionamientoDia;
                    float EstacionamientoDia2;
                    float PeajesDia;
                    float PeajesDia2;
                    System.out.print("Ingrese el total de dias del viaje : ");
                    DiasViaje = viaje.nextInt();
                    System.out.print("Ingrese los kilometros conducidos por dia : ");
                    KmDia = viaje.nextFloat();
                    System.out.print("Ingrese el valor del litro de gasolina : ");
                    LitroGasolina = viaje.nextFloat();
                    System.out.print("Ingrese el promedio de Km por litro de gasolina : ");
                    PromedioKmLitro = viaje.nextFloat();
                    System.out.print("Ingrese el valor por estacionamiento por dia : ");
                    EstacionamientoDia = viaje.nextFloat();
                    System.out.print("Ingrese El Valor De Peajes Por Dia : ");
                    PeajesDia = viaje.nextFloat();
                    System.out.println("---------------------------------------------");
                    KmDia2 = (KmDia * DiasViaje);
                    ValorGasolinaDia = ( (KmDia / PromedioKmLitro) * LitroGasolina );
                    ValorGasolinaDia2 = ( ValorGasolinaDia * DiasViaje );
                    EstacionamientoDia2 = ( EstacionamientoDia * DiasViaje );
                    PeajesDia2 = ( PeajesDia * DiasViaje );
                    ValorTotalViaje = ( ValorGasolinaDia2 + EstacionamientoDia2 + PeajesDia2 );
                    System.out.println("TOTAL DE KM DEL VIAJE : " + KmDia2 + " KM " );
                    System.out.println("TOTAL DE GASTO DE GASOLINA DEL VIAJE : " + ValorGasolinaDia2 + " PESOS " );
                    System.out.println("TOTAL DE ESTACIOMANIENTO DEL VIAJE : "+ EstacionamientoDia2 + " PESOS " );
                    System.out.println("TOTAL DE PEAJES DEL VIAJE : "+ PeajesDia2 + " PESOS " );
                    System.out.println("---------------------------------------------");
                    System.out.println("TOTAL DE GASTOS POR EL VIAJE : "+ ValorTotalViaje + " PESOS " );
                    break;
            case 5: Scanner calorias = new Scanner (System.in);
                    int Manzana = 52, Piña = 55, Pera = 55, Naranja = 45, Fresa = 32, Melon = 54;
                    int Manzana2, Piña2, Pera2, Naranja2, Fresa2, Melon2;
                    int CaloriasTotal;
                    System.out.print("Cuantas Manzanas Tiene La Ensalada De Juan : ");
                    Manzana2 = calorias.nextInt();
                    System.out.print("Cuantas Piñas Tiene La Ensalada De Juan : ");
                    Piña2 = calorias.nextInt();
                    System.out.print("Cuantas Peras Tiene La Ensalada De Juan : ");
                    Pera2 = calorias.nextInt();
                    System.out.print("Cuantas Naranjas Tiene La Ensalada De Juan : ");
                    Naranja2 = calorias.nextInt();
                    System.out.print("Cuantas Fresas Tiene La Ensalada De Juan : ");
                    Fresa2 = calorias.nextInt();
                    System.out.print("Cuantos Melones Tiene La Ensalada De Juan : ");
                    Melon2 = calorias.nextInt();
                    System.out.println("---------------------------------------------------");
                    CaloriasTotal = ((Manzana * Manzana2)+(Piña * Piña2)+(Pera * Pera2)+(Naranja * Naranja2)+(Fresa * Fresa2)+(Melon * Melon2));
                    System.out.println("TOTA DE CALORIAS CONSUMIDAS POR JUAN : "+ CaloriasTotal + " CALORIAS ");
                    break;
                    
            default : System.out.println("FINALIZO EL PROGRAMA");
                    break;
    
        }  
    }
}
