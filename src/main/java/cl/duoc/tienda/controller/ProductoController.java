package cl.duoc.tienda.controller;


import cl.duoc.tienda.model.Producto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class ProductoController {
    //Elementos de la interfaz grafica
    @FXML
    private Label labelCodigo;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelPrecio;
    @FXML
    private Label labelactivo;
    @FXML
    private Label labelStock;
    @FXML
    private Label labelCategoria;
    @FXML
    private Label labelOferta;
    @FXML
    private TextField textFieldCodigo;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldPrecio;
    @FXML
    private TextField textFieldStock;
    @FXML
    private ComboBox<String> comboBoxCategoria;
    @FXML
    private CheckBox checkBoxOferta;
    @FXML
    private RadioButton radioButtonSi;
    @FXML
    private RadioButton radioButtonNo;
    @FXML
    private Button buttonAgregar;

    //2. Dejmos preparado el arreglo
    ArrayList<Producto> productos = new ArrayList<>();//[]vacio

    //3.Acciones
    //3.1 Necsito cargar el comboBox:
    @FXML
    public void initialize(){
        comboBoxCategoria.getItems().addAll("Seleccionar","Bebestible","Congelado","Útiles","Snaks");
    }


    @FXML
    protected void agregarProducto() {
        //tarea hacer funcionar el boton
        try{
            String codigo = textFieldCodigo.getText();
            String nombre = textFieldNombre.getText();
            double precio = Double.parseDouble(textFieldPrecio.getText());
            int stock = Integer.parseInt(textFieldStock.getText());
            String categoria = String.valueOf(comboBoxCategoria.getItems());
            boolean oferta = Boolean.parseBoolean(checkBoxOferta.getText());
            boolean activo = radioButtonSi.isSelected();


            Producto p = new Producto(codigo,nombre,precio,stock,categoria,oferta,activo);
            productos.add(p);

            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setContentText("Producto registrado");
            alerta.show();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}