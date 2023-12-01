package org.example.dao.client;

import org.example.entity.Client;

import java.util.List;

public interface ClientDao {
    void saveClient(Client client);

    Client findClientById(Long id);

    void updateClient(Client client);

    void deleteClient(Client client);

    void deleteClientById(Long id);

    List<Client> getAllClients();
}
