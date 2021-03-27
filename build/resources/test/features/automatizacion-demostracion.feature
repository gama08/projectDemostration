@registrarse
Feature: Desmotración Automatización
  Scenario: Registrar usuario
    Given que Antonio desea registrarse en el aplicativo de sitio demostracion automatizacion
    When diligencia la informacion solicitada despues valida la informacion
    | nombre | apellido | direccion | correo | telefono | genero | pais | fNacimiento | contrasenia | confirContrasenia |
    | Gamaliel Antonio | Beltran ramos | CRA 3A BIS #47B-06 SUR ESTE | beltranramosgamaliel@gmail.com | 3113604278 | Male | Colombia | 2000-August-15 | B3tr4*823 | B3tr4*823 |
    Then sigue en la misma pantalla
    | pantalla|
    | Register |