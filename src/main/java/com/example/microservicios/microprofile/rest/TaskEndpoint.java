package com.example.microservicios.microprofile.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

@Path("/task")
public class TaskEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Task> doGetTasks() {
		Task tarea1 = new Task();
		tarea1.setId(1);
		tarea1.setDescripcion("Tarea 1");
		Task tarea2 = new Task();
		tarea2.setId(2);
		tarea2.setDescripcion("Tarea 2");
		List<Task> lista = new ArrayList<>();
		lista.add(tarea1);
		lista.add(tarea2);
		return lista;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response doPostTask(Task task) {
		return Response.status(Status.OK).entity(task).build();
	}
}
