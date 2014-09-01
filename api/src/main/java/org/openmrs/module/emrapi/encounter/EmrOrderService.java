package org.openmrs.module.emrapi.encounter;

import org.openmrs.*;
import org.openmrs.module.emrapi.encounter.domain.*;

import java.util.*;

public interface EmrOrderService {
    void save(List<EncounterTransaction.DrugOrder> drugOrders, Encounter encounter);
    List<EncounterTransaction.DrugOrder> getDrugOrders(Encounter encounter);
    List<EncounterTransaction.TestOrder> getTestOrders(Encounter encounter);
}
