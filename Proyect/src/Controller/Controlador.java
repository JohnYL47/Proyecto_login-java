l./*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.ArrayList;
import Model.*;
import View.*;
import java.util.*;

public class Controlador implements ActionListener {

    ArrayList<ModelPerson> list_Person = new ArrayList<ModelPerson>();
    ArrayList<Vendedor_Controller> list_Vendedor = new ArrayList<Vendedor_Controller>();
    ArrayList<Vendedor> list_Vend = new ArrayList<Vendedor>();
    ArrayList<Productos> list_Product = new ArrayList<Productos>();


    fLogin vistalogin = new fLogin();

    fclientes clientes = new fclientes();
    fproductos productos = new fproductos();
    fvendedor vendedor = new fvendedor();
    fadmin admin=new fadmin();
    

    JFcliente clientes = new JFcliente();
    JFproductos productos = new JFproductos();
    JFvendedor vendedor = new JFvendedor();
>>>>>>> solito

    //--------------List--------------------------//
    //LOGIN
    private String usuario;
    private String password;

    //TABLA DE CLIENTE

    //TABLA DE CLIENTE,VENDEDOR

    private int Id;
    private int IdV;
    private String Nombre;
    private String NombreV;
    private String Apellido;
    //TABLA VENDEDOR
    private int Idv;
    private String Nombrev;
    private String Apellidov;
    private String ApellidoV;

    //TABLA PRODUCTOS
    private int Id_Product;
    private String Nombre_Product;
    private String Precio_Product;
    private String Categoria_Product;
    //TABLAS
    private JTable JTable_Vendedor;
    private JTable JTable_Cliente;
    private JTable JTable_Products;
    //------------------------------------------//

    public Controlador(fLogin login) {
        //Falta Admin
        this.vistalogin.JBGuardar_login.addActionListener(this);
        this.clientes.JBClient_Mostrar.addActionListener(this);
        this.clientes.JBACK_Client.addActionListener(this);
        this.clientes.JBUSCAR_CLient.addActionListener(this);
        this.productos.JBProducts_Buscar.addActionListener(this);
        this.productos.JBProducts_Guardar.addActionListener(this);
        this.productos.JBProducts_Mostrar.addActionListener(this);
        this.vendedor.JBVENDEDOR_Buscar.addActionListener(this);
        this.vendedor.JBVENDEDOR_Mostrar.addActionListener(this);


    } //Buttons

    public void iniciar() {
        this.vistalogin.setVisible(false);
        this.admin.setVisible(true);
    } //inicio

    @Override
    public void actionPerformed(ActionEvent e) {

        //Ingreso de las tablas
        if (e.getSource() == this.vistalogin.JBGuardar_login) {
            usuario = this.vistalogin.JTNombre_login.getText();
            password = this.vistalogin.JPassword_login.getText();
            limpiar();
            if (usuario.equals("admin") && password.equals("123")) {
                productos.setVisible(true);
            } else if (usuario.equals("cliente") && password.equals("456")) {
                clientes.setVisible(true);
            } else if (usuario.equals("vendedor") && password.equals("789")) {
                vendedor.setVisible(true);
            } else if (usuario.equals("") && password.equals("")) {
                JOptionPane.showMessageDialog(null, "Favor ingrese datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña o Usuario no valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        //CLIENTE
//Guardar y Mostrar

        if (e.getSource() == this.clientes.JBClient_Mostrar) {
            Id = Integer.parseInt(this.clientes.JTClient_ID.getText());
            Nombre = this.clientes.JTClient_Nombre.getText();
            Apellido = this.clientes.JTClient_Apellido.getText();
            limpiar();
            list_Person.add(new ModelPerson(Id, Nombre, Apellido, usuario, password));
<<<<<<< HEAD
<<<<<<< HEAD
            cargartablaClient(this.clientes.JTable_Cliente, list_Person);
=======
            cargartablaCliente(this.clientes.JTable_Cliente, list_Person);
>>>>>>> solito
        }
        /*if (e.getSource() == this.clientes.JBClient_Mostrar) {
            Id = Integer.parseInt(this.clientes.JTClient_ID.getText());
            Nombre = this.clientes.JTClient_Nombre.getText();
            Apellido = this.clientes.JTClient_Apellido.getText();
            limpiar();
            list_Person.add(new ModelPerson(Id, Nombre, Apellido, usuario, password));
            cargartablaClient(this.clientes.JTable_Cliente, list_Person);
        }*/
//Buscar
        if (e.getSource() == this.clientes.JBUSCAR_CLient) {
            //Al presionar el boton buscar nos enviará  a la otra interfaz
            for (int i = 0; i < list_Person.size(); i++) {
                if (Integer.parseInt(this.clientes.JTClient_ID.getText()) == list_Person.get(i).getId()) {
                    this.clientes.JTClient_Nombre.setText(list_Person.get(i).getNombre());
                    this.clientes.JTClient_Apellido.setText(list_Person.get(i).getApellido());
                }
            }
        }
        if (e.getSource() == this.clientes.JBACK_Client) {
            clientes.dispose();
        }

        //VENDEDOR
