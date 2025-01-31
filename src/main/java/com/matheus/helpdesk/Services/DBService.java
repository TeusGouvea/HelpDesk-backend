package com.matheus.helpdesk.Services;

import com.matheus.helpdesk.Repositories.ChamadoRepository;
import com.matheus.helpdesk.Repositories.ClienteRepository;
import com.matheus.helpdesk.Repositories.PessoaRepository;
import com.matheus.helpdesk.Repositories.TecnicoRepository;
import com.matheus.helpdesk.domain.Chamado;
import com.matheus.helpdesk.domain.Cliente;
import com.matheus.helpdesk.domain.Tecnico;
import com.matheus.helpdesk.domain.enums.Perfil;
import com.matheus.helpdesk.domain.enums.Prioridade;
import com.matheus.helpdesk.domain.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;


@Service
public class DBService {

    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public void instanciaDB() {

        Tecnico tec1 = new Tecnico(null,"Matheus Gouvêa", "778.556.170-27", "matheus@mail.com", encoder.encode("123"));
        tec1.addPerfil(Perfil.ADMIN);  tec1.addPerfil(Perfil.TECNICO);
        Tecnico tec2 = new Tecnico(null, "Richard Stallman", "903.347.070-56", "stallman@mail.com", encoder.encode("123"));
        tec2.addPerfil(Perfil.TECNICO);
        Tecnico tec3 = new Tecnico(null, "Claude Elwood Shannon", "271.068.470-54", "shannon@mail.com", encoder.encode("123"));
        tec3.addPerfil(Perfil.TECNICO);
        Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee", "162.720.120-39", "lee@mail.com", encoder.encode("123"));
        tec4.addPerfil(Perfil.TECNICO);
        Tecnico tec5 = new Tecnico(null, "Bruce Rock", "244.155.620-78", "bl@mail.com", encoder.encode("123"));
        tec5.addPerfil(Perfil.TECNICO);

        Cliente cli1 = new Cliente(null,"Linus Torvalds","37608118849", "torvalds@mail.com",encoder.encode("123"));
        Cliente cli2 = new Cliente(null, "Marie Curie", "322.429.140-06", "curie@mail.com", encoder.encode("123"));
        Cliente cli3 = new Cliente(null, "Charles Darwin", "792.043.830-62", "darwin@mail.com", encoder.encode("123"));
        Cliente cli4 = new Cliente(null, "Stephen Hawking", "177.409.680-30", "hawking@mail.com", encoder.encode("123"));
        Cliente cli5 = new Cliente(null, "Max Planck", "081.399.300-83", "planck@mail.com", encoder.encode("123"));


        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01","Primeiro chamado",tec1, cli1);
        Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste chamado 2", tec1, cli2);
        Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste chamado 3", tec2, cli3);
        Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste chamado 4", tec3, cli3);
        Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 5", "Teste chamado 5", tec2, cli1);
        Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 7", "Teste chamado 6", tec1, cli5);

        pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4,tec5, cli1, cli2, cli3, cli4, cli5));
        chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
    }



    @Autowired
    private DBService dbservice;




}
