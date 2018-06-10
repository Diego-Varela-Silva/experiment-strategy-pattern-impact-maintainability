package com.mycompany.strategyexperiment.dao.experiment;


import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAnexo;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAtaParticipante;

public interface AbstractFullDAOFactory {
    static <T extends AbstractFullDAO> T of(Class<T> type) {
        if (type == AnexoFullDAO.class)
            return type.cast(new AnexoFullDAO(
                    new SalvarAnexo(),
                    new ListarAnexo(),
                    new BuscarAnexo(),
                    new ExcluirAnexo()
            ));
        if (type == AtaParticipanteFullDAO.class)
            return type.cast(new AtaParticipanteFullDAO(
                    new SalvarAtaParticipante(),
                    new ListarAtaParticipante(),
                    new BuscarAtaParticipante(),
                    new ExcluirAtaParticipante()
            ));
        throw new RuntimeException("Class Not Implemented: " + type.getName());
    }
}
