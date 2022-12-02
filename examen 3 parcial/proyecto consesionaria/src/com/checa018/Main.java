package com.checa018;

import com.checa018.dao.ClienteDao;
import com.checa018.model.Cliente;
import com.checa018.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1450", "Carlos Peres", "Cochabamba", "Av. Ayacucho s/n",4495699);
        //Cliente laura = new Cliente("1451", "Laura Saavedra", "Cochabamba", "Av. Ayacucho s/n",4495699);
        //Cliente roberto = new Cliente("1452", "Roberto Claros", "Cochabamba", "Calle Junin s/n",4147901);
        //Cliente lorena = new Cliente("1453", "Lorena Peredo", "Cochabamba", "Av. Heroinas s/n",4593214);
        //Cliente jose = new Cliente("1454", "Jose Jose Caceres", "Cochabamba", "Calle Sucre s/n",4795467);
        //Cliente maria = new Cliente("1455", "Maria Vargas", "Cochabamba", "Calle Bolivar s/n",4780012);
        //Cliente luis = new Cliente("1456-1B", "Luis Villarroel", "Cochabamba", "Av. Blanco Galindo s/n",4169587);
        //Cliente carmen = new Cliente("1457", "Carmen Canedo", "Cochabamba", "Av. Alnina Patiño s/n",4910020);

        //CRUD tabla clientes
        ClienteDao clienteDao = new ClienteDao();

        //CREATE
        //clienteDao.addCliente(cliente);
        //clienteDao.addCliente(laura);
        //clienteDao.addCliente(roberto);
        //clienteDao.addCliente(lorena);
        //clienteDao.addCliente(jose);
        //clienteDao.addCliente(maria);
        //clienteDao.addCliente(luis);
        //clienteDao.addCliente(carmen);

        //READ
        /*
        List<Cliente> clientes = clienteDao.getALLClientes();
        for (int i = 0; i < clientes.size(); i++) {
          Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }

         */

        //UPDATE
        //Cliente cliente = new Cliente("1450", "Fernando Torricos", "Cochabamba", "Av. 6 de Agosto s/n",4444444);
        //clienteDao.updateCliente(cliente);

        //DELETE
        clienteDao.deleteCliente("1450");
        clienteDao.deleteCliente("1456-1B");
    }
}
