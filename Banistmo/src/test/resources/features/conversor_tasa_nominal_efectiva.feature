#language: es
#Author: lamd9126@hotmail.com.co

@Conversor
Característica: Ingresar a la pagina de Bancolombia y realiza una conversión de tasa nominal efectiva

  Antecedentes:
    Dado que el cliente ingresa a Bancolombia

  @ConvertirTasaNominalEfectiva
  Escenario: Verificar la conversión de la tasa según los valores ingresados
    Cuando ingresa los datos principales para convertir la tasa
      | ingresaTasa | periodicidadDeseada | capitalizacion | respuesta |
      | 20          | Semestral           | Anual          | 9.54 %    |
    Entonces se visualiza el resultado
