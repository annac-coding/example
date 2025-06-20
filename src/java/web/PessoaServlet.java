package web;

import ejb.PessoaBean;
import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/salvar")
public class PessoaServlet extends HttpServlet {

    @EJB
    private PessoaBean pessoaBean;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String nome = req.getParameter("nome");
        pessoaBean.salvarPessoa(nome);
        resp.getWriter().write("Nome salvo com sucesso!");
    }
}
