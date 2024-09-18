package io.nxoscloud.aircoordinations.economy;

import io.nxoscloud.aircoordinations.residents.Resident;

import java.util.HashMap;
import java.util.Map;

public class ResidentManager {

    private final Map<String, Resident> residents = new HashMap<>();

    public void addResident(Resident resident) {
        residents.put(resident.getName(), resident);
    }

    public Resident getResident(String name) {
        return residents.get(name);
    }

    public void updateResidents() {
        for (Resident resident : residents.values()) {
            // Update logic such as work, sleep, etc.
        }
    }
}
