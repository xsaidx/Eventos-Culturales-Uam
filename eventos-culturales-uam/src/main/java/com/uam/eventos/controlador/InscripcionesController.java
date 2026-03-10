package com.uam.eventos.controlador;

public class InscripcionesController {

    // Crear una inscripción
    public void crearInscripcion() {
        System.out.println("Inscripción creada correctamente.");
    }

    // Consultar todas las inscripciones
    public void listarInscripciones() {
        System.out.println("Listado de inscripciones.");
    }

    // Consultar una inscripción por ID
    public void obtenerInscripcionPorId(int id) {
        System.out.println("Mostrando inscripción con ID: " + id);
    }

    // Actualizar una inscripción
    public void actualizarInscripcion(int id) {
        System.out.println("Inscripción actualizada con ID: " + id);
    }

    // Eliminar una inscripción
    public void eliminarInscripcion(int id) {
        System.out.println("Inscripción eliminada con ID: " + id);
    }
}