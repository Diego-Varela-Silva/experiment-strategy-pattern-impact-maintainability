package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarCampus;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarComentario;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarDepartamento;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarCampus;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarComentario;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarDepartamento;

public interface AbstractSalvarBuscarDAOFactory {
    static <T extends AbstractSalvarBuscarDAO> T of(Class<T> type) {
        if (type == CampusSalvarBuscarDAO.class)
            return type.cast(new CampusSalvarBuscarDAO(
                    new SalvarCampus(),
                    new BuscarCampus()
            ));
        if (type == ComentarioSalvarBuscarDAO.class)
            return type.cast(new ComentarioSalvarBuscarDAO(
                    new SalvarComentario(),
                    new BuscarComentario()
            ));
        if (type == DepartamentoSalvarBuscarDAO.class)
            return type.cast(new DepartamentoSalvarBuscarDAO(
                    new SalvarDepartamento(),
                    new BuscarDepartamento()
            ));
        throw new RuntimeException("Class Not Implemented: " + type.getName());
    }
}
