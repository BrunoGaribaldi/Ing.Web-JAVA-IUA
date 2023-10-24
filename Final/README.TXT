- Implementar la clase Silo, que extiende de Contenedor, e implemente el siguiente constructor:   LISTO Y PROBADO
    . public Silo(Ingrediente ingrediente, int capacidad)
        el constructor lanza una IllegalArgumentException si el tipo de ingrediente no es POLVO
    
- Implementar los metodos de la clase CatalogoDeRecetas LISTO, Y PROBADA
    . public List<String> indice()
    
- Modificar la clase Amasadora tal que implemente la interfaz maquina LISTO PERO PROBAR
    . public Amasadora()
    . public boolean verificarDisponibilidadDeIngrediente (Ingrediente ingrediente, int cantidad) LISTO Y PROBADO
    . public void extraerIngrediente(Ingrediente ingrediente, int cantidad) LISTO Y PROBADO
    . public List<Ingrediente> getIngredientesFaltantesParaReceta() LISTO Y PROBADO
        
- Implementar los metodos de la interfaz Maquina para Amasadaora tal que LISTO PERO PROBAR
    . Al encender cambia el Estado de la maquina a ENCENDIDO
    . Al apagar cambia el Estado de la maquina a APAGADO. Si la maquina esta OCUPADA, lanza una IllegalStateException
    . Al iniciar proceso:
        Inicia el proces de amasado de la receta asociada 
            - Extrae los ingredientes necesarios para la receta
            - Cambia estado de la amasadora a OCUPADO
            - Setea la alarma del Reloj de la amasadora al final del ciclo de amasado segun el tiempo de amasado de la receta
            - Setea el peso del lote amasado (sumatoria de la cantidad de cada ingrediente de la receta) 
              Lanza IllegalStateException cuando 
                - el Estado de la amasadora no es correcto (apagado u ocupado),
                - no hay receta cargada en la amasadora
                - hay algun faltante de ingrediente 

    . Al finalizar proceso LISTO PERO PROBAR
        Finaliza el proceso de la maquina
        - Cambia el estado a ENCENDIDO
        - desaloja el lote (pone el peso del lote en cero)
        - limpia la alarma del reloj de la amasadora (la setea a null)
        Lanza IllegalStateException cuando
        - el estado de la maquina esta en estado APAGADO o ENCENDIDO (no hay ningun proceso corriendo)