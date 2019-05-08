package br.com.fiap.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bean.CidadaoTO;
import br.com.fiap.bo.CidadaoBO;

@Path("/cidadao")
public class CadastroResource {
	
	private CidadaoBO cidadaoBO = CidadaoBO.getInstance();
	
	@SuppressWarnings("static-access")
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CidadaoTO getById(@PathParam("id") int codigo){
		return cidadaoBO.buscar(codigo);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(CidadaoTO cidadao, @Context UriInfo uriInfo) {
		cidadaoBO.cadastrar(cidadao);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(cidadao.getCodigo()));
		return Response.created(builder.build()).build();
	}
}
