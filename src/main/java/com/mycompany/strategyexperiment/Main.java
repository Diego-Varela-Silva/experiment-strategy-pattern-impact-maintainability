package com.mycompany.strategyexperiment;

import com.mycompany.strategyexperiment.dao.experiment.*;

public class Main {
    public static void main(String[] args) {
        AnexoFullDAO anexoFullDAO = AbstractFullDAOFactory.of(AnexoFullDAO.class);
        AtaParticipanteFullDAO ataParticipanteFullDAO = AbstractFullDAOFactory.of(AtaParticipanteFullDAO.class);
        CampusSalvarBuscarDAO campusSalvarBuscarDAO = AbstractSalvarBuscarDAOFactory.of(CampusSalvarBuscarDAO.class);
        ComentarioSalvarBuscarDAO comentarioSalvarBuscarDAO = AbstractSalvarBuscarDAOFactory.of(ComentarioSalvarBuscarDAO.class);
        DepartamentoSalvarBuscarDAO departamentoSalvarBuscarDAO = AbstractSalvarBuscarDAOFactory.of(DepartamentoSalvarBuscarDAO.class);
        PautaSalvarBuscarExcluirDAO pautaSalvarBuscarExcluirDAO = AbstractSalvarBuscarExcluirDAOFactory.of(PautaSalvarBuscarExcluirDAO.class);
    }
}
