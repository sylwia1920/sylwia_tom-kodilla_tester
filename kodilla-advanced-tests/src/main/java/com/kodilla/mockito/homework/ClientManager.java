package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ClientManager {
    private Map<Location, Set<Client>> generalSubscription = new HashMap<>();

    public void addClientToLocation(Client client, Location location) {
        if (generalSubscription.containsKey(location)) {
            generalSubscription.get(location).add(client);
        } else {
            Set<Client> newLocation = new HashSet<>();
            newLocation.add(client);
            generalSubscription.put(location, newLocation);
        }
    }

    public void removeClientFromLocation(Client client, Location location) throws NoLocation {
        //if (generalSubscription.containsKey(location)) {
            //generalSubscription.get(location).remove(client);
        //}
        if (generalSubscription.get(location).size() == 0) {
            removeLocation(location);
        }
    }

    public void removeClientFromAllLocation(Client client) throws NoLocation {
        for (Map.Entry<Location, Set<Client>> location : generalSubscription.entrySet()) {
            if (location.getValue().contains(client)) {
                location.getValue().remove(client);
            } else {
                throw new NoLocation();
            }
        }
        generalSubscription = generalSubscription.entrySet().stream()
                .filter(mapWithoutZeroLocation -> !(mapWithoutZeroLocation.getValue().size() == 0))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
    }

    public void removeLocation(Location location) throws NoLocation {
        if (generalSubscription.containsKey(location)) {
            //Set<Client> temporaryList = generalSubscription.get(location).stream().collect(Collectors.toSet());
            generalSubscription.remove(location);
            //Location temporaryLocation = null;
            //if (generalSubscription.containsKey(temporaryLocation)) {
                //for (Client client : temporaryList) {
                    //generalSubscription.get(temporaryLocation).add(client);
                //}
            //} else {
                //generalSubscription.put(temporaryLocation, temporaryList);
            //}
        } else {
            throw new NoLocation();
        }
    }

    public void sendLocationNote(Location location) throws NoLocation {
        if (generalSubscription.containsKey(location)) {
            for (Client client : generalSubscription.get(location)) {
                client.receiveLocationNote(location);
            }
        } else {
            throw new NoLocation();
        }
    }

    public void sendGeneralNote() throws NoLocation {
        if (generalSubscription.isEmpty()) {
            throw new NoLocation();
        } else {
            Set<Client> setOfClients = new HashSet<>();
            for (Map.Entry<Location, Set<Client>> client : generalSubscription.entrySet()) {
                setOfClients = client.getValue().stream().collect(Collectors.toSet());
            }
            for (Client client : setOfClients) {
                client.receiveGeneralNote();
            }
        }
    }

    public Map<Location, Set<Client>> getGeneralSubscription() {
        return generalSubscription;
    }
}
