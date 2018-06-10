package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarPauta;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirPauta;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarPauta;

public interface AbstractSalvarBuscarExcluirDAOFactory {
    static <T extends AbstractSalvarBuscarExcluirDAO> T of(Class<T> type) {
        if (type == PautaSalvarBuscarExcluirDAO.class)
            return type.cast(new PautaSalvarBuscarExcluirDAO(
                    new SalvarPauta(),
                    new BuscarPauta(),
                    new ExcluirPauta()
            ));
        throw new RuntimeException("Class Not Implemented: " + type.getName());
    }
}
