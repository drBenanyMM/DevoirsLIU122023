// pharmacie.dao.MedicamentDAO
package DAO;

import Metier.MedicamentServive;
import java.util.List;

public interface MedicamentDAO {
    List<Medicament> getAllMedicaments();
    Medicament getMedicamentById(int id);
    void addMedicament(Medicament medicament);
    void updateMedicament(Medicament medicament);
    void deleteMedicament(int id);
}
