package br.unipar.programacaointernet.servicecep.servicecep.service;

import br.unipar.programacaointernet.servicecep.servicecep.dao.UsuarioDAO;
import br.unipar.programacaointernet.servicecep.servicecep.dao.UsuarioDAOImpl;
import br.unipar.programacaointernet.servicecep.servicecep.model.Usuario;
import br.unipar.programacaointernet.servicecep.servicecep.util.EntityManagerUtil;
import jakarta.jws.WebService;

@WebService(endpointInterface = "br.unipar.programacaointernet.servicecep.servicecep.service.UsuarioSEI")

public class UsuarioSIB implements UsuarioSEI{
    @Override
    public String boasVindas(String nome) {

        return "Bem Vindo" + nome + " ! ";
    }

    @Override
    public Usuario consultaUsuario(Long idUsuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl(EntityManagerUtil
                .getManager());

        return usuarioDAO.FindById(idUsuario);
    }
}