//Guardar y Mostrar
        if (e.getSource() == this.vendedor.JBVENDEDOR_Mostrar) {
<<<<<<< HEAD
            Idv = Integer.parseInt(this.vendedor.JTVENDEDOR_ID.getText());
            Nombrev = this.vendedor.JTVENDEDOR_Nombre.getText();
            Apellidov = this.vendedor.JTVENDEDOR_Apellido.getText();
            limpiar();
            list_Vendedor.add(new Vendedor_Controller(Idv, Nombrev, Apellidov));
            cargartablaVent(this.vendedor.JTable_Vendedor, list_Vendedor);
        }
//Buscar
        if (e.getSource() == this.vendedor.JBVENDEDOR_Buscar) {
            for (int i = 0; i < list_Vendedor.size(); i++) {
                if (Integer.parseInt(this.vendedor.JTVENDEDOR_ID.getText()) == list_Vendedor.get(i).getIdv()) {
                    this.vendedor.JTVENDEDOR_Nombre.setText(list_Vendedor.get(i).getNombrev());
                    this.vendedor.JTVENDEDOR_Apellido.setText(list_Vendedor.get(i).getApellidov());
                }
            }
        }
        if (e.getSource() == this.vendedor.JBACK_Vendedor) {
            vendedor.dispose();
        }
=======
            cargartablaClient(this.clientes.JTable_Client, list_Person);
//Mostrar

        }
        //VENDEDOR
//Guardar
     if (e.getSource() == productos.JBProducts_Guardar) {
          JOptionPane.showMessageDialog(null, "Algo", "ERROR", JOptionPane.ERROR_MESSAGE);
     } 
//cerrar ventanas


>>>>>>> main
    }
    
   
    
=======
            IdV = Integer.parseInt(this.vendedor.JTVENDEDOR_ID.getText());
            NombreV = this.vendedor.JTVENDEDOR_Nombre.getText();
            ApellidoV = this.vendedor.JTVENDEDOR_Apellido.getText();
            limpiar();
            list_Vend.add(new Vendedor(IdV, NombreV, ApellidoV));
            cargartablaVendedor(this.vendedor.JTable_Vendedor, list_Vend);
        }
//Buscar
        if (e.getSource() == this.vendedor.JBVENDEDOR_Buscar) {
            for (int i = 0; i < list_Vend.size(); i++) {
                if (Integer.parseInt(this.vendedor.JTVENDEDOR_ID.getText()) == list_Vend.get(i).getIdV()) {
                    this.vendedor.JTVENDEDOR_Nombre.setText(list_Vend.get(i).getNombreV());
                    this.vendedor.JTVENDEDOR_Apellido.setText(list_Vend.get(i).getApellidoV());
                }
            }
        }
        //Back
        if (e.getSource() == this.vendedor.JBACK_Vendedor) {
            vendedor.dispose();
        }
    }
    
>>>>>>> solito

    private void limpiar() {
        //Falta admin
        this.vistalogin.JTNombre_login.setText("");
        this.vistalogin.JPassword_login.setText("");
        this.clientes.JTClient_Apellido.setText("");
        this.clientes.JTClient_ID.setText("");
        this.clientes.JTClient_Nombre.setText("");
        this.vendedor.JTVENDEDOR_Apellido.setText("");
        this.vendedor.JTVENDEDOR_ID.setText("");
        this.vendedor.JTVENDEDOR_Nombre.setText("");
    } //Limpiar --Admin

    private void cargartablaCliente(JTable JTable_Cliente, ArrayList<ModelPerson> list_ClientList) {
        for (int i = 0; i < list_ClientList.size(); i++) {
            JTable_Cliente.setValueAt(list_ClientList.get(i).getId(), i, 0);
            JTable_Cliente.setValueAt(list_ClientList.get(i).getNombre(), i, 1);
            JTable_Cliente.setValueAt(list_ClientList.get(i).getApellido(), i, 2);
        }
    }
    private void cargartablaVendedor(JTable JTable_Vendedor, ArrayList<Vendedor> list_VendList){
        for (int i = 0; i < list_VendList.size(); i++) {
            JTable_Vendedor.setValueAt(list_VendList.get(i).getIdV(), i, 0);
            JTable_Vendedor.setValueAt(list_VendList.get(i).getNombreV(), i, 1);
            JTable_Vendedor.setValueAt(list_VendList.get(i).getApellidoV(), i, 2);
        }
    }

    private void cargartablaVent(JTable JTable_Vendedor, ArrayList<Vendedor_Controller> list_V) {
        for (int i = 0; i < list_V.size(); i++) {
            JTable_Vendedor.setValueAt(list_V.get(i).getIdv(), i, 0);
            JTable_Vendedor.setValueAt(list_V.get(i).getNombrev(), i, 1);
            JTable_Vendedor.setValueAt(list_V.get(i).getApellidov(), i, 2);
        }
    }
}
<<<<<<< HEAD
//suhdfbdhfdhfdfvdfhvdfhdvdhvfdhvfdh
//sbhfvdhfvdgfv
<<<<<<< HEAD
//knajdsjdbskdjbdhbdhdbfghgb
=======
=======
//si
>>>>>>> solito
>>>>>>> 55da6ebfc98407923b6966ebdb31f9cff983dcd1
