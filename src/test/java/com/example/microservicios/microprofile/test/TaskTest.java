package com.example.microservicios.microprofile.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.microservicios.microprofile.rest.Task;

class TaskTest {
	private final Task task = new Task();
	@Test
	void testToString() {
		String toString = task.toString();
		assertEquals("1.Tarea 1", toString);
	}

	@Test
	void testSetId() {
		task.setId(2);
		int id = task.getId();
		assertEquals(2, id);
	}

	@Test
	void testSetDescripcion() {
		task.setDescripcion("Tarea 2");
		String descripcion = task.getDescripcion();
		assertEquals("Tarea 2", descripcion);
	}

	@Test
	void testGetId() {
		int id = task.getId();
		assertEquals(1, id);
	}

	@Test
	void testGetDescripcion() {
		String descripcion = task.getDescripcion();
		assertEquals("Tarea 1", descripcion);
	}

}
