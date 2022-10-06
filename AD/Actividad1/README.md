# PRACTICA 1

## Ejercicio 1

Desarrollar una aplicación para tomar y mostrar datos generales de personas. El formulario deberá tener el siguiente aspecto:

[https://raw.githubusercontent.com/davidcafor/davidcafor/Entregas_DAM/blob/main/DI/UD1.PRACTICA1/snapshot.png](https://github.com/davidcafor/Entregas_DAM/blob/main/DI/UD1.PRACTICA1/snapshot.png)

Al pulsar sobre el botón Guardar se almacenará toda la información introducida.

Habrá que tener en cuenta las siguientes restricciones:

* Todos los campos son obligatorios (realizar una validación de campos total).
* En caso de que la opción Otra esté seleccionada, la caja de texto asociada a la opción estará habilitada.
* En caso de que la opción Otra no esté seleccionada, la caja de texto asociada a la opción estará vacía y deshabilitada.
* En caso de seleccionar Otra, al guardar se debe validar que en la caja de texto asociada hay algo escrito (si no es así informar del error).
* No puede haber 2 registros con el mismo DNI. En caso de intentar introducir un DNI repetido mostrar un mensaje de error.
* No es necesario validar el formato del DNI.

Si los utilizando la estructura de datos que se considere oportuna (Vector, ArrayList, HashTable, ...).
datos introducidos son correctos se almacenara el registro en memoria

Al pulsar sobre el botón buscar se buscará en memoria el DNI insertado en la caja de texto adjunta al botón buscar (se debe comprobar que se ha escrito
algo. En caso de no ser así mostrar un mensaje de error). En caso de que no
exista el registro buscado en memoria, se informará al usuario. En caso de que exista el registro buscado en memoria, se utilizará el formulario para mostrar la información almacenada en el registro (antes de volcar los datos al formulario es necesario limpiar los datos que había en él previamente para que no haya inconsistencias en la información mostrada).

Todos los errores que puedan surgir durante la utilización de la aplicación deben de ser mostrados al usuario para que pueda subsanarlos.

## Ejercicio 2

Desarrollar de nuevo la aplicación del EJERCICIO1, pero en este caso la validación de campos debe de ser parcial.
